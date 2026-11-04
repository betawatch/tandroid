package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ec extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ gc f;

    public ec(gc gcVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        this.f = gcVar;
        this.c = context;
        this.d = e6Var;
        this.e = i3;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(this.e).q4;
        if (xoVar == null) {
            return 0;
        }
        return xoVar.c.size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        fc fcVar = (fc) d1Var.a;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, fcVar, this.d);
        boolean z10 = i3 == this.f.e;
        fcVar.s = z10;
        fcVar.w.f(z10, true);
        fcVar.invalidate();
        org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(this.e).q4;
        if (xoVar != null) {
            ArrayList arrayList = xoVar.c;
            if (i3 < 0 || i3 >= arrayList.size()) {
                return;
            }
            fcVar.a((org.telegram.messenger.wo) arrayList.get(i3));
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new org.telegram.ui.Components.bj0(new fc(this.f, this.c));
    }
}
