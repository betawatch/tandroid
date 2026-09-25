package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h7 extends lu0 {
    public org.telegram.ui.Components.wl0 a;
    public final /* synthetic */ s7 b;

    public h7(s7 s7Var) {
        this.b = s7Var;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.wl0 listView = this.b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 >= listView.getChildCount()) {
                t7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i11);
            if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.t7)) {
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
        vu0 vu0Var = new vu0();
        vu0Var.b = iArr[0];
        vu0Var.c = iArr[1];
        vu0Var.d = this.a;
        ImageReceiver imageReceiver = t7Var.c;
        vu0Var.a = imageReceiver;
        vu0Var.e = imageReceiver.getBitmapSafe();
        vu0Var.k = t7Var.getScaleX();
        return vu0Var;
    }
}
