package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h7 extends nq0 {
    public org.telegram.ui.Components.pj0 a;
    public final /* synthetic */ t7 b;

    public h7(t7 t7Var) {
        this.b = t7Var;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
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
        wq0 wq0Var = new wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = this.a;
        ImageReceiver imageReceiver = o7Var.c;
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        wq0Var.k = o7Var.getScaleX();
        return wq0Var;
    }
}
