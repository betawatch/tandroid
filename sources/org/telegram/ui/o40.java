package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class o40 extends org.telegram.ui.Components.v00 {
    public final /* synthetic */ w40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o40(w40 w40Var, Context context, int i7) {
        super(context, i7);
        this.r = w40Var;
    }

    @Override // org.telegram.ui.Components.v00
    public final void a(org.telegram.ui.Components.c20 c20Var) {
        super.a(c20Var);
        w40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.v00
    public final void b() {
        super.b();
        w40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.v00
    public final void c(org.telegram.ui.Components.c20 c20Var) {
        w40 w40Var = this.r;
        if (c20Var == w40Var.X) {
            w40Var.X = null;
        }
        if (c20Var == w40Var.Y) {
            w40Var.Y = null;
        }
        super.c(c20Var);
        w40.e0(w40Var);
    }
}
