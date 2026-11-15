package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class es0 extends org.telegram.ui.mq0 {
    public final /* synthetic */ fs0 a;

    public es0(fs0 fs0Var) {
        this.a = fs0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject;
        hs0 hs0Var = this.a.c;
        sr0 sr0Var = hs0Var.r;
        if (sr0Var != null) {
            int childCount = sr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = hs0Var.r.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.q1) || gjVar == null || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) == null || messageObject.e1() != gjVar.e1()) {
                    imageReceiver = null;
                } else {
                    ArrayList arrayList = messageObject.s0;
                    imageReceiver = (arrayList == null || i7 < 0 || i7 >= arrayList.size()) ? q1Var.T1(i7) : q1Var.T1(((Integer) messageObject.s0.get(i7)).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.uq0 uq0Var = new org.telegram.ui.uq0();
                    uq0Var.b = iArr[0];
                    uq0Var.c = childAt.getPaddingTop() + iArr[1];
                    uq0Var.d = hs0Var.r;
                    uq0Var.m = null;
                    uq0Var.a = imageReceiver;
                    if (z10) {
                        uq0Var.e = imageReceiver.p();
                    }
                    uq0Var.h = imageReceiver.E();
                    uq0Var.j = 0;
                    uq0Var.i = 0;
                    return uq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean L() {
        return true;
    }
}
