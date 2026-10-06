package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ji0 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ zi0 e;

    public ji0(zi0 zi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = zi0Var;
        this.c = context;
        this.d = d6Var;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.N.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        zi0 zi0Var = this.e;
        ArrayList arrayList = zi0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) c1Var.a;
        MessageObject.GroupedMessages l4 = zi0Var.l(messageObject);
        int i11 = 0;
        u1Var.setInvalidatesParent(l4 != null);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!zi0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        zi0Var.Q = u1Var;
        Point point = AndroidUtilities.displaySize;
        u1Var.Z3(point.x, point.y);
        zi0Var.R = messageObject.getId();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        zi0 zi0Var = this.e;
        yi0 yi0Var = new yi0(zi0Var, this.c, zi0Var.c, this.d);
        yi0Var.setDelegate(new na.d(17));
        return new org.telegram.ui.Components.il0(yi0Var);
    }
}
