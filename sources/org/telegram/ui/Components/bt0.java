package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class bt0 extends org.telegram.ui.uu0 {
    public final /* synthetic */ bw0 a;

    public bt0(bw0 bw0Var) {
        this.a = bw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        int i11;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        boolean z12;
        ?? r16;
        View pinnedHeader;
        int i12;
        bw0 bw0Var = this.a;
        nu0 nu0Var = bw0Var.D1;
        nt0 nt0Var = bw0Var.R0;
        uu0[] uu0VarArr = bw0Var.k0;
        if (messageObject != null) {
            int i13 = 0;
            uu0 uu0Var = uu0VarArr[0];
            int i14 = uu0Var.F;
            boolean z13 = true;
            if (i14 == 0 || i14 == 1 || i14 == 3 || i14 == 5) {
                at0 at0Var = uu0Var.h;
                int childCount = at0Var.getChildCount();
                int i15 = -1;
                int i16 = 0;
                int i17 = -1;
                int i18 = -1;
                while (i16 < childCount) {
                    View childAt = at0Var.getChildAt(i16);
                    int measuredHeight = uu0VarArr[i13].h.getMeasuredHeight();
                    View view = (View) bw0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (bw0Var.getY() + bw0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= bw0Var.getBottom() - view.getMeasuredHeight();
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
                        if (childAt instanceof org.telegram.ui.Cells.t7) {
                            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                            linkImageView = t7Var.c;
                            MessageObject messageObject2 = t7Var.getMessageObject();
                            if (messageObject2 != null) {
                                i11 = i13;
                                int id2 = messageObject2.getId();
                                boolean z14 = z13;
                                z12 = z14;
                                if (id2 == messageObject.getId()) {
                                    t7Var.getLocationInWindow(iArr);
                                    iArr[i11] = Math.round(linkImageView.getImageX()) + iArr[i11];
                                    iArr[z14 ? 1 : 0] = Math.round(linkImageView.getImageY()) + iArr[z14 ? 1 : 0];
                                    r16 = z14;
                                    if (linkImageView != null) {
                                        org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                                        ev0Var.b = iArr[i11];
                                        ev0Var.c = iArr[r16];
                                        ev0Var.d = at0Var;
                                        uu0 uu0Var2 = uu0VarArr[i11];
                                        ev0Var.m = uu0Var2.y;
                                        uu0Var2.h.getLocationInWindow(iArr);
                                        ev0Var.n = -iArr[r16];
                                        ev0Var.a = linkImageView;
                                        boolean z15 = r16;
                                        ev0Var.o = z15;
                                        ev0Var.h = linkImageView.getRoundRadius(z15);
                                        ev0Var.e = ev0Var.a.getBitmapSafe();
                                        ev0Var.d.getLocationInWindow(iArr);
                                        int i19 = i11;
                                        ev0Var.j = i19;
                                        ev0Var.q = bw0Var.t1[i19].m;
                                        if (nt0Var != null && nt0Var.getVisibility() == 0) {
                                            ev0Var.j = AndroidUtilities.dp(36.0f) + ev0Var.j;
                                        }
                                        if (PhotoViewer.N1(messageObject) && (pinnedHeader = at0Var.getPinnedHeader()) != null) {
                                            int height = (nt0Var == null || nt0Var.getVisibility() != 0) ? 0 : nt0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z16 = childAt instanceof org.telegram.ui.Cells.k7;
                                            if (z16) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i20 = height - ev0Var.c;
                                            if (i20 > childAt.getHeight()) {
                                                at0Var.scrollBy(0, -(pinnedHeader.getHeight() + i20));
                                                return ev0Var;
                                            }
                                            int height2 = ev0Var.c - at0Var.getHeight();
                                            if (z16) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                at0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return ev0Var;
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
                                    y9 imageView = k7Var.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                    r16 = z17;
                                }
                                linkImageView = imageReceiver;
                                r16 = z12;
                            } else {
                                if (childAt instanceof org.telegram.ui.Cells.f2) {
                                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                                    MessageObject messageObject3 = (MessageObject) f2Var.getParentObject();
                                    z12 = z17;
                                    if (messageObject3 != null) {
                                        z12 = z17;
                                        if (messageObject3.getId() == messageObject.getId()) {
                                            photoImage = f2Var.getPhotoImage();
                                            f2Var.getLocationInWindow(iArr);
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
                if (uu0VarArr[i21].F != 0 || i17 < 0 || i18 < 0) {
                    return null;
                }
                int L = bw0Var.H.L(i10);
                if (L <= i17) {
                    uu0VarArr[i21].x.h1(L, i21);
                    nu0Var.E();
                    return null;
                }
                if (L < i18 || i18 < 0) {
                    return null;
                }
                uu0VarArr[i21].x.i1(L, i21, true);
                nu0Var.E();
                return null;
            }
        }
        return null;
    }
}
