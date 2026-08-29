package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bi implements org.telegram.ui.Components.cl0 {
    public final /* synthetic */ tn a;

    public bi(tn tnVar) {
        this.a = tnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.cl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(float f9, float f10, int i10, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.l lVar;
        View view2;
        boolean z12;
        tn tnVar = this.a;
        lm lmVar = tnVar.Y8;
        if ((lmVar == null || !lmVar.z) && !tnVar.b9()) {
            z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
            if (!z10 && !tnVar.Ka) {
                tnVar.z4 = true;
                if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    MessageObject messageObject = v0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && v0Var.getMessageObject().type != 21 && !v0Var.getMessageObject().isWallpaperAction() && v0Var.getMessageObject().type != 30) {
                            z11 = false;
                            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                            if (!lVar.s() || (tnVar.A9() && !z11)) {
                                view2 = view;
                                tn.b2(tnVar, view2, view2 instanceof org.telegram.ui.Cells.s1 ? !((org.telegram.ui.Cells.s1) view2).i3(f9) : false, f9, f10);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = tnVar.I7(view2, false, true, f9, f10, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().type != 27) {
                                    tn.c2(tnVar, i10);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                if (lVar.s()) {
                }
                view2 = view;
                tn.b2(tnVar, view2, view2 instanceof org.telegram.ui.Cells.s1 ? !((org.telegram.ui.Cells.s1) view2).i3(f9) : false, f9, f10);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.s1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ void r(float f9) {
    }
}
