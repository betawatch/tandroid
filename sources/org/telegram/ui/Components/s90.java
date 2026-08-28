package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s90 extends org.telegram.ui.rt0 {
    public final /* synthetic */ w90 a;

    public s90(w90 w90Var) {
        this.a = w90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i9 >= 0) {
            w90 w90Var = this.a;
            if (i9 < w90Var.L.size()) {
                int childCount = w90Var.getListView().getChildCount();
                Object obj = w90Var.L.get(i9);
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = w90Var.getListView().getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.bu0 bu0Var = new org.telegram.ui.bu0();
                                bu0Var.b = iArr[0];
                                bu0Var.c = iArr[1];
                                bu0Var.d = w90Var.getListView();
                                bu0Var.a = imageReceiver;
                                bu0Var.e = imageReceiver.getBitmapSafe();
                                bu0Var.h = imageReceiver.getRoundRadius(true);
                                return bu0Var;
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

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        if (i9 >= 0) {
            w90 w90Var = this.a;
            if (i9 >= w90Var.L.size()) {
                return;
            }
            w90Var.x.a((TLRPC.BotInlineResult) w90Var.L.get(i9), z10, i10);
        }
    }
}
