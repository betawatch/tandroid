package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.in;
import org.telegram.ui.jl;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                org.telegram.ui.ActionBar.h3 h3Var = ((org.telegram.ui.k4) this.b).I;
                if (h3Var != null) {
                    h3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                sn snVar = (sn) this.b;
                snVar.z9 = !z10;
                if (z10) {
                    if (snVar.p9 != null) {
                        sn.W1(snVar, 0.0f);
                        snVar.p9 = null;
                    }
                    snVar.q9 = false;
                    snVar.r9 = false;
                    jl jlVar = snVar.t9;
                    if (jlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(jlVar.H);
                        jlVar.a();
                    }
                }
                snVar.Cc();
                break;
            default:
                lc0 lc0Var = (lc0) this.b;
                dc0 dc0Var = lc0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lc0Var.s;
                rc0 rc0Var = lc0Var.c0;
                if (rc0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (dc0Var.v - dc0Var.u <= MessagesController.getInstance(rc0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.w9 w9Var = dc0Var.W;
                            MessageObject c10 = lc0Var.c(w9Var != null ? ((org.telegram.ui.Cells.t1) w9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = rc0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = dc0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = dc0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = in.c(c10, i10, i11);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(lc0Var.I);
                                break;
                            }
                        } else {
                            lc0Var.g();
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
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                    if (kVar2.s()) {
                        snVar.C7(false);
                    }
                }
                snVar.T7();
                snVar.K3.j(58, 0L, null);
                break;
        }
    }
}
