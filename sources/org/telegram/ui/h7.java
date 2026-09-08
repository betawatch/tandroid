package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h7 extends su0 {
    public org.telegram.ui.Components.ll0 a;
    public final /* synthetic */ s7 b;

    public h7(s7 s7Var) {
        this.b = s7Var;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.ll0 listView = this.b.getListView();
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
        cv0 cv0Var = new cv0();
        cv0Var.b = iArr[0];
        cv0Var.c = iArr[1];
        cv0Var.d = this.a;
        ImageReceiver imageReceiver = t7Var.c;
        cv0Var.a = imageReceiver;
        cv0Var.e = imageReceiver.getBitmapSafe();
        cv0Var.k = t7Var.getScaleX();
        return cv0Var;
    }
}
