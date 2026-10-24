package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class hb extends cu0 {
    public final /* synthetic */ vb a;

    public hb(vb vbVar) {
        this.a = vbVar;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject messageObject2;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject3;
        vb vbVar = this.a;
        int childCount = vbVar.v.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = vbVar.v.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                if (messageObject != null && (messageObject3 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                    imageReceiver = t1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.v0) && (messageObject2 = (v0Var = (org.telegram.ui.Cells.v0) childAt).getMessageObject()) != null) {
                if (messageObject != null) {
                    if (messageObject2.getId() == messageObject.getId()) {
                        imageReceiver = v0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject2.photoThumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= messageObject2.photoThumbs.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = messageObject2.photoThumbs.get(i12).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = v0Var.getPhotoImage();
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                mu0 mu0Var = new mu0();
                mu0Var.b = iArr[0];
                mu0Var.c = iArr[1];
                mu0Var.d = vbVar.v;
                mu0Var.a = imageReceiver;
                mu0Var.e = imageReceiver.getBitmapSafe();
                mu0Var.h = imageReceiver.getRoundRadius(true);
                mu0Var.l = true;
                return mu0Var;
            }
            i11++;
        }
    }
}
