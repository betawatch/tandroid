package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ r8(t8 t8Var, int i7) {
        this.a = i7;
        this.b = t8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        t8 t8Var = this.b;
        switch (i7) {
            case 0:
                t8Var.b();
                break;
            case 1:
                t8Var.a();
                break;
            default:
                org.telegram.ui.Components.xb xbVar = t8Var.d;
                v8 v8Var = t8Var.q;
                r8 r8Var = t8Var.p;
                gj gjVar = t8Var.b;
                if (!t8Var.l) {
                    t8Var.l = true;
                    gjVar.f((int) t8Var.k, t8Var.c(), true);
                    long j3 = v8Var.g;
                    int i10 = v8Var.a;
                    v8Var.g = j3 + t8Var.k;
                    ns.f(i10).k(ns.y3, new Object[0]);
                    t8Var.k = 0L;
                    ns.f(i10).k(ns.o1, Long.valueOf(gj.B0(gjVar.k)), Integer.valueOf(gjVar.e1()), gjVar.k.reactions);
                }
                if (!t8Var.m) {
                    t8Var.m = true;
                    t8Var.f.b = 5000L;
                    org.telegram.messenger.g0.r(r8Var);
                    org.telegram.messenger.g0.i3(r8Var, 5000L);
                    xbVar.k(true);
                    xbVar.v = r8Var;
                }
                t8Var.e.b.setText(t8Var.d());
                break;
        }
    }
}
