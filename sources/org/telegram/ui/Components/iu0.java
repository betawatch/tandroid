package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class iu0 {
    public org.telegram.messenger.wo a;
    public org.telegram.ui.ActionBar.e6 b;
    public int c;
    public int d;
    public float e;

    public final void a(org.telegram.messenger.wo woVar) {
        this.a = woVar;
        if (woVar == null) {
            this.c = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, this.b);
            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.b);
            this.c = i0.a.f(this.e, this.c, 603979776);
            this.d = i0.a.f(this.e, this.d, -1);
            return;
        }
        int c2 = woVar.c(org.telegram.ui.ActionBar.k6.I.q());
        int d = woVar.d(org.telegram.ui.ActionBar.k6.I.q());
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int f10 = i0.a.f(0.75f, d, c2);
        int w02 = org.telegram.messenger.g0.B(f10) > 0.721f ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, e6Var) : org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, f10);
        this.c = w02;
        this.d = org.telegram.messenger.g0.B(w02) > 0.721f ? -16777216 : -1;
        this.c = i0.a.f(this.e, this.c, 603979776);
        this.d = i0.a.f(this.e, this.d, -1);
    }
}
