package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y80 extends org.telegram.ui.eq0 {
    public final /* synthetic */ c90 a;

    public y80(c90 c90Var) {
        this.a = c90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i3 >= 0) {
            c90 c90Var = this.a;
            if (i3 < c90Var.Q.size()) {
                int childCount = c90Var.getListView().getChildCount();
                Object obj = c90Var.Q.get(i3);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = c90Var.getListView().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        if (h2Var.getResult() == obj) {
                            imageReceiver = h2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0();
                                mq0Var.b = iArr[0];
                                mq0Var.c = iArr[1];
                                mq0Var.d = c90Var.getListView();
                                mq0Var.a = imageReceiver;
                                mq0Var.e = imageReceiver.p();
                                mq0Var.h = imageReceiver.E();
                                return mq0Var;
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

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i3 >= 0) {
            c90 c90Var = this.a;
            if (i3 >= c90Var.Q.size()) {
                return;
            }
            c90Var.y.e((TLRPC.BotInlineResult) c90Var.Q.get(i3), z10, i10);
        }
    }
}
