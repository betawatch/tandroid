package o4;

import android.os.Bundle;
import b8.yd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ h0(o0 o0Var, int i3) {
        this.a = i3;
        this.b = o0Var;
    }

    @Override // o4.n0
    public final void c(v vVar) {
        int i3 = this.a;
        o0 o0Var = this.b;
        switch (i3) {
            case 0:
                o0Var.h.n(vVar);
                break;
            case 1:
                e0 e0Var = o0Var.h;
                if (e0Var.t.S0() != null) {
                    kb.a aVar = e0Var.e;
                    e0Var.s(vVar);
                    aVar.getClass();
                    yd.b(new r1(-6));
                    break;
                }
                break;
            case 2:
                o0Var.h.t.S();
                break;
            case 3:
                o0Var.h.t.D();
                break;
            case 4:
                o0Var.h.t.J0();
                break;
            case 5:
                o0Var.h.t.K0();
                break;
            case 6:
                o0Var.h.g(vVar, true);
                break;
            case 7:
                o0Var.h.t.a();
                break;
            case 8:
                o0Var.h.t.stop();
                break;
            case 9:
                e0 e0Var2 = o0Var.h;
                l1 l1Var = e0Var2.t;
                if (!g2.n0.c0(l1Var, e0Var2.p)) {
                    if (l1Var != null && l1Var.m0(1)) {
                        l1Var.e();
                        break;
                    }
                } else {
                    g2.n0.J(l1Var);
                    break;
                }
                break;
            case 10:
                o0Var.h.t.I0();
                break;
            case 11:
                o0Var.h.t.d0();
                break;
            default:
                l1 l1Var2 = o0Var.h.t;
                String str = g2.n0.a;
                if (l1Var2 != null && l1Var2.m0(1)) {
                    l1Var2.e();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h0(o0 o0Var, d2.f1 f1Var) {
        this.a = 1;
        this.b = o0Var;
    }

    public /* synthetic */ h0(o0 o0Var, n1 n1Var, Bundle bundle) {
        this.a = 0;
        this.b = o0Var;
    }
}
