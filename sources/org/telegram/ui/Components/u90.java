package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u90 extends org.telegram.ui.yr0 {
    public final /* synthetic */ y90 a;

    public u90(y90 y90Var) {
        this.a = y90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            y90 y90Var = this.a;
            if (i10 < y90Var.P.size()) {
                int childCount = y90Var.getListView().getChildCount();
                Object obj = y90Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = y90Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        if (h2Var.getResult() == obj) {
                            imageReceiver = h2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.gs0 gs0Var = new org.telegram.ui.gs0();
                                gs0Var.b = iArr[0];
                                gs0Var.c = iArr[1];
                                gs0Var.d = y90Var.getListView();
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
            y90 y90Var = this.a;
            if (i10 >= y90Var.P.size()) {
                return;
            }
            y90Var.y.m((TLRPC.BotInlineResult) y90Var.P.get(i10), z10, i11);
        }
    }
}
