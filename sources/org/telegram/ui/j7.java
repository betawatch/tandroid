package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j7 extends yt0 {
    public org.telegram.ui.Components.sl0 a;
    public final /* synthetic */ u7 b;

    public j7(u7 u7Var) {
        this.b = u7Var;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Cells.r7 r7Var;
        org.telegram.ui.Components.sl0 listView = this.b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 >= listView.getChildCount()) {
                r7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i11);
            if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.r7)) {
                r7Var = (org.telegram.ui.Cells.r7) childAt;
                break;
            }
            i11++;
        }
        if (r7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        r7Var.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.b = iArr[0];
        ju0Var.c = iArr[1];
        ju0Var.d = this.a;
        ImageReceiver imageReceiver = r7Var.c;
        ju0Var.a = imageReceiver;
        ju0Var.e = imageReceiver.getBitmapSafe();
        ju0Var.k = r7Var.getScaleX();
        return ju0Var;
    }
}
