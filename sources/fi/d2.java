package fi;

import c8.fa;
import org.telegram.messenger.gj;
import org.telegram.messenger.kj;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.an;
import org.telegram.ui.qm;
import org.telegram.ui.tk;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                da0 da0Var = (da0) this.b;
                x90 x90Var = da0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = da0Var.s;
                ja0 ja0Var = da0Var.d0;
                if (ja0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (x90Var.v - x90Var.u <= np.s1(ja0Var.x).p4) {
                            org.telegram.ui.Cells.p9 p9Var = x90Var.W;
                            gj c10 = da0Var.c(p9Var != null ? ((org.telegram.ui.Cells.q1) p9Var).getMessageObject() : null);
                            kj kjVar = ja0Var.d;
                            if (kjVar.d == null) {
                                int i7 = x90Var.u;
                                kjVar.e = i7;
                                int i10 = x90Var.v;
                                kjVar.f = i10;
                                kjVar.d = qm.b(i7, i10, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(da0Var.J);
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
