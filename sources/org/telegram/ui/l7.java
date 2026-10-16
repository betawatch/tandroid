package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class l7 extends zu0 {
    public org.telegram.ui.Components.mm0 a;
    public final /* synthetic */ w7 b;

    public l7(w7 w7Var) {
        this.b = w7Var;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.mm0 listView = this.b.getListView();
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
        jv0 jv0Var = new jv0();
        jv0Var.b = iArr[0];
        jv0Var.c = iArr[1];
        jv0Var.d = this.a;
        ImageReceiver imageReceiver = t7Var.c;
        jv0Var.a = imageReceiver;
        jv0Var.e = imageReceiver.getBitmapSafe();
        jv0Var.k = t7Var.getScaleX();
        return jv0Var;
    }
}
