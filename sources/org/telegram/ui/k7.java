package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k7 extends zt0 {
    public org.telegram.ui.Components.im0 a;
    public final /* synthetic */ v7 b;

    public k7(v7 v7Var) {
        this.b = v7Var;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.s7 s7Var;
        org.telegram.ui.Components.im0 listView = this.b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 >= listView.getChildCount()) {
                s7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i11);
            if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.s7)) {
                s7Var = (org.telegram.ui.Cells.s7) childAt;
                break;
            }
            i11++;
        }
        if (s7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        s7Var.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.b = iArr[0];
        ju0Var.c = iArr[1];
        ju0Var.d = this.a;
        ImageReceiver imageReceiver = s7Var.c;
        ju0Var.a = imageReceiver;
        ju0Var.e = imageReceiver.getBitmapSafe();
        ju0Var.k = s7Var.getScaleX();
        return ju0Var;
    }
}
