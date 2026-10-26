package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ft0 extends org.telegram.ui.gu0 {
    public final /* synthetic */ aw0 a;

    public ft0(aw0 aw0Var) {
        this.a = aw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        int i11;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        boolean z12;
        ?? r16;
        View pinnedHeader;
        int i12;
        aw0 aw0Var = this.a;
        mu0 mu0Var = aw0Var.F1;
        pt0 pt0Var = aw0Var.T0;
        tu0[] tu0VarArr = aw0Var.m0;
        if (messageObject != null) {
            int i13 = 0;
            tu0 tu0Var = tu0VarArr[0];
            int i14 = tu0Var.E;
            boolean z13 = true;
            if (i14 == 0 || i14 == 1 || i14 == 3 || i14 == 5) {
                dt0 dt0Var = tu0Var.h;
                int childCount = dt0Var.getChildCount();
                int i15 = -1;
                int i16 = 0;
                int i17 = -1;
                int i18 = -1;
                while (i16 < childCount) {
                    View childAt = dt0Var.getChildAt(i16);
                    int measuredHeight = tu0VarArr[i13].h.getMeasuredHeight();
                    View view = (View) aw0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (aw0Var.getY() + aw0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= aw0Var.getBottom() - view.getMeasuredHeight();
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
                        if (childAt instanceof org.telegram.ui.Cells.w7) {
                            org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                            linkImageView = w7Var.c;
                            MessageObject messageObject2 = w7Var.getMessageObject();
                            if (messageObject2 != null) {
                                i11 = i13;
                                int id2 = messageObject2.getId();
                                boolean z14 = z13;
                                z12 = z14;
                                if (id2 == messageObject.getId()) {
                                    w7Var.getLocationInWindow(iArr);
                                    iArr[i11] = Math.round(linkImageView.getImageX()) + iArr[i11];
                                    iArr[z14 ? 1 : 0] = Math.round(linkImageView.getImageY()) + iArr[z14 ? 1 : 0];
                                    r16 = z14;
                                    if (linkImageView != null) {
                                        org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                                        qu0Var.b = iArr[i11];
                                        qu0Var.c = iArr[r16];
                                        qu0Var.d = dt0Var;
                                        tu0 tu0Var2 = tu0VarArr[i11];
                                        qu0Var.m = tu0Var2.x;
                                        tu0Var2.h.getLocationInWindow(iArr);
                                        qu0Var.n = -iArr[r16];
                                        qu0Var.a = linkImageView;
                                        boolean z15 = r16;
                                        qu0Var.o = z15;
                                        qu0Var.h = linkImageView.getRoundRadius(z15);
                                        qu0Var.e = qu0Var.a.getBitmapSafe();
                                        qu0Var.d.getLocationInWindow(iArr);
                                        int i19 = i11;
                                        qu0Var.j = i19;
                                        qu0Var.q = aw0Var.v1[i19].m;
                                        if (pt0Var != null && pt0Var.getVisibility() == 0) {
                                            qu0Var.j = AndroidUtilities.dp(36.0f) + qu0Var.j;
                                        }
                                        if (PhotoViewer.P1(messageObject) && (pinnedHeader = dt0Var.getPinnedHeader()) != null) {
                                            int height = (pt0Var == null || pt0Var.getVisibility() != 0) ? 0 : pt0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z16 = childAt instanceof org.telegram.ui.Cells.o7;
                                            if (z16) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i20 = height - qu0Var.c;
                                            if (i20 > childAt.getHeight()) {
                                                dt0Var.scrollBy(0, -(pinnedHeader.getHeight() + i20));
                                                return qu0Var;
                                            }
                                            int height2 = qu0Var.c - dt0Var.getHeight();
                                            if (z16) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                dt0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return qu0Var;
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
                            if (childAt instanceof org.telegram.ui.Cells.o7) {
                                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                                z12 = z17;
                                if (o7Var.getMessage().getId() == messageObject.getId()) {
                                    y9 imageView = o7Var.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                    r16 = z17;
                                }
                                linkImageView = imageReceiver;
                                r16 = z12;
                            } else {
                                if (childAt instanceof org.telegram.ui.Cells.d2) {
                                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                                    MessageObject messageObject3 = (MessageObject) d2Var.getParentObject();
                                    z12 = z17;
                                    if (messageObject3 != null) {
                                        z12 = z17;
                                        if (messageObject3.getId() == messageObject.getId()) {
                                            photoImage = d2Var.getPhotoImage();
                                            d2Var.getLocationInWindow(iArr);
                                            linkImageView = photoImage;
                                            r16 = z17;
                                        }
                                    }
                                } else {
                                    z12 = z17;
                                    if (childAt instanceof org.telegram.ui.Cells.r7) {
                                        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                                        MessageObject message = r7Var.getMessage();
                                        z12 = z17;
                                        if (message != null) {
                                            z12 = z17;
                                            if (message.getId() == messageObject.getId()) {
                                                linkImageView = r7Var.getLinkImageView();
                                                r7Var.getLocationInWindow(iArr);
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
                if (tu0VarArr[i21].E != 0 || i17 < 0 || i18 < 0) {
                    return null;
                }
                int L = aw0Var.J.L(i10);
                if (L <= i17) {
                    tu0VarArr[i21].w.h1(L, i21);
                    mu0Var.G();
                    return null;
                }
                if (L < i18 || i18 < 0) {
                    return null;
                }
                tu0VarArr[i21].w.i1(L, i21, true);
                mu0Var.G();
                return null;
            }
        }
        return null;
    }
}
