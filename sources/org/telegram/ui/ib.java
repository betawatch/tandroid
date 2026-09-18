package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ib extends vu0 {
    public final /* synthetic */ wb a;

    public ib(wb wbVar) {
        this.a = wbVar;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject messageObject2;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject3;
        wb wbVar = this.a;
        int childCount = wbVar.v.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = wbVar.v.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                if (messageObject != null && (messageObject3 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                    imageReceiver = t1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.w0) && (messageObject2 = (w0Var = (org.telegram.ui.Cells.w0) childAt).getMessageObject()) != null) {
                if (messageObject != null) {
                    if (messageObject2.getId() == messageObject.getId()) {
                        imageReceiver = w0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject2.photoThumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= messageObject2.photoThumbs.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = messageObject2.photoThumbs.get(i12).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = w0Var.getPhotoImage();
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                fv0 fv0Var = new fv0();
                fv0Var.b = iArr[0];
                fv0Var.c = iArr[1];
                fv0Var.d = wbVar.v;
                fv0Var.a = imageReceiver;
                fv0Var.e = imageReceiver.getBitmapSafe();
                fv0Var.h = imageReceiver.getRoundRadius(true);
                fv0Var.l = true;
                return fv0Var;
            }
            i11++;
        }
    }
}
