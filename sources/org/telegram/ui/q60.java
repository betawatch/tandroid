package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q60 extends org.telegram.ui.Components.g20 {
    public final /* synthetic */ y60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(y60 y60Var, Context context, int i10) {
        super(context, i10);
        this.r = y60Var;
    }

    @Override // org.telegram.ui.Components.g20
    public final void a(org.telegram.ui.Components.n30 n30Var) {
        super.a(n30Var);
        y60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.g20
    public final void b() {
        super.b();
        y60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.g20
    public final void c(org.telegram.ui.Components.n30 n30Var) {
        y60 y60Var = this.r;
        if (n30Var == y60Var.U) {
            y60Var.U = null;
        }
        if (n30Var == y60Var.V) {
            y60Var.V = null;
        }
        super.c(n30Var);
        y60.Z(y60Var);
    }
}
