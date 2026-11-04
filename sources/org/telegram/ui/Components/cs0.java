package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cs0 extends org.telegram.ui.eq0 {
    public final /* synthetic */ ds0 a;

    public cs0(ds0 ds0Var) {
        this.a = ds0Var;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        fs0 fs0Var = this.a.c;
        qr0 qr0Var = fs0Var.r;
        if (qr0Var != null) {
            int childCount = qr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = fs0Var.r.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.q1) || ziVar == null || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) == null || messageObject.f1() != ziVar.f1()) {
                    imageReceiver = null;
                } else {
                    ArrayList arrayList = messageObject.q0;
                    imageReceiver = (arrayList == null || i3 < 0 || i3 >= arrayList.size()) ? q1Var.S1(i3) : q1Var.S1(((Integer) messageObject.q0.get(i3)).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0();
                    mq0Var.b = iArr[0];
                    mq0Var.c = childAt.getPaddingTop() + iArr[1];
                    mq0Var.d = fs0Var.r;
                    mq0Var.m = null;
                    mq0Var.a = imageReceiver;
                    if (z10) {
                        mq0Var.e = imageReceiver.p();
                    }
                    mq0Var.h = imageReceiver.E();
                    mq0Var.j = 0;
                    mq0Var.i = 0;
                    return mq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean L() {
        return true;
    }
}
