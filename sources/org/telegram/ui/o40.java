package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o40 extends org.telegram.ui.Components.z00 {
    public final /* synthetic */ w40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o40(w40 w40Var, Context context, int i7) {
        super(context, i7);
        this.r = w40Var;
    }

    @Override // org.telegram.ui.Components.z00
    public final void a(org.telegram.ui.Components.f20 f20Var) {
        super.a(f20Var);
        w40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.z00
    public final void b() {
        super.b();
        w40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.z00
    public final void c(org.telegram.ui.Components.f20 f20Var) {
        w40 w40Var = this.r;
        if (f20Var == w40Var.Y) {
            w40Var.Y = null;
        }
        if (f20Var == w40Var.Z) {
            w40Var.Z = null;
        }
        super.c(f20Var);
        w40.e0(w40Var);
    }
}
