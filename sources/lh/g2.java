package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.il;
import org.telegram.ui.jn;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g2 extends i7.b6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // i7.b6
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                x3 x3Var = d4Var.M1;
                boolean y8 = d4Var.G0.S.y();
                i9 i9Var = ((z8) x3Var).d;
                i9Var.f1 = y8;
                i9Var.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.m4) this.b).E;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                tn tnVar = (tn) this.b;
                tnVar.j9 = !z10;
                if (z10) {
                    if (tnVar.Z8 != null) {
                        tn.V1(tnVar, 0.0f);
                        tnVar.Z8 = null;
                    }
                    tnVar.a9 = false;
                    tnVar.b9 = false;
                    il ilVar = tnVar.d9;
                    if (ilVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(ilVar.D);
                        ilVar.a();
                    }
                }
                tnVar.vc();
                break;
            default:
                lb0 lb0Var = (lb0) this.b;
                db0 db0Var = lb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lb0Var.s;
                rb0 rb0Var = lb0Var.V;
                if (rb0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (db0Var.v - db0Var.u <= MessagesController.getInstance(rb0Var.w).quoteLengthMax) {
                            s9 s9Var = db0Var.W;
                            MessageObject c3 = lb0Var.c(s9Var != null ? ((org.telegram.ui.Cells.s1) s9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = rb0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = db0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = db0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = jn.b(i10, i11, c3);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(lb0Var.E);
                                break;
                            }
                        } else {
                            lb0Var.f();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // i7.b6
    public void b() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 2:
                tn tnVar = (tn) this.b;
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    if (lVar2.s()) {
                        tnVar.z7(false);
                    }
                }
                tnVar.Q7();
                tnVar.u3.j(58, 0L, null);
                break;
        }
    }
}
