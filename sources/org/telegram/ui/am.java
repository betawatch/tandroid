package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class am extends fu0 {
    public final /* synthetic */ zn a;

    public am(zn znVar) {
        this.a = znVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[LOOP:0: B:10:0x002a->B:17:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC] */
    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        dk dkVar;
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            zn znVar = this.a;
            if (i10 < znVar.Ea.size() && (dkVar = znVar.F1) != null && dkVar.getListView() != null) {
                int childCount = znVar.F1.getListView().getChildCount();
                Object obj = znVar.Ea.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = znVar.F1.getListView().getChildAt(i11);
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
                                qu0Var.d = znVar.F1.getListView();
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
            zn znVar = this.a;
            if (i10 >= znVar.Ea.size()) {
                return;
            }
            znVar.cb((TLRPC.BotInlineResult) znVar.Ea.get(i10), z4, i11, 0L);
        }
    }
}
