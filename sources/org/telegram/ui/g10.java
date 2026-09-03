package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g10 extends fu0 {
    public final /* synthetic */ t10 a;

    public g10(t10 t10Var) {
        this.a = t10Var;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (messageObject != null) {
            mh.d1 d1Var = this.a.b;
            int childCount = d1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = d1Var.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                    photoImage = null;
                    int i12 = 0;
                    while (i12 < 6) {
                        MessageObject messageObject2 = i12 >= s7Var.e ? null : s7Var.b[i12];
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            org.telegram.ui.Components.p9 p9Var = i12 >= s7Var.e ? null : s7Var.a[i12].a;
                            ImageReceiver imageReceiver = p9Var.getImageReceiver();
                            p9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (i7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.p9 imageView = i7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        MessageObject messageObject3 = (MessageObject) e2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = e2Var.getPhotoImage();
                            e2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    qu0 qu0Var = new qu0();
                    qu0Var.b = iArr[0];
                    qu0Var.c = iArr[1];
                    qu0Var.d = d1Var;
                    d1Var.getLocationInWindow(iArr);
                    qu0Var.n = -iArr[1];
                    qu0Var.a = photoImage;
                    qu0Var.o = false;
                    qu0Var.h = photoImage.getRoundRadius(true);
                    qu0Var.e = qu0Var.a.getBitmapSafe();
                    qu0Var.d.getLocationInWindow(iArr);
                    qu0Var.j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = d1Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.i7 ? AndroidUtilities.dp(8.0f) : 0) - qu0Var.c;
                        if (dp > childAt.getHeight()) {
                            d1Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return qu0Var;
                        }
                        int height = qu0Var.c - d1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            d1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return qu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean Y() {
        t10 t10Var = this.a;
        if (t10Var.K) {
            return true;
        }
        t10Var.h(t10Var.B, t10Var.C, t10Var.E, t10Var.D, t10Var.y, t10Var.G, t10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final CharSequence b0(int i10) {
        return t10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final int y() {
        return this.a.L;
    }
}
