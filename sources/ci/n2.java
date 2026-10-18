package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.in;
import org.telegram.ui.kl;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class n2 extends w7.j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // w7.j0
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                p4 p4Var = (p4) this.b;
                i4 i4Var = p4Var.Q1;
                boolean x10 = p4Var.K0.W.x();
                z9 z9Var = ((q9) i4Var).d;
                z9Var.j1 = x10;
                z9Var.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.l4) this.b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                sn snVar = (sn) this.b;
                snVar.n9 = !z10;
                if (z10) {
                    if (snVar.d9 != null) {
                        sn.W1(snVar, 0.0f);
                        snVar.d9 = null;
                    }
                    snVar.e9 = false;
                    snVar.f9 = false;
                    kl klVar = snVar.h9;
                    if (klVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(klVar.H);
                        klVar.a();
                    }
                }
                snVar.zc();
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
                                messagePreviewParams.quote = in.c(c10, i10, i11);
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
                sn snVar = (sn) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                    if (kVar2.s()) {
                        snVar.C7(false);
                    }
                }
                snVar.T7();
                snVar.y3.j(58, 0L, null);
                break;
        }
    }
}
