package j8;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        int i10 = 1;
        this.c = true;
        Activity activity = getActivity();
        activity.getFragmentManager().beginTransaction().remove(this).commit();
        if (task == null) {
            a.b(activity, this.a, 0, new Intent());
            return;
        }
        int i11 = this.a;
        int i12 = a.c;
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
                ((com.google.android.gms.common.api.p) exception).getStatus().f(activity, i11);
                return;
            } catch (IntentSender.SendIntentException e) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e);
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
            i10 = -1;
        } else if (exception instanceof com.google.android.gms.common.api.f) {
            com.google.android.gms.common.api.f fVar = (com.google.android.gms.common.api.f) exception;
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(fVar.getStatusCode(), fVar.getMessage(), null, null));
        } else {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Unexpected non API exception!", exception);
            }
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!", null, null));
        }
        a.b(activity, i11, i10, intent);
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
        boolean z4 = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z4 = true;
        }
        this.c = z4;
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
