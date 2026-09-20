package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.ol;
import org.telegram.ui.pn;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                xb0 xb0Var = (xb0) this.b;
                ob0 ob0Var = xb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = xb0Var.s;
                dc0 dc0Var = xb0Var.c0;
                if (dc0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (ob0Var.v - ob0Var.u <= MessagesController.getInstance(dc0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.z9 z9Var = ob0Var.W;
                            MessageObject c10 = xb0Var.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = dc0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = ob0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = ob0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = pn.b(i10, i11, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(xb0Var.I);
                                break;
                            }
                        } else {
                            xb0Var.f();
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
