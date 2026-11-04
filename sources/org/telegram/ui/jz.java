package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jz extends eq0 {
    public final /* synthetic */ wz a;

    public jz(wz wzVar) {
        this.a = wzVar;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final CharSequence C(int i3) {
        return org.telegram.messenger.bd.s(((org.telegram.messenger.zi) this.a.f.get(i3)).k.date, false);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (ziVar != null) {
            xs xsVar = this.a.b;
            int childCount = xsVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = xsVar.getChildAt(i10);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    photoImage = null;
                    int i11 = 0;
                    while (i11 < 6) {
                        org.telegram.messenger.zi ziVar2 = i11 >= o7Var.e ? null : o7Var.b[i11];
                        if (ziVar2 == null) {
                            break;
                        }
                        if (ziVar2.f1() == ziVar.f1()) {
                            org.telegram.ui.Components.k9 k9Var = i11 >= o7Var.e ? null : o7Var.a[i11].a;
                            ImageReceiver imageReceiver = k9Var.getImageReceiver();
                            k9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i11++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (g7Var.getMessage().f1() == ziVar.f1()) {
                        org.telegram.ui.Components.k9 imageView = g7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) h2Var.getParentObject();
                        if (ziVar3 != null && ziVar3.f1() == ziVar.f1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    mq0 mq0Var = new mq0();
                    mq0Var.b = iArr[0];
                    mq0Var.c = iArr[1];
                    mq0Var.d = xsVar;
                    xsVar.getLocationInWindow(iArr);
                    mq0Var.n = -iArr[1];
                    mq0Var.a = photoImage;
                    mq0Var.o = false;
                    mq0Var.h = photoImage.E();
                    mq0Var.e = mq0Var.a.p();
                    mq0Var.d.getLocationInWindow(iArr);
                    mq0Var.j = 0;
                    if (PhotoViewer.Q1(ziVar) && (pinnedHeader = xsVar.getPinnedHeader()) != null) {
                        int L = (childAt instanceof org.telegram.ui.Cells.g7 ? org.telegram.messenger.g0.L(8.0f) : 0) - mq0Var.c;
                        if (L > childAt.getHeight()) {
                            xsVar.scrollBy(0, -(pinnedHeader.getHeight() + L));
                            return mq0Var;
                        }
                        int height = mq0Var.c - xsVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            xsVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return mq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean Z() {
        wz wzVar = this.a;
        if (wzVar.O) {
            return true;
        }
        wzVar.h(wzVar.F, wzVar.G, wzVar.I, wzVar.H, wzVar.E, wzVar.K, wzVar.x, false);
        return true;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final CharSequence c0(int i3) {
        return wz.d((org.telegram.messenger.zi) this.a.f.get(i3), true, 0, null);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int y() {
        return this.a.P;
    }
}
