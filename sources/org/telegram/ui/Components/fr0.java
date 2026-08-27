package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fr0 extends org.telegram.ui.st0 {
    public final /* synthetic */ hu0 a;

    public fr0(hu0 hu0Var) {
        this.a = hu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124 A[SYNTHETIC] */
    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        char c10;
        char c11;
        org.telegram.ui.Cells.i7 i7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        hu0 hu0Var = this.a;
        ss0 ss0Var = hu0Var.z1;
        rr0 rr0Var = hu0Var.N0;
        zs0[] zs0VarArr = hu0Var.g0;
        if (messageObject != null) {
            char c12 = 0;
            zs0 zs0Var = zs0VarArr[0];
            int i11 = zs0Var.B;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                er0 er0Var = zs0Var.h;
                int childCount = er0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = er0Var.getChildAt(i13);
                    int measuredHeight = zs0VarArr[c12].h.getMeasuredHeight();
                    View view = (View) hu0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (hu0Var.getY() + hu0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= hu0Var.getBottom() - view.getMeasuredHeight();
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
                        if (childAt instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                            linkImageView = o7Var.c;
                            MessageObject messageObject2 = o7Var.getMessageObject();
                            if (messageObject2 != null) {
                                c10 = 0;
                                int id2 = messageObject2.getId();
                                c11 = 1;
                                if (id2 == messageObject.getId()) {
                                    o7Var.getLocationInWindow(iArr);
                                    iArr[0] = Math.round(linkImageView.getImageX()) + iArr[0];
                                    iArr[1] = Math.round(linkImageView.getImageY()) + iArr[1];
                                    if (linkImageView != null) {
                                        org.telegram.ui.cu0 cu0Var = new org.telegram.ui.cu0();
                                        cu0Var.b = iArr[c10];
                                        cu0Var.c = iArr[c11];
                                        cu0Var.d = er0Var;
                                        zs0 zs0Var2 = zs0VarArr[c10];
                                        cu0Var.m = zs0Var2.y;
                                        zs0Var2.h.getLocationInWindow(iArr);
                                        cu0Var.n = -iArr[c11];
                                        cu0Var.a = linkImageView;
                                        cu0Var.o = true;
                                        cu0Var.h = linkImageView.getRoundRadius(true);
                                        cu0Var.e = cu0Var.a.getBitmapSafe();
                                        cu0Var.d.getLocationInWindow(iArr);
                                        cu0Var.j = 0;
                                        cu0Var.q = hu0Var.p1[0].m;
                                        if (rr0Var != null && rr0Var.getVisibility() == 0) {
                                            cu0Var.j = AndroidUtilities.dp(36.0f) + cu0Var.j;
                                        }
                                        if (PhotoViewer.M1(messageObject) && (pinnedHeader = er0Var.getPinnedHeader()) != null) {
                                            int height = (rr0Var == null || rr0Var.getVisibility() != 0) ? 0 : rr0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z12 = childAt instanceof org.telegram.ui.Cells.f7;
                                            if (z12) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - cu0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                er0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return cu0Var;
                                            }
                                            int height2 = cu0Var.c - er0Var.getHeight();
                                            if (z12) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                er0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return cu0Var;
                                    }
                                }
                                linkImageView = imageReceiver;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            c10 = 0;
                            c11 = 1;
                            if (childAt instanceof org.telegram.ui.Cells.f7) {
                                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                                if (f7Var.getMessage().getId() == messageObject.getId()) {
                                    n9 imageView = f7Var.getImageView();
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
                                } else if ((childAt instanceof org.telegram.ui.Cells.i7) && (message = (i7Var = (org.telegram.ui.Cells.i7) childAt).getMessage()) != null && message.getId() == messageObject.getId()) {
                                    linkImageView = i7Var.getLinkImageView();
                                    i7Var.getLocationInWindow(iArr);
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
                if (zs0VarArr[0].B != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int L = hu0Var.D.L(i10);
                if (L <= i14) {
                    zs0VarArr[0].x.h1(L, 0);
                    ss0Var.F();
                    return null;
                }
                if (L < i15 || i15 < 0) {
                    return null;
                }
                zs0VarArr[0].x.i1(L, 0, true);
                ss0Var.F();
                return null;
            }
        }
        return null;
    }
}
