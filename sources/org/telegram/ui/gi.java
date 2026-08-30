package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gi implements org.telegram.ui.Components.ll0 {
    public final /* synthetic */ xn a;

    public gi(xn xnVar) {
        this.a = xnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.ll0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f10, float f11, int i10, View view) {
        boolean z4;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z11;
        xn xnVar = this.a;
        qm qmVar = xnVar.Z8;
        if ((qmVar == null || !qmVar.z) && !xnVar.b9()) {
            z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
            if (!z4 && !xnVar.La) {
                xnVar.A4 = true;
                if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    MessageObject messageObject = v0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && v0Var.getMessageObject().type != 21 && !v0Var.getMessageObject().isWallpaperAction() && v0Var.getMessageObject().type != 30) {
                            z10 = false;
                            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                            if (!kVar.s() || (xnVar.A9() && !z10)) {
                                view2 = view;
                                xn.b2(xnVar, view2, view2 instanceof org.telegram.ui.Cells.t1 ? !((org.telegram.ui.Cells.t1) view2).i3(f10) : false, f10, f11);
                                z11 = true;
                            } else {
                                view2 = view;
                                z11 = xnVar.I7(view2, false, true, f10, f11, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().type != 27) {
                                    xn.c2(xnVar, i10);
                                    return true;
                                }
                            }
                            return z11;
                        }
                    }
                }
                z10 = true;
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                if (kVar.s()) {
                }
                view2 = view;
                xn.b2(xnVar, view2, view2 instanceof org.telegram.ui.Cells.t1 ? !((org.telegram.ui.Cells.t1) view2).i3(f10) : false, f10, f11);
                z11 = true;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                }
                return z11;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public final /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ll0
    public final /* synthetic */ void p(float f10) {
    }
}
