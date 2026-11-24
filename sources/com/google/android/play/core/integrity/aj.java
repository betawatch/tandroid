package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class aj {
    final hzc a;
    private final q0d b;
    private final String c;
    private final Context d;
    private final at e;
    private final k f;

    public aj(Context context, q0d q0dVar, at atVar, k kVar) {
        q0d q0dVar2;
        this.c = context.getPackageName();
        this.b = q0dVar;
        this.e = atVar;
        this.f = kVar;
        this.d = context;
        q0d q0dVar3 = jzc.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (jzc.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.a = new hzc(context, q0dVar, "IntegrityService", ak.a, new y0d() { // from class: com.google.android.play.core.integrity.ae
                            @Override // y0d
                            public final Object a(IBinder iBinder) {
                                int i = l0d.i;
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                return queryLocalInterface instanceof m0d ? (m0d) queryLocalInterface : new i0d(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService", (byte) 0);
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    q0dVar2 = q0dVar;
                    q0dVar3.c("Play Store package is not found.", new Object[0]);
                }
            } else {
                q0dVar3.c("Play Store package is disabled.", new Object[0]);
            }
            q0dVar2 = q0dVar;
        } catch (PackageManager.NameNotFoundException unused2) {
            q0dVar2 = q0dVar;
            q0dVar3.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        q0dVar2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", q0d.d(q0dVar2.a, "Phonesky is not installed.", objArr));
        }
        this.a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzc(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(uye.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s, %s)", this.c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        if (jzc.a(this.d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            this.b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.a.c(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
