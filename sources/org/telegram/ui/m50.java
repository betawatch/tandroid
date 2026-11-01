package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m50 extends org.telegram.ui.Components.l10 {
    public final /* synthetic */ u50 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(u50 u50Var, Context context, int i10) {
        super(context, i10);
        this.r = u50Var;
    }

    @Override // org.telegram.ui.Components.l10
    public final void a(org.telegram.ui.Components.s20 s20Var) {
        super.a(s20Var);
        u50.e0(this.r);
    }

    @Override // org.telegram.ui.Components.l10
    public final void b() {
        super.b();
        u50.e0(this.r);
    }

    @Override // org.telegram.ui.Components.l10
    public final void c(org.telegram.ui.Components.s20 s20Var) {
        u50 u50Var = this.r;
        if (s20Var == u50Var.X) {
            u50Var.X = null;
        }
        if (s20Var == u50Var.Y) {
            u50Var.Y = null;
        }
        super.c(s20Var);
        u50.e0(u50Var);
    }
}
