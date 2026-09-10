package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m10 extends tu0 {
    public final /* synthetic */ z10 a;

    public m10(z10 z10Var) {
        this.a = z10Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (messageObject != null) {
            bi.y1 y1Var = this.a.b;
            int childCount = y1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = y1Var.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.v7) {
                    org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) childAt;
                    photoImage = null;
                    int i12 = 0;
                    while (i12 < 6) {
                        MessageObject messageObject2 = i12 >= v7Var.e ? null : v7Var.b[i12];
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            org.telegram.ui.Components.w9 w9Var = i12 >= v7Var.e ? null : v7Var.a[i12].a;
                            ImageReceiver imageReceiver = w9Var.getImageReceiver();
                            w9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                    if (l7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.w9 imageView = l7Var.getImageView();
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
                    ev0 ev0Var = new ev0();
                    ev0Var.b = iArr[0];
                    ev0Var.c = iArr[1];
                    ev0Var.d = y1Var;
                    y1Var.getLocationInWindow(iArr);
                    ev0Var.n = -iArr[1];
                    ev0Var.a = photoImage;
                    ev0Var.o = false;
                    ev0Var.h = photoImage.getRoundRadius(true);
                    ev0Var.e = ev0Var.a.getBitmapSafe();
                    ev0Var.d.getLocationInWindow(iArr);
                    ev0Var.j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = y1Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.l7 ? AndroidUtilities.dp(8.0f) : 0) - ev0Var.c;
                        if (dp > childAt.getHeight()) {
                            y1Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return ev0Var;
                        }
                        int height = ev0Var.c - y1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.l7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            y1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return ev0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean Y() {
        z10 z10Var = this.a;
        if (z10Var.N) {
            return true;
        }
        z10Var.h(z10Var.E, z10Var.F, z10Var.H, z10Var.G, z10Var.y, z10Var.J, z10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final CharSequence b0(int i10) {
        return z10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final int y() {
        return this.a.O;
    }
}
