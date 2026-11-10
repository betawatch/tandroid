package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class eq0 extends org.telegram.ui.qq0 {
    public final /* synthetic */ ys0 a;

    public eq0(ys0 ys0Var) {
        this.a = ys0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver imageReceiver;
        int i10;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        boolean z11;
        boolean z12;
        View pinnedHeader;
        int i11;
        ys0 ys0Var = this.a;
        nr0 nr0Var = ys0Var.F1;
        qq0 qq0Var = ys0Var.T0;
        tr0[] tr0VarArr = ys0Var.m0;
        if (ijVar != null) {
            int i12 = 0;
            tr0 tr0Var = tr0VarArr[0];
            int i13 = tr0Var.E;
            boolean z13 = true;
            if (i13 == 0 || i13 == 1 || i13 == 3 || i13 == 5) {
                cq0 cq0Var = tr0Var.h;
                int childCount = cq0Var.getChildCount();
                int i14 = -1;
                int i15 = 0;
                int i16 = -1;
                int i17 = -1;
                while (i15 < childCount) {
                    View childAt = cq0Var.getChildAt(i15);
                    int measuredHeight = tr0VarArr[i12].h.getMeasuredHeight();
                    View view = (View) ys0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (ys0Var.getY() + ys0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= ys0Var.getBottom() - view.getMeasuredHeight();
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (childAt.getTop() < measuredHeight) {
                        int R = RecyclerView.R(childAt);
                        if (R < i16 || i16 == i14) {
                            i16 = R;
                        }
                        if (R > i17 || i17 == i14) {
                            i17 = R;
                        }
                        int[] iArr = new int[2];
                        if (childAt instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                            linkImageView = o7Var.c;
                            org.telegram.messenger.ij messageObject = o7Var.getMessageObject();
                            if (messageObject != null) {
                                i10 = i12;
                                int e12 = messageObject.e1();
                                boolean z14 = z13;
                                z11 = z14;
                                if (e12 == ijVar.e1()) {
                                    o7Var.getLocationInWindow(iArr);
                                    iArr[i10] = Math.round(linkImageView.K0) + iArr[i10];
                                    iArr[z14 ? 1 : 0] = Math.round(linkImageView.L0) + iArr[z14 ? 1 : 0];
                                    z12 = z14;
                                    if (linkImageView != null) {
                                        org.telegram.ui.zq0 zq0Var = new org.telegram.ui.zq0();
                                        zq0Var.b = iArr[i10];
                                        zq0Var.c = iArr[z12];
                                        zq0Var.d = cq0Var;
                                        tr0 tr0Var2 = tr0VarArr[i10];
                                        zq0Var.m = tr0Var2.y;
                                        tr0Var2.h.getLocationInWindow(iArr);
                                        zq0Var.n = -iArr[z12];
                                        zq0Var.a = linkImageView;
                                        zq0Var.o = z12;
                                        zq0Var.h = linkImageView.E();
                                        zq0Var.e = zq0Var.a.p();
                                        zq0Var.d.getLocationInWindow(iArr);
                                        int i18 = i10;
                                        zq0Var.j = i18;
                                        zq0Var.q = ys0Var.v1[i18].m;
                                        if (qq0Var != null && qq0Var.getVisibility() == 0) {
                                            zq0Var.j = org.telegram.messenger.g0.L(36.0f) + zq0Var.j;
                                        }
                                        if (PhotoViewer.L1(ijVar) && (pinnedHeader = cq0Var.getPinnedHeader()) != null) {
                                            int height = (qq0Var == null || qq0Var.getVisibility() != 0) ? 0 : qq0Var.getHeight() - org.telegram.messenger.g0.L(2.5f);
                                            boolean z15 = childAt instanceof org.telegram.ui.Cells.h7;
                                            if (z15) {
                                                height += org.telegram.messenger.g0.L(8.0f);
                                            }
                                            int i19 = height - zq0Var.c;
                                            if (i19 > childAt.getHeight()) {
                                                cq0Var.scrollBy(0, -(pinnedHeader.getHeight() + i19));
                                                return zq0Var;
                                            }
                                            int height2 = zq0Var.c - cq0Var.getHeight();
                                            if (z15) {
                                                height2 -= org.telegram.messenger.g0.L(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                cq0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return zq0Var;
                                    }
                                    i11 = i10;
                                }
                                linkImageView = imageReceiver;
                                z12 = z11;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            i10 = i12;
                            boolean z16 = z13;
                            if (childAt instanceof org.telegram.ui.Cells.h7) {
                                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                                z11 = z16;
                                if (h7Var.getMessage().e1() == ijVar.e1()) {
                                    k9 imageView = h7Var.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                    z12 = z16;
                                }
                                linkImageView = imageReceiver;
                                z12 = z11;
                            } else {
                                if (childAt instanceof org.telegram.ui.Cells.h2) {
                                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) h2Var.getParentObject();
                                    z11 = z16;
                                    if (ijVar2 != null) {
                                        z11 = z16;
                                        if (ijVar2.e1() == ijVar.e1()) {
                                            photoImage = h2Var.getPhotoImage();
                                            h2Var.getLocationInWindow(iArr);
                                            linkImageView = photoImage;
                                            z12 = z16;
                                        }
                                    }
                                } else {
                                    z11 = z16;
                                    if (childAt instanceof org.telegram.ui.Cells.k7) {
                                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                                        org.telegram.messenger.ij message = k7Var.getMessage();
                                        z11 = z16;
                                        if (message != null) {
                                            z11 = z16;
                                            if (message.e1() == ijVar.e1()) {
                                                linkImageView = k7Var.getLinkImageView();
                                                k7Var.getLocationInWindow(iArr);
                                                z12 = z16;
                                            }
                                        }
                                    }
                                }
                                linkImageView = imageReceiver;
                                z12 = z11;
                            }
                            if (linkImageView != null) {
                            }
                        }
                        i15++;
                        i12 = i11;
                        z13 = true;
                        i14 = -1;
                    }
                    i11 = i12;
                    i15++;
                    i12 = i11;
                    z13 = true;
                    i14 = -1;
                }
                int i20 = i12;
                if (tr0VarArr[i20].E != 0 || i16 < 0 || i17 < 0) {
                    return null;
                }
                int L = ys0Var.J.L(i7);
                if (L <= i16) {
                    tr0VarArr[i20].x.h1(L, i20);
                    nr0Var.I();
                    return null;
                }
                if (L < i17 || i17 < 0) {
                    return null;
                }
                tr0VarArr[i20].x.i1(L, i20, true);
                nr0Var.I();
                return null;
            }
        }
        return null;
    }
}
