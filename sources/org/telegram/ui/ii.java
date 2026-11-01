package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ii extends xr0 {
    public final /* synthetic */ un a;

    public ii(un unVar) {
        this.a = unVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                                fs0 fs0Var = new fs0();
                                fs0Var.b = iArr[0];
                                fs0Var.c = iArr[1];
                                fs0Var.d = unVar.W1.getListView();
                                fs0Var.a = imageReceiver;
                                fs0Var.e = imageReceiver.p();
                                fs0Var.h = imageReceiver.E();
                                return fs0Var;
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

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            un unVar = this.a;
            if (i10 >= unVar.bb.size()) {
                return;
            }
            unVar.yb((TLRPC.BotInlineResult) unVar.bb.get(i10), z10, i11, 0L);
        }
    }
}
