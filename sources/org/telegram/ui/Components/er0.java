package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class er0 extends org.telegram.ui.rt0 {
    public final /* synthetic */ eu0 a;

    public er0(eu0 eu0Var) {
        this.a = eu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124 A[SYNTHETIC] */
    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        char c10;
        char c11;
        org.telegram.ui.Cells.l7 l7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        eu0 eu0Var = this.a;
        qs0 qs0Var = eu0Var.z1;
        qr0 qr0Var = eu0Var.N0;
        xs0[] xs0VarArr = eu0Var.g0;
        if (messageObject != null) {
            char c12 = 0;
            xs0 xs0Var = xs0VarArr[0];
            int i10 = xs0Var.B;
            if (i10 == 0 || i10 == 1 || i10 == 3 || i10 == 5) {
                dr0 dr0Var = xs0Var.h;
                int childCount = dr0Var.getChildCount();
                int i11 = -1;
                int i12 = 0;
                int i13 = -1;
                int i14 = -1;
                while (i12 < childCount) {
                    View childAt = dr0Var.getChildAt(i12);
                    int measuredHeight = xs0VarArr[c12].h.getMeasuredHeight();
                    View view = (View) eu0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (eu0Var.getY() + eu0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= eu0Var.getBottom() - view.getMeasuredHeight();
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (childAt.getTop() < measuredHeight) {
                        int R = RecyclerView.R(childAt);
                        if (R < i13 || i13 == i11) {
                            i13 = R;
                        }
                        if (R > i14 || i14 == i11) {
                            i14 = R;
                        }
                        int[] iArr = new int[2];
                        if (childAt instanceof org.telegram.ui.Cells.r7) {
                            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                            linkImageView = r7Var.c;
                            MessageObject messageObject2 = r7Var.getMessageObject();
                            if (messageObject2 != null) {
                                c10 = 0;
                                int id2 = messageObject2.getId();
                                c11 = 1;
                                if (id2 == messageObject.getId()) {
                                    r7Var.getLocationInWindow(iArr);
                                    iArr[0] = Math.round(linkImageView.getImageX()) + iArr[0];
                                    iArr[1] = Math.round(linkImageView.getImageY()) + iArr[1];
                                    if (linkImageView != null) {
                                        org.telegram.ui.bu0 bu0Var = new org.telegram.ui.bu0();
                                        bu0Var.b = iArr[c10];
                                        bu0Var.c = iArr[c11];
                                        bu0Var.d = dr0Var;
                                        xs0 xs0Var2 = xs0VarArr[c10];
                                        bu0Var.m = xs0Var2.y;
                                        xs0Var2.h.getLocationInWindow(iArr);
                                        bu0Var.n = -iArr[c11];
                                        bu0Var.a = linkImageView;
                                        bu0Var.o = true;
                                        bu0Var.h = linkImageView.getRoundRadius(true);
                                        bu0Var.e = bu0Var.a.getBitmapSafe();
                                        bu0Var.d.getLocationInWindow(iArr);
                                        bu0Var.j = 0;
                                        bu0Var.q = eu0Var.p1[0].m;
                                        if (qr0Var != null && qr0Var.getVisibility() == 0) {
                                            bu0Var.j = AndroidUtilities.dp(36.0f) + bu0Var.j;
                                        }
                                        if (PhotoViewer.M1(messageObject) && (pinnedHeader = dr0Var.getPinnedHeader()) != null) {
                                            int height = (qr0Var == null || qr0Var.getVisibility() != 0) ? 0 : qr0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z12 = childAt instanceof org.telegram.ui.Cells.i7;
                                            if (z12) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i15 = height - bu0Var.c;
                                            if (i15 > childAt.getHeight()) {
                                                dr0Var.scrollBy(0, -(pinnedHeader.getHeight() + i15));
                                                return bu0Var;
                                            }
                                            int height2 = bu0Var.c - dr0Var.getHeight();
                                            if (z12) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                dr0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return bu0Var;
                                    }
                                }
                                linkImageView = imageReceiver;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            c10 = 0;
                            c11 = 1;
                            if (childAt instanceof org.telegram.ui.Cells.i7) {
                                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                                if (i7Var.getMessage().getId() == messageObject.getId()) {
                                    o9 imageView = i7Var.getImageView();
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
                                } else if ((childAt instanceof org.telegram.ui.Cells.l7) && (message = (l7Var = (org.telegram.ui.Cells.l7) childAt).getMessage()) != null && message.getId() == messageObject.getId()) {
                                    linkImageView = l7Var.getLinkImageView();
                                    l7Var.getLocationInWindow(iArr);
                                }
                                linkImageView = imageReceiver;
                            }
                            if (linkImageView != null) {
                            }
                        }
                    }
                    i12++;
                    c12 = 0;
                    i11 = -1;
                }
                if (xs0VarArr[0].B != 0 || i13 < 0 || i14 < 0) {
                    return null;
                }
                int L = eu0Var.D.L(i9);
                if (L <= i13) {
                    xs0VarArr[0].x.h1(L, 0);
                    qs0Var.E();
                    return null;
                }
                if (L < i14 || i14 < 0) {
                    return null;
                }
                xs0VarArr[0].x.i1(L, 0, true);
                qs0Var.E();
                return null;
            }
        }
        return null;
    }
}
