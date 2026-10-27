package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class db0 extends org.telegram.ui.iu0 {
    public final /* synthetic */ hb0 a;

    public db0(hb0 hb0Var) {
        this.a = hb0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            hb0 hb0Var = this.a;
            if (i10 < hb0Var.P.size()) {
                int childCount = hb0Var.getListView().getChildCount();
                Object obj = hb0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = hb0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        if (d2Var.getResult() == obj) {
                            imageReceiver = d2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.su0 su0Var = new org.telegram.ui.su0();
                                su0Var.b = iArr[0];
                                su0Var.c = iArr[1];
                                su0Var.d = hb0Var.getListView();
                                su0Var.a = imageReceiver;
                                su0Var.e = imageReceiver.getBitmapSafe();
                                su0Var.h = imageReceiver.getRoundRadius(true);
                                return su0Var;
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

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            hb0 hb0Var = this.a;
            if (i10 >= hb0Var.P.size()) {
                return;
            }
            hb0Var.x.j((TLRPC.BotInlineResult) hb0Var.P.get(i10), z10, i11);
        }
    }
}
