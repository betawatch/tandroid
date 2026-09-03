package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class oh0 implements org.telegram.ui.Components.x80 {
    public final /* synthetic */ org.telegram.ui.Components.y80 a;
    public final /* synthetic */ ph0 b;

    public oh0(ph0 ph0Var, org.telegram.ui.Components.y80 y80Var) {
        this.b = ph0Var;
        this.a = y80Var;
    }

    @Override // org.telegram.ui.Components.x80
    public final void c() {
        qh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.x80
    public final void e() {
        ph0 ph0Var = this.b;
        qh0 qh0Var = ph0Var.d;
        Context context = this.a.getContext();
        qh0 qh0Var2 = ph0Var.d;
        qh0Var.i0 = new org.telegram.ui.Components.u60(context, qh0Var2.e, qh0Var2.d, qh0Var2.h0, qh0Var2, qh0Var2.n, true, qh0Var2.h);
        ph0Var.d.i0.show();
    }

    @Override // org.telegram.ui.Components.x80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.x80
    public final /* synthetic */ void k() {
    }
}
