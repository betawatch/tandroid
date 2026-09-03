package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.nn;
import org.telegram.ui.ol;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class i2 extends k7.y5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // k7.y5
    public final void a(boolean z4) {
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                z3 z3Var = f4Var.N1;
                boolean y10 = f4Var.H0.T.y();
                i9 i9Var = ((z8) z3Var).d;
                i9Var.g1 = y10;
                i9Var.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.h3 h3Var = ((org.telegram.ui.l4) this.b).F;
                if (h3Var != null) {
                    h3Var.setDisableScroll(z4);
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
                sb0 sb0Var = (sb0) this.b;
                jb0 jb0Var = sb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = sb0Var.s;
                yb0 yb0Var = sb0Var.W;
                if (yb0Var.s) {
                    if (!z4 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z4) {
                        if (jb0Var.v - jb0Var.u <= MessagesController.getInstance(yb0Var.w).quoteLengthMax) {
                            u9 u9Var = jb0Var.W;
                            MessageObject c3 = sb0Var.c(u9Var != null ? ((org.telegram.ui.Cells.t1) u9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = yb0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = jb0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = jb0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = nn.b(i10, i11, c3);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(sb0Var.F);
                                break;
                            }
                        } else {
                            sb0Var.f();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // k7.y5
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
