package fi;

import c8.ha;
import org.telegram.messenger.gj;
import org.telegram.messenger.kj;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.bn;
import org.telegram.ui.rm;
import org.telegram.ui.uk;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class b2 extends ha {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // c8.ha
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
                qa0 qa0Var = (qa0) this.b;
                ka0 ka0Var = qa0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = qa0Var.s;
                wa0 wa0Var = qa0Var.d0;
                if (wa0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (ka0Var.v - ka0Var.u <= np.u1(wa0Var.x).r4) {
                            r9 r9Var = ka0Var.W;
                            gj c10 = qa0Var.c(r9Var != null ? ((org.telegram.ui.Cells.r1) r9Var).getMessageObject() : null);
                            kj kjVar = wa0Var.d;
                            if (kjVar.d == null) {
                                int i7 = ka0Var.u;
                                kjVar.e = i7;
                                int i10 = ka0Var.v;
                                kjVar.f = i10;
                                kjVar.d = rm.b(i7, i10, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(qa0Var.J);
                                break;
                            }
                        } else {
                            qa0Var.g();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // c8.ha
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
