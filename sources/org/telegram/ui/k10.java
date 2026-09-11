package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class k10 extends su0 {
    public final /* synthetic */ x10 a;

    public k10(x10 x10Var) {
        this.a = x10Var;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (messageObject != null) {
            bi.o0 o0Var = this.a.b;
            int childCount = o0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = o0Var.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.u7) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    photoImage = null;
                    int i12 = 0;
                    while (i12 < 6) {
                        MessageObject messageObject2 = i12 >= u7Var.e ? null : u7Var.b[i12];
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            org.telegram.ui.Components.x9 x9Var = i12 >= u7Var.e ? null : u7Var.a[i12].a;
                            ImageReceiver imageReceiver = x9Var.getImageReceiver();
                            x9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (j7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.x9 imageView = j7Var.getImageView();
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
                    cv0 cv0Var = new cv0();
                    cv0Var.b = iArr[0];
                    cv0Var.c = iArr[1];
                    cv0Var.d = o0Var;
                    o0Var.getLocationInWindow(iArr);
                    cv0Var.n = -iArr[1];
                    cv0Var.a = photoImage;
                    cv0Var.o = false;
                    cv0Var.h = photoImage.getRoundRadius(true);
                    cv0Var.e = cv0Var.a.getBitmapSafe();
                    cv0Var.d.getLocationInWindow(iArr);
                    cv0Var.j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = o0Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.j7 ? AndroidUtilities.dp(8.0f) : 0) - cv0Var.c;
                        if (dp > childAt.getHeight()) {
                            o0Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return cv0Var;
                        }
                        int height = cv0Var.c - o0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            o0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return cv0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean Y() {
        x10 x10Var = this.a;
        if (x10Var.N) {
            return true;
        }
        x10Var.h(x10Var.E, x10Var.F, x10Var.H, x10Var.G, x10Var.y, x10Var.J, x10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final CharSequence b0(int i10) {
        return x10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int y() {
        return this.a.O;
    }
}
