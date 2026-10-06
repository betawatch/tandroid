package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class qs0 extends org.telegram.ui.ou0 {
    public final /* synthetic */ qv0 a;

    public qs0(qv0 qv0Var) {
        this.a = qv0Var;
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
        qv0 qv0Var = this.a;
        cu0 cu0Var = qv0Var.D1;
        ct0 ct0Var = qv0Var.R0;
        ju0[] ju0VarArr = qv0Var.k0;
        if (messageObject != null) {
            char c12 = 0;
            ju0 ju0Var = ju0VarArr[0];
            int i11 = ju0Var.F;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                ps0 ps0Var = ju0Var.h;
                int childCount = ps0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = ps0Var.getChildAt(i13);
                    int measuredHeight = ju0VarArr[c12].h.getMeasuredHeight();
                    View view = (View) qv0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (qv0Var.getY() + qv0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= qv0Var.getBottom() - view.getMeasuredHeight();
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
                                        yu0Var.d = ps0Var;
                                        ju0 ju0Var2 = ju0VarArr[c10];
                                        yu0Var.m = ju0Var2.y;
                                        ju0Var2.h.getLocationInWindow(iArr);
                                        yu0Var.n = -iArr[c11];
                                        yu0Var.a = linkImageView;
                                        yu0Var.o = true;
                                        yu0Var.h = linkImageView.getRoundRadius(true);
                                        yu0Var.e = yu0Var.a.getBitmapSafe();
                                        yu0Var.d.getLocationInWindow(iArr);
                                        yu0Var.j = 0;
                                        yu0Var.q = qv0Var.t1[0].m;
                                        if (ct0Var != null && ct0Var.getVisibility() == 0) {
                                            yu0Var.j = AndroidUtilities.dp(36.0f) + yu0Var.j;
                                        }
                                        if (PhotoViewer.N1(messageObject) && (pinnedHeader = ps0Var.getPinnedHeader()) != null) {
                                            int height = (ct0Var == null || ct0Var.getVisibility() != 0) ? 0 : ct0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z12 = childAt instanceof org.telegram.ui.Cells.k7;
                                            if (z12) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - yu0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                ps0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return yu0Var;
                                            }
                                            int height2 = yu0Var.c - ps0Var.getHeight();
                                            if (z12) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                ps0Var.scrollBy(0, childAt.getHeight() + height2);
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
                ju0 ju0Var3 = ju0VarArr[0];
                if (ju0Var3.F != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int i17 = qv0Var.H.f.t1[0].m + i10;
                if (i17 <= i14) {
                    ju0Var3.x.h1(i17, 0);
                    cu0Var.C();
                    return null;
                }
                if (i17 < i15 || i15 < 0) {
                    return null;
                }
                ju0Var3.x.i1(i17, 0, true);
                cu0Var.C();
                return null;
            }
        }
        return null;
    }
}
