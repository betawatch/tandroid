package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class h7 extends mu0 {
    public org.telegram.ui.Components.ml0 a;
    public final /* synthetic */ s7 b;

    public h7(s7 s7Var) {
        this.b = s7Var;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.ml0 listView = this.b.getListView();
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
        wu0 wu0Var = new wu0();
        wu0Var.b = iArr[0];
        wu0Var.c = iArr[1];
        wu0Var.d = this.a;
        ImageReceiver imageReceiver = t7Var.c;
        wu0Var.a = imageReceiver;
        wu0Var.e = imageReceiver.getBitmapSafe();
        wu0Var.k = t7Var.getScaleX();
        return wu0Var;
    }
}
