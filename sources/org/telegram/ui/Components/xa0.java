package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xa0 extends a81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wb0 b;

    public xa0(wb0 wb0Var, Context context) {
        this.b = wb0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        qb0 qb0Var = (qb0) view;
        qb0Var.h();
        qb0Var.k(false);
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        return new qb0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.a81
    public final int h(int i10) {
        return ((tb0) this.b.e.a.get(i10)).a;
    }
}
