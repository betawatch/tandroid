package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cu0 extends org.telegram.ui.au0 {
    public final /* synthetic */ du0 a;

    public cu0(du0 du0Var) {
        this.a = du0Var;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        fu0 fu0Var = this.a.c;
        qt0 qt0Var = fu0Var.r;
        if (qt0Var != null) {
            int childCount = qt0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = fu0Var.r.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.t1) || messageObject == null || (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) == null || messageObject2.getId() != messageObject.getId()) {
                    imageReceiver = null;
                } else {
                    ArrayList<Integer> arrayList = messageObject2.pollMediaMapping;
                    imageReceiver = (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? t1Var.F2(i10) : t1Var.F2(messageObject2.pollMediaMapping.get(i10).intValue());
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    org.telegram.ui.lu0 lu0Var = new org.telegram.ui.lu0();
                    lu0Var.b = iArr[0];
                    lu0Var.c = childAt.getPaddingTop() + iArr[1];
                    lu0Var.d = fu0Var.r;
                    lu0Var.m = null;
                    lu0Var.a = imageReceiver;
                    if (z4) {
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

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean K() {
        return true;
    }
}
