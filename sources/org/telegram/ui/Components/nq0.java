package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nq0 extends org.telegram.ui.oq0 {
    public final /* synthetic */ gt0 a;

    public nq0(gt0 gt0Var) {
        this.a = gt0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        int i10;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        boolean z12;
        boolean z13;
        View pinnedHeader;
        int i11;
        gt0 gt0Var = this.a;
        vr0 vr0Var = gt0Var.G1;
        zq0 zq0Var = gt0Var.U0;
        bs0[] bs0VarArr = gt0Var.n0;
        if (fjVar != null) {
            int i12 = 0;
            bs0 bs0Var = bs0VarArr[0];
            int i13 = bs0Var.F;
            boolean z14 = true;
            if (i13 == 0 || i13 == 1 || i13 == 3 || i13 == 5) {
                lq0 lq0Var = bs0Var.h;
                int childCount = lq0Var.getChildCount();
                int i14 = -1;
                int i15 = 0;
                int i16 = -1;
                int i17 = -1;
                while (i15 < childCount) {
                    View childAt = lq0Var.getChildAt(i15);
                    int measuredHeight = bs0VarArr[i12].h.getMeasuredHeight();
                    View view = (View) gt0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (gt0Var.getY() + gt0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= gt0Var.getBottom() - view.getMeasuredHeight();
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
                            org.telegram.messenger.fj messageObject = o7Var.getMessageObject();
                            if (messageObject != null) {
                                i10 = i12;
                                int e12 = messageObject.e1();
                                boolean z15 = z14;
                                z12 = z15;
                                if (e12 == fjVar.e1()) {
                                    o7Var.getLocationInWindow(iArr);
                                    iArr[i10] = Math.round(linkImageView.L0) + iArr[i10];
                                    iArr[z15 ? 1 : 0] = Math.round(linkImageView.M0) + iArr[z15 ? 1 : 0];
                                    z13 = z15;
                                    if (linkImageView != null) {
                                        org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                                        wq0Var.b = iArr[i10];
                                        wq0Var.c = iArr[z13];
                                        wq0Var.d = lq0Var;
                                        bs0 bs0Var2 = bs0VarArr[i10];
                                        wq0Var.m = bs0Var2.y;
                                        bs0Var2.h.getLocationInWindow(iArr);
                                        wq0Var.n = -iArr[z13];
                                        wq0Var.a = linkImageView;
                                        wq0Var.o = z13;
                                        wq0Var.h = linkImageView.E();
                                        wq0Var.e = wq0Var.a.p();
                                        wq0Var.d.getLocationInWindow(iArr);
                                        int i18 = i10;
                                        wq0Var.j = i18;
                                        wq0Var.q = gt0Var.w1[i18].m;
                                        if (zq0Var != null && zq0Var.getVisibility() == 0) {
                                            wq0Var.j = org.telegram.messenger.g0.L(36.0f) + wq0Var.j;
                                        }
                                        if (PhotoViewer.L1(fjVar) && (pinnedHeader = lq0Var.getPinnedHeader()) != null) {
                                            int height = (zq0Var == null || zq0Var.getVisibility() != 0) ? 0 : zq0Var.getHeight() - org.telegram.messenger.g0.L(2.5f);
                                            boolean z16 = childAt instanceof org.telegram.ui.Cells.h7;
                                            if (z16) {
                                                height += org.telegram.messenger.g0.L(8.0f);
                                            }
                                            int i19 = height - wq0Var.c;
                                            if (i19 > childAt.getHeight()) {
                                                lq0Var.scrollBy(0, -(pinnedHeader.getHeight() + i19));
                                                return wq0Var;
                                            }
                                            int height2 = wq0Var.c - lq0Var.getHeight();
                                            if (z16) {
                                                height2 -= org.telegram.messenger.g0.L(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                lq0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return wq0Var;
                                    }
                                    i11 = i10;
                                }
                                linkImageView = imageReceiver;
                                z13 = z12;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            i10 = i12;
                            boolean z17 = z14;
                            if (childAt instanceof org.telegram.ui.Cells.h7) {
                                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                                z12 = z17;
                                if (h7Var.getMessage().e1() == fjVar.e1()) {
                                    q9 imageView = h7Var.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                    z13 = z17;
                                }
                                linkImageView = imageReceiver;
                                z13 = z12;
                            } else {
                                if (childAt instanceof org.telegram.ui.Cells.h2) {
                                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                                    org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) h2Var.getParentObject();
                                    z12 = z17;
                                    if (fjVar2 != null) {
                                        z12 = z17;
                                        if (fjVar2.e1() == fjVar.e1()) {
                                            photoImage = h2Var.getPhotoImage();
                                            h2Var.getLocationInWindow(iArr);
                                            linkImageView = photoImage;
                                            z13 = z17;
                                        }
                                    }
                                } else {
                                    z12 = z17;
                                    if (childAt instanceof org.telegram.ui.Cells.k7) {
                                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                                        org.telegram.messenger.fj message = k7Var.getMessage();
                                        z12 = z17;
                                        if (message != null) {
                                            z12 = z17;
                                            if (message.e1() == fjVar.e1()) {
                                                linkImageView = k7Var.getLinkImageView();
                                                k7Var.getLocationInWindow(iArr);
                                                z13 = z17;
                                            }
                                        }
                                    }
                                }
                                linkImageView = imageReceiver;
                                z13 = z12;
                            }
                            if (linkImageView != null) {
                            }
                        }
                        i15++;
                        i12 = i11;
                        z14 = true;
                        i14 = -1;
                    }
                    i11 = i12;
                    i15++;
                    i12 = i11;
                    z14 = true;
                    i14 = -1;
                }
                int i20 = i12;
                if (bs0VarArr[i20].F != 0 || i16 < 0 || i17 < 0) {
                    return null;
                }
                int L = gt0Var.K.L(i7);
                if (L <= i16) {
                    bs0VarArr[i20].x.h1(L, i20);
                    vr0Var.J();
                    return null;
                }
                if (L < i17 || i17 < 0) {
                    return null;
                }
                bs0VarArr[i20].x.i1(L, i20, true);
                vr0Var.J();
                return null;
            }
        }
        return null;
    }
}
