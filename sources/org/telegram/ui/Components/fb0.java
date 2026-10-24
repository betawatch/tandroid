package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fb0 extends org.telegram.ui.cu0 {
    public final /* synthetic */ jb0 a;

    public fb0(jb0 jb0Var) {
        this.a = jb0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:6:0x001e->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC] */
    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        if (i10 >= 0) {
            jb0 jb0Var = this.a;
            if (i10 < jb0Var.P.size()) {
                int childCount = jb0Var.getListView().getChildCount();
                Object obj = jb0Var.P.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = jb0Var.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        if (e2Var.getResult() == obj) {
                            imageReceiver = e2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                org.telegram.ui.mu0 mu0Var = new org.telegram.ui.mu0();
                                mu0Var.b = iArr[0];
                                mu0Var.c = iArr[1];
                                mu0Var.d = jb0Var.getListView();
                                mu0Var.a = imageReceiver;
                                mu0Var.e = imageReceiver.getBitmapSafe();
                                mu0Var.h = imageReceiver.getRoundRadius(true);
                                return mu0Var;
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

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            jb0 jb0Var = this.a;
            if (i10 >= jb0Var.P.size()) {
                return;
            }
            jb0Var.x.i((TLRPC.BotInlineResult) jb0Var.P.get(i10), z10, i11);
        }
    }
}
