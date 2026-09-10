package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hs0 extends org.telegram.ui.tu0 {
    public final /* synthetic */ iv0 a;

    public hs0(iv0 iv0Var) {
        this.a = iv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124 A[SYNTHETIC] */
    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        char c10;
        char c11;
        org.telegram.ui.Cells.o7 o7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        iv0 iv0Var = this.a;
        tt0 tt0Var = iv0Var.D1;
        ts0 ts0Var = iv0Var.R0;
        au0[] au0VarArr = iv0Var.k0;
        if (messageObject != null) {
            char c12 = 0;
            au0 au0Var = au0VarArr[0];
            int i11 = au0Var.F;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                gs0 gs0Var = au0Var.h;
                int childCount = gs0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = gs0Var.getChildAt(i13);
                    int measuredHeight = au0VarArr[c12].h.getMeasuredHeight();
                    View view = (View) iv0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (iv0Var.getY() + iv0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= iv0Var.getBottom() - view.getMeasuredHeight();
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (childAt.getTop() < measuredHeight) {
                        int R = RecyclerView.R(childAt);
                        if (R < i14 || i14 == i12) {
                            i14 = R;
                        }
                        if (R > i15 || i15 == i12) {
                            i15 = R;
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
                                        org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                                        ev0Var.b = iArr[c10];
                                        ev0Var.c = iArr[c11];
                                        ev0Var.d = gs0Var;
                                        au0 au0Var2 = au0VarArr[c10];
                                        ev0Var.m = au0Var2.y;
                                        au0Var2.h.getLocationInWindow(iArr);
                                        ev0Var.n = -iArr[c11];
                                        ev0Var.a = linkImageView;
                                        ev0Var.o = true;
                                        ev0Var.h = linkImageView.getRoundRadius(true);
                                        ev0Var.e = ev0Var.a.getBitmapSafe();
                                        ev0Var.d.getLocationInWindow(iArr);
                                        ev0Var.j = 0;
                                        ev0Var.q = iv0Var.t1[0].m;
                                        if (ts0Var != null && ts0Var.getVisibility() == 0) {
                                            ev0Var.j = AndroidUtilities.dp(36.0f) + ev0Var.j;
                                        }
                                        if (PhotoViewer.M1(messageObject) && (pinnedHeader = gs0Var.getPinnedHeader()) != null) {
                                            int height = (ts0Var == null || ts0Var.getVisibility() != 0) ? 0 : ts0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z12 = childAt instanceof org.telegram.ui.Cells.l7;
                                            if (z12) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - ev0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                gs0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return ev0Var;
                                            }
                                            int height2 = ev0Var.c - gs0Var.getHeight();
                                            if (z12) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                gs0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return ev0Var;
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
                                    w9 imageView = l7Var.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                }
                                linkImageView = imageReceiver;
                            } else {
                                if (childAt instanceof org.telegram.ui.Cells.e2) {
                                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                                    MessageObject messageObject3 = (MessageObject) e2Var.getParentObject();
                                    if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                                        photoImage = e2Var.getPhotoImage();
                                        e2Var.getLocationInWindow(iArr);
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
                if (au0VarArr[0].F != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int L = iv0Var.H.L(i10);
                if (L <= i14) {
                    au0VarArr[0].x.h1(L, 0);
                    tt0Var.D();
                    return null;
                }
                if (L < i15 || i15 < 0) {
                    return null;
                }
                au0VarArr[0].x.i1(L, 0, true);
                tt0Var.D();
                return null;
            }
        }
        return null;
    }
}
