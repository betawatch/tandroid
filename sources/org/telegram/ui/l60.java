package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l60 extends org.telegram.ui.Components.q20 {
    public final /* synthetic */ t60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l60(t60 t60Var, Context context, int i10) {
        super(context, i10);
        this.r = t60Var;
    }

    @Override // org.telegram.ui.Components.q20
    public final void a(org.telegram.ui.Components.x30 x30Var) {
        super.a(x30Var);
        t60.a0(this.r);
    }

    @Override // org.telegram.ui.Components.q20
    public final void b() {
        super.b();
        t60.a0(this.r);
    }

    @Override // org.telegram.ui.Components.q20
    public final void c(org.telegram.ui.Components.x30 x30Var) {
        t60 t60Var = this.r;
        if (x30Var == t60Var.X) {
            t60Var.X = null;
        }
        if (x30Var == t60Var.Y) {
            t60Var.Y = null;
        }
        super.c(x30Var);
        t60.a0(t60Var);
    }
}
