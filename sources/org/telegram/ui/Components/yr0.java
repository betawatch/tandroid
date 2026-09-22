package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yr0 extends org.telegram.ui.tu0 {
    public final /* synthetic */ yu0 a;

    public yr0(yu0 yu0Var) {
        this.a = yu0Var;
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
        org.telegram.ui.Cells.n7 n7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        yu0 yu0Var = this.a;
        kt0 kt0Var = yu0Var.D1;
        ks0 ks0Var = yu0Var.R0;
        rt0[] rt0VarArr = yu0Var.k0;
        if (messageObject != null) {
            char c12 = 0;
            rt0 rt0Var = rt0VarArr[0];
            int i11 = rt0Var.F;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                xr0 xr0Var = rt0Var.h;
                int childCount = xr0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = xr0Var.getChildAt(i13);
                    int measuredHeight = rt0VarArr[c12].h.getMeasuredHeight();
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
                                        org.telegram.ui.dv0 dv0Var = new org.telegram.ui.dv0();
                                        dv0Var.b = iArr[c10];
                                        dv0Var.c = iArr[c11];
                                        dv0Var.d = xr0Var;
                                        rt0 rt0Var2 = rt0VarArr[c10];
                                        dv0Var.m = rt0Var2.y;
                                        rt0Var2.h.getLocationInWindow(iArr);
                                        dv0Var.n = -iArr[c11];
                                        dv0Var.a = linkImageView;
                                        dv0Var.o = true;
                                        dv0Var.h = linkImageView.getRoundRadius(true);
                                        dv0Var.e = dv0Var.a.getBitmapSafe();
                                        dv0Var.d.getLocationInWindow(iArr);
                                        dv0Var.j = 0;
                                        dv0Var.q = yu0Var.t1[0].m;
                                        if (ks0Var != null && ks0Var.getVisibility() == 0) {
                                            dv0Var.j = AndroidUtilities.dp(36.0f) + dv0Var.j;
                                        }
                                        if (PhotoViewer.M1(messageObject) && (pinnedHeader = xr0Var.getPinnedHeader()) != null) {
                                            int height = (ks0Var == null || ks0Var.getVisibility() != 0) ? 0 : ks0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z12 = childAt instanceof org.telegram.ui.Cells.j7;
                                            if (z12) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - dv0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                xr0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return dv0Var;
                                            }
                                            int height2 = dv0Var.c - xr0Var.getHeight();
                                            if (z12) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                xr0Var.scrollBy(0, childAt.getHeight() + height2);
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
                if (rt0VarArr[0].F != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int L = yu0Var.H.L(i10);
                if (L <= i14) {
                    rt0VarArr[0].x.h1(L, 0);
                    kt0Var.E();
                    return null;
                }
                if (L < i15 || i15 < 0) {
                    return null;
                }
                rt0VarArr[0].x.i1(L, 0, true);
                kt0Var.E();
                return null;
            }
        }
        return null;
    }
}
