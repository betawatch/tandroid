package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g7 extends tu0 {
    public org.telegram.ui.Components.vl0 a;
    public final /* synthetic */ r7 b;

    public g7(r7 r7Var) {
        this.b = r7Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.u7 u7Var;
        org.telegram.ui.Components.vl0 listView = this.b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 >= listView.getChildCount()) {
                u7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i11);
            if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.u7)) {
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
        ev0 ev0Var = new ev0();
        ev0Var.b = iArr[0];
        ev0Var.c = iArr[1];
        ev0Var.d = this.a;
        ImageReceiver imageReceiver = u7Var.c;
        ev0Var.a = imageReceiver;
        ev0Var.e = imageReceiver.getBitmapSafe();
        ev0Var.k = u7Var.getScaleX();
        return ev0Var;
    }
}
