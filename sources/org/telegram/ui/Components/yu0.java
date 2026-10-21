package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class yu0 extends org.telegram.ui.zt0 {
    public final /* synthetic */ zu0 a;

    public yu0(zu0 zu0Var) {
        this.a = zu0Var;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        bv0 bv0Var = this.a.c;
        mu0 mu0Var = bv0Var.r;
        if (mu0Var != null) {
            int childCount = mu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = bv0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.u1) || messageObject == null || (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? u1Var.F2(i10) : u1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                    ju0Var.b = iArr[0];
                    ju0Var.c = childAt.getPaddingTop() + iArr[1];
                    ju0Var.d = bv0Var.r;
                    ju0Var.m = null;
                    ju0Var.a = imageReceiver;
                    if (z10) {
                        ju0Var.e = imageReceiver.getBitmapSafe();
                    }
                    ju0Var.h = imageReceiver.getRoundRadius(true);
                    ju0Var.j = 0;
                    ju0Var.i = 0;
                    return ju0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean L() {
        return true;
    }
}
