package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ph0 implements org.telegram.ui.Components.w80 {
    public final /* synthetic */ org.telegram.ui.Components.x80 a;
    public final /* synthetic */ qh0 b;

    public ph0(qh0 qh0Var, org.telegram.ui.Components.x80 x80Var) {
        this.b = qh0Var;
        this.a = x80Var;
    }

    @Override // org.telegram.ui.Components.w80
    public final void c() {
        rh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.w80
    public final void f() {
        qh0 qh0Var = this.b;
        rh0 rh0Var = qh0Var.d;
        Context context = this.a.getContext();
        rh0 rh0Var2 = qh0Var.d;
        rh0Var.i0 = new org.telegram.ui.Components.t60(context, rh0Var2.e, rh0Var2.d, rh0Var2.h0, rh0Var2, rh0Var2.n, true, rh0Var2.h);
        qh0Var.d.i0.show();
    }

    @Override // org.telegram.ui.Components.w80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.w80
    public final /* synthetic */ void h() {
    }
}
