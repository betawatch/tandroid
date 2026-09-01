package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class db extends au0 {
    public final /* synthetic */ sb a;

    public db(sb sbVar) {
        this.a = sbVar;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject messageObject2;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject3;
        sb sbVar = this.a;
        int childCount = sbVar.B.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = sbVar.B.getChildAt(i11);
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
                lu0 lu0Var = new lu0();
                lu0Var.b = iArr[0];
                lu0Var.c = iArr[1];
                lu0Var.d = sbVar.B;
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
