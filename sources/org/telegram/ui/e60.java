package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e60 extends org.telegram.ui.Components.b20 {
    public final /* synthetic */ m60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e60(m60 m60Var, Context context, int i10) {
        super(context, i10);
        this.r = m60Var;
    }

    @Override // org.telegram.ui.Components.b20
    public final void a(org.telegram.ui.Components.j30 j30Var) {
        super.a(j30Var);
        m60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.b20
    public final void b() {
        super.b();
        m60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.b20
    public final void c(org.telegram.ui.Components.j30 j30Var) {
        m60 m60Var = this.r;
        if (j30Var == m60Var.T) {
            m60Var.T = null;
        }
        if (j30Var == m60Var.U) {
            m60Var.U = null;
        }
        super.c(j30Var);
        m60.Z(m60Var);
    }
}
