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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class aj {
    final i1d a;
    private final s2d b;
    private final String c;
    private final Context d;
    private final at e;
    private final k f;

    public aj(Context context, s2d s2dVar, at atVar, k kVar) {
        s2d s2dVar2;
        this.c = context.getPackageName();
        this.b = s2dVar;
        this.e = atVar;
        this.f = kVar;
        this.d = context;
        s2d s2dVar3 = k1d.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (k1d.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.a = new i1d(context, s2dVar, "IntegrityService", ak.a, new a3d() { // from class: com.google.android.play.core.integrity.ae
                            @Override // a3d
                            public final Object a(IBinder iBinder) {
                                int i = n2d.i;
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                return queryLocalInterface instanceof o2d ? (o2d) queryLocalInterface : new k2d(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService", (byte) 0);
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    s2dVar2 = s2dVar;
                    s2dVar3.c("Play Store package is not found.", new Object[0]);
                }
            } else {
                s2dVar3.c("Play Store package is disabled.", new Object[0]);
            }
            s2dVar2 = s2dVar;
        } catch (PackageManager.NameNotFoundException unused2) {
            s2dVar2 = s2dVar;
            s2dVar3.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        s2dVar2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", s2d.d(s2dVar2.a, "Phonesky is not installed.", objArr));
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
        arrayList.add(new a2d(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(w0f.a(arrayList)));
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
        if (k1d.a(this.d) < 82380000) {
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
