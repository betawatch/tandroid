package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class su0 {
    public org.telegram.messenger.bp a;
    public org.telegram.ui.ActionBar.i6 b;
    public int c;
    public int d;
    public float e;

    public final void a(org.telegram.messenger.bp bpVar) {
        this.a = bpVar;
        if (bpVar == null) {
            this.c = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, this.b);
            this.d = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s8, this.b);
            this.c = i0.a.f(this.e, this.c, 603979776);
            this.d = i0.a.f(this.e, this.d, -1);
            return;
        }
        int c10 = bpVar.c(org.telegram.ui.ActionBar.n6.I.q());
        int d = bpVar.d(org.telegram.ui.ActionBar.n6.I.q());
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        int f10 = i0.a.f(0.75f, d, c10);
        int w02 = org.telegram.messenger.g0.B(f10) > 0.721f ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v6, i6Var) : org.telegram.ui.ActionBar.n6.b(0.08f, -0.08f, f10);
        this.c = w02;
        this.d = org.telegram.messenger.g0.B(w02) > 0.721f ? -16777216 : -1;
        this.c = i0.a.f(this.e, this.c, 603979776);
        this.d = i0.a.f(this.e, this.d, -1);
    }
}
