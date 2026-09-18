package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ks0 extends org.telegram.ui.tu0 {
    public final /* synthetic */ kv0 a;

    public ks0(kv0 kv0Var) {
        this.a = kv0Var;
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
        kv0 kv0Var = this.a;
        wt0 wt0Var = kv0Var.D1;
        ws0 ws0Var = kv0Var.R0;
        du0[] du0VarArr = kv0Var.k0;
        if (messageObject != null) {
            char c12 = 0;
            du0 du0Var = du0VarArr[0];
            int i11 = du0Var.F;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                js0 js0Var = du0Var.h;
                int childCount = js0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = js0Var.getChildAt(i13);
                    int measuredHeight = du0VarArr[c12].h.getMeasuredHeight();
                    View view = (View) kv0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (kv0Var.getY() + kv0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= kv0Var.getBottom() - view.getMeasuredHeight();
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
                                        org.telegram.ui.dv0 dv0Var = new org.telegram.ui.dv0();
                                        dv0Var.b = iArr[c10];
                                        dv0Var.c = iArr[c11];
                                        dv0Var.d = js0Var;
                                        du0 du0Var2 = du0VarArr[c10];
                                        dv0Var.m = du0Var2.y;
                                        du0Var2.h.getLocationInWindow(iArr);
                                        dv0Var.n = -iArr[c11];
                                        dv0Var.a = linkImageView;
                                        dv0Var.o = true;
                                        dv0Var.h = linkImageView.getRoundRadius(true);
                                        dv0Var.e = dv0Var.a.getBitmapSafe();
                                        dv0Var.d.getLocationInWindow(iArr);
                                        dv0Var.j = 0;
                                        dv0Var.q = kv0Var.t1[0].m;
                                        if (ws0Var != null && ws0Var.getVisibility() == 0) {
                                            dv0Var.j = AndroidUtilities.dp(36.0f) + dv0Var.j;
                                        }
                                        if (PhotoViewer.M1(messageObject) && (pinnedHeader = js0Var.getPinnedHeader()) != null) {
                                            int height = (ws0Var == null || ws0Var.getVisibility() != 0) ? 0 : ws0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z12 = childAt instanceof org.telegram.ui.Cells.k7;
                                            if (z12) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - dv0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                js0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return dv0Var;
                                            }
                                            int height2 = dv0Var.c - js0Var.getHeight();
                                            if (z12) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                js0Var.scrollBy(0, childAt.getHeight() + height2);
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
                            if (childAt instanceof org.telegram.ui.Cells.k7) {
                                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                                if (k7Var.getMessage().getId() == messageObject.getId()) {
                                    w9 imageView = k7Var.getImageView();
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
                if (du0VarArr[0].F != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int L = kv0Var.H.L(i10);
                if (L <= i14) {
                    du0VarArr[0].x.h1(L, 0);
                    wt0Var.E();
                    return null;
                }
                if (L < i15 || i15 < 0) {
                    return null;
                }
                du0VarArr[0].x.i1(L, 0, true);
                wt0Var.E();
                return null;
            }
        }
        return null;
    }
}
