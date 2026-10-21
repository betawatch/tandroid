package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class eb0 extends org.telegram.ui.zt0 {
    public final /* synthetic */ ib0 a;

    public eb0(ib0 ib0Var) {
        this.a = ib0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            ib0 ib0Var = this.a;
            if (i10 < ib0Var.P.size()) {
                int childCount = ib0Var.getListView().getChildCount();
                Object obj = ib0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ib0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        if (f2Var.getResult() == obj) {
                            imageReceiver = f2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                                ju0Var.b = iArr[0];
                                ju0Var.c = iArr[1];
                                ju0Var.d = ib0Var.getListView();
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

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            ib0 ib0Var = this.a;
            if (i10 >= ib0Var.P.size()) {
                return;
            }
            ib0Var.x.i((TLRPC.BotInlineResult) ib0Var.P.get(i10), z10, i11);
        }
    }
}
