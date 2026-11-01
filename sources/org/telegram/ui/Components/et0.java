package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class et0 extends org.telegram.ui.xr0 {
    public final /* synthetic */ ft0 a;

    public et0(ft0 ft0Var) {
        this.a = ft0Var;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.kj messageObject;
        ht0 ht0Var = this.a.c;
        ss0 ss0Var = ht0Var.r;
        if (ss0Var != null) {
            int childCount = ss0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ht0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.q1) || kjVar == null || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) == null || messageObject.f1() != kjVar.f1()) {
                    imageReceiver = null;
                } else {
                    ArrayList arrayList = messageObject.q0;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? q1Var.Q1(i10) : q1Var.Q1(((Integer) messageObject.q0.get(i10)).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.fs0 fs0Var = new org.telegram.ui.fs0();
                    fs0Var.b = iArr[0];
                    fs0Var.c = childAt.getPaddingTop() + iArr[1];
                    fs0Var.d = ht0Var.r;
                    fs0Var.m = null;
                    fs0Var.a = imageReceiver;
                    if (z10) {
                        fs0Var.e = imageReceiver.p();
                    }
                    fs0Var.h = imageReceiver.E();
                    fs0Var.j = 0;
                    fs0Var.i = 0;
                    return fs0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean L() {
        return true;
    }
}
