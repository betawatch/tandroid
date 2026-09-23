package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gi0 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ wi0 e;

    public gi0(wi0 wi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = wi0Var;
        this.c = context;
        this.d = d6Var;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.N.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        wi0 wi0Var = this.e;
        ArrayList arrayList = wi0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) c1Var.a;
        MessageObject.GroupedMessages l4 = wi0Var.l(messageObject);
        int i11 = 0;
        t1Var.setInvalidatesParent(l4 != null);
        t1Var.X3(messageObject, l4, false, false, false, false);
        if (!wi0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        wi0Var.Q = t1Var;
        Point point = AndroidUtilities.displaySize;
        t1Var.Z3(point.x, point.y);
        wi0Var.R = messageObject.getId();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        wi0 wi0Var = this.e;
        vi0 vi0Var = new vi0(wi0Var, this.c, wi0Var.c, this.d);
        vi0Var.setDelegate(new na.d(17));
        return new org.telegram.ui.Components.wk0(vi0Var);
    }
}
