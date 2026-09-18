package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zr0 extends org.telegram.ui.vu0 {
    public final /* synthetic */ zu0 a;

    public zr0(zu0 zu0Var) {
        this.a = zu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124 A[SYNTHETIC] */
    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        char c10;
        char c11;
        org.telegram.ui.Cells.n7 n7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        zu0 zu0Var = this.a;
        lt0 lt0Var = zu0Var.D1;
        ls0 ls0Var = zu0Var.R0;
        st0[] st0VarArr = zu0Var.k0;
        if (messageObject != null) {
            char c12 = 0;
            st0 st0Var = st0VarArr[0];
            int i11 = st0Var.F;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                yr0 yr0Var = st0Var.h;
                int childCount = yr0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = yr0Var.getChildAt(i13);
                    int measuredHeight = st0VarArr[c12].h.getMeasuredHeight();
                    View view = (View) zu0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (zu0Var.getY() + zu0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= zu0Var.getBottom() - view.getMeasuredHeight();
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
                                        org.telegram.ui.fv0 fv0Var = new org.telegram.ui.fv0();
                                        fv0Var.b = iArr[c10];
                                        fv0Var.c = iArr[c11];
                                        fv0Var.d = yr0Var;
                                        st0 st0Var2 = st0VarArr[c10];
                                        fv0Var.m = st0Var2.y;
                                        st0Var2.h.getLocationInWindow(iArr);
                                        fv0Var.n = -iArr[c11];
                                        fv0Var.a = linkImageView;
                                        fv0Var.o = true;
                                        fv0Var.h = linkImageView.getRoundRadius(true);
                                        fv0Var.e = fv0Var.a.getBitmapSafe();
                                        fv0Var.d.getLocationInWindow(iArr);
                                        fv0Var.j = 0;
                                        fv0Var.q = zu0Var.t1[0].m;
                                        if (ls0Var != null && ls0Var.getVisibility() == 0) {
                                            fv0Var.j = AndroidUtilities.dp(36.0f) + fv0Var.j;
                                        }
                                        if (PhotoViewer.M1(messageObject) && (pinnedHeader = yr0Var.getPinnedHeader()) != null) {
                                            int height = (ls0Var == null || ls0Var.getVisibility() != 0) ? 0 : ls0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z12 = childAt instanceof org.telegram.ui.Cells.j7;
                                            if (z12) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - fv0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                yr0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return fv0Var;
                                            }
                                            int height2 = fv0Var.c - yr0Var.getHeight();
                                            if (z12) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                yr0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return fv0Var;
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
                                    u9 imageView = j7Var.getImageView();
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
                if (st0VarArr[0].F != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int L = zu0Var.H.L(i10);
                if (L <= i14) {
                    st0VarArr[0].x.h1(L, 0);
                    lt0Var.E();
                    return null;
                }
                if (L < i15 || i15 < 0) {
                    return null;
                }
                st0VarArr[0].x.i1(L, 0, true);
                lt0Var.E();
                return null;
            }
        }
        return null;
    }
}
