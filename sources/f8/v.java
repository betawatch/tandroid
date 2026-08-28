package f8;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v extends Fragment {
    public static final /* synthetic */ int d = 0;
    public int a;
    public u b;
    public boolean c;

    public final void a(Task task) {
        if (this.c) {
            return;
        }
        int i9 = 1;
        this.c = true;
        Activity activity = getActivity();
        activity.getFragmentManager().beginTransaction().remove(this).commit();
        if (task == null) {
            a.b(activity, this.a, 0, new Intent());
            return;
        }
        int i10 = this.a;
        int i11 = a.c;
        if (activity.isFinishing()) {
            if (Log.isLoggable("AutoResolveHelper", 3)) {
                Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                return;
            }
            return;
        }
        Exception exception = task.getException();
        if (exception instanceof com.google.android.gms.common.api.p) {
            try {
                ((com.google.android.gms.common.api.p) exception).getStatus().c(activity, i10);
                return;
            } catch (IntentSender.SendIntentException e10) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e10);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        if (task.isSuccessful()) {
            i iVar = (i) task.getResult();
            iVar.getClass();
            Parcel obtain = Parcel.obtain();
            iVar.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            intent.putExtra("com.google.android.gms.wallet.PaymentData", marshall);
            i9 = -1;
        } else if (exception instanceof com.google.android.gms.common.api.f) {
            com.google.android.gms.common.api.f fVar = (com.google.android.gms.common.api.f) exception;
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(fVar.getStatusCode(), fVar.getMessage(), null, null));
        } else {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Unexpected non API exception!", exception);
            }
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!", null, null));
        }
        a.b(activity, i10, i9, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getInt("requestCode");
        if (a.b != getArguments().getLong("initializationElapsedRealtime")) {
            this.b = null;
        } else {
            this.b = (u) u.e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z10 = true;
        }
        this.c = z10;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        u uVar = this.b;
        if (uVar == null || uVar.b != this) {
            return;
        }
        uVar.b = null;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        u uVar = this.b;
        if (uVar != null) {
            uVar.b = this;
            uVar.a();
        } else {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
            }
            a(null);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.c);
        u uVar = this.b;
        if (uVar == null || uVar.b != this) {
            return;
        }
        uVar.b = null;
    }
}
