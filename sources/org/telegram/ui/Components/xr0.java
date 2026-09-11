package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xr0 extends org.telegram.ui.su0 {
    public final /* synthetic */ xu0 a;

    public xr0(xu0 xu0Var) {
        this.a = xu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124 A[SYNTHETIC] */
    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        char c10;
        char c11;
        org.telegram.ui.Cells.n7 n7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        xu0 xu0Var = this.a;
        jt0 jt0Var = xu0Var.D1;
        js0 js0Var = xu0Var.R0;
        qt0[] qt0VarArr = xu0Var.k0;
        if (messageObject != null) {
            char c12 = 0;
            qt0 qt0Var = qt0VarArr[0];
            int i11 = qt0Var.F;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                wr0 wr0Var = qt0Var.h;
                int childCount = wr0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = wr0Var.getChildAt(i13);
                    int measuredHeight = qt0VarArr[c12].h.getMeasuredHeight();
                    View view = (View) xu0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (xu0Var.getY() + xu0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= xu0Var.getBottom() - view.getMeasuredHeight();
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
                        if (childAt instanceof org.telegram.ui.Cells.t7) {
                            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                            linkImageView = t7Var.c;
                            MessageObject messageObject2 = t7Var.getMessageObject();
                            if (messageObject2 != null) {
                                c10 = 0;
                                int id2 = messageObject2.getId();
                                c11 = 1;
                                if (id2 == messageObject.getId()) {
                                    t7Var.getLocationInWindow(iArr);
                                    iArr[0] = Math.round(linkImageView.getImageX()) + iArr[0];
                                    iArr[1] = Math.round(linkImageView.getImageY()) + iArr[1];
                                    if (linkImageView != null) {
                                        org.telegram.ui.cv0 cv0Var = new org.telegram.ui.cv0();
                                        cv0Var.b = iArr[c10];
                                        cv0Var.c = iArr[c11];
                                        cv0Var.d = wr0Var;
                                        qt0 qt0Var2 = qt0VarArr[c10];
                                        cv0Var.m = qt0Var2.y;
                                        qt0Var2.h.getLocationInWindow(iArr);
                                        cv0Var.n = -iArr[c11];
                                        cv0Var.a = linkImageView;
                                        cv0Var.o = true;
                                        cv0Var.h = linkImageView.getRoundRadius(true);
                                        cv0Var.e = cv0Var.a.getBitmapSafe();
                                        cv0Var.d.getLocationInWindow(iArr);
                                        cv0Var.j = 0;
                                        cv0Var.q = xu0Var.t1[0].m;
                                        if (js0Var != null && js0Var.getVisibility() == 0) {
                                            cv0Var.j = AndroidUtilities.dp(36.0f) + cv0Var.j;
                                        }
                                        if (PhotoViewer.M1(messageObject) && (pinnedHeader = wr0Var.getPinnedHeader()) != null) {
                                            int height = (js0Var == null || js0Var.getVisibility() != 0) ? 0 : js0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z12 = childAt instanceof org.telegram.ui.Cells.j7;
                                            if (z12) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - cv0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                wr0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return cv0Var;
                                            }
                                            int height2 = cv0Var.c - wr0Var.getHeight();
                                            if (z12) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                wr0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return cv0Var;
                                    }
                                }
                                linkImageView = imageReceiver;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            c10 = 0;
                            c11 = 1;
                            if (childAt instanceof org.telegram.ui.Cells.j7) {
                                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                                if (j7Var.getMessage().getId() == messageObject.getId()) {
                                    x9 imageView = j7Var.getImageView();
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
                                } else if ((childAt instanceof org.telegram.ui.Cells.n7) && (message = (n7Var = (org.telegram.ui.Cells.n7) childAt).getMessage()) != null && message.getId() == messageObject.getId()) {
                                    linkImageView = n7Var.getLinkImageView();
                                    n7Var.getLocationInWindow(iArr);
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
                if (qt0VarArr[0].F != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int L = xu0Var.H.L(i10);
                if (L <= i14) {
                    qt0VarArr[0].x.h1(L, 0);
                    jt0Var.D();
                    return null;
                }
                if (L < i15 || i15 < 0) {
                    return null;
                }
                qt0VarArr[0].x.i1(L, 0, true);
                jt0Var.D();
                return null;
            }
        }
        return null;
    }
}
