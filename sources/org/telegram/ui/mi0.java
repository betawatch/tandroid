package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class mi0 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ cj0 e;

    public mi0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = cj0Var;
        this.c = context;
        this.d = f6Var;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.N.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        cj0 cj0Var = this.e;
        ArrayList arrayList = cj0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) c1Var.a;
        MessageObject.GroupedMessages l4 = cj0Var.l(messageObject);
        int i11 = 0;
        t1Var.setInvalidatesParent(l4 != null);
        t1Var.X3(messageObject, l4, false, false, false, false);
        if (!cj0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        cj0Var.Q = t1Var;
        Point point = AndroidUtilities.displaySize;
        t1Var.Z3(point.x, point.y);
        cj0Var.R = messageObject.getId();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        cj0 cj0Var = this.e;
        bj0 bj0Var = new bj0(cj0Var, this.c, cj0Var.c, this.d);
        bj0Var.setDelegate(new ob.a(17));
        return new org.telegram.ui.Components.vk0(bj0Var);
    }
}
