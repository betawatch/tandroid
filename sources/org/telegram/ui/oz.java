package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class oz extends oq0 {
    public final /* synthetic */ b00 a;

    public oz(b00 b00Var) {
        this.a = b00Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final CharSequence C(int i7) {
        return org.telegram.messenger.gd.s(((org.telegram.messenger.fj) this.a.f.get(i7)).k.date, false);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (fjVar != null) {
            dt dtVar = this.a.b;
            int childCount = dtVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = dtVar.getChildAt(i10);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                    photoImage = null;
                    int i11 = 0;
                    while (i11 < 6) {
                        org.telegram.messenger.fj fjVar2 = i11 >= p7Var.e ? null : p7Var.b[i11];
                        if (fjVar2 == null) {
                            break;
                        }
                        if (fjVar2.e1() == fjVar.e1()) {
                            org.telegram.ui.Components.p9 p9Var = i11 >= p7Var.e ? null : p7Var.a[i11].a;
                            ImageReceiver imageReceiver = p9Var.getImageReceiver();
                            p9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i11++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage().e1() == fjVar.e1()) {
                        org.telegram.ui.Components.p9 imageView = h7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.i2) {
                        org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) childAt;
                        org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) i2Var.getParentObject();
                        if (fjVar3 != null && fjVar3.e1() == fjVar.e1()) {
                            photoImage = i2Var.getPhotoImage();
                            i2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    wq0 wq0Var = new wq0();
                    wq0Var.b = iArr[0];
                    wq0Var.c = iArr[1];
                    wq0Var.d = dtVar;
                    dtVar.getLocationInWindow(iArr);
                    wq0Var.n = -iArr[1];
                    wq0Var.a = photoImage;
                    wq0Var.o = false;
                    wq0Var.h = photoImage.F();
                    wq0Var.e = wq0Var.a.p();
                    wq0Var.d.getLocationInWindow(iArr);
                    wq0Var.j = 0;
                    if (PhotoViewer.L1(fjVar) && (pinnedHeader = dtVar.getPinnedHeader()) != null) {
                        int L = (childAt instanceof org.telegram.ui.Cells.h7 ? org.telegram.messenger.g0.L(8.0f) : 0) - wq0Var.c;
                        if (L > childAt.getHeight()) {
                            dtVar.scrollBy(0, -(pinnedHeader.getHeight() + L));
                            return wq0Var;
                        }
                        int height = wq0Var.c - dtVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            dtVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return wq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean Z() {
        b00 b00Var = this.a;
        if (b00Var.O) {
            return true;
        }
        b00Var.h(b00Var.F, b00Var.G, b00Var.I, b00Var.H, b00Var.E, b00Var.K, b00Var.x, false);
        return true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final CharSequence c0(int i7) {
        return b00.d((org.telegram.messenger.fj) this.a.f.get(i7), true, 0, null);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int y() {
        return this.a.P;
    }
}
