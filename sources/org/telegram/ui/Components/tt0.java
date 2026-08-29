package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tt0 extends org.telegram.ui.pt0 {
    public final /* synthetic */ ut0 a;

    public tt0(ut0 ut0Var) {
        this.a = ut0Var;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final org.telegram.ui.zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        wt0 wt0Var = this.a.c;
        ht0 ht0Var = wt0Var.r;
        if (ht0Var != null) {
            int childCount = ht0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = wt0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.s1) || messageObject == null || (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? s1Var.F2(i10) : s1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.zt0 zt0Var = new org.telegram.ui.zt0();
                    zt0Var.b = iArr[0];
                    zt0Var.c = childAt.getPaddingTop() + iArr[1];
                    zt0Var.d = wt0Var.r;
                    zt0Var.m = null;
                    zt0Var.a = imageReceiver;
                    if (z10) {
                        zt0Var.e = imageReceiver.getBitmapSafe();
                    }
                    zt0Var.h = imageReceiver.getRoundRadius(true);
                    zt0Var.j = 0;
                    zt0Var.i = 0;
                    return zt0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean K() {
        return true;
    }
}
