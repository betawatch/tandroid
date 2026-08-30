package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ya0 extends c81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wb0 b;

    public ya0(wb0 wb0Var, Context context) {
        this.b = wb0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        qb0 qb0Var = (qb0) view;
        qb0Var.h();
        qb0Var.k(false);
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        return new qb0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.c81
    public final int h(int i10) {
        return ((tb0) this.b.e.a.get(i10)).a;
    }
}
