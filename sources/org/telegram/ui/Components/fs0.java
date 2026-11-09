package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fs0 extends org.telegram.ui.pq0 {
    public final /* synthetic */ gs0 a;

    public fs0(gs0 gs0Var) {
        this.a = gs0Var;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final org.telegram.ui.yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        is0 is0Var = this.a.c;
        tr0 tr0Var = is0Var.r;
        if (tr0Var != null) {
            int childCount = tr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = is0Var.r.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.q1) || ijVar == null || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) == null || messageObject.e1() != ijVar.e1()) {
                    imageReceiver = null;
                } else {
                    ArrayList arrayList = messageObject.q0;
                    imageReceiver = (arrayList == null || i7 < 0 || i7 >= arrayList.size()) ? q1Var.S1(i7) : q1Var.S1(((Integer) messageObject.q0.get(i7)).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.yq0 yq0Var = new org.telegram.ui.yq0();
                    yq0Var.b = iArr[0];
                    yq0Var.c = childAt.getPaddingTop() + iArr[1];
                    yq0Var.d = is0Var.r;
                    yq0Var.m = null;
                    yq0Var.a = imageReceiver;
                    if (z9) {
                        yq0Var.e = imageReceiver.p();
                    }
                    yq0Var.h = imageReceiver.E();
                    yq0Var.j = 0;
                    yq0Var.i = 0;
                    return yq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean L() {
        return true;
    }
}
