package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.fo;
import org.telegram.ui.un;
import org.telegram.ui.vl;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class i3 extends w7.w5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // w7.w5
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                q5 q5Var = (q5) this.b;
                j5 j5Var = q5Var.Q1;
                boolean x10 = q5Var.K0.W.x();
                sb sbVar = ((jb) j5Var).d;
                sbVar.j1 = x10;
                sbVar.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.k4) this.b).I;
                if (e3Var != null) {
                    e3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                fo foVar = (fo) this.b;
                foVar.n9 = !z10;
                if (z10) {
                    if (foVar.d9 != null) {
                        fo.W1(foVar, 0.0f);
                        foVar.d9 = null;
                    }
                    foVar.e9 = false;
                    foVar.f9 = false;
                    vl vlVar = foVar.h9;
                    if (vlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(vlVar.H);
                        vlVar.a();
                    }
                }
                foVar.zc();
                break;
            default:
                pc0 pc0Var = (pc0) this.b;
                gc0 gc0Var = pc0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pc0Var.s;
                vc0 vc0Var = pc0Var.c0;
                if (vc0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (gc0Var.v - gc0Var.u <= MessagesController.getInstance(vc0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.w9 w9Var = gc0Var.W;
                            MessageObject c10 = pc0Var.c(w9Var != null ? ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = vc0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = gc0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = gc0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = un.b(i10, i11, c10);
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

    @Override // w7.w5
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                fo foVar = (fo) this.b;
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                    if (kVar2.t()) {
                        foVar.C7(false);
                    }
                }
                foVar.T7();
                foVar.y3.j(58, 0L, null);
                break;
        }
    }
}
