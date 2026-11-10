package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class es0 extends org.telegram.ui.qq0 {
    public final /* synthetic */ fs0 a;

    public es0(fs0 fs0Var) {
        this.a = fs0Var;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final org.telegram.ui.zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        hs0 hs0Var = this.a.c;
        sr0 sr0Var = hs0Var.r;
        if (sr0Var != null) {
            int childCount = sr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = hs0Var.r.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.q1) || ijVar == null || (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) == null || messageObject.e1() != ijVar.e1()) {
                    imageReceiver = null;
                } else {
                    ArrayList arrayList = messageObject.q0;
                    imageReceiver = (arrayList == null || i7 < 0 || i7 >= arrayList.size()) ? q1Var.S1(i7) : q1Var.S1(((Integer) messageObject.q0.get(i7)).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.zq0 zq0Var = new org.telegram.ui.zq0();
                    zq0Var.b = iArr[0];
                    zq0Var.c = childAt.getPaddingTop() + iArr[1];
                    zq0Var.d = hs0Var.r;
                    zq0Var.m = null;
                    zq0Var.a = imageReceiver;
                    if (z9) {
                        zq0Var.e = imageReceiver.p();
                    }
                    zq0Var.h = imageReceiver.E();
                    zq0Var.j = 0;
                    zq0Var.i = 0;
                    return zq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean L() {
        return true;
    }
}
