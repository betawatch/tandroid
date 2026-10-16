package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kb0 extends org.telegram.ui.zu0 {
    public final /* synthetic */ ob0 a;

    public kb0(ob0 ob0Var) {
        this.a = ob0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            ob0 ob0Var = this.a;
            if (i10 < ob0Var.P.size()) {
                int childCount = ob0Var.getListView().getChildCount();
                Object obj = ob0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ob0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        if (f2Var.getResult() == obj) {
                            imageReceiver = f2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.jv0 jv0Var = new org.telegram.ui.jv0();
                                jv0Var.b = iArr[0];
                                jv0Var.c = iArr[1];
                                jv0Var.d = ob0Var.getListView();
                                jv0Var.a = imageReceiver;
                                jv0Var.e = imageReceiver.getBitmapSafe();
                                jv0Var.h = imageReceiver.getRoundRadius(true);
                                return jv0Var;
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

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            ob0 ob0Var = this.a;
            if (i10 >= ob0Var.P.size()) {
                return;
            }
            ob0Var.x.g((TLRPC.BotInlineResult) ob0Var.P.get(i10), z10, i11);
        }
    }
}
