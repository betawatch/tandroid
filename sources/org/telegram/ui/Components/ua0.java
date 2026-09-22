package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ua0 extends org.telegram.ui.tu0 {
    public final /* synthetic */ ya0 a;

    public ua0(ya0 ya0Var) {
        this.a = ya0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            ya0 ya0Var = this.a;
            if (i10 < ya0Var.P.size()) {
                int childCount = ya0Var.getListView().getChildCount();
                Object obj = ya0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ya0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        if (f2Var.getResult() == obj) {
                            imageReceiver = f2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.dv0 dv0Var = new org.telegram.ui.dv0();
                                dv0Var.b = iArr[0];
                                dv0Var.c = iArr[1];
                                dv0Var.d = ya0Var.getListView();
                                dv0Var.a = imageReceiver;
                                dv0Var.e = imageReceiver.getBitmapSafe();
                                dv0Var.h = imageReceiver.getRoundRadius(true);
                                return dv0Var;
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            ya0 ya0Var = this.a;
            if (i10 >= ya0Var.P.size()) {
                return;
            }
            ya0Var.x.f((TLRPC.BotInlineResult) ya0Var.P.get(i10), z10, i11);
        }
    }
}
