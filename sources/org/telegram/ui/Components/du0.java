package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class du0 extends org.telegram.ui.vu0 {
    public final /* synthetic */ eu0 a;

    public du0(eu0 eu0Var) {
        this.a = eu0Var;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final org.telegram.ui.fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        gu0 gu0Var = this.a.c;
        rt0 rt0Var = gu0Var.r;
        if (rt0Var != null) {
            int childCount = rt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = gu0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.t1) || messageObject == null || (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? t1Var.F2(i10) : t1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.fv0 fv0Var = new org.telegram.ui.fv0();
                    fv0Var.b = iArr[0];
                    fv0Var.c = childAt.getPaddingTop() + iArr[1];
                    fv0Var.d = gu0Var.r;
                    fv0Var.m = null;
                    fv0Var.a = imageReceiver;
                    if (z10) {
                        fv0Var.e = imageReceiver.getBitmapSafe();
                    }
                    fv0Var.h = imageReceiver.getRoundRadius(true);
                    fv0Var.j = 0;
                    fv0Var.i = 0;
                    return fv0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean K() {
        return true;
    }
}
