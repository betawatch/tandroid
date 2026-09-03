package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l7 extends fu0 {
    public org.telegram.ui.Components.rl0 a;
    public final /* synthetic */ w7 b;

    public l7(w7 w7Var) {
        this.b = w7Var;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Cells.q7 q7Var;
        org.telegram.ui.Components.rl0 listView = this.b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 >= listView.getChildCount()) {
                q7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i11);
            if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.q7)) {
                q7Var = (org.telegram.ui.Cells.q7) childAt;
                break;
            }
            i11++;
        }
        if (q7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        q7Var.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = this.a;
        ImageReceiver imageReceiver = q7Var.c;
        qu0Var.a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        qu0Var.k = q7Var.getScaleX();
        return qu0Var;
    }
}
