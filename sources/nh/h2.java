package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.nn;
import org.telegram.ui.ol;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h2 extends k7.x5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // k7.x5
    public final void a(boolean z4) {
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                x3 x3Var = d4Var.N1;
                boolean y10 = d4Var.H0.T.y();
                i9 i9Var = ((z8) x3Var).d;
                i9Var.g1 = y10;
                i9Var.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.l4) this.b).F;
                if (g3Var != null) {
                    g3Var.setDisableScroll(z4);
                    break;
                }
                break;
            case 2:
                xn xnVar = (xn) this.b;
                xnVar.k9 = !z4;
                if (z4) {
                    if (xnVar.a9 != null) {
                        xn.V1(xnVar, 0.0f);
                        xnVar.a9 = null;
                    }
                    xnVar.b9 = false;
                    xnVar.c9 = false;
                    ol olVar = xnVar.e9;
                    if (olVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(olVar.E);
                        olVar.a();
                    }
                }
                xnVar.vc();
                break;
            default:
                qb0 qb0Var = (qb0) this.b;
                hb0 hb0Var = qb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = qb0Var.s;
                wb0 wb0Var = qb0Var.W;
                if (wb0Var.s) {
                    if (!z4 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z4) {
                        if (hb0Var.v - hb0Var.u <= MessagesController.getInstance(wb0Var.w).quoteLengthMax) {
                            u9 u9Var = hb0Var.W;
                            MessageObject c3 = qb0Var.c(u9Var != null ? ((org.telegram.ui.Cells.t1) u9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = wb0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = hb0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = hb0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = nn.b(i10, i11, c3);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(qb0Var.F);
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

    @Override // k7.x5
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                xn xnVar = (xn) this.b;
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    if (kVar2.s()) {
                        xnVar.z7(false);
                    }
                }
                xnVar.Q7();
                xnVar.v3.j(58, 0L, null);
                break;
        }
    }
}
