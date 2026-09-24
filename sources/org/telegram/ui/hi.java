package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class hi implements org.telegram.ui.Components.nl0 {
    public final /* synthetic */ wn a;

    public hi(wn wnVar) {
        this.a = wnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.nl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        wn wnVar = this.a;
        qm qmVar = wnVar.c9;
        if ((qmVar == null || !qmVar.z) && !wnVar.b9()) {
            z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
            if (!z10 && !wnVar.Oa) {
                wnVar.D4 = true;
                if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    MessageObject messageObject = w0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && w0Var.getMessageObject().type != 21 && !w0Var.getMessageObject().isWallpaperAction() && w0Var.getMessageObject().type != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                            if (!kVar.s() || (wnVar.A9() && !z11)) {
                                view2 = view;
                                wn.b2(wnVar, view2, view2 instanceof org.telegram.ui.Cells.u1 ? !((org.telegram.ui.Cells.u1) view2).i3(f7) : false, f7, f10);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = wnVar.I7(view2, false, true, f7, f10, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.u1) {
                                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view2;
                                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().type != 27) {
                                    wn.c2(wnVar, i10);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                if (kVar.s()) {
                }
                view2 = view;
                wn.b2(wnVar, view2, view2 instanceof org.telegram.ui.Cells.u1 ? !((org.telegram.ui.Cells.u1) view2).i3(f7) : false, f7, f10);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nl0
    public final /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.nl0
    public final /* synthetic */ void q(float f7) {
    }
}
