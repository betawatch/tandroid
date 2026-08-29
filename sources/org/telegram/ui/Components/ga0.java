package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ga0 extends org.telegram.ui.pt0 {
    public final /* synthetic */ ka0 a;

    public ga0(ka0 ka0Var) {
        this.a = ka0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            ka0 ka0Var = this.a;
            if (i10 < ka0Var.L.size()) {
                int childCount = ka0Var.getListView().getChildCount();
                Object obj = ka0Var.L.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ka0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        if (d2Var.getResult() == obj) {
                            imageReceiver = d2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.zt0 zt0Var = new org.telegram.ui.zt0();
                                zt0Var.b = iArr[0];
                                zt0Var.c = iArr[1];
                                zt0Var.d = ka0Var.getListView();
                                zt0Var.a = imageReceiver;
                                zt0Var.e = imageReceiver.getBitmapSafe();
                                zt0Var.h = imageReceiver.getRoundRadius(true);
                                return zt0Var;
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

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            ka0 ka0Var = this.a;
            if (i10 >= ka0Var.L.size()) {
                return;
            }
            ka0Var.x.b((TLRPC.BotInlineResult) ka0Var.L.get(i10), z10, i11);
        }
    }
}
