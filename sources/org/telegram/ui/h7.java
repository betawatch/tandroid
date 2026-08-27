package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h7 extends st0 {
    public org.telegram.ui.Components.zk0 a;
    public final /* synthetic */ s7 b;

    public h7(s7 s7Var) {
        this.b = s7Var;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.o7 o7Var;
        org.telegram.ui.Components.zk0 listView = this.b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 >= listView.getChildCount()) {
                o7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i11);
            if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.o7)) {
                o7Var = (org.telegram.ui.Cells.o7) childAt;
                break;
            }
            i11++;
        }
        if (o7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        o7Var.getLocationInWindow(iArr);
        cu0 cu0Var = new cu0();
        cu0Var.b = iArr[0];
        cu0Var.c = iArr[1];
        cu0Var.d = this.a;
        ImageReceiver imageReceiver = o7Var.c;
        cu0Var.a = imageReceiver;
        cu0Var.e = imageReceiver.getBitmapSafe();
        cu0Var.k = o7Var.getScaleX();
        return cu0Var;
    }
}
