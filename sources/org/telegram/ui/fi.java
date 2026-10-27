package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fi extends iu0 {
    public final /* synthetic */ wn a;

    public fi(wn wnVar) {
        this.a = wnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        bk bkVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            wn wnVar = this.a;
            if (i10 < wnVar.Ya.size() && (bkVar = wnVar.U1) != null && bkVar.getListView() != null) {
                int childCount = wnVar.U1.getListView().getChildCount();
                Object obj = wnVar.Ya.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = wnVar.U1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        if (d2Var.getResult() == obj) {
                            imageReceiver = d2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                su0 su0Var = new su0();
                                su0Var.b = iArr[0];
                                su0Var.c = iArr[1];
                                su0Var.d = wnVar.U1.getListView();
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
            wn wnVar = this.a;
            if (i10 >= wnVar.Ya.size()) {
                return;
            }
            wnVar.qb((TLRPC.BotInlineResult) wnVar.Ya.get(i10), z10, i11, 0L);
        }
    }
}
