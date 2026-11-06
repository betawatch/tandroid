package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class h7 extends mq0 {
    public org.telegram.ui.Components.pj0 a;
    public final /* synthetic */ t7 b;

    public h7(t7 t7Var) {
        this.b = t7Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Cells.o7 o7Var;
        org.telegram.ui.Components.pj0 listView = this.b.getListView();
        int i10 = 0;
        while (true) {
            if (i10 >= listView.getChildCount()) {
                o7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i10);
            if (RecyclerView.R(childAt) == i7 && (childAt instanceof org.telegram.ui.Cells.o7)) {
                o7Var = (org.telegram.ui.Cells.o7) childAt;
                break;
            }
            i10++;
        }
        if (o7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        o7Var.getLocationInWindow(iArr);
        vq0 vq0Var = new vq0();
        vq0Var.b = iArr[0];
        vq0Var.c = iArr[1];
        vq0Var.d = this.a;
        ImageReceiver imageReceiver = o7Var.c;
        vq0Var.a = imageReceiver;
        vq0Var.e = imageReceiver.p();
        vq0Var.k = o7Var.getScaleX();
        return vq0Var;
    }
}
