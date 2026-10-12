package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bv0 extends org.telegram.ui.av0 {
    public final /* synthetic */ cv0 a;

    public bv0(cv0 cv0Var) {
        this.a = cv0Var;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final org.telegram.ui.kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
                    org.telegram.ui.kv0 kv0Var = new org.telegram.ui.kv0();
                    kv0Var.b = iArr[0];
                    kv0Var.c = childAt.getPaddingTop() + iArr[1];
                    kv0Var.d = ev0Var.r;
                    kv0Var.m = null;
                    kv0Var.a = imageReceiver;
                    if (z10) {
                        kv0Var.e = imageReceiver.getBitmapSafe();
                    }
                    kv0Var.h = imageReceiver.getRoundRadius(true);
                    kv0Var.j = 0;
                    kv0Var.i = 0;
                    return kv0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean K() {
        return true;
    }
}
