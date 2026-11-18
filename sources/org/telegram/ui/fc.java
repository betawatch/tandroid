package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fc extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ hc f;

    public fc(hc hcVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        this.f = hcVar;
        this.c = context;
        this.d = i6Var;
        this.e = i7;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(this.e).t4;
        if (cpVar == null) {
            return 0;
        }
        return cpVar.c.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        gc gcVar = (gc) f1Var.a;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, gcVar, this.d);
        boolean z10 = i7 == this.f.e;
        gcVar.s = z10;
        gcVar.w.f(z10, true);
        gcVar.invalidate();
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(this.e).t4;
        if (cpVar != null) {
            ArrayList arrayList = cpVar.c;
            if (i7 < 0 || i7 >= arrayList.size()) {
                return;
            }
            gcVar.a((org.telegram.messenger.bp) arrayList.get(i7));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.kj0(new gc(this.f, this.c));
    }
}
