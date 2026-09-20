package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ra0 extends org.telegram.ui.tu0 {
    public final /* synthetic */ va0 a;

    public ra0(va0 va0Var) {
        this.a = va0Var;
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
            va0 va0Var = this.a;
            if (i10 < va0Var.P.size()) {
                int childCount = va0Var.getListView().getChildCount();
                Object obj = va0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = va0Var.getListView().getChildAt(i11);
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
                                dv0Var.d = va0Var.getListView();
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
            va0 va0Var = this.a;
            if (i10 >= va0Var.P.size()) {
                return;
            }
            va0Var.x.f((TLRPC.BotInlineResult) va0Var.P.get(i10), z10, i11);
        }
    }
}
