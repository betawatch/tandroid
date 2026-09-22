package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class li0 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ bj0 e;

    public li0(bj0 bj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = bj0Var;
        this.c = context;
        this.d = e6Var;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.N.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        bj0 bj0Var = this.e;
        ArrayList arrayList = bj0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) c1Var.a;
        MessageObject.GroupedMessages l4 = bj0Var.l(messageObject);
        int i11 = 0;
        t1Var.setInvalidatesParent(l4 != null);
        t1Var.X3(messageObject, l4, false, false, false, false);
        if (!bj0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        bj0Var.Q = t1Var;
        Point point = AndroidUtilities.displaySize;
        t1Var.Z3(point.x, point.y);
        bj0Var.R = messageObject.getId();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        bj0 bj0Var = this.e;
        aj0 aj0Var = new aj0(bj0Var, this.c, bj0Var.c, this.d);
        aj0Var.setDelegate(new na.d(17));
        return new org.telegram.ui.Components.vk0(aj0Var);
    }
}
