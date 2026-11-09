package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nz extends pq0 {
    public final /* synthetic */ a00 a;

    public nz(a00 a00Var) {
        this.a = a00Var;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final CharSequence C(int i7) {
        return org.telegram.messenger.id.s(((org.telegram.messenger.ij) this.a.f.get(i7)).k.date, false);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (ijVar != null) {
            bt btVar = this.a.b;
            int childCount = btVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = btVar.getChildAt(i10);
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
                            org.telegram.ui.Components.l9 l9Var = i11 >= p7Var.e ? null : p7Var.a[i11].a;
                            ImageReceiver imageReceiver = l9Var.getImageReceiver();
                            l9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i11++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage().e1() == ijVar.e1()) {
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
                        if (ijVar3 != null && ijVar3.e1() == ijVar.e1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    yq0 yq0Var = new yq0();
                    yq0Var.b = iArr[0];
                    yq0Var.c = iArr[1];
                    yq0Var.d = btVar;
                    btVar.getLocationInWindow(iArr);
                    yq0Var.n = -iArr[1];
                    yq0Var.a = photoImage;
                    yq0Var.o = false;
                    yq0Var.h = photoImage.E();
                    yq0Var.e = yq0Var.a.p();
                    yq0Var.d.getLocationInWindow(iArr);
                    yq0Var.j = 0;
                    if (PhotoViewer.L1(ijVar) && (pinnedHeader = btVar.getPinnedHeader()) != null) {
                        int L = (childAt instanceof org.telegram.ui.Cells.h7 ? org.telegram.messenger.g0.L(8.0f) : 0) - yq0Var.c;
                        if (L > childAt.getHeight()) {
                            btVar.scrollBy(0, -(pinnedHeader.getHeight() + L));
                            return yq0Var;
                        }
                        int height = yq0Var.c - btVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            btVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return yq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean Z() {
        a00 a00Var = this.a;
        if (a00Var.N) {
            return true;
        }
        a00Var.h(a00Var.E, a00Var.F, a00Var.H, a00Var.G, a00Var.D, a00Var.J, a00Var.x, false);
        return true;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final CharSequence c0(int i7) {
        return a00.d((org.telegram.messenger.ij) this.a.f.get(i7), true, 0, null);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final int y() {
        return this.a.O;
    }
}
