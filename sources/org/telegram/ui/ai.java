package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ai implements org.telegram.ui.Components.sk0 {
    public final /* synthetic */ rn a;

    public ai(rn rnVar) {
        this.a = rnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.sk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f10, float f11, int i10, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        rn rnVar = this.a;
        km kmVar = rnVar.Y8;
        if ((kmVar == null || !kmVar.z) && !rnVar.b9()) {
            z10 = ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode;
            if (!z10 && !rnVar.Ka) {
                rnVar.z4 = true;
                if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    MessageObject messageObject = v0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && v0Var.getMessageObject().type != 21 && !v0Var.getMessageObject().isWallpaperAction() && v0Var.getMessageObject().type != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                            if (!kVar.t() || (rnVar.A9() && !z11)) {
                                view2 = view;
                                rn.b2(rnVar, view2, view2 instanceof org.telegram.ui.Cells.s1 ? !((org.telegram.ui.Cells.s1) view2).h3(f10) : false, f10, f11);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = rnVar.I7(view2, false, true, f10, f11, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().type != 27) {
                                    rn.c2(rnVar, i10);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                if (kVar.t()) {
                }
                view2 = view;
                rn.b2(rnVar, view2, view2 instanceof org.telegram.ui.Cells.s1 ? !((org.telegram.ui.Cells.s1) view2).h3(f10) : false, f10, f11);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.s1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sk0
    public final /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.sk0
    public final /* synthetic */ void s(float f10) {
    }
}
