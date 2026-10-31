package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lv0 {
    public org.telegram.messenger.kp a;
    public org.telegram.ui.ActionBar.p6 b;
    public int c;
    public int d;
    public float e;

    public final void a(org.telegram.messenger.kp kpVar) {
        this.a = kpVar;
        if (kpVar == null) {
            this.c = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, this.b);
            this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, this.b);
            this.c = i0.b.f(this.e, this.c, 603979776);
            this.d = i0.b.f(this.e, this.d, -1);
            return;
        }
        int c10 = kpVar.c(org.telegram.ui.ActionBar.t6.I.q());
        int d = kpVar.d(org.telegram.ui.ActionBar.t6.I.q());
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        int f7 = i0.b.f(0.75f, d, c10);
        int w02 = org.telegram.messenger.i0.B(f7) > 0.721f ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, p6Var) : org.telegram.ui.ActionBar.t6.b(0.08f, -0.08f, f7);
        this.c = w02;
        this.d = org.telegram.messenger.i0.B(w02) > 0.721f ? -16777216 : -1;
        this.c = i0.b.f(this.e, this.c, 603979776);
        this.d = i0.b.f(this.e, this.d, -1);
    }
}
