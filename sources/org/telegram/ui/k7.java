package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class k7 extends bu0 {
    public org.telegram.ui.Components.im0 a;
    public final /* synthetic */ v7 b;

    public k7(v7 v7Var) {
        this.b = v7Var;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.s7 s7Var;
        org.telegram.ui.Components.im0 listView = this.b.getListView();
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
        lu0 lu0Var = new lu0();
        lu0Var.b = iArr[0];
        lu0Var.c = iArr[1];
        lu0Var.d = this.a;
        ImageReceiver imageReceiver = s7Var.c;
        lu0Var.a = imageReceiver;
        lu0Var.e = imageReceiver.getBitmapSafe();
        lu0Var.k = s7Var.getScaleX();
        return lu0Var;
    }
}
