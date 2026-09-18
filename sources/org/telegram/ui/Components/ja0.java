package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ja0 extends org.telegram.ui.vu0 {
    public final /* synthetic */ na0 a;

    public ja0(na0 na0Var) {
        this.a = na0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            na0 na0Var = this.a;
            if (i10 < na0Var.P.size()) {
                int childCount = na0Var.getListView().getChildCount();
                Object obj = na0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = na0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.fv0 fv0Var = new org.telegram.ui.fv0();
                                fv0Var.b = iArr[0];
                                fv0Var.c = iArr[1];
                                fv0Var.d = na0Var.getListView();
                                fv0Var.a = imageReceiver;
                                fv0Var.e = imageReceiver.getBitmapSafe();
                                fv0Var.h = imageReceiver.getRoundRadius(true);
                                return fv0Var;
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

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            na0 na0Var = this.a;
            if (i10 >= na0Var.P.size()) {
                return;
            }
            na0Var.x.f((TLRPC.BotInlineResult) na0Var.P.get(i10), z10, i11);
        }
    }
}
