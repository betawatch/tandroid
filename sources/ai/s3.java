package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.pl;
import org.telegram.ui.pn;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                    pl plVar = znVar.h9;
                    if (plVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(plVar.H);
                        plVar.a();
                    }
                }
                znVar.vc();
                break;
            default:
                ac0 ac0Var = (ac0) this.b;
                rb0 rb0Var = ac0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ac0Var.s;
                gc0 gc0Var = ac0Var.c0;
                if (gc0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (rb0Var.v - rb0Var.u <= MessagesController.getInstance(gc0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.z9 z9Var = rb0Var.W;
                            MessageObject c10 = ac0Var.c(z9Var != null ? ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = gc0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = rb0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = rb0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = pn.b(i10, i11, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ac0Var.I);
                                break;
                            }
                        } else {
                            ac0Var.f();
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
