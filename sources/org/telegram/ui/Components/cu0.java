package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class cu0 extends org.telegram.ui.tu0 {
    public final /* synthetic */ du0 a;

    public cu0(du0 du0Var) {
        this.a = du0Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        fu0 fu0Var = this.a.c;
        qt0 qt0Var = fu0Var.r;
        if (qt0Var != null) {
            int childCount = qt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = fu0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.t1) || messageObject == null || (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? t1Var.F2(i10) : t1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.dv0 dv0Var = new org.telegram.ui.dv0();
                    dv0Var.b = iArr[0];
                    dv0Var.c = childAt.getPaddingTop() + iArr[1];
                    dv0Var.d = fu0Var.r;
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
