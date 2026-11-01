package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h7 extends xr0 {
    public org.telegram.ui.Components.uk0 a;
    public final /* synthetic */ t7 b;

    public h7(t7 t7Var) {
        this.b = t7Var;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.s7 s7Var;
        org.telegram.ui.Components.uk0 listView = this.b.getListView();
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
        fs0 fs0Var = new fs0();
        fs0Var.b = iArr[0];
        fs0Var.c = iArr[1];
        fs0Var.d = this.a;
        ImageReceiver imageReceiver = s7Var.c;
        fs0Var.a = imageReceiver;
        fs0Var.e = imageReceiver.p();
        fs0Var.k = s7Var.getScaleX();
        return fs0Var;
    }
}
