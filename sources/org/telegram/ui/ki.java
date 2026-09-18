package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ki implements org.telegram.ui.Components.nl0 {
    public final /* synthetic */ zn a;

    public ki(zn znVar) {
        this.a = znVar;
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
        zn znVar = this.a;
        sm smVar = znVar.c9;
        if ((smVar == null || !smVar.z) && !znVar.b9()) {
            z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
            if (!z10 && !znVar.Oa) {
                znVar.D4 = true;
                if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    MessageObject messageObject = w0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && w0Var.getMessageObject().type != 21 && !w0Var.getMessageObject().isWallpaperAction() && w0Var.getMessageObject().type != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                            if (!kVar.s() || (znVar.A9() && !z11)) {
                                view2 = view;
                                zn.b2(znVar, view2, view2 instanceof org.telegram.ui.Cells.u1 ? !((org.telegram.ui.Cells.u1) view2).i3(f7) : false, f7, f10);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = znVar.I7(view2, false, true, f7, f10, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.u1) {
                                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view2;
                                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().type != 27) {
                                    zn.c2(znVar, i10);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (kVar.s()) {
                }
                view2 = view;
                zn.b2(znVar, view2, view2 instanceof org.telegram.ui.Cells.u1 ? !((org.telegram.ui.Cells.u1) view2).i3(f7) : false, f7, f10);
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
