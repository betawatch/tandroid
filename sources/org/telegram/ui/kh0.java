package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class kh0 implements org.telegram.ui.Components.q90 {
    public final /* synthetic */ org.telegram.ui.Components.r90 a;
    public final /* synthetic */ lh0 b;

    public kh0(lh0 lh0Var, org.telegram.ui.Components.r90 r90Var) {
        this.b = lh0Var;
        this.a = r90Var;
    }

    @Override // org.telegram.ui.Components.q90
    public final void c() {
        mh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.q90
    public final void j() {
        lh0 lh0Var = this.b;
        mh0 mh0Var = lh0Var.d;
        Context context = this.a.getContext();
        mh0 mh0Var2 = lh0Var.d;
        mh0Var.l0 = new org.telegram.ui.Components.m70(context, mh0Var2.e, mh0Var2.d, mh0Var2.k0, mh0Var2, mh0Var2.n, true, mh0Var2.h);
        lh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.q90
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.q90
    public final /* synthetic */ void k() {
    }
}
