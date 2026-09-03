package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xr0 extends org.telegram.ui.fu0 {
    public final /* synthetic */ yu0 a;

    public xr0(yu0 yu0Var) {
        this.a = yu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124 A[SYNTHETIC] */
    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        char c3;
        char c10;
        org.telegram.ui.Cells.k7 k7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        yu0 yu0Var = this.a;
        jt0 jt0Var = yu0Var.A1;
        js0 js0Var = yu0Var.O0;
        qt0[] qt0VarArr = yu0Var.h0;
        if (messageObject != null) {
            char c11 = 0;
            qt0 qt0Var = qt0VarArr[0];
            int i11 = qt0Var.C;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                wr0 wr0Var = qt0Var.h;
                int childCount = wr0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = wr0Var.getChildAt(i13);
                    int measuredHeight = qt0VarArr[c11].h.getMeasuredHeight();
                    View view = (View) yu0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (yu0Var.getY() + yu0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= yu0Var.getBottom() - view.getMeasuredHeight();
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
                        if (childAt instanceof org.telegram.ui.Cells.q7) {
                            org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                            linkImageView = q7Var.c;
                            MessageObject messageObject2 = q7Var.getMessageObject();
                            if (messageObject2 != null) {
                                c3 = 0;
                                int id2 = messageObject2.getId();
                                c10 = 1;
                                if (id2 == messageObject.getId()) {
                                    q7Var.getLocationInWindow(iArr);
                                    iArr[0] = Math.round(linkImageView.getImageX()) + iArr[0];
                                    iArr[1] = Math.round(linkImageView.getImageY()) + iArr[1];
                                    if (linkImageView != null) {
                                        org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                                        qu0Var.b = iArr[c3];
                                        qu0Var.c = iArr[c10];
                                        qu0Var.d = wr0Var;
                                        qt0 qt0Var2 = qt0VarArr[c3];
                                        qu0Var.m = qt0Var2.y;
                                        qt0Var2.h.getLocationInWindow(iArr);
                                        qu0Var.n = -iArr[c10];
                                        qu0Var.a = linkImageView;
                                        qu0Var.o = true;
                                        qu0Var.h = linkImageView.getRoundRadius(true);
                                        qu0Var.e = qu0Var.a.getBitmapSafe();
                                        qu0Var.d.getLocationInWindow(iArr);
                                        qu0Var.j = 0;
                                        qu0Var.q = yu0Var.q1[0].m;
                                        if (js0Var != null && js0Var.getVisibility() == 0) {
                                            qu0Var.j = AndroidUtilities.dp(36.0f) + qu0Var.j;
                                        }
                                        if (PhotoViewer.M1(messageObject) && (pinnedHeader = wr0Var.getPinnedHeader()) != null) {
                                            int height = (js0Var == null || js0Var.getVisibility() != 0) ? 0 : js0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z11 = childAt instanceof org.telegram.ui.Cells.h7;
                                            if (z11) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - qu0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                wr0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return qu0Var;
                                            }
                                            int height2 = qu0Var.c - wr0Var.getHeight();
                                            if (z11) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                wr0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return qu0Var;
                                    }
                                }
                                linkImageView = imageReceiver;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            c3 = 0;
                            c10 = 1;
                            if (childAt instanceof org.telegram.ui.Cells.h7) {
                                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                                if (h7Var.getMessage().getId() == messageObject.getId()) {
                                    p9 imageView = h7Var.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                }
                                linkImageView = imageReceiver;
                            } else {
                                if (childAt instanceof org.telegram.ui.Cells.d2) {
                                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                                    MessageObject messageObject3 = (MessageObject) d2Var.getParentObject();
                                    if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                                        photoImage = d2Var.getPhotoImage();
                                        d2Var.getLocationInWindow(iArr);
                                        linkImageView = photoImage;
                                    }
                                } else if ((childAt instanceof org.telegram.ui.Cells.k7) && (message = (k7Var = (org.telegram.ui.Cells.k7) childAt).getMessage()) != null && message.getId() == messageObject.getId()) {
                                    linkImageView = k7Var.getLinkImageView();
                                    k7Var.getLocationInWindow(iArr);
                                }
                                linkImageView = imageReceiver;
                            }
                            if (linkImageView != null) {
                            }
                        }
                    }
                    i13++;
                    c11 = 0;
                    i12 = -1;
                }
                if (qt0VarArr[0].C != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int L = yu0Var.E.L(i10);
                if (L <= i14) {
                    qt0VarArr[0].x.h1(L, 0);
                    jt0Var.E();
                    return null;
                }
                if (L < i15 || i15 < 0) {
                    return null;
                }
                qt0VarArr[0].x.i1(L, 0, true);
                jt0Var.E();
                return null;
            }
        }
        return null;
    }
}
