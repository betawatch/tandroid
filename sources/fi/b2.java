package fi;

import c8.ia;
import org.telegram.messenger.fj;
import org.telegram.messenger.jj;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.bn;
import org.telegram.ui.rm;
import org.telegram.ui.uk;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class b2 extends ia {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // c8.ia
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                z3 z3Var = (z3) this.b;
                s3 s3Var = z3Var.A1;
                boolean x10 = z3Var.u0.a0.x();
                f9 f9Var = ((w8) s3Var).d;
                f9Var.j1 = x10;
                f9Var.V();
                break;
            case 1:
                bn bnVar = (bn) this.b;
                bnVar.K9 = !z10;
                if (z10) {
                    if (bnVar.v9 != null) {
                        bn.e2(bnVar, 0.0f);
                        bnVar.v9 = null;
                    }
                    bnVar.w9 = false;
                    bnVar.C9 = false;
                    uk ukVar = bnVar.E9;
                    if (ukVar != null) {
                        org.telegram.messenger.g0.r(ukVar.I);
                        ukVar.a();
                    }
                }
                bnVar.dd();
                break;
            default:
                na0 na0Var = (na0) this.b;
                ha0 ha0Var = na0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = na0Var.s;
                ta0 ta0Var = na0Var.d0;
                if (ta0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (ha0Var.v - ha0Var.u <= mp.u1(ta0Var.x).r4) {
                            q9 q9Var = ha0Var.W;
                            fj c10 = na0Var.c(q9Var != null ? ((org.telegram.ui.Cells.r1) q9Var).getMessageObject() : null);
                            jj jjVar = ta0Var.d;
                            if (jjVar.d == null) {
                                int i7 = ha0Var.u;
                                jjVar.e = i7;
                                int i10 = ha0Var.v;
                                jjVar.f = i10;
                                jjVar.d = rm.b(i7, i10, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(na0Var.J);
                                break;
                            }
                        } else {
                            na0Var.g();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // c8.ia
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 1:
                bn bnVar = (bn) this.b;
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    if (kVar2.x()) {
                        bnVar.O7(false);
                    }
                }
                bnVar.h8();
                bnVar.N3.j(58, 0L, null);
                break;
        }
    }
}
