package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m00 extends yr0 {
    public final /* synthetic */ z00 a;

    public m00(z00 z00Var) {
        this.a = z00Var;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final CharSequence C(int i10) {
        return org.telegram.messenger.cd.s(((org.telegram.messenger.jj) this.a.f.get(i10)).k.date, false);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (jjVar != null) {
            ag.b1 b1Var = this.a.b;
            int childCount = b1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = b1Var.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    photoImage = null;
                    int i12 = 0;
                    while (i12 < 6) {
                        org.telegram.messenger.jj jjVar2 = i12 >= t7Var.e ? null : t7Var.b[i12];
                        if (jjVar2 == null) {
                            break;
                        }
                        if (jjVar2.f1() == jjVar.f1()) {
                            org.telegram.ui.Components.g9 g9Var = i12 >= t7Var.e ? null : t7Var.a[i12].a;
                            ImageReceiver imageReceiver = g9Var.getImageReceiver();
                            g9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                    if (l7Var.getMessage().f1() == jjVar.f1()) {
                        org.telegram.ui.Components.g9 imageView = l7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) h2Var.getParentObject();
                        if (jjVar3 != null && jjVar3.f1() == jjVar.f1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    gs0 gs0Var = new gs0();
                    gs0Var.b = iArr[0];
                    gs0Var.c = iArr[1];
                    gs0Var.d = b1Var;
                    b1Var.getLocationInWindow(iArr);
                    gs0Var.n = -iArr[1];
                    gs0Var.a = photoImage;
                    gs0Var.o = false;
                    gs0Var.h = photoImage.E();
                    gs0Var.e = gs0Var.a.p();
                    gs0Var.d.getLocationInWindow(iArr);
                    gs0Var.j = 0;
                    if (PhotoViewer.Q1(jjVar) && (pinnedHeader = b1Var.getPinnedHeader()) != null) {
                        int L = (childAt instanceof org.telegram.ui.Cells.l7 ? org.telegram.messenger.i0.L(8.0f) : 0) - gs0Var.c;
                        if (L > childAt.getHeight()) {
                            b1Var.scrollBy(0, -(pinnedHeader.getHeight() + L));
                            return gs0Var;
                        }
                        int height = gs0Var.c - b1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.l7) {
                            height -= org.telegram.messenger.i0.L(8.0f);
                        }
                        if (height >= 0) {
                            b1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return gs0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean Z() {
        z00 z00Var = this.a;
        if (z00Var.N) {
            return true;
        }
        z00Var.h(z00Var.E, z00Var.F, z00Var.H, z00Var.G, z00Var.D, z00Var.J, z00Var.x, false);
        return true;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final CharSequence c0(int i10) {
        return z00.d((org.telegram.messenger.jj) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int y() {
        return this.a.O;
    }
}
