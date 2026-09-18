package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.ol;
import org.telegram.ui.pn;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class s3 extends w7.i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // w7.i0
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
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.h4) this.b).I;
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
                        zn.V1(znVar, 0.0f);
                        znVar.d9 = null;
                    }
                    znVar.e9 = false;
                    znVar.f9 = false;
                    ol olVar = znVar.h9;
                    if (olVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(olVar.H);
                        olVar.a();
                    }
                }
                znVar.vc();
                break;
            default:
                yb0 yb0Var = (yb0) this.b;
                pb0 pb0Var = yb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = yb0Var.s;
                ec0 ec0Var = yb0Var.c0;
                if (ec0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (pb0Var.v - pb0Var.u <= MessagesController.getInstance(ec0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.y9 y9Var = pb0Var.W;
                            MessageObject c10 = yb0Var.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = ec0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = pb0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = pb0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = pn.b(i10, i11, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(yb0Var.I);
                                break;
                            }
                        } else {
                            yb0Var.f();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // w7.i0
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                zn znVar = (zn) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    if (kVar2.s()) {
                        znVar.z7(false);
                    }
                }
                znVar.Q7();
                znVar.y3.j(58, 0L, null);
                break;
        }
    }
}
