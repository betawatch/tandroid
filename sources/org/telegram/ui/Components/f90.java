package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f90 extends org.telegram.ui.mq0 {
    public final /* synthetic */ j90 a;

    public f90(j90 j90Var) {
        this.a = j90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i7 >= 0) {
            j90 j90Var = this.a;
            if (i7 < j90Var.Q.size()) {
                int childCount = j90Var.getListView().getChildCount();
                Object obj = j90Var.Q.get(i7);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = j90Var.getListView().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        if (h2Var.getResult() == obj) {
                            imageReceiver = h2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.uq0 uq0Var = new org.telegram.ui.uq0();
                                uq0Var.b = iArr[0];
                                uq0Var.c = iArr[1];
                                uq0Var.d = j90Var.getListView();
                                uq0Var.a = imageReceiver;
                                uq0Var.e = imageReceiver.p();
                                uq0Var.h = imageReceiver.E();
                                return uq0Var;
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

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            j90 j90Var = this.a;
            if (i7 >= j90Var.Q.size()) {
                return;
            }
            j90Var.y.r((TLRPC.BotInlineResult) j90Var.Q.get(i7), z10, i10);
        }
    }
}
