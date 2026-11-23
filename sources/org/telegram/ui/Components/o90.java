package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o90 extends org.telegram.ui.oq0 {
    public final /* synthetic */ s90 a;

    public o90(s90 s90Var) {
        this.a = s90Var;
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
            s90 s90Var = this.a;
            if (i7 < s90Var.Q.size()) {
                int childCount = s90Var.getListView().getChildCount();
                Object obj = s90Var.Q.get(i7);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = s90Var.getListView().getChildAt(i10);
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
                                wq0Var.d = s90Var.getListView();
                                wq0Var.a = imageReceiver;
                                wq0Var.e = imageReceiver.p();
                                wq0Var.h = imageReceiver.F();
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
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            s90 s90Var = this.a;
            if (i7 >= s90Var.Q.size()) {
                return;
            }
            s90Var.y.a0((TLRPC.BotInlineResult) s90Var.Q.get(i7), z10, i10);
        }
    }
}
