package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class p10 extends av0 {
    public final /* synthetic */ c20 a;

    public p10(c20 c20Var) {
        this.a = c20Var;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                            org.telegram.ui.Components.z9 z9Var = i12 >= u7Var.e ? null : u7Var.a[i12].a;
                            ImageReceiver imageReceiver = z9Var.getImageReceiver();
                            z9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                    if (k7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.z9 imageView = k7Var.getImageView();
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
                    kv0 kv0Var = new kv0();
                    kv0Var.b = iArr[0];
                    kv0Var.c = iArr[1];
                    kv0Var.d = o0Var;
                    o0Var.getLocationInWindow(iArr);
                    kv0Var.n = -iArr[1];
                    kv0Var.a = photoImage;
                    kv0Var.o = false;
                    kv0Var.h = photoImage.getRoundRadius(true);
                    kv0Var.e = kv0Var.a.getBitmapSafe();
                    kv0Var.d.getLocationInWindow(iArr);
                    kv0Var.j = 0;
                    if (PhotoViewer.N1(messageObject) && (pinnedHeader = o0Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.k7 ? AndroidUtilities.dp(8.0f) : 0) - kv0Var.c;
                        if (dp > childAt.getHeight()) {
                            o0Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return kv0Var;
                        }
                        int height = kv0Var.c - o0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            o0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return kv0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean Y() {
        c20 c20Var = this.a;
        if (c20Var.N) {
            return true;
        }
        c20Var.h(c20Var.E, c20Var.F, c20Var.H, c20Var.G, c20Var.y, c20Var.J, c20Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final CharSequence b0(int i10) {
        return c20.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final int y() {
        return this.a.O;
    }
}
