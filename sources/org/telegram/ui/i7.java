package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i7 extends eq0 {
    public org.telegram.ui.Components.tj0 a;
    public final /* synthetic */ u7 b;

    public i7(u7 u7Var) {
        this.b = u7Var;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        org.telegram.ui.Cells.n7 n7Var;
        org.telegram.ui.Components.tj0 listView = this.b.getListView();
        int i10 = 0;
        while (true) {
            if (i10 >= listView.getChildCount()) {
                n7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i10);
            if (RecyclerView.R(childAt) == i3 && (childAt instanceof org.telegram.ui.Cells.n7)) {
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
        mq0 mq0Var = new mq0();
        mq0Var.b = iArr[0];
        mq0Var.c = iArr[1];
        mq0Var.d = this.a;
        ImageReceiver imageReceiver = n7Var.c;
        mq0Var.a = imageReceiver;
        mq0Var.e = imageReceiver.p();
        mq0Var.k = n7Var.getScaleX();
        return mq0Var;
    }
}
