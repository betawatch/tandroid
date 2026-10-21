package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class d60 extends org.telegram.ui.Components.o20 {
    public final /* synthetic */ l60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(l60 l60Var, Context context, int i10) {
        super(context, i10);
        this.r = l60Var;
    }

    @Override // org.telegram.ui.Components.o20
    public final void a(org.telegram.ui.Components.v30 v30Var) {
        super.a(v30Var);
        l60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.o20
    public final void b() {
        super.b();
        l60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.o20
    public final void c(org.telegram.ui.Components.v30 v30Var) {
        l60 l60Var = this.r;
        if (v30Var == l60Var.X) {
            l60Var.X = null;
        }
        if (v30Var == l60Var.Y) {
            l60Var.Y = null;
        }
        super.c(v30Var);
        l60.Z(l60Var);
    }
}
