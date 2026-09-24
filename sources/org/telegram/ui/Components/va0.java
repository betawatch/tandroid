package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class va0 extends org.telegram.ui.lu0 {
    public final /* synthetic */ za0 a;

    public va0(za0 za0Var) {
        this.a = za0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            za0 za0Var = this.a;
            if (i10 < za0Var.P.size()) {
                int childCount = za0Var.getListView().getChildCount();
                Object obj = za0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = za0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        if (f2Var.getResult() == obj) {
                            imageReceiver = f2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.vu0 vu0Var = new org.telegram.ui.vu0();
                                vu0Var.b = iArr[0];
                                vu0Var.c = iArr[1];
                                vu0Var.d = za0Var.getListView();
                                vu0Var.a = imageReceiver;
                                vu0Var.e = imageReceiver.getBitmapSafe();
                                vu0Var.h = imageReceiver.getRoundRadius(true);
                                return vu0Var;
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

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            za0 za0Var = this.a;
            if (i10 >= za0Var.P.size()) {
                return;
            }
            za0Var.x.f((TLRPC.BotInlineResult) za0Var.P.get(i10), z10, i11);
        }
    }
}
