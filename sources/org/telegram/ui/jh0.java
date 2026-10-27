package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jh0 implements org.telegram.ui.Components.r90 {
    public final /* synthetic */ org.telegram.ui.Components.s90 a;
    public final /* synthetic */ kh0 b;

    public jh0(kh0 kh0Var, org.telegram.ui.Components.s90 s90Var) {
        this.b = kh0Var;
        this.a = s90Var;
    }

    @Override // org.telegram.ui.Components.r90
    public final void d() {
        lh0.X(this.b.d);
    }

    @Override // org.telegram.ui.Components.r90
    public final void e() {
        kh0 kh0Var = this.b;
        lh0 lh0Var = kh0Var.d;
        Context context = this.a.getContext();
        lh0 lh0Var2 = kh0Var.d;
        lh0Var.l0 = new org.telegram.ui.Components.o70(context, lh0Var2.e, lh0Var2.d, lh0Var2.k0, lh0Var2, lh0Var2.n, true, lh0Var2.h);
        kh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.r90
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.r90
    public final /* synthetic */ void k() {
    }
}
