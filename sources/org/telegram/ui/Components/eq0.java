package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class eq0 extends org.telegram.ui.eq0 {
    public final /* synthetic */ ws0 a;

    public eq0(ws0 ws0Var) {
        this.a = ws0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        int i10;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        boolean z12;
        boolean z13;
        View pinnedHeader;
        int i11;
        ws0 ws0Var = this.a;
        lr0 lr0Var = ws0Var.G1;
        oq0 oq0Var = ws0Var.U0;
        rr0[] rr0VarArr = ws0Var.n0;
        if (ziVar != null) {
            int i12 = 0;
            rr0 rr0Var = rr0VarArr[0];
            int i13 = rr0Var.F;
            boolean z14 = true;
            if (i13 == 0 || i13 == 1 || i13 == 3 || i13 == 5) {
                cq0 cq0Var = rr0Var.h;
                int childCount = cq0Var.getChildCount();
                int i14 = -1;
                int i15 = 0;
                int i16 = -1;
                int i17 = -1;
                while (i15 < childCount) {
                    View childAt = cq0Var.getChildAt(i15);
                    int measuredHeight = rr0VarArr[i12].h.getMeasuredHeight();
                    View view = (View) ws0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (ws0Var.getY() + ws0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= ws0Var.getBottom() - view.getMeasuredHeight();
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
                        if (childAt instanceof org.telegram.ui.Cells.n7) {
                            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                            linkImageView = n7Var.c;
                            org.telegram.messenger.zi messageObject = n7Var.getMessageObject();
                            if (messageObject != null) {
                                i10 = i12;
                                int f12 = messageObject.f1();
                                boolean z15 = z14;
                                z12 = z15;
                                if (f12 == ziVar.f1()) {
                                    n7Var.getLocationInWindow(iArr);
                                    iArr[i10] = Math.round(linkImageView.L0) + iArr[i10];
                                    iArr[z15 ? 1 : 0] = Math.round(linkImageView.M0) + iArr[z15 ? 1 : 0];
                                    z13 = z15;
                                    if (linkImageView != null) {
                                        org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0();
                                        mq0Var.b = iArr[i10];
                                        mq0Var.c = iArr[z13];
                                        mq0Var.d = cq0Var;
                                        rr0 rr0Var2 = rr0VarArr[i10];
                                        mq0Var.m = rr0Var2.y;
                                        rr0Var2.h.getLocationInWindow(iArr);
                                        mq0Var.n = -iArr[z13];
                                        mq0Var.a = linkImageView;
                                        mq0Var.o = z13;
                                        mq0Var.h = linkImageView.E();
                                        mq0Var.e = mq0Var.a.p();
                                        mq0Var.d.getLocationInWindow(iArr);
                                        int i18 = i10;
                                        mq0Var.j = i18;
                                        mq0Var.q = ws0Var.w1[i18].m;
                                        if (oq0Var != null && oq0Var.getVisibility() == 0) {
                                            mq0Var.j = org.telegram.messenger.g0.L(36.0f) + mq0Var.j;
                                        }
                                        if (PhotoViewer.Q1(ziVar) && (pinnedHeader = cq0Var.getPinnedHeader()) != null) {
                                            int height = (oq0Var == null || oq0Var.getVisibility() != 0) ? 0 : oq0Var.getHeight() - org.telegram.messenger.g0.L(2.5f);
                                            boolean z16 = childAt instanceof org.telegram.ui.Cells.g7;
                                            if (z16) {
                                                height += org.telegram.messenger.g0.L(8.0f);
                                            }
                                            int i19 = height - mq0Var.c;
                                            if (i19 > childAt.getHeight()) {
                                                cq0Var.scrollBy(0, -(pinnedHeader.getHeight() + i19));
                                                return mq0Var;
                                            }
                                            int height2 = mq0Var.c - cq0Var.getHeight();
                                            if (z16) {
                                                height2 -= org.telegram.messenger.g0.L(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                cq0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return mq0Var;
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
                            if (childAt instanceof org.telegram.ui.Cells.g7) {
                                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                                z12 = z17;
                                if (g7Var.getMessage().f1() == ziVar.f1()) {
                                    k9 imageView = g7Var.getImageView();
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
                                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) h2Var.getParentObject();
                                    z12 = z17;
                                    if (ziVar2 != null) {
                                        z12 = z17;
                                        if (ziVar2.f1() == ziVar.f1()) {
                                            photoImage = h2Var.getPhotoImage();
                                            h2Var.getLocationInWindow(iArr);
                                            linkImageView = photoImage;
                                            z13 = z17;
                                        }
                                    }
                                } else {
                                    z12 = z17;
                                    if (childAt instanceof org.telegram.ui.Cells.j7) {
                                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                                        org.telegram.messenger.zi message = j7Var.getMessage();
                                        z12 = z17;
                                        if (message != null) {
                                            z12 = z17;
                                            if (message.f1() == ziVar.f1()) {
                                                linkImageView = j7Var.getLinkImageView();
                                                j7Var.getLocationInWindow(iArr);
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
                if (rr0VarArr[i20].F != 0 || i16 < 0 || i17 < 0) {
                    return null;
                }
                int L = ws0Var.K.L(i3);
                if (L <= i16) {
                    rr0VarArr[i20].x.h1(L, i20);
                    lr0Var.I();
                    return null;
                }
                if (L < i17 || i17 < 0) {
                    return null;
                }
                rr0VarArr[i20].x.i1(L, i20, true);
                lr0Var.I();
                return null;
            }
        }
        return null;
    }
}
