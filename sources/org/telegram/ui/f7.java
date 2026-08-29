package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f7 extends pt0 {
    public org.telegram.ui.Components.jl0 a;
    public final /* synthetic */ q7 b;

    public f7(q7 q7Var) {
        this.b = q7Var;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.p7 p7Var;
        org.telegram.ui.Components.jl0 listView = this.b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 >= listView.getChildCount()) {
                p7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i11);
            if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.p7)) {
                p7Var = (org.telegram.ui.Cells.p7) childAt;
                break;
            }
            i11++;
        }
        if (p7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        p7Var.getLocationInWindow(iArr);
        zt0 zt0Var = new zt0();
        zt0Var.b = iArr[0];
        zt0Var.c = iArr[1];
        zt0Var.d = this.a;
        ImageReceiver imageReceiver = p7Var.c;
        zt0Var.a = imageReceiver;
        zt0Var.e = imageReceiver.getBitmapSafe();
        zt0Var.k = p7Var.getScaleX();
        return zt0Var;
    }
}
