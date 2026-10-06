package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class k10 extends ou0 {
    public final /* synthetic */ x10 a;

    public k10(x10 x10Var) {
        this.a = x10Var;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                    yu0 yu0Var = new yu0();
                    yu0Var.b = iArr[0];
                    yu0Var.c = iArr[1];
                    yu0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    yu0Var.n = -iArr[1];
                    yu0Var.a = photoImage;
                    yu0Var.o = false;
                    yu0Var.h = photoImage.getRoundRadius(true);
                    yu0Var.e = yu0Var.a.getBitmapSafe();
                    yu0Var.d.getLocationInWindow(iArr);
                    yu0Var.j = 0;
                    if (PhotoViewer.N1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.k7 ? AndroidUtilities.dp(8.0f) : 0) - yu0Var.c;
                        if (dp > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return yu0Var;
                        }
                        int height = yu0Var.c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            w0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return yu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean Y() {
        x10 x10Var = this.a;
        if (x10Var.N) {
            return true;
        }
        x10Var.h(x10Var.E, x10Var.F, x10Var.H, x10Var.G, x10Var.y, x10Var.J, x10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final CharSequence b0(int i10) {
        return x10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final int y() {
        return this.a.O;
    }
}
