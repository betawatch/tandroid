package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g7 extends rt0 {
    public org.telegram.ui.Components.wk0 a;
    public final /* synthetic */ r7 b;

    public g7(r7 r7Var) {
        this.b = r7Var;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        org.telegram.ui.Cells.r7 r7Var;
        org.telegram.ui.Components.wk0 listView = this.b.getListView();
        int i10 = 0;
        while (true) {
            if (i10 >= listView.getChildCount()) {
                r7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i10);
            if (RecyclerView.R(childAt) == i9 && (childAt instanceof org.telegram.ui.Cells.r7)) {
                r7Var = (org.telegram.ui.Cells.r7) childAt;
                break;
            }
            i10++;
        }
        if (r7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        r7Var.getLocationInWindow(iArr);
        bu0 bu0Var = new bu0();
        bu0Var.b = iArr[0];
        bu0Var.c = iArr[1];
        bu0Var.d = this.a;
        ImageReceiver imageReceiver = r7Var.c;
        bu0Var.a = imageReceiver;
        bu0Var.e = imageReceiver.getBitmapSafe();
        bu0Var.k = r7Var.getScaleX();
        return bu0Var;
    }
}
