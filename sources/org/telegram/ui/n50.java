package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n50 extends org.telegram.ui.Components.l10 {
    public final /* synthetic */ v50 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(v50 v50Var, Context context, int i10) {
        super(context, i10);
        this.r = v50Var;
    }

    @Override // org.telegram.ui.Components.l10
    public final void a(org.telegram.ui.Components.s20 s20Var) {
        super.a(s20Var);
        v50.d0(this.r);
    }

    @Override // org.telegram.ui.Components.l10
    public final void b() {
        super.b();
        v50.d0(this.r);
    }

    @Override // org.telegram.ui.Components.l10
    public final void c(org.telegram.ui.Components.s20 s20Var) {
        v50 v50Var = this.r;
        if (s20Var == v50Var.X) {
            v50Var.X = null;
        }
        if (s20Var == v50Var.Y) {
            v50Var.Y = null;
        }
        super.c(s20Var);
        v50.d0(v50Var);
    }
}
