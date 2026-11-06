package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class lz extends mq0 {
    public final /* synthetic */ yz a;

    public lz(yz yzVar) {
        this.a = yzVar;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final CharSequence C(int i7) {
        return org.telegram.messenger.hd.s(((org.telegram.messenger.ij) this.a.f.get(i7)).k.date, false);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (ijVar != null) {
            zs zsVar = this.a.b;
            int childCount = zsVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zsVar.getChildAt(i10);
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
                        if (ijVar2.f1() == ijVar.f1()) {
                            org.telegram.ui.Components.l9 l9Var = i11 >= p7Var.e ? null : p7Var.a[i11].a;
                            ImageReceiver imageReceiver = l9Var.getImageReceiver();
                            l9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i11++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage().f1() == ijVar.f1()) {
                        org.telegram.ui.Components.l9 imageView = h7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) h2Var.getParentObject();
                        if (ijVar3 != null && ijVar3.f1() == ijVar.f1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    vq0 vq0Var = new vq0();
                    vq0Var.b = iArr[0];
                    vq0Var.c = iArr[1];
                    vq0Var.d = zsVar;
                    zsVar.getLocationInWindow(iArr);
                    vq0Var.n = -iArr[1];
                    vq0Var.a = photoImage;
                    vq0Var.o = false;
                    vq0Var.h = photoImage.E();
                    vq0Var.e = vq0Var.a.p();
                    vq0Var.d.getLocationInWindow(iArr);
                    vq0Var.j = 0;
                    if (PhotoViewer.L1(ijVar) && (pinnedHeader = zsVar.getPinnedHeader()) != null) {
                        int L = (childAt instanceof org.telegram.ui.Cells.h7 ? org.telegram.messenger.g0.L(8.0f) : 0) - vq0Var.c;
                        if (L > childAt.getHeight()) {
                            zsVar.scrollBy(0, -(pinnedHeader.getHeight() + L));
                            return vq0Var;
                        }
                        int height = vq0Var.c - zsVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            zsVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return vq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean Z() {
        yz yzVar = this.a;
        if (yzVar.N) {
            return true;
        }
        yzVar.h(yzVar.E, yzVar.F, yzVar.H, yzVar.G, yzVar.D, yzVar.J, yzVar.x, false);
        return true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final CharSequence c0(int i7) {
        return yz.d((org.telegram.messenger.ij) this.a.f.get(i7), true, 0, null);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final int y() {
        return this.a.O;
    }
}
