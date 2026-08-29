package k0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.biometric.e;
import c2.u;
import com.google.firebase.messaging.s;
import ha.c;
import m.s3;
import v5.n;
import y2.j;
import y2.m;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b {
    public Context a;

    public b(Context context) {
        this.a = context;
    }

    public void a(e eVar, u uVar, c cVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager f9;
        if (uVar != null) {
            synchronized (uVar) {
                try {
                    if (((CancellationSignal) uVar.c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        uVar.c = cancellationSignal2;
                        if (uVar.b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) uVar.c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT < 23 || (f9 = e0.b.f(this.a)) == null) {
            return;
        }
        e0.b.a(f9, e0.b.C(eVar), cancellationSignal, new a(cVar));
    }

    public j b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        j jVar = new j();
        jVar.a = a3.a.a(m.a);
        a3.c cVar = new a3.c(context);
        jVar.b = cVar;
        jVar.c = a3.a.a(new n(9, cVar, new org.telegram.ui.Components.n(cVar, 24)));
        a3.c cVar2 = jVar.b;
        jVar.d = new c(cVar2, 17);
        pc.a a2 = a3.a.a(new ze.b(jVar.d, a3.a.a(new za.c(cVar2, 14))));
        jVar.e = a2;
        ya.a aVar = new ya.a(4);
        a3.c cVar3 = jVar.b;
        e eVar = new e(cVar3, a2, aVar, 8);
        pc.a aVar2 = jVar.a;
        pc.a aVar3 = jVar.c;
        a5.j jVar2 = new a5.j();
        jVar2.a = aVar2;
        jVar2.b = aVar3;
        jVar2.c = eVar;
        jVar2.d = a2;
        jVar2.e = a2;
        s3 s3Var = new s3();
        s3Var.a = cVar3;
        s3Var.b = aVar3;
        s3Var.c = a2;
        s3Var.d = eVar;
        s3Var.e = aVar2;
        s3Var.f = a2;
        s3Var.h = a2;
        jVar.f = a3.a.a(new v5.c(jVar2, s3Var, new s(aVar2, a2, eVar, a2, 7), 5));
        return jVar;
    }
}
