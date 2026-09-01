package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ab0 extends e81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yb0 b;

    public ab0(yb0 yb0Var, Context context) {
        this.b = yb0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.e81
    public final void b(View view, int i10, int i11) {
        sb0 sb0Var = (sb0) view;
        sb0Var.h();
        sb0Var.k(false);
    }

    @Override // org.telegram.ui.Components.e81
    public final View d(int i10) {
        return new sb0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.e81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.e81
    public final int h(int i10) {
        return ((vb0) this.b.e.a.get(i10)).a;
    }
}
