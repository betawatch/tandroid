package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g10 extends yt0 {
    public final /* synthetic */ t10 a;

    public g10(t10 t10Var) {
        this.a = t10Var;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.a.f.get(i10)).messageOwner.date, false);
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (messageObject != null) {
            lh.e1 e1Var = this.a.b;
            int childCount = e1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = e1Var.getChildAt(i11);
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
                    ju0 ju0Var = new ju0();
                    ju0Var.b = iArr[0];
                    ju0Var.c = iArr[1];
                    ju0Var.d = e1Var;
                    e1Var.getLocationInWindow(iArr);
                    ju0Var.n = -iArr[1];
                    ju0Var.a = photoImage;
                    ju0Var.o = false;
                    ju0Var.h = photoImage.getRoundRadius(true);
                    ju0Var.e = ju0Var.a.getBitmapSafe();
                    ju0Var.d.getLocationInWindow(iArr);
                    ju0Var.j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = e1Var.getPinnedHeader()) != null) {
                        int dp = (childAt instanceof org.telegram.ui.Cells.i7 ? AndroidUtilities.dp(8.0f) : 0) - ju0Var.c;
                        if (dp > childAt.getHeight()) {
                            e1Var.scrollBy(0, -(pinnedHeader.getHeight() + dp));
                            return ju0Var;
                        }
                        int height = ju0Var.c - e1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            e1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return ju0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean Y() {
        t10 t10Var = this.a;
        if (t10Var.K) {
            return true;
        }
        t10Var.h(t10Var.B, t10Var.C, t10Var.E, t10Var.D, t10Var.y, t10Var.G, t10Var.w, false);
        return true;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final CharSequence b0(int i10) {
        return t10.d((MessageObject) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final int y() {
        return this.a.L;
    }
}
