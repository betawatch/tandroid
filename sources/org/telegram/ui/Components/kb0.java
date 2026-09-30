package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class kb0 extends p81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ hc0 b;

    public kb0(hc0 hc0Var, Context context) {
        this.b = hc0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.p81
    public final void b(View view, int i10, int i11) {
        bc0 bc0Var = (bc0) view;
        bc0Var.h();
        bc0Var.k(false);
    }

    @Override // org.telegram.ui.Components.p81
    public final View d(int i10) {
        return new bc0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.p81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.p81
    public final int h(int i10) {
        return ((ec0) this.b.e.a.get(i10)).a;
    }
}
