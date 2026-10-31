package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dt0 extends org.telegram.ui.yr0 {
    public final /* synthetic */ et0 a;

    public dt0(et0 et0Var) {
        this.a = et0Var;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject;
        gt0 gt0Var = this.a.c;
        rs0 rs0Var = gt0Var.r;
        if (rs0Var != null) {
            int childCount = rs0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = gt0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.q1) || jjVar == null || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) == null || messageObject.f1() != jjVar.f1()) {
                    imageReceiver = null;
                } else {
                    ArrayList arrayList = messageObject.q0;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? q1Var.Q1(i10) : q1Var.Q1(((Integer) messageObject.q0.get(i10)).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.gs0 gs0Var = new org.telegram.ui.gs0();
                    gs0Var.b = iArr[0];
                    gs0Var.c = childAt.getPaddingTop() + iArr[1];
                    gs0Var.d = gt0Var.r;
                    gs0Var.m = null;
                    gs0Var.a = imageReceiver;
                    if (z10) {
                        gs0Var.e = imageReceiver.p();
                    }
                    gs0Var.h = imageReceiver.E();
                    gs0Var.j = 0;
                    gs0Var.i = 0;
                    return gs0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean L() {
        return true;
    }
}
