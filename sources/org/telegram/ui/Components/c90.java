package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class c90 extends org.telegram.ui.nq0 {
    public final /* synthetic */ g90 a;

    public c90(g90 g90Var) {
        this.a = g90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver imageReceiver;
        if (i7 >= 0) {
            g90 g90Var = this.a;
            if (i7 < g90Var.P.size()) {
                int childCount = g90Var.getListView().getChildCount();
                Object obj = g90Var.P.get(i7);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = g90Var.getListView().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        if (h2Var.getResult() == obj) {
                            imageReceiver = h2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                                wq0Var.b = iArr[0];
                                wq0Var.c = iArr[1];
                                wq0Var.d = g90Var.getListView();
                                wq0Var.a = imageReceiver;
                                wq0Var.e = imageReceiver.p();
                                wq0Var.h = imageReceiver.E();
                                return wq0Var;
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

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        if (i7 >= 0) {
            g90 g90Var = this.a;
            if (i7 >= g90Var.P.size()) {
                return;
            }
            g90Var.y.M((TLRPC.BotInlineResult) g90Var.P.get(i7), z9, i10);
        }
    }
}
