package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class xu0 extends org.telegram.ui.zt0 {
    public final /* synthetic */ yu0 a;

    public xu0(yu0 yu0Var) {
        this.a = yu0Var;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        av0 av0Var = this.a.c;
        lu0 lu0Var = av0Var.r;
        if (lu0Var != null) {
            int childCount = lu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = av0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.u1) || messageObject == null || (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? u1Var.F2(i10) : u1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                    ju0Var.b = iArr[0];
                    ju0Var.c = childAt.getPaddingTop() + iArr[1];
                    ju0Var.d = av0Var.r;
                    ju0Var.m = null;
                    ju0Var.a = imageReceiver;
                    if (z10) {
                        ju0Var.e = imageReceiver.getBitmapSafe();
                    }
                    ju0Var.h = imageReceiver.getRoundRadius(true);
                    ju0Var.j = 0;
                    ju0Var.i = 0;
                    return ju0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean L() {
        return true;
    }
}
