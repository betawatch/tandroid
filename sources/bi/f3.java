package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.co;
import org.telegram.ui.rl;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class f3 extends w7.h0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // w7.h0
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.b;
                h5 h5Var = o5Var.Q1;
                boolean y3 = o5Var.K0.W.y();
                pb pbVar = ((gb) h5Var).d;
                pbVar.j1 = y3;
                pbVar.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.i4) this.b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                co coVar = (co) this.b;
                coVar.n9 = !z10;
                if (z10) {
                    if (coVar.d9 != null) {
                        co.V1(coVar, 0.0f);
                        coVar.d9 = null;
                    }
                    coVar.e9 = false;
                    coVar.f9 = false;
                    rl rlVar = coVar.h9;
                    if (rlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rlVar.H);
                        rlVar.a();
                    }
                }
                coVar.vc();
                break;
            default:
                qb0 qb0Var = (qb0) this.b;
                hb0 hb0Var = qb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = qb0Var.s;
                wb0 wb0Var = qb0Var.c0;
                if (wb0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (hb0Var.v - hb0Var.u <= MessagesController.getInstance(wb0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.y9 y9Var = hb0Var.W;
                            MessageObject c10 = qb0Var.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = wb0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = hb0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = hb0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = sn.b(i10, i11, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(qb0Var.I);
                                break;
                            }
                        } else {
                            qb0Var.f();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // w7.h0
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                co coVar = (co) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    if (kVar2.s()) {
                        coVar.z7(false);
                    }
                }
                coVar.Q7();
                coVar.y3.j(58, 0L, null);
                break;
        }
    }
}
