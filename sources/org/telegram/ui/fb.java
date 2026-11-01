package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fb extends xr0 {
    public final /* synthetic */ sb a;

    public fb(sb sbVar) {
        this.a = sbVar;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.s0 s0Var;
        org.telegram.messenger.kj messageObject;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.kj messageObject2;
        sb sbVar = this.a;
        int childCount = sbVar.w.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = sbVar.w.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                if (kjVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.f1() == kjVar.f1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.s0) && (messageObject = (s0Var = (org.telegram.ui.Cells.s0) childAt).getMessageObject()) != null) {
                if (kjVar != null) {
                    if (messageObject.f1() == kjVar.f1()) {
                        imageReceiver = s0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.n0 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= messageObject.n0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.n0.get(i12)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = s0Var.getPhotoImage();
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                fs0 fs0Var = new fs0();
                fs0Var.b = iArr[0];
                fs0Var.c = iArr[1];
                fs0Var.d = sbVar.w;
                fs0Var.a = imageReceiver;
                fs0Var.e = imageReceiver.p();
                fs0Var.h = imageReceiver.E();
                fs0Var.l = true;
                return fs0Var;
            }
            i11++;
        }
    }
}
