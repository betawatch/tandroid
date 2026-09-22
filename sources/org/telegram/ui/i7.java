package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class i7 extends tu0 {
    public org.telegram.ui.Components.yl0 a;
    public final /* synthetic */ t7 b;

    public i7(t7 t7Var) {
        this.b = t7Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.u7 u7Var;
        org.telegram.ui.Components.yl0 listView = this.b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 >= listView.getChildCount()) {
                u7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i11);
            if (RecyclerView.S(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.u7)) {
                u7Var = (org.telegram.ui.Cells.u7) childAt;
                break;
            }
            i11++;
        }
        if (u7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        u7Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.b = iArr[0];
        dv0Var.c = iArr[1];
        dv0Var.d = this.a;
        ImageReceiver imageReceiver = u7Var.c;
        dv0Var.a = imageReceiver;
        dv0Var.e = imageReceiver.getBitmapSafe();
        dv0Var.k = u7Var.getScaleX();
        return dv0Var;
    }
}
