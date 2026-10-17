package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class jb extends bu0 {
    public final /* synthetic */ xb a;

    public jb(xb xbVar) {
        this.a = xbVar;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.x0 x0Var;
        MessageObject messageObject2;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject3;
        xb xbVar = this.a;
        int childCount = xbVar.v.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = xbVar.v.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                if (messageObject != null && (messageObject3 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                    imageReceiver = u1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.x0) && (messageObject2 = (x0Var = (org.telegram.ui.Cells.x0) childAt).getMessageObject()) != null) {
                if (messageObject != null) {
                    if (messageObject2.getId() == messageObject.getId()) {
                        imageReceiver = x0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject2.photoThumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= messageObject2.photoThumbs.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = messageObject2.photoThumbs.get(i12).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = x0Var.getPhotoImage();
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                lu0 lu0Var = new lu0();
                lu0Var.b = iArr[0];
                lu0Var.c = iArr[1];
                lu0Var.d = xbVar.v;
                lu0Var.a = imageReceiver;
                lu0Var.e = imageReceiver.getBitmapSafe();
                lu0Var.h = imageReceiver.getRoundRadius(true);
                lu0Var.l = true;
                return lu0Var;
            }
            i11++;
        }
    }
}
