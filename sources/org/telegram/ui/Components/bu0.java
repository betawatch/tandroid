package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bu0 extends org.telegram.ui.fu0 {
    public final /* synthetic */ cu0 a;

    public bu0(cu0 cu0Var) {
        this.a = cu0Var;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        eu0 eu0Var = this.a.c;
        pt0 pt0Var = eu0Var.r;
        if (pt0Var != null) {
            int childCount = pt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = eu0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.t1) || messageObject == null || (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? t1Var.F2(i10) : t1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                    qu0Var.b = iArr[0];
                    qu0Var.c = childAt.getPaddingTop() + iArr[1];
                    qu0Var.d = eu0Var.r;
                    qu0Var.m = null;
                    qu0Var.a = imageReceiver;
                    if (z4) {
                        qu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    qu0Var.h = imageReceiver.getRoundRadius(true);
                    qu0Var.j = 0;
                    qu0Var.i = 0;
                    return qu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean K() {
        return true;
    }
}
