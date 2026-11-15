package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h7 extends mq0 {
    public org.telegram.ui.Components.uj0 a;
    public final /* synthetic */ t7 b;

    public h7(t7 t7Var) {
        this.b = t7Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.n7 n7Var;
        org.telegram.ui.Components.uj0 listView = this.b.getListView();
        int i10 = 0;
        while (true) {
            if (i10 >= listView.getChildCount()) {
                n7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i10);
            if (RecyclerView.R(childAt) == i7 && (childAt instanceof org.telegram.ui.Cells.n7)) {
                n7Var = (org.telegram.ui.Cells.n7) childAt;
                break;
            }
            i10++;
        }
        if (n7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        n7Var.getLocationInWindow(iArr);
        uq0 uq0Var = new uq0();
        uq0Var.b = iArr[0];
        uq0Var.c = iArr[1];
        uq0Var.d = this.a;
        ImageReceiver imageReceiver = n7Var.c;
        uq0Var.a = imageReceiver;
        uq0Var.e = imageReceiver.p();
        uq0Var.k = n7Var.getScaleX();
        return uq0Var;
    }
}
