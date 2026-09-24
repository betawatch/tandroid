package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ib0 extends n81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ fc0 b;

    public ib0(fc0 fc0Var, Context context) {
        this.b = fc0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        zb0 zb0Var = (zb0) view;
        zb0Var.h();
        zb0Var.k(false);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        return new zb0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        return ((cc0) this.b.e.a.get(i10)).a;
    }
}
