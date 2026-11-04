package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j40 extends org.telegram.ui.Components.r00 {
    public final /* synthetic */ r40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(r40 r40Var, Context context, int i3) {
        super(context, i3);
        this.r = r40Var;
    }

    @Override // org.telegram.ui.Components.r00
    public final void a(org.telegram.ui.Components.y10 y10Var) {
        super.a(y10Var);
        r40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.r00
    public final void b() {
        super.b();
        r40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.r00
    public final void c(org.telegram.ui.Components.y10 y10Var) {
        r40 r40Var = this.r;
        if (y10Var == r40Var.Y) {
            r40Var.Y = null;
        }
        if (y10Var == r40Var.Z) {
            r40Var.Z = null;
        }
        super.c(y10Var);
        r40.e0(r40Var);
    }
}
