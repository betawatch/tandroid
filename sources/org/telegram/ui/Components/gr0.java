package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gr0 extends org.telegram.ui.xr0 {
    public final /* synthetic */ au0 a;

    public gr0(au0 au0Var) {
        this.a = au0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        int i11;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        boolean z12;
        boolean z13;
        View pinnedHeader;
        int i12;
        au0 au0Var = this.a;
        ns0 ns0Var = au0Var.F1;
        qr0 qr0Var = au0Var.T0;
        ts0[] ts0VarArr = au0Var.m0;
        if (kjVar != null) {
            int i13 = 0;
            ts0 ts0Var = ts0VarArr[0];
            int i14 = ts0Var.E;
            boolean z14 = true;
            if (i14 == 0 || i14 == 1 || i14 == 3 || i14 == 5) {
                er0 er0Var = ts0Var.h;
                int childCount = er0Var.getChildCount();
                int i15 = -1;
                int i16 = 0;
                int i17 = -1;
                int i18 = -1;
                while (i16 < childCount) {
                    View childAt = er0Var.getChildAt(i16);
                    int measuredHeight = ts0VarArr[i13].h.getMeasuredHeight();
                    View view = (View) au0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (au0Var.getY() + au0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= au0Var.getBottom() - view.getMeasuredHeight();
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
                            org.telegram.messenger.kj messageObject = s7Var.getMessageObject();
                            if (messageObject != null) {
                                i11 = i13;
                                int f12 = messageObject.f1();
                                boolean z15 = z14;
                                z12 = z15;
                                if (f12 == kjVar.f1()) {
                                    s7Var.getLocationInWindow(iArr);
                                    iArr[i11] = Math.round(linkImageView.K0) + iArr[i11];
                                    iArr[z15 ? 1 : 0] = Math.round(linkImageView.L0) + iArr[z15 ? 1 : 0];
                                    z13 = z15;
                                    if (linkImageView != null) {
                                        org.telegram.ui.fs0 fs0Var = new org.telegram.ui.fs0();
                                        fs0Var.b = iArr[i11];
                                        fs0Var.c = iArr[z13];
                                        fs0Var.d = er0Var;
                                        ts0 ts0Var2 = ts0VarArr[i11];
                                        fs0Var.m = ts0Var2.y;
                                        ts0Var2.h.getLocationInWindow(iArr);
                                        fs0Var.n = -iArr[z13];
                                        fs0Var.a = linkImageView;
                                        fs0Var.o = z13;
                                        fs0Var.h = linkImageView.E();
                                        fs0Var.e = fs0Var.a.p();
                                        fs0Var.d.getLocationInWindow(iArr);
                                        int i19 = i11;
                                        fs0Var.j = i19;
                                        fs0Var.q = au0Var.v1[i19].m;
                                        if (qr0Var != null && qr0Var.getVisibility() == 0) {
                                            fs0Var.j = org.telegram.messenger.i0.L(36.0f) + fs0Var.j;
                                        }
                                        if (PhotoViewer.Q1(kjVar) && (pinnedHeader = er0Var.getPinnedHeader()) != null) {
                                            int height = (qr0Var == null || qr0Var.getVisibility() != 0) ? 0 : qr0Var.getHeight() - org.telegram.messenger.i0.L(2.5f);
                                            boolean z16 = childAt instanceof org.telegram.ui.Cells.l7;
                                            if (z16) {
                                                height += org.telegram.messenger.i0.L(8.0f);
                                            }
                                            int i20 = height - fs0Var.c;
                                            if (i20 > childAt.getHeight()) {
                                                er0Var.scrollBy(0, -(pinnedHeader.getHeight() + i20));
                                                return fs0Var;
                                            }
                                            int height2 = fs0Var.c - er0Var.getHeight();
                                            if (z16) {
                                                height2 -= org.telegram.messenger.i0.L(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                er0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return fs0Var;
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
                                if (l7Var.getMessage().f1() == kjVar.f1()) {
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
                                    org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) h2Var.getParentObject();
                                    z12 = z17;
                                    if (kjVar2 != null) {
                                        z12 = z17;
                                        if (kjVar2.f1() == kjVar.f1()) {
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
                                        org.telegram.messenger.kj message = o7Var.getMessage();
                                        z12 = z17;
                                        if (message != null) {
                                            z12 = z17;
                                            if (message.f1() == kjVar.f1()) {
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
                if (ts0VarArr[i21].E != 0 || i17 < 0 || i18 < 0) {
                    return null;
                }
                int L = au0Var.J.L(i10);
                if (L <= i17) {
                    ts0VarArr[i21].x.h1(L, i21);
                    ns0Var.J();
                    return null;
                }
                if (L < i18 || i18 < 0) {
                    return null;
                }
                ts0VarArr[i21].x.i1(L, i21, true);
                ns0Var.J();
                return null;
            }
        }
        return null;
    }
}
