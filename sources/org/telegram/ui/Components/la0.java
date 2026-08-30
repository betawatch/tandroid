package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class la0 extends org.telegram.ui.yt0 {
    public final /* synthetic */ pa0 a;

    public la0(pa0 pa0Var) {
        this.a = pa0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            pa0 pa0Var = this.a;
            if (i10 < pa0Var.M.size()) {
                int childCount = pa0Var.getListView().getChildCount();
                Object obj = pa0Var.M.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = pa0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                                ju0Var.b = iArr[0];
                                ju0Var.c = iArr[1];
                                ju0Var.d = pa0Var.getListView();
                                ju0Var.a = imageReceiver;
                                ju0Var.e = imageReceiver.getBitmapSafe();
                                ju0Var.h = imageReceiver.getRoundRadius(true);
                                return ju0Var;
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

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        if (i10 >= 0) {
            pa0 pa0Var = this.a;
            if (i10 >= pa0Var.M.size()) {
                return;
            }
            pa0Var.x.a((TLRPC.BotInlineResult) pa0Var.M.get(i10), z4, i11);
        }
    }
}
