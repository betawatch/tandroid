package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bv0 extends org.telegram.ui.zu0 {
    public final /* synthetic */ cv0 a;

    public bv0(cv0 cv0Var) {
        this.a = cv0Var;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final org.telegram.ui.jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        ev0 ev0Var = this.a.c;
        pu0 pu0Var = ev0Var.r;
        if (pu0Var != null) {
            int childCount = pu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ev0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.u1) || messageObject == null || (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? u1Var.F2(i10) : u1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.jv0 jv0Var = new org.telegram.ui.jv0();
                    jv0Var.b = iArr[0];
                    jv0Var.c = childAt.getPaddingTop() + iArr[1];
                    jv0Var.d = ev0Var.r;
                    jv0Var.m = null;
                    jv0Var.a = imageReceiver;
                    if (z10) {
                        jv0Var.e = imageReceiver.getBitmapSafe();
                    }
                    jv0Var.h = imageReceiver.getRoundRadius(true);
                    jv0Var.j = 0;
                    jv0Var.i = 0;
                    return jv0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean L() {
        return true;
    }
}
