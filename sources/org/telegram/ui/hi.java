package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hi implements org.telegram.ui.Components.cm0 {
    public final /* synthetic */ un a;

    public hi(un unVar) {
        this.a = unVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.cm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        un unVar = this.a;
        nm nmVar = unVar.o9;
        if ((nmVar == null || !nmVar.z) && !unVar.l9()) {
            z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
            if (!z10 && !unVar.bb) {
                unVar.P4 = true;
                if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    MessageObject messageObject = v0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && v0Var.getMessageObject().type != 21 && !v0Var.getMessageObject().isWallpaperAction() && v0Var.getMessageObject().type != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                            if (!kVar.q() || (unVar.J9() && !z11)) {
                                view2 = view;
                                un.e2(unVar, view2, view2 instanceof org.telegram.ui.Cells.s1 ? !((org.telegram.ui.Cells.s1) view2).i3(f7) : false, f7, f10);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = unVar.P7(view2, false, true, f7, f10, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().type != 27) {
                                    un.f2(unVar, i10);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                if (kVar.q()) {
                }
                view2 = view;
                un.e2(unVar, view2, view2 instanceof org.telegram.ui.Cells.s1 ? !((org.telegram.ui.Cells.s1) view2).i3(f7) : false, f7, f10);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.s1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cm0
    public final /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.cm0
    public final /* synthetic */ void o(float f7) {
    }
}
