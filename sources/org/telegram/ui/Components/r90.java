package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class r90 extends org.telegram.ui.oq0 {
    public final /* synthetic */ v90 a;

    public r90(v90 v90Var) {
        this.a = v90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i7 >= 0) {
            v90 v90Var = this.a;
            if (i7 < v90Var.Q.size()) {
                int childCount = v90Var.getListView().getChildCount();
                Object obj = v90Var.Q.get(i7);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = v90Var.getListView().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.i2) {
                        org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) childAt;
                        if (i2Var.getResult() == obj) {
                            imageReceiver = i2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                                wq0Var.b = iArr[0];
                                wq0Var.c = iArr[1];
                                wq0Var.d = v90Var.getListView();
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
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            v90 v90Var = this.a;
            if (i7 >= v90Var.Q.size()) {
                return;
            }
            v90Var.y.g((TLRPC.BotInlineResult) v90Var.Q.get(i7), z10, i10);
        }
    }
}
