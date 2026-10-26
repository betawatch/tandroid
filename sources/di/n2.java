package di;

import a8.ye;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.kl;
import org.telegram.ui.kn;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class n2 extends ye {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // a8.ye
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.b;
                j4 j4Var = q4Var.F1;
                boolean x9 = q4Var.z0.W.x();
                y9 y9Var = ((p9) j4Var).d;
                y9Var.j1 = x9;
                y9Var.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.k3 k3Var = ((org.telegram.ui.j4) this.b).I;
                if (k3Var != null) {
                    k3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                un unVar = (un) this.b;
                unVar.z9 = !z10;
                if (z10) {
                    if (unVar.p9 != null) {
                        un.Y1(unVar, 0.0f);
                        unVar.p9 = null;
                    }
                    unVar.q9 = false;
                    unVar.r9 = false;
                    kl klVar = unVar.t9;
                    if (klVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(klVar.H);
                        klVar.a();
                    }
                }
                unVar.Ic();
                break;
            default:
                hc0 hc0Var = (hc0) this.b;
                zb0 zb0Var = hc0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = hc0Var.s;
                nc0 nc0Var = hc0Var.c0;
                if (nc0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (zb0Var.v - zb0Var.u <= MessagesController.getInstance(nc0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.aa aaVar = zb0Var.W;
                            MessageObject c10 = hc0Var.c(aaVar != null ? ((org.telegram.ui.Cells.s1) aaVar).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = nc0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = zb0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = zb0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = kn.c(c10, i10, i11);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(hc0Var.I);
                                break;
                            }
                        } else {
                            hc0Var.g();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // a8.ye
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                un unVar = (un) this.b;
                kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                    if (kVar2.q()) {
                        unVar.G7(false);
                    }
                }
                unVar.X7();
                unVar.K3.j(58, 0L, null);
                break;
        }
    }
}
