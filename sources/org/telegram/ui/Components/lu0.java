package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lu0 extends org.telegram.ui.tu0 {
    public final /* synthetic */ mu0 a;

    public lu0(mu0 mu0Var) {
        this.a = mu0Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        ou0 ou0Var = this.a.c;
        zt0 zt0Var = ou0Var.r;
        if (zt0Var != null) {
            int childCount = zt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ou0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.t1) || messageObject == null || (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? t1Var.F2(i10) : t1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                    ev0Var.b = iArr[0];
                    ev0Var.c = childAt.getPaddingTop() + iArr[1];
                    ev0Var.d = ou0Var.r;
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean K() {
        return true;
    }
}
