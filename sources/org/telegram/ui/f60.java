package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class f60 extends org.telegram.ui.Components.o20 {
    public final /* synthetic */ n60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(n60 n60Var, Context context, int i10) {
        super(context, i10);
        this.r = n60Var;
    }

    @Override // org.telegram.ui.Components.o20
    public final void a(org.telegram.ui.Components.v30 v30Var) {
        super.a(v30Var);
        n60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.o20
    public final void b() {
        super.b();
        n60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.o20
    public final void c(org.telegram.ui.Components.v30 v30Var) {
        n60 n60Var = this.r;
        if (v30Var == n60Var.X) {
            n60Var.X = null;
        }
        if (v30Var == n60Var.Y) {
            n60Var.Y = null;
        }
        super.c(v30Var);
        n60.Z(n60Var);
    }
}
