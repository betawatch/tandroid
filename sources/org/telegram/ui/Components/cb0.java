package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cb0 extends org.telegram.ui.gu0 {
    public final /* synthetic */ gb0 a;

    public cb0(gb0 gb0Var) {
        this.a = gb0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            gb0 gb0Var = this.a;
            if (i10 < gb0Var.P.size()) {
                int childCount = gb0Var.getListView().getChildCount();
                Object obj = gb0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = gb0Var.getListView().getChildAt(i11);
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
                                qu0Var.d = gb0Var.getListView();
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

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            gb0 gb0Var = this.a;
            if (i10 >= gb0Var.P.size()) {
                return;
            }
            gb0Var.x.j((TLRPC.BotInlineResult) gb0Var.P.get(i10), z10, i11);
        }
    }
}
