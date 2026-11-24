// default package

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hr1 extends ive {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hr1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ive
    public final void a(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj;
                mu1Var.K9 = !z;
                if (z) {
                    if (mu1Var.v9 != null) {
                        mu1Var.pc(0.0f);
                        mu1Var.v9 = null;
                    }
                    mu1Var.w9 = false;
                    mu1Var.C9 = false;
                    es1 es1Var = mu1Var.E9;
                    if (es1Var != null) {
                        gl.r(es1Var.I);
                        es1Var.a();
                    }
                }
                mu1Var.Rc();
                break;
            case 1:
                f37 f37Var = (f37) obj;
                z27 z27Var = f37Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f37Var.s;
                l37 l37Var = f37Var.d0;
                if (l37Var.s) {
                    if (!z) {
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                            break;
                        }
                    } else if (z27Var.v - z27Var.u <= na7.q1(l37Var.x).k4.N1.f()) {
                        mib mibVar = z27Var.W;
                        k27 a = f37Var.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                        o27 o27Var = l37Var.d;
                        if (o27Var.d == null) {
                            int i = z27Var.u;
                            o27Var.e = i;
                            int i2 = z27Var.v;
                            o27Var.f = i2;
                            o27Var.d = bu1.b(i, i2, a);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(f37Var.J);
                            break;
                        }
                    } else {
                        f37Var.f();
                        break;
                    }
                }
                break;
            default:
                y28 y28Var = (y28) obj;
                t28 t28Var = y28Var.G1;
                boolean w = y28Var.A0.W.w();
                m8b m8bVar = ((d8b) t28Var).d;
                m8bVar.j1 = w;
                m8bVar.U();
                break;
        }
    }

    @Override // ive
    public final void b() {
        a aVar;
        a aVar2;
        switch (this.a) {
            case 0:
                mu1 mu1Var = (mu1) this.b;
                aVar = ((d) mu1Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((d) mu1Var).actionBar;
                    if (aVar2.y()) {
                        mu1Var.F5(false);
                    }
                }
                mu1Var.b6();
                mu1Var.N3.j(58, 0L, null);
                break;
        }
    }
}
