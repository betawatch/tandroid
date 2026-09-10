package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ta0 extends org.telegram.ui.tu0 {
    public final /* synthetic */ xa0 a;

    public ta0(xa0 xa0Var) {
        this.a = xa0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            xa0 xa0Var = this.a;
            if (i10 < xa0Var.P.size()) {
                int childCount = xa0Var.getListView().getChildCount();
                Object obj = xa0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = xa0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                                ev0Var.b = iArr[0];
                                ev0Var.c = iArr[1];
                                ev0Var.d = xa0Var.getListView();
                                ev0Var.a = imageReceiver;
                                ev0Var.e = imageReceiver.getBitmapSafe();
                                ev0Var.h = imageReceiver.getRoundRadius(true);
                                return ev0Var;
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            xa0 xa0Var = this.a;
            if (i10 >= xa0Var.P.size()) {
                return;
            }
            xa0Var.x.d((TLRPC.BotInlineResult) xa0Var.P.get(i10), z10, i11);
        }
    }
}
