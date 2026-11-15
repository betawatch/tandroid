package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class mz extends mq0 {
    public final /* synthetic */ zz a;

    public mz(zz zzVar) {
        this.a = zzVar;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final CharSequence C(int i7) {
        return org.telegram.messenger.hd.s(((org.telegram.messenger.gj) this.a.f.get(i7)).k.date, false);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (gjVar != null) {
            ct ctVar = this.a.b;
            int childCount = ctVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ctVar.getChildAt(i10);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    photoImage = null;
                    int i11 = 0;
                    while (i11 < 6) {
                        org.telegram.messenger.gj gjVar2 = i11 >= o7Var.e ? null : o7Var.b[i11];
                        if (gjVar2 == null) {
                            break;
                        }
                        if (gjVar2.e1() == gjVar.e1()) {
                            org.telegram.ui.Components.i9 i9Var = i11 >= o7Var.e ? null : o7Var.a[i11].a;
                            ImageReceiver imageReceiver = i9Var.getImageReceiver();
                            i9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i11++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (g7Var.getMessage().e1() == gjVar.e1()) {
                        org.telegram.ui.Components.i9 imageView = g7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) h2Var.getParentObject();
                        if (gjVar3 != null && gjVar3.e1() == gjVar.e1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    uq0 uq0Var = new uq0();
                    uq0Var.b = iArr[0];
                    uq0Var.c = iArr[1];
                    uq0Var.d = ctVar;
                    ctVar.getLocationInWindow(iArr);
                    uq0Var.n = -iArr[1];
                    uq0Var.a = photoImage;
                    uq0Var.o = false;
                    uq0Var.h = photoImage.E();
                    uq0Var.e = uq0Var.a.p();
                    uq0Var.d.getLocationInWindow(iArr);
                    uq0Var.j = 0;
                    if (PhotoViewer.L1(gjVar) && (pinnedHeader = ctVar.getPinnedHeader()) != null) {
                        int L = (childAt instanceof org.telegram.ui.Cells.g7 ? org.telegram.messenger.g0.L(8.0f) : 0) - uq0Var.c;
                        if (L > childAt.getHeight()) {
                            ctVar.scrollBy(0, -(pinnedHeader.getHeight() + L));
                            return uq0Var;
                        }
                        int height = uq0Var.c - ctVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            ctVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return uq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean Z() {
        zz zzVar = this.a;
        if (zzVar.O) {
            return true;
        }
        zzVar.h(zzVar.F, zzVar.G, zzVar.I, zzVar.H, zzVar.E, zzVar.K, zzVar.x, false);
        return true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final CharSequence c0(int i7) {
        return zz.d((org.telegram.messenger.gj) this.a.f.get(i7), true, 0, null);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int y() {
        return this.a.P;
    }
}
