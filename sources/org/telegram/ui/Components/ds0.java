package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ds0 extends org.telegram.ui.mq0 {
    public final /* synthetic */ es0 a;

    public ds0(es0 es0Var) {
        this.a = es0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final org.telegram.ui.vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        gs0 gs0Var = this.a.c;
        rr0 rr0Var = gs0Var.r;
        if (rr0Var != null) {
            int childCount = rr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = gs0Var.r.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.q1) || ijVar == null || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) == null || messageObject.f1() != ijVar.f1()) {
                    imageReceiver = null;
                } else {
                    ArrayList arrayList = messageObject.q0;
                    imageReceiver = (arrayList == null || i7 < 0 || i7 >= arrayList.size()) ? q1Var.S1(i7) : q1Var.S1(((Integer) messageObject.q0.get(i7)).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.vq0 vq0Var = new org.telegram.ui.vq0();
                    vq0Var.b = iArr[0];
                    vq0Var.c = childAt.getPaddingTop() + iArr[1];
                    vq0Var.d = gs0Var.r;
                    vq0Var.m = null;
                    vq0Var.a = imageReceiver;
                    if (z9) {
                        vq0Var.e = imageReceiver.p();
                    }
                    vq0Var.h = imageReceiver.E();
                    vq0Var.j = 0;
                    vq0Var.i = 0;
                    return vq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean L() {
        return true;
    }
}
