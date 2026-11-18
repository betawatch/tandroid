package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g7 extends oq0 {
    public org.telegram.ui.Components.ck0 a;
    public final /* synthetic */ s7 b;

    public g7(s7 s7Var) {
        this.b = s7Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.p7 p7Var;
        org.telegram.ui.Components.ck0 listView = this.b.getListView();
        int i10 = 0;
        while (true) {
            if (i10 >= listView.getChildCount()) {
                p7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i10);
            if (RecyclerView.R(childAt) == i7 && (childAt instanceof org.telegram.ui.Cells.p7)) {
                p7Var = (org.telegram.ui.Cells.p7) childAt;
                break;
            }
            i10++;
        }
        if (p7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        p7Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = this.a;
        ImageReceiver imageReceiver = p7Var.c;
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        wq0Var.k = p7Var.getScaleX();
        return wq0Var;
    }
}
