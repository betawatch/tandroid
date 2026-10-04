package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class tu0 extends org.telegram.ui.ou0 {
    public final /* synthetic */ uu0 a;

    public tu0(uu0 uu0Var) {
        this.a = uu0Var;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        wu0 wu0Var = this.a.c;
        hu0 hu0Var = wu0Var.r;
        if (hu0Var != null) {
            int childCount = hu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = wu0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.u1) || messageObject == null || (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? u1Var.F2(i10) : u1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.yu0 yu0Var = new org.telegram.ui.yu0();
                    yu0Var.b = iArr[0];
                    yu0Var.c = childAt.getPaddingTop() + iArr[1];
                    yu0Var.d = wu0Var.r;
                    yu0Var.m = null;
                    yu0Var.a = imageReceiver;
                    if (z10) {
                        yu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    yu0Var.h = imageReceiver.getRoundRadius(true);
                    yu0Var.j = 0;
                    yu0Var.i = 0;
                    return yu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean K() {
        return true;
    }
}
