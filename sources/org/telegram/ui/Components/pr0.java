package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pr0 extends org.telegram.ui.pt0 {
    public final /* synthetic */ qu0 a;

    public pr0(qu0 qu0Var) {
        this.a = qu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124 A[SYNTHETIC] */
    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        char c3;
        char c6;
        org.telegram.ui.Cells.j7 j7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        qu0 qu0Var = this.a;
        bt0 bt0Var = qu0Var.z1;
        bs0 bs0Var = qu0Var.N0;
        it0[] it0VarArr = qu0Var.g0;
        if (messageObject != null) {
            char c10 = 0;
            it0 it0Var = it0VarArr[0];
            int i11 = it0Var.B;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                or0 or0Var = it0Var.h;
                int childCount = or0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = or0Var.getChildAt(i13);
                    int measuredHeight = it0VarArr[c10].h.getMeasuredHeight();
                    View view = (View) qu0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (qu0Var.getY() + qu0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= qu0Var.getBottom() - view.getMeasuredHeight();
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
                        if (childAt instanceof org.telegram.ui.Cells.p7) {
                            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                            linkImageView = p7Var.c;
                            MessageObject messageObject2 = p7Var.getMessageObject();
                            if (messageObject2 != null) {
                                c3 = 0;
                                int id2 = messageObject2.getId();
                                c6 = 1;
                                if (id2 == messageObject.getId()) {
                                    p7Var.getLocationInWindow(iArr);
                                    iArr[0] = Math.round(linkImageView.getImageX()) + iArr[0];
                                    iArr[1] = Math.round(linkImageView.getImageY()) + iArr[1];
                                    if (linkImageView != null) {
                                        org.telegram.ui.zt0 zt0Var = new org.telegram.ui.zt0();
                                        zt0Var.b = iArr[c3];
                                        zt0Var.c = iArr[c6];
                                        zt0Var.d = or0Var;
                                        it0 it0Var2 = it0VarArr[c3];
                                        zt0Var.m = it0Var2.y;
                                        it0Var2.h.getLocationInWindow(iArr);
                                        zt0Var.n = -iArr[c6];
                                        zt0Var.a = linkImageView;
                                        zt0Var.o = true;
                                        zt0Var.h = linkImageView.getRoundRadius(true);
                                        zt0Var.e = zt0Var.a.getBitmapSafe();
                                        zt0Var.d.getLocationInWindow(iArr);
                                        zt0Var.j = 0;
                                        zt0Var.q = qu0Var.p1[0].m;
                                        if (bs0Var != null && bs0Var.getVisibility() == 0) {
                                            zt0Var.j = AndroidUtilities.dp(36.0f) + zt0Var.j;
                                        }
                                        if (PhotoViewer.M1(messageObject) && (pinnedHeader = or0Var.getPinnedHeader()) != null) {
                                            int height = (bs0Var == null || bs0Var.getVisibility() != 0) ? 0 : bs0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z12 = childAt instanceof org.telegram.ui.Cells.g7;
                                            if (z12) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - zt0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                or0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return zt0Var;
                                            }
                                            int height2 = zt0Var.c - or0Var.getHeight();
                                            if (z12) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                or0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return zt0Var;
                                    }
                                }
                                linkImageView = imageReceiver;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            c3 = 0;
                            c6 = 1;
                            if (childAt instanceof org.telegram.ui.Cells.g7) {
                                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                                if (g7Var.getMessage().getId() == messageObject.getId()) {
                                    t9 imageView = g7Var.getImageView();
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
                                } else if ((childAt instanceof org.telegram.ui.Cells.j7) && (message = (j7Var = (org.telegram.ui.Cells.j7) childAt).getMessage()) != null && message.getId() == messageObject.getId()) {
                                    linkImageView = j7Var.getLinkImageView();
                                    j7Var.getLocationInWindow(iArr);
                                }
                                linkImageView = imageReceiver;
                            }
                            if (linkImageView != null) {
                            }
                        }
                    }
                    i13++;
                    c10 = 0;
                    i12 = -1;
                }
                if (it0VarArr[0].B != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int L = qu0Var.D.L(i10);
                if (L <= i14) {
                    it0VarArr[0].x.h1(L, 0);
                    bt0Var.E();
                    return null;
                }
                if (L < i15 || i15 < 0) {
                    return null;
                }
                it0VarArr[0].x.i1(L, 0, true);
                bt0Var.E();
                return null;
            }
        }
        return null;
    }
}
