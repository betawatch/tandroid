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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class aj {
    final y3d a;
    private final h5d b;
    private final String c;
    private final Context d;
    private final at e;
    private final k f;

    public aj(Context context, h5d h5dVar, at atVar, k kVar) {
        h5d h5dVar2;
        this.c = context.getPackageName();
        this.b = h5dVar;
        this.e = atVar;
        this.f = kVar;
        this.d = context;
        h5d h5dVar3 = a4d.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (a4d.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.a = new y3d(context, h5dVar, "IntegrityService", ak.a, new p5d() { // from class: com.google.android.play.core.integrity.ae
                            @Override // p5d
                            public final Object a(IBinder iBinder) {
                                int i = c5d.i;
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                return queryLocalInterface instanceof d5d ? (d5d) queryLocalInterface : new z4d(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService", (byte) 0);
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    h5dVar2 = h5dVar;
                    h5dVar3.c("Play Store package is not found.", new Object[0]);
                }
            } else {
                h5dVar3.c("Play Store package is disabled.", new Object[0]);
            }
            h5dVar2 = h5dVar;
        } catch (PackageManager.NameNotFoundException unused2) {
            h5dVar2 = h5dVar;
            h5dVar3.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        h5dVar2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h5d.d(h5dVar2.a, "Phonesky is not installed.", objArr));
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
        arrayList.add(new q4d(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(n3f.a(arrayList)));
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
        if (a4d.a(this.d) < 82380000) {
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
