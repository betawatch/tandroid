package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ka0 extends org.telegram.ui.su0 {
    public final /* synthetic */ oa0 a;

    public ka0(oa0 oa0Var) {
        this.a = oa0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            oa0 oa0Var = this.a;
            if (i10 < oa0Var.P.size()) {
                int childCount = oa0Var.getListView().getChildCount();
                Object obj = oa0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = oa0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.cv0 cv0Var = new org.telegram.ui.cv0();
                                cv0Var.b = iArr[0];
                                cv0Var.c = iArr[1];
                                cv0Var.d = oa0Var.getListView();
                                cv0Var.a = imageReceiver;
                                cv0Var.e = imageReceiver.getBitmapSafe();
                                cv0Var.h = imageReceiver.getRoundRadius(true);
                                return cv0Var;
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

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            oa0 oa0Var = this.a;
            if (i10 >= oa0Var.P.size()) {
                return;
            }
            oa0Var.x.f((TLRPC.BotInlineResult) oa0Var.P.get(i10), z10, i11);
        }
    }
}
