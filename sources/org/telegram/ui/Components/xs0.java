package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xs0 extends org.telegram.ui.cu0 {
    public final /* synthetic */ xv0 a;

    public xs0(xv0 xv0Var) {
        this.a = xv0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        int i11;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        boolean z12;
        ?? r16;
        View pinnedHeader;
        int i12;
        xv0 xv0Var = this.a;
        ju0 ju0Var = xv0Var.D1;
        jt0 jt0Var = xv0Var.R0;
        qu0[] qu0VarArr = xv0Var.k0;
        if (messageObject != null) {
            int i13 = 0;
            qu0 qu0Var = qu0VarArr[0];
            int i14 = qu0Var.F;
            boolean z13 = true;
            if (i14 == 0 || i14 == 1 || i14 == 3 || i14 == 5) {
                ws0 ws0Var = qu0Var.h;
                int childCount = ws0Var.getChildCount();
                int i15 = -1;
                int i16 = 0;
                int i17 = -1;
                int i18 = -1;
                while (i16 < childCount) {
                    View childAt = ws0Var.getChildAt(i16);
                    int measuredHeight = qu0VarArr[i13].h.getMeasuredHeight();
                    View view = (View) xv0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (xv0Var.getY() + xv0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= xv0Var.getBottom() - view.getMeasuredHeight();
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
                            MessageObject messageObject2 = s7Var.getMessageObject();
                            if (messageObject2 != null) {
                                i11 = i13;
                                int id2 = messageObject2.getId();
                                boolean z14 = z13;
                                z12 = z14;
                                if (id2 == messageObject.getId()) {
                                    s7Var.getLocationInWindow(iArr);
                                    iArr[i11] = Math.round(linkImageView.getImageX()) + iArr[i11];
                                    iArr[z14 ? 1 : 0] = Math.round(linkImageView.getImageY()) + iArr[z14 ? 1 : 0];
                                    r16 = z14;
                                    if (linkImageView != null) {
                                        org.telegram.ui.mu0 mu0Var = new org.telegram.ui.mu0();
                                        mu0Var.b = iArr[i11];
                                        mu0Var.c = iArr[r16];
                                        mu0Var.d = ws0Var;
                                        qu0 qu0Var2 = qu0VarArr[i11];
                                        mu0Var.m = qu0Var2.y;
                                        qu0Var2.h.getLocationInWindow(iArr);
                                        mu0Var.n = -iArr[r16];
                                        mu0Var.a = linkImageView;
                                        boolean z15 = r16;
                                        mu0Var.o = z15;
                                        mu0Var.h = linkImageView.getRoundRadius(z15);
                                        mu0Var.e = mu0Var.a.getBitmapSafe();
                                        mu0Var.d.getLocationInWindow(iArr);
                                        int i19 = i11;
                                        mu0Var.j = i19;
                                        mu0Var.q = xv0Var.t1[i19].m;
                                        if (jt0Var != null && jt0Var.getVisibility() == 0) {
                                            mu0Var.j = AndroidUtilities.dp(36.0f) + mu0Var.j;
                                        }
                                        if (PhotoViewer.P1(messageObject) && (pinnedHeader = ws0Var.getPinnedHeader()) != null) {
                                            int height = (jt0Var == null || jt0Var.getVisibility() != 0) ? 0 : jt0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z16 = childAt instanceof org.telegram.ui.Cells.k7;
                                            if (z16) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i20 = height - mu0Var.c;
                                            if (i20 > childAt.getHeight()) {
                                                ws0Var.scrollBy(0, -(pinnedHeader.getHeight() + i20));
                                                return mu0Var;
                                            }
                                            int height2 = mu0Var.c - ws0Var.getHeight();
                                            if (z16) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                ws0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return mu0Var;
                                    }
                                    i12 = i11;
                                }
                                linkImageView = imageReceiver;
                                r16 = z12;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            i11 = i13;
                            boolean z17 = z13;
                            if (childAt instanceof org.telegram.ui.Cells.k7) {
                                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                                z12 = z17;
                                if (k7Var.getMessage().getId() == messageObject.getId()) {
                                    w9 imageView = k7Var.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                    r16 = z17;
                                }
                                linkImageView = imageReceiver;
                                r16 = z12;
                            } else {
                                if (childAt instanceof org.telegram.ui.Cells.e2) {
                                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                                    MessageObject messageObject3 = (MessageObject) e2Var.getParentObject();
                                    z12 = z17;
                                    if (messageObject3 != null) {
                                        z12 = z17;
                                        if (messageObject3.getId() == messageObject.getId()) {
                                            photoImage = e2Var.getPhotoImage();
                                            e2Var.getLocationInWindow(iArr);
                                            linkImageView = photoImage;
                                            r16 = z17;
                                        }
                                    }
                                } else {
                                    z12 = z17;
                                    if (childAt instanceof org.telegram.ui.Cells.n7) {
                                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                                        MessageObject message = n7Var.getMessage();
                                        z12 = z17;
                                        if (message != null) {
                                            z12 = z17;
                                            if (message.getId() == messageObject.getId()) {
                                                linkImageView = n7Var.getLinkImageView();
                                                n7Var.getLocationInWindow(iArr);
                                                r16 = z17;
                                            }
                                        }
                                    }
                                }
                                linkImageView = imageReceiver;
                                r16 = z12;
                            }
                            if (linkImageView != null) {
                            }
                        }
                        i16++;
                        i13 = i12;
                        z13 = true;
                        i15 = -1;
                    }
                    i12 = i13;
                    i16++;
                    i13 = i12;
                    z13 = true;
                    i15 = -1;
                }
                int i21 = i13;
                if (qu0VarArr[i21].F != 0 || i17 < 0 || i18 < 0) {
                    return null;
                }
                int L = xv0Var.H.L(i10);
                if (L <= i17) {
                    qu0VarArr[i21].x.h1(L, i21);
                    ju0Var.C();
                    return null;
                }
                if (L < i18 || i18 < 0) {
                    return null;
                }
                qu0VarArr[i21].x.i1(L, i21, true);
                ju0Var.C();
                return null;
            }
        }
        return null;
    }
}
