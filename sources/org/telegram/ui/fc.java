package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fc extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ hc f;

    public fc(hc hcVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        this.f = hcVar;
        this.c = context;
        this.d = e6Var;
        this.e = i7;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(this.e).r4;
        if (dpVar == null) {
            return 0;
        }
        return dpVar.c.size();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        gc gcVar = (gc) e1Var.a;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, gcVar, this.d);
        boolean z10 = i7 == this.f.e;
        gcVar.s = z10;
        gcVar.w.f(z10, true);
        gcVar.invalidate();
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(this.e).r4;
        if (dpVar != null) {
            ArrayList arrayList = dpVar.c;
            if (i7 < 0 || i7 >= arrayList.size()) {
                return;
            }
            gcVar.a((org.telegram.messenger.cp) arrayList.get(i7));
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.cj0(new gc(this.f, this.c));
    }
}
