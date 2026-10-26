package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ci extends gu0 {
    public final /* synthetic */ un a;

    public ci(un unVar) {
        this.a = unVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        zj zjVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            un unVar = this.a;
            if (i10 < unVar.Ua.size() && (zjVar = unVar.U1) != null && zjVar.getListView() != null) {
                int childCount = unVar.U1.getListView().getChildCount();
                Object obj = unVar.Ua.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = unVar.U1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        if (d2Var.getResult() == obj) {
                            imageReceiver = d2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                qu0 qu0Var = new qu0();
                                qu0Var.b = iArr[0];
                                qu0Var.c = iArr[1];
                                qu0Var.d = unVar.U1.getListView();
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
            un unVar = this.a;
            if (i10 >= unVar.Ua.size()) {
                return;
            }
            unVar.mb((TLRPC.BotInlineResult) unVar.Ua.get(i10), z10, i11, 0L);
        }
    }
}
