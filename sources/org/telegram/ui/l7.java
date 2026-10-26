package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l7 extends gu0 {
    public org.telegram.ui.Components.mm0 a;
    public final /* synthetic */ x7 b;

    public l7(x7 x7Var) {
        this.b = x7Var;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.w7 w7Var;
        org.telegram.ui.Components.mm0 listView = this.b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 >= listView.getChildCount()) {
                w7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i11);
            if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.w7)) {
                w7Var = (org.telegram.ui.Cells.w7) childAt;
                break;
            }
            i11++;
        }
        if (w7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        w7Var.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = this.a;
        ImageReceiver imageReceiver = w7Var.c;
        qu0Var.a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        qu0Var.k = w7Var.getScaleX();
        return qu0Var;
    }
}
