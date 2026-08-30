package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nh0 implements org.telegram.ui.Components.w80 {
    public final /* synthetic */ org.telegram.ui.Components.x80 a;
    public final /* synthetic */ oh0 b;

    public nh0(oh0 oh0Var, org.telegram.ui.Components.x80 x80Var) {
        this.b = oh0Var;
        this.a = x80Var;
    }

    @Override // org.telegram.ui.Components.w80
    public final void c() {
        ph0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.w80
    public final void e() {
        oh0 oh0Var = this.b;
        ph0 ph0Var = oh0Var.d;
        Context context = this.a.getContext();
        ph0 ph0Var2 = oh0Var.d;
        ph0Var.i0 = new org.telegram.ui.Components.s60(context, ph0Var2.e, ph0Var2.d, ph0Var2.h0, ph0Var2, ph0Var2.n, true, ph0Var2.h);
        oh0Var.d.i0.show();
    }

    @Override // org.telegram.ui.Components.w80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.w80
    public final /* synthetic */ void j() {
    }
}
