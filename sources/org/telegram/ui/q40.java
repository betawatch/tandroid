package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q40 extends org.telegram.ui.Components.w00 {
    public final /* synthetic */ y40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(y40 y40Var, Context context, int i7) {
        super(context, i7);
        this.r = y40Var;
    }

    @Override // org.telegram.ui.Components.w00
    public final void a(org.telegram.ui.Components.d20 d20Var) {
        super.a(d20Var);
        y40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.w00
    public final void b() {
        super.b();
        y40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.w00
    public final void c(org.telegram.ui.Components.d20 d20Var) {
        y40 y40Var = this.r;
        if (d20Var == y40Var.X) {
            y40Var.X = null;
        }
        if (d20Var == y40Var.Y) {
            y40Var.Y = null;
        }
        super.c(d20Var);
        y40.e0(y40Var);
    }
}
