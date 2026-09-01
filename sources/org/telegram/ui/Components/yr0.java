package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yr0 extends org.telegram.ui.au0 {
    public final /* synthetic */ zu0 a;

    public yr0(zu0 zu0Var) {
        this.a = zu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124 A[SYNTHETIC] */
    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        char c3;
        char c10;
        org.telegram.ui.Cells.l7 l7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        zu0 zu0Var = this.a;
        kt0 kt0Var = zu0Var.A1;
        ks0 ks0Var = zu0Var.O0;
        rt0[] rt0VarArr = zu0Var.h0;
        if (messageObject != null) {
            char c11 = 0;
            rt0 rt0Var = rt0VarArr[0];
            int i11 = rt0Var.C;
            if (i11 == 0 || i11 == 1 || i11 == 3 || i11 == 5) {
                xr0 xr0Var = rt0Var.h;
                int childCount = xr0Var.getChildCount();
                int i12 = -1;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                while (i13 < childCount) {
                    View childAt = xr0Var.getChildAt(i13);
                    int measuredHeight = rt0VarArr[c11].h.getMeasuredHeight();
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
                        int R = RecyclerView.R(childAt);
                        if (R < i14 || i14 == i12) {
                            i14 = R;
                        }
                        if (R > i15 || i15 == i12) {
                            i15 = R;
                        }
                        int[] iArr = new int[2];
                        if (childAt instanceof org.telegram.ui.Cells.r7) {
                            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                            linkImageView = r7Var.c;
                            MessageObject messageObject2 = r7Var.getMessageObject();
                            if (messageObject2 != null) {
                                c3 = 0;
                                int id2 = messageObject2.getId();
                                c10 = 1;
                                if (id2 == messageObject.getId()) {
                                    r7Var.getLocationInWindow(iArr);
                                    iArr[0] = Math.round(linkImageView.getImageX()) + iArr[0];
                                    iArr[1] = Math.round(linkImageView.getImageY()) + iArr[1];
                                    if (linkImageView != null) {
                                        org.telegram.ui.lu0 lu0Var = new org.telegram.ui.lu0();
                                        lu0Var.b = iArr[c3];
                                        lu0Var.c = iArr[c10];
                                        lu0Var.d = xr0Var;
                                        rt0 rt0Var2 = rt0VarArr[c3];
                                        lu0Var.m = rt0Var2.y;
                                        rt0Var2.h.getLocationInWindow(iArr);
                                        lu0Var.n = -iArr[c10];
                                        lu0Var.a = linkImageView;
                                        lu0Var.o = true;
                                        lu0Var.h = linkImageView.getRoundRadius(true);
                                        lu0Var.e = lu0Var.a.getBitmapSafe();
                                        lu0Var.d.getLocationInWindow(iArr);
                                        lu0Var.j = 0;
                                        lu0Var.q = zu0Var.q1[0].m;
                                        if (ks0Var != null && ks0Var.getVisibility() == 0) {
                                            lu0Var.j = AndroidUtilities.dp(36.0f) + lu0Var.j;
                                        }
                                        if (PhotoViewer.M1(messageObject) && (pinnedHeader = xr0Var.getPinnedHeader()) != null) {
                                            int height = (ks0Var == null || ks0Var.getVisibility() != 0) ? 0 : ks0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z11 = childAt instanceof org.telegram.ui.Cells.i7;
                                            if (z11) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i16 = height - lu0Var.c;
                                            if (i16 > childAt.getHeight()) {
                                                xr0Var.scrollBy(0, -(pinnedHeader.getHeight() + i16));
                                                return lu0Var;
                                            }
                                            int height2 = lu0Var.c - xr0Var.getHeight();
                                            if (z11) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                xr0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return lu0Var;
                                    }
                                }
                                linkImageView = imageReceiver;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            c3 = 0;
                            c10 = 1;
                            if (childAt instanceof org.telegram.ui.Cells.i7) {
                                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                                if (i7Var.getMessage().getId() == messageObject.getId()) {
                                    p9 imageView = i7Var.getImageView();
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
                    i13++;
                    c11 = 0;
                    i12 = -1;
                }
                if (rt0VarArr[0].C != 0 || i14 < 0 || i15 < 0) {
                    return null;
                }
                int L = zu0Var.E.L(i10);
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
