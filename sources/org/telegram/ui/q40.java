package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q40 extends org.telegram.ui.Components.h10 {
    public final /* synthetic */ y40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(y40 y40Var, Context context, int i7) {
        super(context, i7);
        this.r = y40Var;
    }

    @Override // org.telegram.ui.Components.h10
    public final void a(org.telegram.ui.Components.n20 n20Var) {
        super.a(n20Var);
        y40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.h10
    public final void b() {
        super.b();
        y40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.h10
    public final void c(org.telegram.ui.Components.n20 n20Var) {
        y40 y40Var = this.r;
        if (n20Var == y40Var.Y) {
            y40Var.Y = null;
        }
        if (n20Var == y40Var.Z) {
            y40Var.Z = null;
        }
        super.c(n20Var);
        y40.e0(y40Var);
    }
}
