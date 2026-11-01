package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l00 extends xr0 {
    public final /* synthetic */ y00 a;

    public l00(y00 y00Var) {
        this.a = y00Var;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final CharSequence C(int i10) {
        return org.telegram.messenger.dd.s(((org.telegram.messenger.kj) this.a.f.get(i10)).k.date, false);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (kjVar != null) {
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
                        org.telegram.messenger.kj kjVar2 = i12 >= t7Var.e ? null : t7Var.b[i12];
                        if (kjVar2 == null) {
                            break;
                        }
                        if (kjVar2.f1() == kjVar.f1()) {
                            org.telegram.ui.Components.g9 g9Var = i12 >= t7Var.e ? null : t7Var.a[i12].a;
                            ImageReceiver imageReceiver = g9Var.getImageReceiver();
                            g9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                    if (l7Var.getMessage().f1() == kjVar.f1()) {
                        org.telegram.ui.Components.g9 imageView = l7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) h2Var.getParentObject();
                        if (kjVar3 != null && kjVar3.f1() == kjVar.f1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    fs0 fs0Var = new fs0();
                    fs0Var.b = iArr[0];
                    fs0Var.c = iArr[1];
                    fs0Var.d = b1Var;
                    b1Var.getLocationInWindow(iArr);
                    fs0Var.n = -iArr[1];
                    fs0Var.a = photoImage;
                    fs0Var.o = false;
                    fs0Var.h = photoImage.E();
                    fs0Var.e = fs0Var.a.p();
                    fs0Var.d.getLocationInWindow(iArr);
                    fs0Var.j = 0;
                    if (PhotoViewer.Q1(kjVar) && (pinnedHeader = b1Var.getPinnedHeader()) != null) {
                        int L = (childAt instanceof org.telegram.ui.Cells.l7 ? org.telegram.messenger.i0.L(8.0f) : 0) - fs0Var.c;
                        if (L > childAt.getHeight()) {
                            b1Var.scrollBy(0, -(pinnedHeader.getHeight() + L));
                            return fs0Var;
                        }
                        int height = fs0Var.c - b1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.l7) {
                            height -= org.telegram.messenger.i0.L(8.0f);
                        }
                        if (height >= 0) {
                            b1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return fs0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean Z() {
        y00 y00Var = this.a;
        if (y00Var.N) {
            return true;
        }
        y00Var.h(y00Var.E, y00Var.F, y00Var.H, y00Var.G, y00Var.D, y00Var.J, y00Var.x, false);
        return true;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final CharSequence c0(int i10) {
        return y00.d((org.telegram.messenger.kj) this.a.f.get(i10), true, 0, null);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int y() {
        return this.a.O;
    }
}
