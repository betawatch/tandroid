package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l7 extends iu0 {
    public org.telegram.ui.Components.nm0 a;
    public final /* synthetic */ x7 b;

    public l7(x7 x7Var) {
        this.b = x7Var;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.w7 w7Var;
        org.telegram.ui.Components.nm0 listView = this.b.getListView();
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
        su0 su0Var = new su0();
        su0Var.b = iArr[0];
        su0Var.c = iArr[1];
        su0Var.d = this.a;
        ImageReceiver imageReceiver = w7Var.c;
        su0Var.a = imageReceiver;
        su0Var.e = imageReceiver.getBitmapSafe();
        su0Var.k = w7Var.getScaleX();
        return su0Var;
    }
}
