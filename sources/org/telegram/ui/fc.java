package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class fc extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ hc f;

    public fc(hc hcVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.f = hcVar;
        this.c = context;
        this.d = h6Var;
        this.e = i7;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(this.e).t4;
        if (dpVar == null) {
            return 0;
        }
        return dpVar.c.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        gc gcVar = (gc) f1Var.a;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, gcVar, this.d);
        boolean z10 = i7 == this.f.e;
        gcVar.s = z10;
        gcVar.w.f(z10, true);
        gcVar.invalidate();
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(this.e).t4;
        if (dpVar != null) {
            ArrayList arrayList = dpVar.c;
            if (i7 < 0 || i7 >= arrayList.size()) {
                return;
            }
            gcVar.a((org.telegram.messenger.cp) arrayList.get(i7));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.mj0(new gc(this.f, this.c));
    }
}
