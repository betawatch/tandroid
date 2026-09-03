package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ii implements org.telegram.ui.Components.kl0 {
    public final /* synthetic */ zn a;

    public ii(zn znVar) {
        this.a = znVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.kl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f10, float f11, int i10, View view) {
        boolean z4;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z11;
        zn znVar = this.a;
        sm smVar = znVar.Z8;
        if ((smVar == null || !smVar.z) && !znVar.b9()) {
            z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
            if (!z4 && !znVar.La) {
                znVar.A4 = true;
                if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    MessageObject messageObject = v0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && v0Var.getMessageObject().type != 21 && !v0Var.getMessageObject().isWallpaperAction() && v0Var.getMessageObject().type != 30) {
                            z10 = false;
                            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                            if (!kVar.s() || (znVar.A9() && !z10)) {
                                view2 = view;
                                zn.b2(znVar, view2, view2 instanceof org.telegram.ui.Cells.s1 ? !((org.telegram.ui.Cells.s1) view2).i3(f10) : false, f10, f11);
                                z11 = true;
                            } else {
                                view2 = view;
                                z11 = znVar.I7(view2, false, true, f10, f11, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().type != 27) {
                                    zn.c2(znVar, i10);
                                    return true;
                                }
                            }
                            return z11;
                        }
                    }
                }
                z10 = true;
                kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                if (kVar.s()) {
                }
                view2 = view;
                zn.b2(znVar, view2, view2 instanceof org.telegram.ui.Cells.s1 ? !((org.telegram.ui.Cells.s1) view2).i3(f10) : false, f10, f11);
                z11 = true;
                if (view2 instanceof org.telegram.ui.Cells.s1) {
                }
                return z11;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public final /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.kl0
    public final /* synthetic */ void p(float f10) {
    }
}
