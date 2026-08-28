package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class it0 extends org.telegram.ui.rt0 {
    public final /* synthetic */ jt0 a;

    public it0(jt0 jt0Var) {
        this.a = jt0Var;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final org.telegram.ui.bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        lt0 lt0Var = this.a.c;
        ws0 ws0Var = lt0Var.r;
        if (ws0Var != null) {
            int childCount = ws0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = lt0Var.r.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.t1) || messageObject == null || (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i9 < 0 || i9 >= arrayList.size()) ? t1Var.F2(i9) : t1Var.F2(messageObject2.pollMediaMapping.get(i9).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.bu0 bu0Var = new org.telegram.ui.bu0();
                    bu0Var.b = iArr[0];
                    bu0Var.c = childAt.getPaddingTop() + iArr[1];
                    bu0Var.d = lt0Var.r;
                    bu0Var.m = null;
                    bu0Var.a = imageReceiver;
                    if (z10) {
                        bu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    bu0Var.h = imageReceiver.getRoundRadius(true);
                    bu0Var.j = 0;
                    bu0Var.i = 0;
                    return bu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean K() {
        return true;
    }
}
