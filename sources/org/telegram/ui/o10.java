package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class o10 extends zu0 {
    public final /* synthetic */ b20 a;

    public o10(b20 b20Var) {
        this.a = b20Var;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (j7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.z9 imageView = j7Var.getImageView();
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
                    jv0 jv0Var = new jv0();
                    jv0Var.b = iArr[0];
                    jv0Var.c = iArr[1];
                    jv0Var.d = o0Var;
                    o0Var.getLocationInWindow(iArr);
                    jv0Var.n = -iArr[1];
                    jv0Var.a = photoImage;
                    jv0Var.o = false;
                    jv0Var.h = photoImage.getRoundRadius(true);
                    jv0Var.e = jv0Var.a.getBitmapSafe();
                    jv0Var.d.getLocationInWindow(iArr);
                    jv0Var.j = 0;
                    if (PhotoViewer.N1(messageObject) && (pinnedHeader = o0Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.j7 ? AndroidUtilities.dp(8.0f) : 0) - jv0Var.c;
                        if (dp > childAt.getHeight()) {
                            o0Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return jv0Var;
                        }
                        int height = jv0Var.c - o0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            o0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return jv0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean Z() {
        b20 b20Var = this.a;
        if (b20Var.N) {
            return true;
        }
        b20Var.h(b20Var.E, b20Var.F, b20Var.H, b20Var.G, b20Var.y, b20Var.J, b20Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final CharSequence c0(int i10) {
        return b20.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final int y() {
        return this.a.O;
    }
}
