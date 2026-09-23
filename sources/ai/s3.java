package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.nn;
import org.telegram.ui.ol;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                e6 e6Var = (e6) this.b;
                x5 x5Var = e6Var.Q1;
                boolean y3 = e6Var.K0.W.y();
                jc jcVar = ((ac) x5Var).d;
                jcVar.j1 = y3;
                jcVar.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.i4) this.b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                xn xnVar = (xn) this.b;
                xnVar.n9 = !z10;
                if (z10) {
                    if (xnVar.d9 != null) {
                        xn.V1(xnVar, 0.0f);
                        xnVar.d9 = null;
                    }
                    xnVar.e9 = false;
                    xnVar.f9 = false;
                    ol olVar = xnVar.h9;
                    if (olVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(olVar.H);
                        olVar.a();
                    }
                }
                xnVar.vc();
                break;
            default:
                ob0 ob0Var = (ob0) this.b;
                gb0 gb0Var = ob0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ob0Var.s;
                ub0 ub0Var = ob0Var.c0;
                if (ub0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (gb0Var.v - gb0Var.u <= MessagesController.getInstance(ub0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.z9 z9Var = gb0Var.W;
                            MessageObject c10 = ob0Var.c(z9Var != null ? ((org.telegram.ui.Cells.t1) z9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = ub0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = gb0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = gb0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = nn.b(i10, i11, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ob0Var.I);
                                break;
                            }
                        } else {
                            ob0Var.f();
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
                xn xnVar = (xn) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                    if (kVar2.s()) {
                        xnVar.z7(false);
                    }
                }
                xnVar.Q7();
                xnVar.y3.j(58, 0L, null);
                break;
        }
    }
}
