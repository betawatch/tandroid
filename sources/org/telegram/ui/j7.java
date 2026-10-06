package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class j7 extends ou0 {
    public org.telegram.ui.Components.zl0 a;
    public final /* synthetic */ v7 b;

    public j7(v7 v7Var) {
        this.b = v7Var;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.zl0 listView = this.b.getListView();
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
        yu0 yu0Var = new yu0();
        yu0Var.b = iArr[0];
        yu0Var.c = iArr[1];
        yu0Var.d = this.a;
        ImageReceiver imageReceiver = t7Var.c;
        yu0Var.a = imageReceiver;
        yu0Var.e = imageReceiver.getBitmapSafe();
        yu0Var.k = t7Var.getScaleX();
        return yu0Var;
    }
}
