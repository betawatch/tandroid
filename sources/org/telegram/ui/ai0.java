package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ai0 extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ qi0 e;

    public ai0(qi0 qi0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = qi0Var;
        this.c = context;
        this.d = g6Var;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.M.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        qi0 qi0Var = this.e;
        ArrayList arrayList = qi0Var.M;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) b1Var.a;
        MessageObject.GroupedMessages k10 = qi0Var.k(messageObject);
        int i11 = 0;
        t1Var.setInvalidatesParent(k10 != null);
        t1Var.W3(messageObject, k10, false, false, false, false);
        if (!qi0Var.O.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        qi0Var.P = t1Var;
        Point point = AndroidUtilities.displaySize;
        t1Var.Y3(point.x, point.y);
        qi0Var.Q = messageObject.getId();
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        qi0 qi0Var = this.e;
        pi0 pi0Var = new pi0(qi0Var, this.c, qi0Var.c, this.d);
        pi0Var.setDelegate(new rb.b(17));
        return new org.telegram.ui.Components.wl0(pi0Var);
    }
}
