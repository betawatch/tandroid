package k0;

import a3.c;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.biometric.e;
import c2.u;
import m.r3;
import o5.i;
import q5.g0;
import y2.j;
import y2.m;
import y5.h;
import z2.d;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b {
    public Context a;

    public b(Context context) {
        this.a = context;
    }

    public void a(e eVar, u uVar, h hVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager f10;
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
        if (Build.VERSION.SDK_INT < 23 || (f10 = e0.b.f(this.a)) == null) {
            return;
        }
        e0.b.a(f10, e0.b.C(eVar), cancellationSignal, new a(hVar));
    }

    public j b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        j jVar = new j();
        jVar.a = a3.a.a(m.a);
        c cVar = new c(context);
        jVar.b = cVar;
        jVar.c = a3.a.a(new g0(20, cVar, new d(cVar)));
        c cVar2 = jVar.b;
        jVar.d = new h(cVar2, 15);
        rc.a a2 = a3.a.a(new bf.b(29, jVar.d, a3.a.a(new i(cVar2, 12))));
        jVar.e = a2;
        db.a aVar = new db.a(4);
        c cVar3 = jVar.b;
        e eVar = new e(cVar3, a2, aVar, 12);
        rc.a aVar2 = jVar.a;
        rc.a aVar3 = jVar.c;
        c5.j jVar2 = new c5.j();
        jVar2.a = aVar2;
        jVar2.b = aVar3;
        jVar2.c = eVar;
        jVar2.d = a2;
        jVar2.e = a2;
        r3 r3Var = new r3();
        r3Var.a = cVar3;
        r3Var.b = aVar3;
        r3Var.c = a2;
        r3Var.d = eVar;
        r3Var.e = aVar2;
        r3Var.f = a2;
        r3Var.h = a2;
        jVar.f = a3.a.a(new s5.m(jVar2, r3Var, new sf.e(aVar2, a2, eVar, a2, 3), 11));
        return jVar;
    }
}
