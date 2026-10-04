package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ps0 extends org.telegram.ui.ou0 {
    public final /* synthetic */ pv0 a;

    public ps0(pv0 pv0Var) {
        this.a = pv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124 A[SYNTHETIC] */
    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        char c10;
        char c11;
        org.telegram.ui.Cells.n7 n7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        pv0 pv0Var = this.a;
        bu0 bu0Var = pv0Var.D1;
        bt0 bt0Var = pv0Var.R0;
        iu0[] iu0VarArr = pv0Var.k0;
        if (messageObject != null) {
            char c12 = 0;
            iu0 iu0Var = iu0VarArr[0];
            int i11 = iu0Var.F;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                os0 os0Var = iu0Var.h;
                int childCount = os0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = os0Var.getChildAt(i13);
                    int measuredHeight = iu0VarArr[c12].h.getMeasuredHeight();
                    View view = (View) pv0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (pv0Var.getY() + pv0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= pv0Var.getBottom() - view.getMeasuredHeight();
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
                                        org.telegram.ui.yu0 yu0Var = new org.telegram.ui.yu0();
                                        yu0Var.b = iArr[c10];
                                        yu0Var.c = iArr[c11];
                                        yu0Var.d = os0Var;
                                        iu0 iu0Var2 = iu0VarArr[c10];
                                        yu0Var.m = iu0Var2.y;
                                        iu0Var2.h.getLocationInWindow(iArr);
                                        yu0Var.n = -iArr[c11];
                                        yu0Var.a = linkImageView;
                                        yu0Var.o = true;
                                        yu0Var.h = linkImageView.getRoundRadius(true);
                                        yu0Var.e = yu0Var.a.getBitmapSafe();
                                        yu0Var.d.getLocationInWindow(iArr);
                                        yu0Var.j = 0;
                                        yu0Var.q = pv0Var.t1[0].m;
                                        if (bt0Var != null && bt0Var.getVisibility() == 0) {
                                            yu0Var.j = AndroidUtilities.dp(36.0f) + yu0Var.j;
                                        }
                                        if (PhotoViewer.N1(messageObject) && (pinnedHeader = os0Var.getPinnedHeader()) != null) {
                                            int height = (bt0Var == null || bt0Var.getVisibility() != 0) ? 0 : bt0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z12 = childAt instanceof org.telegram.ui.Cells.k7;
                                            if (z12) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - yu0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                os0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return yu0Var;
                                            }
                                            int height2 = yu0Var.c - os0Var.getHeight();
                                            if (z12) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                os0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return yu0Var;
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
                iu0 iu0Var3 = iu0VarArr[0];
                if (iu0Var3.F != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int i17 = pv0Var.H.f.t1[0].m + i10;
                if (i17 <= i14) {
                    iu0Var3.x.h1(i17, 0);
                    bu0Var.C();
                    return null;
                }
                if (i17 < i15 || i15 < 0) {
                    return null;
                }
                iu0Var3.x.i1(i17, 0, true);
                bu0Var.C();
                return null;
            }
        }
        return null;
    }
}
