package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class xa0 extends org.telegram.ui.ou0 {
    public final /* synthetic */ bb0 a;

    public xa0(bb0 bb0Var) {
        this.a = bb0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            bb0 bb0Var = this.a;
            if (i10 < bb0Var.P.size()) {
                int childCount = bb0Var.getListView().getChildCount();
                Object obj = bb0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = bb0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        if (f2Var.getResult() == obj) {
                            imageReceiver = f2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.yu0 yu0Var = new org.telegram.ui.yu0();
                                yu0Var.b = iArr[0];
                                yu0Var.c = iArr[1];
                                yu0Var.d = bb0Var.getListView();
                                yu0Var.a = imageReceiver;
                                yu0Var.e = imageReceiver.getBitmapSafe();
                                yu0Var.h = imageReceiver.getRoundRadius(true);
                                return yu0Var;
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

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            bb0 bb0Var = this.a;
            if (i10 >= bb0Var.P.size()) {
                return;
            }
            bb0Var.x.g((TLRPC.BotInlineResult) bb0Var.P.get(i10), z10, i11);
        }
    }
}
