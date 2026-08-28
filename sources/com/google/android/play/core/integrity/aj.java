package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import k8.a0;
import k8.b0;
import k8.g0;
import k8.k0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class aj {
    final k8.c a;
    private final g0 b;
    private final String c;
    private final Context d;
    private final at e;
    private final k f;

    public aj(Context context, g0 g0Var, at atVar, k kVar) {
        g0 g0Var2;
        this.c = context.getPackageName();
        this.b = g0Var;
        this.e = atVar;
        this.f = kVar;
        this.d = context;
        g0 g0Var3 = k8.e.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (k8.e.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.a = new k8.c(context, g0Var, "IntegrityService", ak.a, new k0() { // from class: com.google.android.play.core.integrity.ae
                            @Override // k8.k0
                            public final Object a(IBinder iBinder) {
                                int i9 = a0.i;
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                return queryLocalInterface instanceof b0 ? (b0) queryLocalInterface : new k8.z(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService", 7);
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    g0Var2 = g0Var;
                    g0Var3.c("Play Store package is not found.", new Object[0]);
                }
            } else {
                g0Var3.c("Play Store package is disabled.", new Object[0]);
            }
            g0Var2 = g0Var;
        } catch (PackageManager.NameNotFoundException unused2) {
            g0Var2 = g0Var;
            g0Var3.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        g0Var2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", g0.d(g0Var2.a, "Phonesky is not installed.", objArr));
        }
        this.a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k8.t(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(g7.j.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i9 = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s, %s)", this.c, Integer.valueOf(i9));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i9), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        if (k8.e.a(this.d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (Build.VERSION.SDK_INT >= 23 && (integrityTokenRequest instanceof ao)) {
            }
            this.b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.a.c(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
