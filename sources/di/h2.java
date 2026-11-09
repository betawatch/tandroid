package di;

import c8.da;
import org.telegram.messenger.ij;
import org.telegram.messenger.mj;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.cn;
import org.telegram.ui.sm;
import org.telegram.ui.vk;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                j4 j4Var = (j4) this.b;
                c4 c4Var = j4Var.z1;
                boolean x10 = j4Var.t0.W.x();
                q9 q9Var = ((h9) c4Var).d;
                q9Var.i1 = x10;
                q9Var.V();
                break;
            case 1:
                cn cnVar = (cn) this.b;
                cnVar.I9 = !z9;
                if (z9) {
                    if (cnVar.t9 != null) {
                        cn.e2(cnVar, 0.0f);
                        cnVar.t9 = null;
                    }
                    cnVar.u9 = false;
                    cnVar.A9 = false;
                    vk vkVar = cnVar.C9;
                    if (vkVar != null) {
                        org.telegram.messenger.g0.r(vkVar.H);
                        vkVar.a();
                    }
                }
                cnVar.cd();
                break;
            default:
                da0 da0Var = (da0) this.b;
                x90 x90Var = da0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = da0Var.s;
                ja0 ja0Var = da0Var.c0;
                if (ja0Var.s) {
                    if (!z9 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z9) {
                        if (x90Var.v - x90Var.u <= qp.s1(ja0Var.x).o4) {
                            org.telegram.ui.Cells.q9 q9Var2 = x90Var.W;
                            ij c10 = da0Var.c(q9Var2 != null ? ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject() : null);
                            mj mjVar = ja0Var.d;
                            if (mjVar.d == null) {
                                int i7 = x90Var.u;
                                mjVar.e = i7;
                                int i10 = x90Var.v;
                                mjVar.f = i10;
                                mjVar.d = sm.b(i7, i10, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(da0Var.I);
                                break;
                            }
                        } else {
                            da0Var.g();
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
                cn cnVar = (cn) this.b;
                kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    if (kVar2.w()) {
                        cnVar.O7(false);
                    }
                }
                cnVar.g8();
                cnVar.M3.j(58, 0L, null);
                break;
        }
    }
}
