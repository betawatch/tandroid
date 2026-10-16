package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b70 extends org.telegram.ui.Components.s20 {
    public final /* synthetic */ j70 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(j70 j70Var, Context context, int i10) {
        super(context, i10);
        this.r = j70Var;
    }

    @Override // org.telegram.ui.Components.s20
    public final void a(org.telegram.ui.Components.z30 z30Var) {
        super.a(z30Var);
        j70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.s20
    public final void b() {
        super.b();
        j70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.s20
    public final void c(org.telegram.ui.Components.z30 z30Var) {
        j70 j70Var = this.r;
        if (z30Var == j70Var.X) {
            j70Var.X = null;
        }
        if (z30Var == j70Var.Y) {
            j70Var.Y = null;
        }
        super.c(z30Var);
        j70.Z(j70Var);
    }
}
