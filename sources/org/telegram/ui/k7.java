package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class k7 extends cu0 {
    public org.telegram.ui.Components.mm0 a;
    public final /* synthetic */ v7 b;

    public k7(v7 v7Var) {
        this.b = v7Var;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.s7 s7Var;
        org.telegram.ui.Components.mm0 listView = this.b.getListView();
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
        mu0 mu0Var = new mu0();
        mu0Var.b = iArr[0];
        mu0Var.c = iArr[1];
        mu0Var.d = this.a;
        ImageReceiver imageReceiver = s7Var.c;
        mu0Var.a = imageReceiver;
        mu0Var.e = imageReceiver.getBitmapSafe();
        mu0Var.k = s7Var.getScaleX();
        return mu0Var;
    }
}
