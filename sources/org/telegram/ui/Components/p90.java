package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class p90 extends org.telegram.ui.oq0 {
    public final /* synthetic */ t90 a;

    public p90(t90 t90Var) {
        this.a = t90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i7 >= 0) {
            t90 t90Var = this.a;
            if (i7 < t90Var.Q.size()) {
                int childCount = t90Var.getListView().getChildCount();
                Object obj = t90Var.Q.get(i7);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = t90Var.getListView().getChildAt(i10);
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
                                wq0Var.d = t90Var.getListView();
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

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            t90 t90Var = this.a;
            if (i7 >= t90Var.Q.size()) {
                return;
            }
            t90Var.y.g((TLRPC.BotInlineResult) t90Var.Q.get(i7), z10, i10);
        }
    }
}
