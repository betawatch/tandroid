package ei;

import b8.hf;
import org.telegram.messenger.dj;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.x90;
import org.telegram.ui.mm;
import org.telegram.ui.pk;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l2 extends hf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l2(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // b8.hf
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.b;
                c4 c4Var = j4Var.A1;
                boolean x10 = j4Var.u0.a0.x();
                r9 r9Var = ((i9) c4Var).d;
                r9Var.k1 = x10;
                r9Var.d0();
                break;
            case 1:
                wm wmVar = (wm) this.b;
                wmVar.H9 = !z10;
                if (z10) {
                    if (wmVar.s9 != null) {
                        wm.d2(wmVar, 0.0f);
                        wmVar.s9 = null;
                    }
                    wmVar.t9 = false;
                    wmVar.z9 = false;
                    pk pkVar = wmVar.B9;
                    if (pkVar != null) {
                        org.telegram.messenger.g0.r(pkVar.I);
                        pkVar.a();
                    }
                }
                wmVar.Zc();
                break;
            default:
                x90 x90Var = (x90) this.b;
                r90 r90Var = x90Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x90Var.s;
                da0 da0Var = x90Var.d0;
                if (da0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (r90Var.v - r90Var.u <= hp.s1(da0Var.x).o4) {
                            org.telegram.ui.Cells.p9 p9Var = r90Var.W;
                            zi c2 = x90Var.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                            dj djVar = da0Var.d;
                            if (djVar.d == null) {
                                int i3 = r90Var.u;
                                djVar.e = i3;
                                int i10 = r90Var.v;
                                djVar.f = i10;
                                djVar.d = mm.b(i3, i10, c2);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(x90Var.J);
                                break;
                            }
                        } else {
                            x90Var.g();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // b8.hf
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 1:
                wm wmVar = (wm) this.b;
                kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    if (kVar2.v()) {
                        wmVar.N7(false);
                    }
                }
                wmVar.f8();
                wmVar.N3.j(58, 0L, null);
                break;
        }
    }
}
