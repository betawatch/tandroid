package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gv0 extends org.telegram.ui.iu0 {
    public final /* synthetic */ hv0 a;

    public gv0(hv0 hv0Var) {
        this.a = hv0Var;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final org.telegram.ui.su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        jv0 jv0Var = this.a.c;
        tu0 tu0Var = jv0Var.r;
        if (tu0Var != null) {
            int childCount = tu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = jv0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.s1) || messageObject == null || (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? s1Var.F2(i10) : s1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.su0 su0Var = new org.telegram.ui.su0();
                    su0Var.b = iArr[0];
                    su0Var.c = childAt.getPaddingTop() + iArr[1];
                    su0Var.d = jv0Var.r;
                    su0Var.m = null;
                    su0Var.a = imageReceiver;
                    if (z10) {
                        su0Var.e = imageReceiver.getBitmapSafe();
                    }
                    su0Var.h = imageReceiver.getRoundRadius(true);
                    su0Var.j = 0;
                    su0Var.i = 0;
                    return su0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean L() {
        return true;
    }
}
