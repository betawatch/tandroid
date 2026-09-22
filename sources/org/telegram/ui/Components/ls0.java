package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ls0 extends org.telegram.ui.tu0 {
    public final /* synthetic */ lv0 a;

    public ls0(lv0 lv0Var) {
        this.a = lv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124 A[SYNTHETIC] */
    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        char c10;
        char c11;
        org.telegram.ui.Cells.o7 o7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        lv0 lv0Var = this.a;
        xt0 xt0Var = lv0Var.D1;
        xs0 xs0Var = lv0Var.R0;
        eu0[] eu0VarArr = lv0Var.k0;
        if (messageObject != null) {
            char c12 = 0;
            eu0 eu0Var = eu0VarArr[0];
            int i11 = eu0Var.F;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                ks0 ks0Var = eu0Var.h;
                int childCount = ks0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = ks0Var.getChildAt(i13);
                    int measuredHeight = eu0VarArr[c12].h.getMeasuredHeight();
                    View view = (View) lv0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (lv0Var.getY() + lv0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= lv0Var.getBottom() - view.getMeasuredHeight();
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (childAt.getTop() < measuredHeight) {
                        int S = RecyclerView.S(childAt);
                        if (S < i14 || i14 == i12) {
                            i14 = S;
                        }
                        if (S > i15 || i15 == i12) {
                            i15 = S;
                        }
                        int[] iArr = new int[2];
                        if (childAt instanceof org.telegram.ui.Cells.u7) {
                            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                            linkImageView = u7Var.c;
                            MessageObject messageObject2 = u7Var.getMessageObject();
                            if (messageObject2 != null) {
                                c10 = 0;
                                int id2 = messageObject2.getId();
                                c11 = 1;
                                if (id2 == messageObject.getId()) {
                                    u7Var.getLocationInWindow(iArr);
                                    iArr[0] = Math.round(linkImageView.getImageX()) + iArr[0];
                                    iArr[1] = Math.round(linkImageView.getImageY()) + iArr[1];
                                    if (linkImageView != null) {
                                        org.telegram.ui.dv0 dv0Var = new org.telegram.ui.dv0();
                                        dv0Var.b = iArr[c10];
                                        dv0Var.c = iArr[c11];
                                        dv0Var.d = ks0Var;
                                        eu0 eu0Var2 = eu0VarArr[c10];
                                        dv0Var.m = eu0Var2.y;
                                        eu0Var2.h.getLocationInWindow(iArr);
                                        dv0Var.n = -iArr[c11];
                                        dv0Var.a = linkImageView;
                                        dv0Var.o = true;
                                        dv0Var.h = linkImageView.getRoundRadius(true);
                                        dv0Var.e = dv0Var.a.getBitmapSafe();
                                        dv0Var.d.getLocationInWindow(iArr);
                                        dv0Var.j = 0;
                                        dv0Var.q = lv0Var.t1[0].m;
                                        if (xs0Var != null && xs0Var.getVisibility() == 0) {
                                            dv0Var.j = AndroidUtilities.dp(36.0f) + dv0Var.j;
                                        }
                                        if (PhotoViewer.M1(messageObject) && (pinnedHeader = ks0Var.getPinnedHeader()) != null) {
                                            int height = (xs0Var == null || xs0Var.getVisibility() != 0) ? 0 : xs0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z12 = childAt instanceof org.telegram.ui.Cells.l7;
                                            if (z12) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - dv0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                ks0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return dv0Var;
                                            }
                                            int height2 = dv0Var.c - ks0Var.getHeight();
                                            if (z12) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                ks0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return dv0Var;
                                    }
                                }
                                linkImageView = imageReceiver;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            c10 = 0;
                            c11 = 1;
                            if (childAt instanceof org.telegram.ui.Cells.l7) {
                                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                                if (l7Var.getMessage().getId() == messageObject.getId()) {
                                    v9 imageView = l7Var.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                }
                                linkImageView = imageReceiver;
                            } else {
                                if (childAt instanceof org.telegram.ui.Cells.f2) {
                                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                                    MessageObject messageObject3 = (MessageObject) f2Var.getParentObject();
                                    if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                                        photoImage = f2Var.getPhotoImage();
                                        f2Var.getLocationInWindow(iArr);
                                        linkImageView = photoImage;
                                    }
                                } else if ((childAt instanceof org.telegram.ui.Cells.o7) && (message = (o7Var = (org.telegram.ui.Cells.o7) childAt).getMessage()) != null && message.getId() == messageObject.getId()) {
                                    linkImageView = o7Var.getLinkImageView();
                                    o7Var.getLocationInWindow(iArr);
                                }
                                linkImageView = imageReceiver;
                            }
                            if (linkImageView != null) {
                            }
                        }
                    }
                    i13++;
                    c12 = 0;
                    i12 = -1;
                }
                if (eu0VarArr[0].F != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int L = lv0Var.H.L(i10);
                if (L <= i14) {
                    eu0VarArr[0].x.h1(L, 0);
                    xt0Var.D();
                    return null;
                }
                if (L < i15 || i15 < 0) {
                    return null;
                }
                eu0VarArr[0].x.i1(L, 0, true);
                xt0Var.D();
                return null;
            }
        }
        return null;
    }
}
