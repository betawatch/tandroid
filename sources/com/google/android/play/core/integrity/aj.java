package com.google.android.play.core.integrity;

import a8.r9;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import b9.a0;
import b9.b0;
import b9.c0;
import b9.h0;
import b9.l0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
final class aj {
    final b9.d a;
    private final h0 b;
    private final String c;
    private final Context d;
    private final at e;
    private final k f;

    public aj(Context context, h0 h0Var, at atVar, k kVar) {
        h0 h0Var2;
        this.c = context.getPackageName();
        this.b = h0Var;
        this.e = atVar;
        this.f = kVar;
        this.d = context;
        h0 h0Var3 = b9.f.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (b9.f.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.a = new b9.d(context, h0Var, "IntegrityService", ak.a, new l0() { // from class: com.google.android.play.core.integrity.ae
                            @Override // b9.l0
                            public final Object a(IBinder iBinder) {
                                int i10 = b0.i;
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                return queryLocalInterface instanceof c0 ? (c0) queryLocalInterface : new a0(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService", 1);
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    h0Var2 = h0Var;
                    h0Var3.c("Play Store package is not found.", new Object[0]);
                }
            } else {
                h0Var3.c("Play Store package is disabled.", new Object[0]);
            }
            h0Var2 = h0Var;
        } catch (PackageManager.NameNotFoundException unused2) {
            h0Var2 = h0Var;
            h0Var3.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        h0Var2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h0.d(h0Var2.a, "Phonesky is not installed.", objArr));
        }
        this.a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l4, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l4 != null) {
            bundle.putLong("cloud.prj", l4.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b9.u(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(r9.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i10 = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s, %s)", this.c, Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        if (b9.f.a(this.d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.a.c(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
