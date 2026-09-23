package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hi implements org.telegram.ui.Components.dl0 {
    public final /* synthetic */ xn a;

    public hi(xn xnVar) {
        this.a = xnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.dl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        xn xnVar = this.a;
        rm rmVar = xnVar.c9;
        if ((rmVar == null || !rmVar.z) && !xnVar.b9()) {
            z10 = ((org.telegram.ui.ActionBar.n2) xnVar).inPreviewMode;
            if (!z10 && !xnVar.Oa) {
                xnVar.D4 = true;
                if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    MessageObject messageObject = w0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && w0Var.getMessageObject().type != 21 && !w0Var.getMessageObject().isWallpaperAction() && w0Var.getMessageObject().type != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                            if (!kVar.s() || (xnVar.A9() && !z11)) {
                                view2 = view;
                                xn.b2(xnVar, view2, view2 instanceof org.telegram.ui.Cells.t1 ? !((org.telegram.ui.Cells.t1) view2).i3(f7) : false, f7, f10);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = xnVar.I7(view2, false, true, f7, f10, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().type != 27) {
                                    xn.c2(xnVar, i10);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                if (kVar.s()) {
                }
                view2 = view;
                xn.b2(xnVar, view2, view2 instanceof org.telegram.ui.Cells.t1 ? !((org.telegram.ui.Cells.t1) view2).i3(f7) : false, f7, f10);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public final /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.dl0
    public final /* synthetic */ void q(float f7) {
    }
}
