package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class g10 extends lu0 {
    public final /* synthetic */ t10 a;

    public g10(t10 t10Var) {
        this.a = t10Var;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                            org.telegram.ui.Components.w9 w9Var = i12 >= u7Var.e ? null : u7Var.a[i12].a;
                            ImageReceiver imageReceiver = w9Var.getImageReceiver();
                            w9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                    if (k7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.w9 imageView = k7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        MessageObject messageObject3 = (MessageObject) f2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = f2Var.getPhotoImage();
                            f2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    vu0 vu0Var = new vu0();
                    vu0Var.b = iArr[0];
                    vu0Var.c = iArr[1];
                    vu0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    vu0Var.n = -iArr[1];
                    vu0Var.a = photoImage;
                    vu0Var.o = false;
                    vu0Var.h = photoImage.getRoundRadius(true);
                    vu0Var.e = vu0Var.a.getBitmapSafe();
                    vu0Var.d.getLocationInWindow(iArr);
                    vu0Var.j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.k7 ? AndroidUtilities.dp(8.0f) : 0) - vu0Var.c;
                        if (dp > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return vu0Var;
                        }
                        int height = vu0Var.c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            w0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return vu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean Y() {
        t10 t10Var = this.a;
        if (t10Var.N) {
            return true;
        }
        t10Var.h(t10Var.E, t10Var.F, t10Var.H, t10Var.G, t10Var.y, t10Var.J, t10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final CharSequence b0(int i10) {
        return t10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final int y() {
        return this.a.O;
    }
}
