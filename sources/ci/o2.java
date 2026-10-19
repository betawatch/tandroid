package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.gn;
import org.telegram.ui.il;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class o2 extends w7.j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // w7.j0
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.b;
                j4 j4Var = q4Var.Q1;
                boolean x10 = q4Var.K0.W.x();
                aa aaVar = ((r9) j4Var).d;
                aaVar.j1 = x10;
                aaVar.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.l4) this.b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                qn qnVar = (qn) this.b;
                qnVar.n9 = !z10;
                if (z10) {
                    if (qnVar.d9 != null) {
                        qn.W1(qnVar, 0.0f);
                        qnVar.d9 = null;
                    }
                    qnVar.e9 = false;
                    qnVar.f9 = false;
                    il ilVar = qnVar.h9;
                    if (ilVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(ilVar.H);
                        ilVar.a();
                    }
                }
                qnVar.zc();
                break;
            default:
                ic0 ic0Var = (ic0) this.b;
                ac0 ac0Var = ic0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ic0Var.s;
                oc0 oc0Var = ic0Var.c0;
                if (oc0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (ac0Var.v - ac0Var.u <= MessagesController.getInstance(oc0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.v9 v9Var = ac0Var.W;
                            MessageObject c10 = ic0Var.c(v9Var != null ? ((org.telegram.ui.Cells.u1) v9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = oc0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = ac0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = ac0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = gn.c(c10, i10, i11);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ic0Var.I);
                                break;
                            }
                        } else {
                            ic0Var.g();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // w7.j0
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                qn qnVar = (qn) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    if (kVar2.t()) {
                        qnVar.C7(false);
                    }
                }
                qnVar.T7();
                qnVar.y3.j(58, 0L, null);
                break;
        }
    }
}
