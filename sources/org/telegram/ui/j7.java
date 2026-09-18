package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j7 extends vu0 {
    public org.telegram.ui.Components.ml0 a;
    public final /* synthetic */ u7 b;

    public j7(u7 u7Var) {
        this.b = u7Var;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.ml0 listView = this.b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 >= listView.getChildCount()) {
                t7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i11);
            if (RecyclerView.S(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.t7)) {
                t7Var = (org.telegram.ui.Cells.t7) childAt;
                break;
            }
            i11++;
        }
        if (t7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        t7Var.getLocationInWindow(iArr);
        fv0 fv0Var = new fv0();
        fv0Var.b = iArr[0];
        fv0Var.c = iArr[1];
        fv0Var.d = this.a;
        ImageReceiver imageReceiver = t7Var.c;
        fv0Var.a = imageReceiver;
        fv0Var.e = imageReceiver.getBitmapSafe();
        fv0Var.k = t7Var.getScaleX();
        return fv0Var;
    }
}
