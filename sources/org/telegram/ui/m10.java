package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class m10 extends vu0 {
    public final /* synthetic */ z10 a;

    public m10(z10 z10Var) {
        this.a = z10Var;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (messageObject != null) {
            ai.w0 w0Var = this.a.b;
            int childCount = w0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = w0Var.getChildAt(i11);
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
                            org.telegram.ui.Components.u9 u9Var = i12 >= u7Var.e ? null : u7Var.a[i12].a;
                            ImageReceiver imageReceiver = u9Var.getImageReceiver();
                            u9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (j7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.u9 imageView = j7Var.getImageView();
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
                    fv0 fv0Var = new fv0();
                    fv0Var.b = iArr[0];
                    fv0Var.c = iArr[1];
                    fv0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    fv0Var.n = -iArr[1];
                    fv0Var.a = photoImage;
                    fv0Var.o = false;
                    fv0Var.h = photoImage.getRoundRadius(true);
                    fv0Var.e = fv0Var.a.getBitmapSafe();
                    fv0Var.d.getLocationInWindow(iArr);
                    fv0Var.j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.j7 ? AndroidUtilities.dp(8.0f) : 0) - fv0Var.c;
                        if (dp > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return fv0Var;
                        }
                        int height = fv0Var.c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            w0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return fv0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean Y() {
        z10 z10Var = this.a;
        if (z10Var.N) {
            return true;
        }
        z10Var.h(z10Var.E, z10Var.F, z10Var.H, z10Var.G, z10Var.y, z10Var.J, z10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final CharSequence b0(int i10) {
        return z10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final int y() {
        return this.a.O;
    }
}
