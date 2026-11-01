package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mv0 {
    public org.telegram.messenger.lp a;
    public org.telegram.ui.ActionBar.p6 b;
    public int c;
    public int d;
    public float e;

    public final void a(org.telegram.messenger.lp lpVar) {
        this.a = lpVar;
        if (lpVar == null) {
            this.c = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, this.b);
            this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, this.b);
            this.c = i0.b.f(this.e, this.c, 603979776);
            this.d = i0.b.f(this.e, this.d, -1);
            return;
        }
        int c10 = lpVar.c(org.telegram.ui.ActionBar.t6.I.q());
        int d = lpVar.d(org.telegram.ui.ActionBar.t6.I.q());
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        int f7 = i0.b.f(0.75f, d, c10);
        int w02 = org.telegram.messenger.i0.B(f7) > 0.721f ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, p6Var) : org.telegram.ui.ActionBar.t6.b(0.08f, -0.08f, f7);
        this.c = w02;
        this.d = org.telegram.messenger.i0.B(w02) > 0.721f ? -16777216 : -1;
        this.c = i0.b.f(this.e, this.c, 603979776);
        this.d = i0.b.f(this.e, this.d, -1);
    }
}
