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
import k7.w5;
import o8.a0;
import o8.f0;
import o8.j0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class aj {
    final o8.c a;
    private final f0 b;
    private final String c;
    private final Context d;
    private final at e;
    private final k f;

    public aj(Context context, f0 f0Var, at atVar, k kVar) {
        f0 f0Var2;
        this.c = context.getPackageName();
        this.b = f0Var;
        this.e = atVar;
        this.f = kVar;
        this.d = context;
        f0 f0Var3 = o8.e.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (o8.e.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.a = new o8.c(context, f0Var, "IntegrityService", ak.a, new j0() { // from class: com.google.android.play.core.integrity.ae
                            @Override // o8.j0
                            public final Object a(IBinder iBinder) {
                                int i10 = o8.z.i;
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                return queryLocalInterface instanceof a0 ? (a0) queryLocalInterface : new o8.y(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService", 8);
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f0Var2 = f0Var;
                    f0Var3.c("Play Store package is not found.", new Object[0]);
                }
            } else {
                f0Var3.c("Play Store package is disabled.", new Object[0]);
            }
            f0Var2 = f0Var;
        } catch (PackageManager.NameNotFoundException unused2) {
            f0Var2 = f0Var;
            f0Var3.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        f0Var2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f0.d(f0Var2.a, "Phonesky is not installed.", objArr));
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
        arrayList.add(new o8.s(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(w5.a(arrayList)));
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
        if (o8.e.a(this.d) < 82380000) {
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
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
