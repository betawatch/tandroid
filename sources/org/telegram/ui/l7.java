package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class l7 extends av0 {
    public org.telegram.ui.Components.mm0 a;
    public final /* synthetic */ w7 b;

    public l7(w7 w7Var) {
        this.b = w7Var;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
        kv0 kv0Var = new kv0();
        kv0Var.b = iArr[0];
        kv0Var.c = iArr[1];
        kv0Var.d = this.a;
        ImageReceiver imageReceiver = t7Var.c;
        kv0Var.a = imageReceiver;
        kv0Var.e = imageReceiver.getBitmapSafe();
        kv0Var.k = t7Var.getScaleX();
        return kv0Var;
    }
}
