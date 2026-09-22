package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wa0 extends a81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ vb0 b;

    public wa0(vb0 vb0Var, Context context) {
        this.b = vb0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        pb0 pb0Var = (pb0) view;
        pb0Var.h();
        pb0Var.k(false);
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        return new pb0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.a81
    public final int h(int i10) {
        return ((sb0) this.b.e.a.get(i10)).a;
    }
}
