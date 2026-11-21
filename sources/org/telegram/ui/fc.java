package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(this.e).t4;
        if (cpVar == null) {
            return 0;
        }
        return cpVar.c.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        gc gcVar = (gc) f1Var.a;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, gcVar, this.d);
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
        return new org.telegram.ui.Components.mj0(new gc(this.f, this.c));
    }
}
