package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class pu0 extends org.telegram.ui.tu0 {
    public final /* synthetic */ qu0 a;

    public pu0(qu0 qu0Var) {
        this.a = qu0Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        su0 su0Var = this.a.c;
        du0 du0Var = su0Var.r;
        if (du0Var != null) {
            int childCount = du0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = su0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.u1) || messageObject == null || (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? u1Var.F2(i10) : u1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.dv0 dv0Var = new org.telegram.ui.dv0();
                    dv0Var.b = iArr[0];
                    dv0Var.c = childAt.getPaddingTop() + iArr[1];
                    dv0Var.d = su0Var.r;
                    dv0Var.m = null;
                    dv0Var.a = imageReceiver;
                    if (z10) {
                        dv0Var.e = imageReceiver.getBitmapSafe();
                    }
                    dv0Var.h = imageReceiver.getRoundRadius(true);
                    dv0Var.j = 0;
                    dv0Var.i = 0;
                    return dv0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final boolean K() {
        return true;
    }
}
