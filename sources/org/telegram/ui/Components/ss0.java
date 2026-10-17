package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ss0 extends org.telegram.ui.bu0 {
    public final /* synthetic */ sv0 a;

    public ss0(sv0 sv0Var) {
        this.a = sv0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        int i11;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        boolean z12;
        ?? r16;
        View pinnedHeader;
        int i12;
        sv0 sv0Var = this.a;
        eu0 eu0Var = sv0Var.D1;
        et0 et0Var = sv0Var.R0;
        lu0[] lu0VarArr = sv0Var.k0;
        if (messageObject != null) {
            int i13 = 0;
            lu0 lu0Var = lu0VarArr[0];
            int i14 = lu0Var.F;
            boolean z13 = true;
            if (i14 == 0 || i14 == 1 || i14 == 3 || i14 == 5) {
                rs0 rs0Var = lu0Var.h;
                int childCount = rs0Var.getChildCount();
                int i15 = -1;
                int i16 = 0;
                int i17 = -1;
                int i18 = -1;
                while (i16 < childCount) {
                    View childAt = rs0Var.getChildAt(i16);
                    int measuredHeight = lu0VarArr[i13].h.getMeasuredHeight();
                    View view = (View) sv0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (sv0Var.getY() + sv0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= sv0Var.getBottom() - view.getMeasuredHeight();
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (childAt.getTop() < measuredHeight) {
                        int R = RecyclerView.R(childAt);
                        if (R < i17 || i17 == i15) {
                            i17 = R;
                        }
                        if (R > i18 || i18 == i15) {
                            i18 = R;
                        }
                        int[] iArr = new int[2];
                        if (childAt instanceof org.telegram.ui.Cells.s7) {
                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                            linkImageView = s7Var.c;
                            MessageObject messageObject2 = s7Var.getMessageObject();
                            if (messageObject2 != null) {
                                i11 = i13;
                                int id2 = messageObject2.getId();
                                boolean z14 = z13;
                                z12 = z14;
                                if (id2 == messageObject.getId()) {
                                    s7Var.getLocationInWindow(iArr);
                                    iArr[i11] = Math.round(linkImageView.getImageX()) + iArr[i11];
                                    iArr[z14 ? 1 : 0] = Math.round(linkImageView.getImageY()) + iArr[z14 ? 1 : 0];
                                    r16 = z14;
                                    if (linkImageView != null) {
                                        org.telegram.ui.lu0 lu0Var2 = new org.telegram.ui.lu0();
                                        lu0Var2.b = iArr[i11];
                                        lu0Var2.c = iArr[r16];
                                        lu0Var2.d = rs0Var;
                                        lu0 lu0Var3 = lu0VarArr[i11];
                                        lu0Var2.m = lu0Var3.y;
                                        lu0Var3.h.getLocationInWindow(iArr);
                                        lu0Var2.n = -iArr[r16];
                                        lu0Var2.a = linkImageView;
                                        boolean z15 = r16;
                                        lu0Var2.o = z15;
                                        lu0Var2.h = linkImageView.getRoundRadius(z15);
                                        lu0Var2.e = lu0Var2.a.getBitmapSafe();
                                        lu0Var2.d.getLocationInWindow(iArr);
                                        int i19 = i11;
                                        lu0Var2.j = i19;
                                        lu0Var2.q = sv0Var.t1[i19].m;
                                        if (et0Var != null && et0Var.getVisibility() == 0) {
                                            lu0Var2.j = AndroidUtilities.dp(36.0f) + lu0Var2.j;
                                        }
                                        if (PhotoViewer.N1(messageObject) && (pinnedHeader = rs0Var.getPinnedHeader()) != null) {
                                            int height = (et0Var == null || et0Var.getVisibility() != 0) ? 0 : et0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                            boolean z16 = childAt instanceof org.telegram.ui.Cells.i7;
                                            if (z16) {
                                                height += AndroidUtilities.dp(8.0f);
                                            }
                                            int i20 = height - lu0Var2.c;
                                            if (i20 > childAt.getHeight()) {
                                                rs0Var.scrollBy(0, -(pinnedHeader.getHeight() + i20));
                                                return lu0Var2;
                                            }
                                            int height2 = lu0Var2.c - rs0Var.getHeight();
                                            if (z16) {
                                                height2 -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                rs0Var.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return lu0Var2;
                                    }
                                    i12 = i11;
                                }
                                linkImageView = imageReceiver;
                                r16 = z12;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            i11 = i13;
                            boolean z17 = z13;
                            if (childAt instanceof org.telegram.ui.Cells.i7) {
                                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                                z12 = z17;
                                if (i7Var.getMessage().getId() == messageObject.getId()) {
                                    w9 imageView = i7Var.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                    r16 = z17;
                                }
                                linkImageView = imageReceiver;
                                r16 = z12;
                            } else {
                                if (childAt instanceof org.telegram.ui.Cells.f2) {
                                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                                    MessageObject messageObject3 = (MessageObject) f2Var.getParentObject();
                                    z12 = z17;
                                    if (messageObject3 != null) {
                                        z12 = z17;
                                        if (messageObject3.getId() == messageObject.getId()) {
                                            photoImage = f2Var.getPhotoImage();
                                            f2Var.getLocationInWindow(iArr);
                                            linkImageView = photoImage;
                                            r16 = z17;
                                        }
                                    }
                                } else {
                                    z12 = z17;
                                    if (childAt instanceof org.telegram.ui.Cells.m7) {
                                        org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) childAt;
                                        MessageObject message = m7Var.getMessage();
                                        z12 = z17;
                                        if (message != null) {
                                            z12 = z17;
                                            if (message.getId() == messageObject.getId()) {
                                                linkImageView = m7Var.getLinkImageView();
                                                m7Var.getLocationInWindow(iArr);
                                                r16 = z17;
                                            }
                                        }
                                    }
                                }
                                linkImageView = imageReceiver;
                                r16 = z12;
                            }
                            if (linkImageView != null) {
                            }
                        }
                        i16++;
                        i13 = i12;
                        z13 = true;
                        i15 = -1;
                    }
                    i12 = i13;
                    i16++;
                    i13 = i12;
                    z13 = true;
                    i15 = -1;
                }
                int i21 = i13;
                if (lu0VarArr[i21].F != 0 || i17 < 0 || i18 < 0) {
                    return null;
                }
                int L = sv0Var.H.L(i10);
                if (L <= i17) {
                    lu0VarArr[i21].x.h1(L, i21);
                    eu0Var.C();
                    return null;
                }
                if (L < i18 || i18 < 0) {
                    return null;
                }
                lu0VarArr[i21].x.i1(L, i21, true);
                eu0Var.C();
                return null;
            }
        }
        return null;
    }
}
