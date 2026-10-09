package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.pn;
import org.telegram.ui.rl;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class t3 extends w7.h0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // w7.h0
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                y5 y5Var = f6Var.Q1;
                boolean x10 = f6Var.K0.W.x();
                kc kcVar = ((bc) y5Var).d;
                kcVar.j1 = x10;
                kcVar.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.i4) this.b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                zn znVar = (zn) this.b;
                znVar.n9 = !z10;
                if (z10) {
                    if (znVar.d9 != null) {
                        zn.W1(znVar, 0.0f);
                        znVar.d9 = null;
                    }
                    znVar.e9 = false;
                    znVar.f9 = false;
                    rl rlVar = znVar.h9;
                    if (rlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rlVar.H);
                        rlVar.a();
                    }
                }
                znVar.zc();
                break;
            default:
                pc0 pc0Var = (pc0) this.b;
                hc0 hc0Var = pc0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pc0Var.s;
                vc0 vc0Var = pc0Var.c0;
                if (vc0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (hc0Var.v - hc0Var.u <= MessagesController.getInstance(vc0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.w9 w9Var = hc0Var.W;
                            MessageObject c10 = pc0Var.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = vc0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = hc0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = hc0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = pn.b(i10, i11, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(pc0Var.I);
                                break;
                            }
                        } else {
                            pc0Var.f();
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
                zn znVar = (zn) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    if (kVar2.t()) {
                        znVar.C7(false);
                    }
                }
                znVar.T7();
                znVar.y3.j(58, 0L, null);
                break;
        }
    }
}
