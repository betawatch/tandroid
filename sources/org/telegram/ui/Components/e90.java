package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e90 extends org.telegram.ui.mq0 {
    public final /* synthetic */ i90 a;

    public e90(i90 i90Var) {
        this.a = i90Var;
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
            i90 i90Var = this.a;
            if (i7 < i90Var.Q.size()) {
                int childCount = i90Var.getListView().getChildCount();
                Object obj = i90Var.Q.get(i7);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i90Var.getListView().getChildAt(i10);
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
                                uq0Var.d = i90Var.getListView();
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
            i90 i90Var = this.a;
            if (i7 >= i90Var.Q.size()) {
                return;
            }
            i90Var.y.r((TLRPC.BotInlineResult) i90Var.Q.get(i7), z10, i10);
        }
    }
}
