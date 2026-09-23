package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class h10 extends mu0 {
    public final /* synthetic */ u10 a;

    public h10(u10 u10Var) {
        this.a = u10Var;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (j7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.w9 imageView = j7Var.getImageView();
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
                    wu0 wu0Var = new wu0();
                    wu0Var.b = iArr[0];
                    wu0Var.c = iArr[1];
                    wu0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    wu0Var.n = -iArr[1];
                    wu0Var.a = photoImage;
                    wu0Var.o = false;
                    wu0Var.h = photoImage.getRoundRadius(true);
                    wu0Var.e = wu0Var.a.getBitmapSafe();
                    wu0Var.d.getLocationInWindow(iArr);
                    wu0Var.j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.j7 ? AndroidUtilities.dp(8.0f) : 0) - wu0Var.c;
                        if (dp > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return wu0Var;
                        }
                        int height = wu0Var.c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            w0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return wu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean Y() {
        u10 u10Var = this.a;
        if (u10Var.N) {
            return true;
        }
        u10Var.h(u10Var.E, u10Var.F, u10Var.H, u10Var.G, u10Var.y, u10Var.J, u10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final CharSequence b0(int i10) {
        return u10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final int y() {
        return this.a.O;
    }
}
