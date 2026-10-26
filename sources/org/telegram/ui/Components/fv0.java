package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fv0 extends org.telegram.ui.gu0 {
    public final /* synthetic */ gv0 a;

    public fv0(gv0 gv0Var) {
        this.a = gv0Var;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        iv0 iv0Var = this.a.c;
        su0 su0Var = iv0Var.r;
        if (su0Var != null) {
            int childCount = su0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = iv0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.s1) || messageObject == null || (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? s1Var.F2(i10) : s1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                    qu0Var.b = iArr[0];
                    qu0Var.c = childAt.getPaddingTop() + iArr[1];
                    qu0Var.d = iv0Var.r;
                    qu0Var.m = null;
                    qu0Var.a = imageReceiver;
                    if (z10) {
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

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean L() {
        return true;
    }
}
