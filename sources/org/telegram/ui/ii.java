package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ii implements org.telegram.ui.Components.pl0 {
    public final /* synthetic */ yn a;

    public ii(yn ynVar) {
        this.a = ynVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.pl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        yn ynVar = this.a;
        rm rmVar = ynVar.a9;
        if ((rmVar == null || !rmVar.z) && !ynVar.c9()) {
            z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
            if (!z10 && !ynVar.Ma) {
                ynVar.B4 = true;
                if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    MessageObject messageObject = w0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && w0Var.getMessageObject().type != 21 && !w0Var.getMessageObject().isWallpaperAction() && w0Var.getMessageObject().type != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                            if (!kVar.s() || (ynVar.z9() && !z11)) {
                                view2 = view;
                                yn.b2(ynVar, view2, view2 instanceof org.telegram.ui.Cells.u1 ? !((org.telegram.ui.Cells.u1) view2).i3(f7) : false, f7, f10);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = ynVar.I7(view2, false, true, f7, f10, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.u1) {
                                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view2;
                                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().type != 27) {
                                    yn.c2(ynVar, i10);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                if (kVar.s()) {
                }
                view2 = view;
                yn.b2(ynVar, view2, view2 instanceof org.telegram.ui.Cells.u1 ? !((org.telegram.ui.Cells.u1) view2).i3(f7) : false, f7, f10);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.pl0
    public final /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.pl0
    public final /* synthetic */ void q(float f7) {
    }
}
