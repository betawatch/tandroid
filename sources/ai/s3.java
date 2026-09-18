package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.bo;
import org.telegram.ui.rl;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class s3 extends w7.h0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // w7.h0
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                y5 y5Var = f6Var.Q1;
                boolean y3 = f6Var.K0.W.y();
                jc jcVar = ((ac) y5Var).d;
                jcVar.j1 = y3;
                jcVar.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.h4) this.b).I;
                if (g3Var != null) {
                    g3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                bo boVar = (bo) this.b;
                boVar.n9 = !z10;
                if (z10) {
                    if (boVar.d9 != null) {
                        bo.V1(boVar, 0.0f);
                        boVar.d9 = null;
                    }
                    boVar.e9 = false;
                    boVar.f9 = false;
                    rl rlVar = boVar.h9;
                    if (rlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rlVar.H);
                        rlVar.a();
                    }
                }
                boVar.vc();
                break;
            default:
                pb0 pb0Var = (pb0) this.b;
                gb0 gb0Var = pb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pb0Var.s;
                vb0 vb0Var = pb0Var.c0;
                if (vb0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (gb0Var.v - gb0Var.u <= MessagesController.getInstance(vb0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.y9 y9Var = gb0Var.W;
                            MessageObject c10 = pb0Var.c(y9Var != null ? ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = vb0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = gb0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = gb0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = rn.b(i10, i11, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(pb0Var.I);
                                break;
                            }
                        } else {
                            pb0Var.f();
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
                bo boVar = (bo) this.b;
                kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                    if (kVar2.s()) {
                        boVar.z7(false);
                    }
                }
                boVar.Q7();
                boVar.y3.j(58, 0L, null);
                break;
        }
    }
}
