package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fv0 extends org.telegram.ui.uu0 {
    public final /* synthetic */ gv0 a;

    public fv0(gv0 gv0Var) {
        this.a = gv0Var;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        iv0 iv0Var = this.a.c;
        tu0 tu0Var = iv0Var.r;
        if (tu0Var != null) {
            int childCount = tu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = iv0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.u1) || messageObject == null || (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? u1Var.F2(i10) : u1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                    ev0Var.b = iArr[0];
                    ev0Var.c = childAt.getPaddingTop() + iArr[1];
                    ev0Var.d = iv0Var.r;
                    ev0Var.m = null;
                    ev0Var.a = imageReceiver;
                    if (z10) {
                        ev0Var.e = imageReceiver.getBitmapSafe();
                    }
                    ev0Var.h = imageReceiver.getRoundRadius(true);
                    ev0Var.j = 0;
                    ev0Var.i = 0;
                    return ev0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean K() {
        return true;
    }
}
