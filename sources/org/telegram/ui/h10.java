package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h10 extends fu0 {
    public final /* synthetic */ u10 a;

    public h10(u10 u10Var) {
        this.a = u10Var;
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
            lh.e1 e1Var = this.a.b;
            int childCount = e1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = e1Var.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.r7) {
                    org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                    photoImage = null;
                    int i12 = 0;
                    while (i12 < 6) {
                        MessageObject messageObject2 = i12 >= r7Var.e ? null : r7Var.b[i12];
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            org.telegram.ui.Components.p9 p9Var = i12 >= r7Var.e ? null : r7Var.a[i12].a;
                            ImageReceiver imageReceiver = p9Var.getImageReceiver();
                            p9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.p9 imageView = h7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        MessageObject messageObject3 = (MessageObject) d2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = d2Var.getPhotoImage();
                            d2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    qu0 qu0Var = new qu0();
                    qu0Var.b = iArr[0];
                    qu0Var.c = iArr[1];
                    qu0Var.d = e1Var;
                    e1Var.getLocationInWindow(iArr);
                    qu0Var.n = -iArr[1];
                    qu0Var.a = photoImage;
                    qu0Var.o = false;
                    qu0Var.h = photoImage.getRoundRadius(true);
                    qu0Var.e = qu0Var.a.getBitmapSafe();
                    qu0Var.d.getLocationInWindow(iArr);
                    qu0Var.j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = e1Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.h7 ? AndroidUtilities.dp(8.0f) : 0) - qu0Var.c;
                        if (dp > childAt.getHeight()) {
                            e1Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return qu0Var;
                        }
                        int height = qu0Var.c - e1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            e1Var.scrollBy(0, childAt.getHeight() + height);
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
        u10 u10Var = this.a;
        if (u10Var.K) {
            return true;
        }
        u10Var.h(u10Var.B, u10Var.C, u10Var.E, u10Var.D, u10Var.y, u10Var.G, u10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final CharSequence b0(int i10) {
        return u10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final int y() {
        return this.a.L;
    }
}
