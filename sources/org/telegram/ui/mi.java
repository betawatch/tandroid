package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mi implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ eo a;

    public mi(eo eoVar) {
        this.a = eoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.ml0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.l lVar;
        View view2;
        boolean z12;
        eo eoVar = this.a;
        wm wmVar = eoVar.c9;
        if ((wmVar == null || !wmVar.z) && !eoVar.b9()) {
            z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
            if (!z10 && !eoVar.Oa) {
                eoVar.D4 = true;
                if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    MessageObject messageObject = w0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && w0Var.getMessageObject().type != 21 && !w0Var.getMessageObject().isWallpaperAction() && w0Var.getMessageObject().type != 30) {
                            z11 = false;
                            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                            if (!lVar.s() || (eoVar.A9() && !z11)) {
                                view2 = view;
                                eo.b2(eoVar, view2, view2 instanceof org.telegram.ui.Cells.t1 ? !((org.telegram.ui.Cells.t1) view2).i3(f7) : false, f7, f10);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = eoVar.I7(view2, false, true, f7, f10, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().type != 27) {
                                    eo.c2(eoVar, i10);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                if (lVar.s()) {
                }
                view2 = view;
                eo.b2(eoVar, view2, view2 instanceof org.telegram.ui.Cells.t1 ? !((org.telegram.ui.Cells.t1) view2).i3(f7) : false, f7, f10);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ml0
    public final /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ml0
    public final /* synthetic */ void p(float f7) {
    }
}
