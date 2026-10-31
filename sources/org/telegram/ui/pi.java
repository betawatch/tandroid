package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pi implements org.telegram.ui.Components.jk0 {
    public final /* synthetic */ un a;

    public pi(un unVar) {
        this.a = unVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.jk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.l lVar;
        View view2;
        boolean z12;
        un unVar = this.a;
        lm lmVar = unVar.q9;
        if ((lmVar == null || !lmVar.z) && !unVar.o9()) {
            z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
            if (!z10 && !unVar.ib) {
                unVar.P4 = true;
                if (view instanceof org.telegram.ui.Cells.s0) {
                    org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
                    org.telegram.messenger.jj messageObject = s0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.k.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && s0Var.getMessageObject().D != 21 && !s0Var.getMessageObject().X4() && s0Var.getMessageObject().D != 30) {
                            z11 = false;
                            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                            if (!lVar.u() || (unVar.M9() && !z11)) {
                                view2 = view;
                                un.i2(unVar, view2, view2 instanceof org.telegram.ui.Cells.q1 ? !((org.telegram.ui.Cells.q1) view2).y2(f7) : false, f7, f10);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = unVar.Q7(view2, false, true, f7, f10, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().D != 27) {
                                    un.j2(unVar, i10);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                if (lVar.u()) {
                }
                view2 = view;
                un.i2(unVar, view2, view2 instanceof org.telegram.ui.Cells.q1 ? !((org.telegram.ui.Cells.q1) view2).y2(f7) : false, f7, f10);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jk0
    public final /* synthetic */ void p(float f7) {
    }

    @Override // org.telegram.ui.Components.jk0
    public final /* synthetic */ void g() {
    }
}
