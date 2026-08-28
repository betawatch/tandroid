package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.fl;
import org.telegram.ui.gn;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i2 extends g7.a6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // g7.a6
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                c4 c4Var = i4Var.M1;
                boolean y10 = i4Var.G0.S.y();
                m9 m9Var = ((d9) c4Var).d;
                m9Var.f1 = y10;
                m9Var.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.l4) this.b).E;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                qn qnVar = (qn) this.b;
                qnVar.j9 = !z10;
                if (z10) {
                    if (qnVar.Z8 != null) {
                        qn.V1(qnVar, 0.0f);
                        qnVar.Z8 = null;
                    }
                    qnVar.a9 = false;
                    qnVar.b9 = false;
                    fl flVar = qnVar.d9;
                    if (flVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(flVar.D);
                        flVar.a();
                    }
                }
                qnVar.vc();
                break;
            default:
                wa0 wa0Var = (wa0) this.b;
                oa0 oa0Var = wa0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = wa0Var.s;
                cb0 cb0Var = wa0Var.V;
                if (cb0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (oa0Var.v - oa0Var.u <= MessagesController.getInstance(cb0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.v9 v9Var = oa0Var.W;
                            MessageObject c10 = wa0Var.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = cb0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i9 = oa0Var.u;
                                messagePreviewParams.quoteStart = i9;
                                int i10 = oa0Var.v;
                                messagePreviewParams.quoteEnd = i10;
                                messagePreviewParams.quote = gn.b(i9, i10, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(wa0Var.E);
                                break;
                            }
                        } else {
                            wa0Var.f();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // g7.a6
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                qn qnVar = (qn) this.b;
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    if (kVar2.s()) {
                        qnVar.z7(false);
                    }
                }
                qnVar.Q7();
                qnVar.u3.j(58, 0L, null);
                break;
        }
    }
}
