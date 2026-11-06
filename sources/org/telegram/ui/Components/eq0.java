package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class eq0 extends org.telegram.ui.nq0 {
    public final /* synthetic */ xs0 a;

    public eq0(xs0 xs0Var) {
        this.a = xs0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver imageReceiver;
        int i10;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        boolean z11;
        boolean z12;
        View pinnedHeader;
        int i11;
        xs0 xs0Var = this.a;
        mr0 mr0Var = xs0Var.F1;
        oq0 oq0Var = xs0Var.T0;
        sr0[] sr0VarArr = xs0Var.m0;
        if (ijVar != null) {
            int i12 = 0;
            sr0 sr0Var = sr0VarArr[0];
            int i13 = sr0Var.E;
            boolean z13 = true;
            if (i13 == 0 || i13 == 1 || i13 == 3 || i13 == 5) {
                cq0 cq0Var = sr0Var.h;
                int childCount = cq0Var.getChildCount();
                int i14 = -1;
                int i15 = 0;
                int i16 = -1;
                int i17 = -1;
                while (i15 < childCount) {
                    View childAt = cq0Var.getChildAt(i15);
                    int measuredHeight = sr0VarArr[i12].h.getMeasuredHeight();
                    View view = (View) xs0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (xs0Var.getY() + xs0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= xs0Var.getBottom() - view.getMeasuredHeight();
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
                                int f12 = messageObject.f1();
                                boolean z14 = z13;
                                z11 = z14;
                                if (f12 == ijVar.f1()) {
                                    o7Var.getLocationInWindow(iArr);
                                    iArr[i10] = Math.round(linkImageView.K0) + iArr[i10];
                                    iArr[z14 ? 1 : 0] = Math.round(linkImageView.L0) + iArr[z14 ? 1 : 0];
                                    z12 = z14;
                                    if (linkImageView != null) {
                                        org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                                        wq0Var.b = iArr[i10];
                                        wq0Var.c = iArr[z12];
                                        wq0Var.d = cq0Var;
                                        sr0 sr0Var2 = sr0VarArr[i10];
                                        wq0Var.m = sr0Var2.y;
                                        sr0Var2.h.getLocationInWindow(iArr);
                                        wq0Var.n = -iArr[z12];
                                        wq0Var.a = linkImageView;
                                        wq0Var.o = z12;
                                        wq0Var.h = linkImageView.E();
                                        wq0Var.e = wq0Var.a.p();
                                        wq0Var.d.getLocationInWindow(iArr);
                                        int i18 = i10;
                                        wq0Var.j = i18;
                                        wq0Var.q = xs0Var.v1[i18].m;
                                        if (oq0Var != null && oq0Var.getVisibility() == 0) {
                                            wq0Var.j = org.telegram.messenger.g0.L(36.0f) + wq0Var.j;
                                        }
                                        if (PhotoViewer.L1(ijVar) && (pinnedHeader = cq0Var.getPinnedHeader()) != null) {
                                            int height = (oq0Var == null || oq0Var.getVisibility() != 0) ? 0 : oq0Var.getHeight() - org.telegram.messenger.g0.L(2.5f);
                                            boolean z15 = childAt instanceof org.telegram.ui.Cells.h7;
                                            if (z15) {
                                                height += org.telegram.messenger.g0.L(8.0f);
                                            }
                                            int i19 = height - wq0Var.c;
                                            if (i19 > childAt.getHeight()) {
                                                cq0Var.scrollBy(0, -(pinnedHeader.getHeight() + i19));
                                                return wq0Var;
                                            }
                                            int height2 = wq0Var.c - cq0Var.getHeight();
                                            if (z15) {
                                                height2 -= org.telegram.messenger.g0.L(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                cq0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return wq0Var;
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
                                if (h7Var.getMessage().f1() == ijVar.f1()) {
                                    l9 imageView = h7Var.getImageView();
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
                                        if (ijVar2.f1() == ijVar.f1()) {
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
                                            if (message.f1() == ijVar.f1()) {
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
                if (sr0VarArr[i20].E != 0 || i16 < 0 || i17 < 0) {
                    return null;
                }
                int L = xs0Var.J.L(i7);
                if (L <= i16) {
                    sr0VarArr[i20].x.h1(L, i20);
                    mr0Var.I();
                    return null;
                }
                if (L < i17 || i17 < 0) {
                    return null;
                }
                sr0VarArr[i20].x.i1(L, i20, true);
                mr0Var.I();
                return null;
            }
        }
        return null;
    }
}
