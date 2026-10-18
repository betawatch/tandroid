package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class wu0 extends org.telegram.ui.bu0 {
    public final /* synthetic */ xu0 a;

    public wu0(xu0 xu0Var) {
        this.a = xu0Var;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        zu0 zu0Var = this.a.c;
        ku0 ku0Var = zu0Var.r;
        if (ku0Var != null) {
            int childCount = ku0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zu0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.u1) || messageObject == null || (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? u1Var.F2(i10) : u1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.lu0 lu0Var = new org.telegram.ui.lu0();
                    lu0Var.b = iArr[0];
                    lu0Var.c = childAt.getPaddingTop() + iArr[1];
                    lu0Var.d = zu0Var.r;
                    lu0Var.m = null;
                    lu0Var.a = imageReceiver;
                    if (z10) {
                        lu0Var.e = imageReceiver.getBitmapSafe();
                    }
                    lu0Var.h = imageReceiver.getRoundRadius(true);
                    lu0Var.j = 0;
                    lu0Var.i = 0;
                    return lu0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean L() {
        return true;
    }
}
