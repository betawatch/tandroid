package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h7 extends qq0 {
    public org.telegram.ui.Components.pj0 a;
    public final /* synthetic */ t7 b;

    public h7(t7 t7Var) {
        this.b = t7Var;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
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
        zq0 zq0Var = new zq0();
        zq0Var.b = iArr[0];
        zq0Var.c = iArr[1];
        zq0Var.d = this.a;
        ImageReceiver imageReceiver = o7Var.c;
        zq0Var.a = imageReceiver;
        zq0Var.e = imageReceiver.p();
        zq0Var.k = o7Var.getScaleX();
        return zq0Var;
    }
}
