package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.hl;
import org.telegram.ui.hn;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class h2 extends h7.j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // h7.j0
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                e4 e4Var = (e4) this.b;
                y3 y3Var = e4Var.M1;
                boolean y10 = e4Var.G0.S.y();
                i9 i9Var = ((z8) y3Var).d;
                i9Var.f1 = y10;
                i9Var.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.m4) this.b).E;
                if (e3Var != null) {
                    e3Var.setDisableScroll(z10);
                    break;
                }
                break;
            case 2:
                rn rnVar = (rn) this.b;
                rnVar.j9 = !z10;
                if (z10) {
                    if (rnVar.Z8 != null) {
                        rn.V1(rnVar, 0.0f);
                        rnVar.Z8 = null;
                    }
                    rnVar.a9 = false;
                    rnVar.b9 = false;
                    hl hlVar = rnVar.d9;
                    if (hlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(hlVar.D);
                        hlVar.a();
                    }
                }
                rnVar.vc();
                break;
            default:
                ab0 ab0Var = (ab0) this.b;
                sa0 sa0Var = ab0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ab0Var.s;
                gb0 gb0Var = ab0Var.V;
                if (gb0Var.s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        break;
                    } else if (z10) {
                        if (sa0Var.v - sa0Var.u <= MessagesController.getInstance(gb0Var.w).quoteLengthMax) {
                            org.telegram.ui.Cells.r9 r9Var = sa0Var.W;
                            MessageObject c10 = ab0Var.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = gb0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = sa0Var.u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = sa0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = hn.b(i10, i11, c10);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ab0Var.E);
                                break;
                            }
                        } else {
                            ab0Var.f();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // h7.j0
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                rn rnVar = (rn) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                    if (kVar2.t()) {
                        rnVar.z7(false);
                    }
                }
                rnVar.Q7();
                rnVar.u3.j(58, 0L, null);
                break;
        }
    }
}
