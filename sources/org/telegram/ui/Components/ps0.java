package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ps0 extends org.telegram.ui.oq0 {
    public final /* synthetic */ qs0 a;

    public ps0(qs0 qs0Var) {
        this.a = qs0Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.ui.wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.gj messageObject;
        ss0 ss0Var = this.a.c;
        cs0 cs0Var = ss0Var.r;
        if (cs0Var != null) {
            int childCount = cs0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ss0Var.r.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.r1) || gjVar == null || (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) == null || messageObject.e1() != gjVar.e1()) {
                    imageReceiver = null;
                } else {
                    ArrayList arrayList = messageObject.s0;
                    imageReceiver = (arrayList == null || i7 < 0 || i7 >= arrayList.size()) ? r1Var.T1(i7) : r1Var.T1(((Integer) messageObject.s0.get(i7)).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                    wq0Var.b = iArr[0];
                    wq0Var.c = childAt.getPaddingTop() + iArr[1];
                    wq0Var.d = ss0Var.r;
                    wq0Var.m = null;
                    wq0Var.a = imageReceiver;
                    if (z10) {
                        wq0Var.e = imageReceiver.p();
                    }
                    wq0Var.h = imageReceiver.E();
                    wq0Var.j = 0;
                    wq0Var.i = 0;
                    return wq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean L() {
        return true;
    }
}
