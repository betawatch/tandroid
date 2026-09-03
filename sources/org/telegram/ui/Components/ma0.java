package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ma0 extends org.telegram.ui.fu0 {
    public final /* synthetic */ qa0 a;

    public ma0(qa0 qa0Var) {
        this.a = qa0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            qa0 qa0Var = this.a;
            if (i10 < qa0Var.M.size()) {
                int childCount = qa0Var.getListView().getChildCount();
                Object obj = qa0Var.M.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = qa0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        if (d2Var.getResult() == obj) {
                            imageReceiver = d2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                                qu0Var.b = iArr[0];
                                qu0Var.c = iArr[1];
                                qu0Var.d = qa0Var.getListView();
                                qu0Var.a = imageReceiver;
                                qu0Var.e = imageReceiver.getBitmapSafe();
                                qu0Var.h = imageReceiver.getRoundRadius(true);
                                return qu0Var;
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

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        if (i10 >= 0) {
            qa0 qa0Var = this.a;
            if (i10 >= qa0Var.M.size()) {
                return;
            }
            qa0Var.x.a((TLRPC.BotInlineResult) qa0Var.M.get(i10), z4, i11);
        }
    }
}
