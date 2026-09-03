package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.pn;
import org.telegram.ui.ql;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class h2 extends k7.x5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // k7.x5
    public final void a(boolean z4) {
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                x3 x3Var = d4Var.N1;
                boolean y10 = d4Var.H0.T.y();
                i9 i9Var = ((z8) x3Var).d;
                i9Var.g1 = y10;
                i9Var.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.n4) this.b).F;
                if (g3Var != null) {
                    g3Var.setDisableScroll(z4);
                    break;
                }
                break;
            case 2:
                zn znVar = (zn) this.b;
                znVar.k9 = !z4;
                if (z4) {
                    if (znVar.a9 != null) {
                        zn.V1(znVar, 0.0f);
                        znVar.a9 = null;
                    }
                    znVar.b9 = false;
                    znVar.c9 = false;
                    ql qlVar = znVar.e9;
                    if (qlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(qlVar.E);
                        qlVar.a();
                    }
                }
                znVar.vc();
                break;
            default:
                rb0 rb0Var = (rb0) this.b;
                ib0 ib0Var = rb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = rb0Var.s;
                xb0 xb0Var = rb0Var.W;
                if (xb0Var.s) {
                    if (!z4 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z4) {
                        if (ib0Var.v - ib0Var.u <= MessagesController.getInstance(xb0Var.w).quoteLengthMax) {
                            t9 t9Var = ib0Var.W;
                            MessageObject c3 = rb0Var.c(t9Var != null ? ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = xb0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = ib0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = ib0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = pn.b(i10, i11, c3);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(rb0Var.F);
                                break;
                            }
                        } else {
                            rb0Var.f();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // k7.x5
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                zn znVar = (zn) this.b;
                kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                    if (kVar2.s()) {
                        znVar.z7(false);
                    }
                }
                znVar.Q7();
                znVar.v3.j(58, 0L, null);
                break;
        }
    }
}
