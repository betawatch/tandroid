package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c60 extends org.telegram.ui.Components.q10 {
    public final /* synthetic */ k60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(k60 k60Var, Context context, int i9) {
        super(context, i9);
        this.r = k60Var;
    }

    @Override // org.telegram.ui.Components.q10
    public final void a(org.telegram.ui.Components.w20 w20Var) {
        super.a(w20Var);
        k60.Y(this.r);
    }

    @Override // org.telegram.ui.Components.q10
    public final void b() {
        super.b();
        k60.Y(this.r);
    }

    @Override // org.telegram.ui.Components.q10
    public final void c(org.telegram.ui.Components.w20 w20Var) {
        k60 k60Var = this.r;
        if (w20Var == k60Var.T) {
            k60Var.T = null;
        }
        if (w20Var == k60Var.U) {
            k60Var.U = null;
        }
        super.c(w20Var);
        k60.Y(k60Var);
    }
}
