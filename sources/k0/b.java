package k0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import c2.t;
import j4.c;
import m.t3;
import n5.e0;
import v9.d;
import w2.j;
import w2.m;
import w4.e;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public Context a;

    public b(Context context) {
        this.a = context;
    }

    public void a(c cVar, t tVar, xa.c cVar2) {
        CancellationSignal cancellationSignal;
        FingerprintManager f10;
        if (tVar != null) {
            synchronized (tVar) {
                try {
                    if (((CancellationSignal) tVar.c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        tVar.c = cancellationSignal2;
                        if (tVar.b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) tVar.c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT < 23 || (f10 = e0.b.f(this.a)) == null) {
            return;
        }
        e0.b.a(f10, e0.b.C(cVar), cancellationSignal, new a(cVar2));
    }

    public j b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        j jVar = new j();
        jVar.a = y2.a.a(m.a);
        e0 e0Var = new e0(context, 26);
        jVar.b = e0Var;
        jVar.c = y2.a.a(new e(2, e0Var, new e0(e0Var, 25)));
        e0 e0Var2 = jVar.b;
        int i9 = 11;
        jVar.d = new fa.c(e0Var2, i9);
        nc.a a2 = y2.a.a(new we.b(jVar.d, y2.a.a(new xa.c(e0Var2, i9)), false, 18));
        jVar.e = a2;
        d dVar = new d(3);
        e0 e0Var3 = jVar.b;
        a5.m mVar = new a5.m(e0Var3, a2, dVar, 5);
        nc.a aVar = jVar.a;
        nc.a aVar2 = jVar.c;
        b3.b bVar = new b3.b();
        bVar.a = aVar;
        bVar.b = aVar2;
        bVar.e = mVar;
        bVar.c = a2;
        bVar.d = a2;
        t3 t3Var = new t3();
        t3Var.a = e0Var3;
        t3Var.b = aVar2;
        t3Var.c = a2;
        t3Var.d = mVar;
        t3Var.e = aVar;
        t3Var.f = a2;
        t3Var.h = a2;
        jVar.f = y2.a.a(new t5.c(bVar, t3Var, new com.google.firebase.messaging.t(aVar, a2, mVar, a2, 5), 5));
        return jVar;
    }
}
