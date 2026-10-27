package di;

import a8.ye;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.ml;
import org.telegram.ui.mn;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n2 extends ye {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // a8.ye
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.b;
                j4 j4Var = q4Var.F1;
                boolean x9 = q4Var.z0.W.x();
                y9 y9Var = ((p9) j4Var).d;
                y9Var.j1 = x9;
                y9Var.Q();
                break;
            case 1:
                org.telegram.ui.ActionBar.k3 k3Var = ((org.telegram.ui.j4) this.b).I;
                if (k3Var != null) {
                    k3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                wn wnVar = (wn) this.b;
                wnVar.D9 = !z10;
                if (z10) {
                    if (wnVar.t9 != null) {
                        wn.Z1(wnVar, 0.0f);
                        wnVar.t9 = null;
                    }
                    wnVar.u9 = false;
                    wnVar.v9 = false;
                    ml mlVar = wnVar.x9;
                    if (mlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(mlVar.H);
                        mlVar.a();
                    }
                }
                wnVar.Mc();
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
                            org.telegram.ui.Cells.aa aaVar = ac0Var.W;
                            MessageObject c10 = ic0Var.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = oc0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = ac0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = ac0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = mn.c(c10, i10, i11);
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

    @Override // a8.ye
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                wn wnVar = (wn) this.b;
                kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    if (kVar2.q()) {
                        wnVar.I7(false);
                    }
                }
                wnVar.Z7();
                wnVar.K3.j(58, 0L, null);
                break;
        }
    }
}
