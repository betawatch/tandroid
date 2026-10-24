package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class h60 extends org.telegram.ui.Components.o20 {
    public final /* synthetic */ p60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h60(p60 p60Var, Context context, int i10) {
        super(context, i10);
        this.r = p60Var;
    }

    @Override // org.telegram.ui.Components.o20
    public final void a(org.telegram.ui.Components.v30 v30Var) {
        super.a(v30Var);
        p60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.o20
    public final void b() {
        super.b();
        p60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.o20
    public final void c(org.telegram.ui.Components.v30 v30Var) {
        p60 p60Var = this.r;
        if (v30Var == p60Var.X) {
            p60Var.X = null;
        }
        if (v30Var == p60Var.Y) {
            p60Var.Y = null;
        }
        super.c(v30Var);
        p60.Z(p60Var);
    }
}
