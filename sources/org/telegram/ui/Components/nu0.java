package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class nu0 extends org.telegram.ui.tu0 {
    public final /* synthetic */ ou0 a;

    public nu0(ou0 ou0Var) {
        this.a = ou0Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        qu0 qu0Var = this.a.c;
        bu0 bu0Var = qu0Var.r;
        if (bu0Var != null) {
            int childCount = bu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = qu0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.u1) || messageObject == null || (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? u1Var.F2(i10) : u1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.dv0 dv0Var = new org.telegram.ui.dv0();
                    dv0Var.b = iArr[0];
                    dv0Var.c = childAt.getPaddingTop() + iArr[1];
                    dv0Var.d = qu0Var.r;
                    dv0Var.m = null;
                    dv0Var.a = imageReceiver;
                    if (z10) {
                        dv0Var.e = imageReceiver.getBitmapSafe();
                    }
                    dv0Var.h = imageReceiver.getRoundRadius(true);
                    dv0Var.j = 0;
                    dv0Var.i = 0;
                    return dv0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final boolean K() {
        return true;
    }
}
