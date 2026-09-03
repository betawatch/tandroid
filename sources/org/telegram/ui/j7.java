package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j7 extends fu0 {
    public org.telegram.ui.Components.sl0 a;
    public final /* synthetic */ u7 b;

    public j7(u7 u7Var) {
        this.b = u7Var;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
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
        qu0 qu0Var = new qu0();
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = this.a;
        ImageReceiver imageReceiver = r7Var.c;
        qu0Var.a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        qu0Var.k = r7Var.getScaleX();
        return qu0Var;
    }
}
