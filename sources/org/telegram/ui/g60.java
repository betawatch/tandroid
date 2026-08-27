package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g60 extends org.telegram.ui.Components.t10 {
    public final /* synthetic */ o60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(o60 o60Var, Context context, int i10) {
        super(context, i10);
        this.r = o60Var;
    }

    @Override // org.telegram.ui.Components.t10
    public final void a(org.telegram.ui.Components.a30 a30Var) {
        super.a(a30Var);
        o60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.t10
    public final void b() {
        super.b();
        o60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.t10
    public final void c(org.telegram.ui.Components.a30 a30Var) {
        o60 o60Var = this.r;
        if (a30Var == o60Var.T) {
            o60Var.T = null;
        }
        if (a30Var == o60Var.U) {
            o60Var.U = null;
        }
        super.c(a30Var);
        o60.Z(o60Var);
    }
}
