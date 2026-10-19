package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ts0 extends org.telegram.ui.zt0 {
    public final /* synthetic */ tv0 a;

    public ts0(tv0 tv0Var) {
        this.a = tv0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        int i11;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        boolean z12;
        ?? r16;
        View pinnedHeader;
        int i12;
        tv0 tv0Var = this.a;
        fu0 fu0Var = tv0Var.D1;
        ft0 ft0Var = tv0Var.R0;
        mu0[] mu0VarArr = tv0Var.k0;
        if (messageObject != null) {
            int i13 = 0;
            mu0 mu0Var = mu0VarArr[0];
            int i14 = mu0Var.F;
            boolean z13 = true;
            if (i14 == 0 || i14 == 1 || i14 == 3 || i14 == 5) {
                ss0 ss0Var = mu0Var.h;
                int childCount = ss0Var.getChildCount();
                int i15 = -1;
                int i16 = 0;
                int i17 = -1;
                int i18 = -1;
                while (i16 < childCount) {
                    View childAt = ss0Var.getChildAt(i16);
                    int measuredHeight = mu0VarArr[i13].h.getMeasuredHeight();
                    View view = (View) tv0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (tv0Var.getY() + tv0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= tv0Var.getBottom() - view.getMeasuredHeight();
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
                                        org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                                        ju0Var.b = iArr[i11];
                                        ju0Var.c = iArr[r16];
                                        ju0Var.d = ss0Var;
                                        mu0 mu0Var2 = mu0VarArr[i11];
                                        ju0Var.m = mu0Var2.y;
                                        mu0Var2.h.getLocationInWindow(iArr);
                                        ju0Var.n = -iArr[r16];
                                        ju0Var.a = linkImageView;
                                        boolean z15 = r16;
                                        ju0Var.o = z15;
                                        ju0Var.h = linkImageView.getRoundRadius(z15);
                                        ju0Var.e = ju0Var.a.getBitmapSafe();
                                        ju0Var.d.getLocationInWindow(iArr);
                                        int i19 = i11;
                                        ju0Var.j = i19;
                                        ju0Var.q = tv0Var.t1[i19].m;
                                        if (ft0Var != null && ft0Var.getVisibility() == 0) {
                                            ju0Var.j = AndroidUtilities.dp(36.0f) + ju0Var.j;
                                        }
                                        if (PhotoViewer.N1(messageObject) && (pinnedHeader = ss0Var.getPinnedHeader()) != null) {
                                            int height = (ft0Var == null || ft0Var.getVisibility() != 0) ? 0 : ft0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z16 = childAt instanceof org.telegram.ui.Cells.i7;
                                            if (z16) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i20 = height - ju0Var.c;
                                            if (i20 > childAt.getHeight()) {
                                                ss0Var.scrollBy(0, -(pinnedHeader.getHeight() + i20));
                                                return ju0Var;
                                            }
                                            int height2 = ju0Var.c - ss0Var.getHeight();
                                            if (z16) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                ss0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return ju0Var;
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
                            if (childAt instanceof org.telegram.ui.Cells.i7) {
                                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                                z12 = z17;
                                if (i7Var.getMessage().getId() == messageObject.getId()) {
                                    w9 imageView = i7Var.getImageView();
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
                                    if (childAt instanceof org.telegram.ui.Cells.m7) {
                                        org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) childAt;
                                        MessageObject message = m7Var.getMessage();
                                        z12 = z17;
                                        if (message != null) {
                                            z12 = z17;
                                            if (message.getId() == messageObject.getId()) {
                                                linkImageView = m7Var.getLinkImageView();
                                                m7Var.getLocationInWindow(iArr);
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
                if (mu0VarArr[i21].F != 0 || i17 < 0 || i18 < 0) {
                    return null;
                }
                int L = tv0Var.H.L(i10);
                if (L <= i17) {
                    mu0VarArr[i21].x.h1(L, i21);
                    fu0Var.C();
                    return null;
                }
                if (L < i18 || i18 < 0) {
                    return null;
                }
                mu0VarArr[i21].x.i1(L, i21, true);
                fu0Var.C();
                return null;
            }
        }
        return null;
    }
}
