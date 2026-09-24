package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.mn;
import org.telegram.ui.nl;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                e6 e6Var = (e6) this.b;
                x5 x5Var = e6Var.Q1;
                boolean y3 = e6Var.K0.W.y();
                jc jcVar = ((ac) x5Var).d;
                jcVar.j1 = y3;
                jcVar.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.i4) this.b).I;
                if (e3Var != null) {
                    e3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                wn wnVar = (wn) this.b;
                wnVar.n9 = !z10;
                if (z10) {
                    if (wnVar.d9 != null) {
                        wn.V1(wnVar, 0.0f);
                        wnVar.d9 = null;
                    }
                    wnVar.e9 = false;
                    wnVar.f9 = false;
                    nl nlVar = wnVar.h9;
                    if (nlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(nlVar.H);
                        nlVar.a();
                    }
                }
                wnVar.vc();
                break;
            default:
                zb0 zb0Var = (zb0) this.b;
                rb0 rb0Var = zb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = zb0Var.s;
                fc0 fc0Var = zb0Var.c0;
                if (fc0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (rb0Var.v - rb0Var.u <= MessagesController.getInstance(fc0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.y9 y9Var = rb0Var.W;
                            MessageObject c10 = zb0Var.c(y9Var != null ? ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = fc0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = rb0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = rb0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = mn.b(i10, i11, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(zb0Var.I);
                                break;
                            }
                        } else {
                            zb0Var.f();
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
                wn wnVar = (wn) this.b;
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    if (kVar2.s()) {
                        wnVar.z7(false);
                    }
                }
                wnVar.Q7();
                wnVar.y3.j(58, 0L, null);
                break;
        }
    }
}
