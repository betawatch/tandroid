package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class bv0 extends org.telegram.ui.cu0 {
    public final /* synthetic */ cv0 a;

    public bv0(cv0 cv0Var) {
        this.a = cv0Var;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final org.telegram.ui.mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        ev0 ev0Var = this.a.c;
        pu0 pu0Var = ev0Var.r;
        if (pu0Var != null) {
            int childCount = pu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ev0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.t1) || messageObject == null || (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? t1Var.E2(i10) : t1Var.E2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.mu0 mu0Var = new org.telegram.ui.mu0();
                    mu0Var.b = iArr[0];
                    mu0Var.c = childAt.getPaddingTop() + iArr[1];
                    mu0Var.d = ev0Var.r;
                    mu0Var.m = null;
                    mu0Var.a = imageReceiver;
                    if (z10) {
                        mu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    mu0Var.h = imageReceiver.getRoundRadius(true);
                    mu0Var.j = 0;
                    mu0Var.i = 0;
                    return mu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean L() {
        return true;
    }
}
