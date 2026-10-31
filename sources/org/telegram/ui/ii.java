package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ii extends yr0 {
    public final /* synthetic */ un a;

    public ii(un unVar) {
        this.a = unVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ek ekVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            un unVar = this.a;
            if (i10 < unVar.bb.size() && (ekVar = unVar.W1) != null && ekVar.getListView() != null) {
                int childCount = unVar.W1.getListView().getChildCount();
                Object obj = unVar.bb.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = unVar.W1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        if (h2Var.getResult() == obj) {
                            imageReceiver = h2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                gs0 gs0Var = new gs0();
                                gs0Var.b = iArr[0];
                                gs0Var.c = iArr[1];
                                gs0Var.d = unVar.W1.getListView();
                                gs0Var.a = imageReceiver;
                                gs0Var.e = imageReceiver.p();
                                gs0Var.h = imageReceiver.E();
                                return gs0Var;
                            }
                        }
                    }
                    imageReceiver = null;
                    if (imageReceiver == null) {
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            un unVar = this.a;
            if (i10 >= unVar.bb.size()) {
                return;
            }
            unVar.tb((TLRPC.BotInlineResult) unVar.bb.get(i10), z10, i11, 0L);
        }
    }
}
