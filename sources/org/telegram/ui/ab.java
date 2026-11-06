package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ab extends nq0 {
    public final /* synthetic */ mb a;

    public ab(mb mbVar) {
        this.a = mbVar;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
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
                if (ijVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.f1() == ijVar.f1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.t0) && (messageObject = (t0Var = (org.telegram.ui.Cells.t0) childAt).getMessageObject()) != null) {
                if (ijVar != null) {
                    if (messageObject.f1() == ijVar.f1()) {
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
                wq0 wq0Var = new wq0();
                wq0Var.b = iArr[0];
                wq0Var.c = iArr[1];
                wq0Var.d = mbVar.w;
                wq0Var.a = imageReceiver;
                wq0Var.e = imageReceiver.p();
                wq0Var.h = imageReceiver.E();
                wq0Var.l = true;
                return wq0Var;
            }
            i10++;
        }
    }
}
