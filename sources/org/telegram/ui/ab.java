package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ab extends qq0 {
    public final /* synthetic */ mb a;

    public ab(mb mbVar) {
        this.a = mbVar;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject2;
        mb mbVar = this.a;
        int childCount = mbVar.w.getChildCount();
        int i10 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i10 >= childCount) {
                return null;
            }
            View childAt = mbVar.w.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                if (ijVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.e1() == ijVar.e1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.t0) && (messageObject = (t0Var = (org.telegram.ui.Cells.t0) childAt).getMessageObject()) != null) {
                if (ijVar != null) {
                    if (messageObject.e1() == ijVar.e1()) {
                        imageReceiver = t0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.n0 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject.n0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.n0.get(i11)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = t0Var.getPhotoImage();
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                zq0 zq0Var = new zq0();
                zq0Var.b = iArr[0];
                zq0Var.c = iArr[1];
                zq0Var.d = mbVar.w;
                zq0Var.a = imageReceiver;
                zq0Var.e = imageReceiver.p();
                zq0Var.h = imageReceiver.E();
                zq0Var.l = true;
                return zq0Var;
            }
            i10++;
        }
    }
}
