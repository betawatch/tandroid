package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class oz extends qq0 {
    public final /* synthetic */ b00 a;

    public oz(b00 b00Var) {
        this.a = b00Var;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final CharSequence C(int i7) {
        return org.telegram.messenger.id.s(((org.telegram.messenger.ij) this.a.f.get(i7)).k.date, false);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (ijVar != null) {
            ct ctVar = this.a.b;
            int childCount = ctVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ctVar.getChildAt(i10);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                    photoImage = null;
                    int i11 = 0;
                    while (i11 < 6) {
                        org.telegram.messenger.ij ijVar2 = i11 >= p7Var.e ? null : p7Var.b[i11];
                        if (ijVar2 == null) {
                            break;
                        }
                        if (ijVar2.e1() == ijVar.e1()) {
                            org.telegram.ui.Components.k9 k9Var = i11 >= p7Var.e ? null : p7Var.a[i11].a;
                            ImageReceiver imageReceiver = k9Var.getImageReceiver();
                            k9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i11++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage().e1() == ijVar.e1()) {
                        org.telegram.ui.Components.k9 imageView = h7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) h2Var.getParentObject();
                        if (ijVar3 != null && ijVar3.e1() == ijVar.e1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    zq0 zq0Var = new zq0();
                    zq0Var.b = iArr[0];
                    zq0Var.c = iArr[1];
                    zq0Var.d = ctVar;
                    ctVar.getLocationInWindow(iArr);
                    zq0Var.n = -iArr[1];
                    zq0Var.a = photoImage;
                    zq0Var.o = false;
                    zq0Var.h = photoImage.E();
                    zq0Var.e = zq0Var.a.p();
                    zq0Var.d.getLocationInWindow(iArr);
                    zq0Var.j = 0;
                    if (PhotoViewer.L1(ijVar) && (pinnedHeader = ctVar.getPinnedHeader()) != null) {
                        int L = (childAt instanceof org.telegram.ui.Cells.h7 ? org.telegram.messenger.g0.L(8.0f) : 0) - zq0Var.c;
                        if (L > childAt.getHeight()) {
                            ctVar.scrollBy(0, -(pinnedHeader.getHeight() + L));
                            return zq0Var;
                        }
                        int height = zq0Var.c - ctVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            ctVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return zq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean Z() {
        b00 b00Var = this.a;
        if (b00Var.N) {
            return true;
        }
        b00Var.h(b00Var.E, b00Var.F, b00Var.H, b00Var.G, b00Var.D, b00Var.J, b00Var.x, false);
        return true;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final CharSequence c0(int i7) {
        return b00.d((org.telegram.messenger.ij) this.a.f.get(i7), true, 0, null);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int y() {
        return this.a.O;
    }
}
