package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fr0 extends org.telegram.ui.yr0 {
    public final /* synthetic */ zt0 a;

    public fr0(zt0 zt0Var) {
        this.a = zt0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        int i11;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        boolean z12;
        boolean z13;
        View pinnedHeader;
        int i12;
        zt0 zt0Var = this.a;
        ms0 ms0Var = zt0Var.F1;
        pr0 pr0Var = zt0Var.T0;
        ss0[] ss0VarArr = zt0Var.m0;
        if (jjVar != null) {
            int i13 = 0;
            ss0 ss0Var = ss0VarArr[0];
            int i14 = ss0Var.E;
            boolean z14 = true;
            if (i14 == 0 || i14 == 1 || i14 == 3 || i14 == 5) {
                dr0 dr0Var = ss0Var.h;
                int childCount = dr0Var.getChildCount();
                int i15 = -1;
                int i16 = 0;
                int i17 = -1;
                int i18 = -1;
                while (i16 < childCount) {
                    View childAt = dr0Var.getChildAt(i16);
                    int measuredHeight = ss0VarArr[i13].h.getMeasuredHeight();
                    View view = (View) zt0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (zt0Var.getY() + zt0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= zt0Var.getBottom() - view.getMeasuredHeight();
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (childAt.getTop() < measuredHeight) {
                        int R = RecyclerView.R(childAt);
                        if (R < i17 || i17 == i15) {
                            i17 = R;
                        }
                        if (R > i18 || i18 == i15) {
                            i18 = R;
                        }
                        int[] iArr = new int[2];
                        if (childAt instanceof org.telegram.ui.Cells.s7) {
                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                            linkImageView = s7Var.c;
                            org.telegram.messenger.jj messageObject = s7Var.getMessageObject();
                            if (messageObject != null) {
                                i11 = i13;
                                int f12 = messageObject.f1();
                                boolean z15 = z14;
                                z12 = z15;
                                if (f12 == jjVar.f1()) {
                                    s7Var.getLocationInWindow(iArr);
                                    iArr[i11] = Math.round(linkImageView.K0) + iArr[i11];
                                    iArr[z15 ? 1 : 0] = Math.round(linkImageView.L0) + iArr[z15 ? 1 : 0];
                                    z13 = z15;
                                    if (linkImageView != null) {
                                        org.telegram.ui.gs0 gs0Var = new org.telegram.ui.gs0();
                                        gs0Var.b = iArr[i11];
                                        gs0Var.c = iArr[z13];
                                        gs0Var.d = dr0Var;
                                        ss0 ss0Var2 = ss0VarArr[i11];
                                        gs0Var.m = ss0Var2.y;
                                        ss0Var2.h.getLocationInWindow(iArr);
                                        gs0Var.n = -iArr[z13];
                                        gs0Var.a = linkImageView;
                                        gs0Var.o = z13;
                                        gs0Var.h = linkImageView.E();
                                        gs0Var.e = gs0Var.a.p();
                                        gs0Var.d.getLocationInWindow(iArr);
                                        int i19 = i11;
                                        gs0Var.j = i19;
                                        gs0Var.q = zt0Var.v1[i19].m;
                                        if (pr0Var != null && pr0Var.getVisibility() == 0) {
                                            gs0Var.j = org.telegram.messenger.i0.L(36.0f) + gs0Var.j;
                                        }
                                        if (PhotoViewer.Q1(jjVar) && (pinnedHeader = dr0Var.getPinnedHeader()) != null) {
                                            int height = (pr0Var == null || pr0Var.getVisibility() != 0) ? 0 : pr0Var.getHeight() - org.telegram.messenger.i0.L(2.5f);
                                            boolean z16 = childAt instanceof org.telegram.ui.Cells.l7;
                                            if (z16) {
                                                height += org.telegram.messenger.i0.L(8.0f);
                                            }
                                            int i20 = height - gs0Var.c;
                                            if (i20 > childAt.getHeight()) {
                                                dr0Var.scrollBy(0, -(pinnedHeader.getHeight() + i20));
                                                return gs0Var;
                                            }
                                            int height2 = gs0Var.c - dr0Var.getHeight();
                                            if (z16) {
                                                height2 -= org.telegram.messenger.i0.L(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                dr0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return gs0Var;
                                    }
                                    i12 = i11;
                                }
                                linkImageView = imageReceiver;
                                z13 = z12;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            i11 = i13;
                            boolean z17 = z14;
                            if (childAt instanceof org.telegram.ui.Cells.l7) {
                                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                                z12 = z17;
                                if (l7Var.getMessage().f1() == jjVar.f1()) {
                                    g9 imageView = l7Var.getImageView();
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
                                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) h2Var.getParentObject();
                                    z12 = z17;
                                    if (jjVar2 != null) {
                                        z12 = z17;
                                        if (jjVar2.f1() == jjVar.f1()) {
                                            photoImage = h2Var.getPhotoImage();
                                            h2Var.getLocationInWindow(iArr);
                                            linkImageView = photoImage;
                                            z13 = z17;
                                        }
                                    }
                                } else {
                                    z12 = z17;
                                    if (childAt instanceof org.telegram.ui.Cells.o7) {
                                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                                        org.telegram.messenger.jj message = o7Var.getMessage();
                                        z12 = z17;
                                        if (message != null) {
                                            z12 = z17;
                                            if (message.f1() == jjVar.f1()) {
                                                linkImageView = o7Var.getLinkImageView();
                                                o7Var.getLocationInWindow(iArr);
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
                        i16++;
                        i13 = i12;
                        z14 = true;
                        i15 = -1;
                    }
                    i12 = i13;
                    i16++;
                    i13 = i12;
                    z14 = true;
                    i15 = -1;
                }
                int i21 = i13;
                if (ss0VarArr[i21].E != 0 || i17 < 0 || i18 < 0) {
                    return null;
                }
                int L = zt0Var.J.L(i10);
                if (L <= i17) {
                    ss0VarArr[i21].x.h1(L, i21);
                    ms0Var.I();
                    return null;
                }
                if (L < i18 || i18 < 0) {
                    return null;
                }
                ss0VarArr[i21].x.i1(L, i21, true);
                ms0Var.I();
                return null;
            }
        }
        return null;
    }
}
