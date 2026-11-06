package di;

import c8.da;
import org.telegram.messenger.ij;
import org.telegram.messenger.mj;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.an;
import org.telegram.ui.qm;
import org.telegram.ui.tk;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class h2 extends da {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // c8.da
    public final void a(boolean z9) {
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                b4 b4Var = i4Var.z1;
                boolean x10 = i4Var.t0.W.x();
                p9 p9Var = ((g9) b4Var).d;
                p9Var.i1 = x10;
                p9Var.V();
                break;
            case 1:
                an anVar = (an) this.b;
                anVar.G9 = !z9;
                if (z9) {
                    if (anVar.r9 != null) {
                        an.d2(anVar, 0.0f);
                        anVar.r9 = null;
                    }
                    anVar.s9 = false;
                    anVar.y9 = false;
                    tk tkVar = anVar.A9;
                    if (tkVar != null) {
                        org.telegram.messenger.g0.r(tkVar.H);
                        tkVar.a();
                    }
                }
                anVar.Zc();
                break;
            default:
                ca0 ca0Var = (ca0) this.b;
                w90 w90Var = ca0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ca0Var.s;
                ia0 ia0Var = ca0Var.c0;
                if (ia0Var.s) {
                    if (!z9 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z9) {
                        if (w90Var.v - w90Var.u <= qp.s1(ia0Var.x).o4) {
                            org.telegram.ui.Cells.q9 q9Var = w90Var.W;
                            ij c10 = ca0Var.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                            mj mjVar = ia0Var.d;
                            if (mjVar.d == null) {
                                int i7 = w90Var.u;
                                mjVar.e = i7;
                                int i10 = w90Var.v;
                                mjVar.f = i10;
                                mjVar.d = qm.b(i7, i10, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ca0Var.I);
                                break;
                            }
                        } else {
                            ca0Var.g();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // c8.da
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 1:
                an anVar = (an) this.b;
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    if (kVar2.v()) {
                        anVar.N7(false);
                    }
                }
                anVar.f8();
                anVar.M3.j(58, 0L, null);
                break;
        }
    }
}
