package fi;

import c8.fa;
import org.telegram.messenger.gj;
import org.telegram.messenger.kj;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.an;
import org.telegram.ui.qm;
import org.telegram.ui.tk;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d2 extends fa {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // c8.fa
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                b4 b4Var = (b4) this.b;
                u3 u3Var = b4Var.A1;
                boolean x10 = b4Var.u0.a0.x();
                i9 i9Var = ((z8) u3Var).d;
                i9Var.j1 = x10;
                i9Var.V();
                break;
            case 1:
                an anVar = (an) this.b;
                anVar.J9 = !z10;
                if (z10) {
                    if (anVar.u9 != null) {
                        an.e2(anVar, 0.0f);
                        anVar.u9 = null;
                    }
                    anVar.v9 = false;
                    anVar.B9 = false;
                    tk tkVar = anVar.D9;
                    if (tkVar != null) {
                        org.telegram.messenger.g0.r(tkVar.I);
                        tkVar.a();
                    }
                }
                anVar.dd();
                break;
            default:
                ea0 ea0Var = (ea0) this.b;
                y90 y90Var = ea0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ea0Var.s;
                ka0 ka0Var = ea0Var.d0;
                if (ka0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (y90Var.v - y90Var.u <= np.s1(ka0Var.x).p4) {
                            org.telegram.ui.Cells.p9 p9Var = y90Var.W;
                            gj c10 = ea0Var.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                            kj kjVar = ka0Var.d;
                            if (kjVar.d == null) {
                                int i7 = y90Var.u;
                                kjVar.e = i7;
                                int i10 = y90Var.v;
                                kjVar.f = i10;
                                kjVar.d = qm.b(i7, i10, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ea0Var.J);
                                break;
                            }
                        } else {
                            ea0Var.g();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // c8.fa
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 1:
                an anVar = (an) this.b;
                kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    if (kVar2.x()) {
                        anVar.O7(false);
                    }
                }
                anVar.h8();
                anVar.N3.j(58, 0L, null);
                break;
        }
    }
}
