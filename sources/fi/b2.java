package fi;

import c8.ha;
import org.telegram.messenger.fj;
import org.telegram.messenger.jj;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.bn;
import org.telegram.ui.rm;
import org.telegram.ui.uk;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                oa0 oa0Var = (oa0) this.b;
                ia0 ia0Var = oa0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = oa0Var.s;
                ua0 ua0Var = oa0Var.d0;
                if (ua0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (ia0Var.v - ia0Var.u <= mp.u1(ua0Var.x).r4) {
                            q9 q9Var = ia0Var.W;
                            fj c10 = oa0Var.c(q9Var != null ? ((org.telegram.ui.Cells.q1) q9Var).getMessageObject() : null);
                            jj jjVar = ua0Var.d;
                            if (jjVar.d == null) {
                                int i7 = ia0Var.u;
                                jjVar.e = i7;
                                int i10 = ia0Var.v;
                                jjVar.f = i10;
                                jjVar.d = rm.b(i7, i10, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(oa0Var.J);
                                break;
                            }
                        } else {
                            oa0Var.g();
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
                kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                    if (kVar2.y()) {
                        bnVar.O7(false);
                    }
                }
                bnVar.h8();
                bnVar.N3.j(58, 0L, null);
                break;
        }
    }
}
