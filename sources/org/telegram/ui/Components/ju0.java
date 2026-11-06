package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ju0 {
    public org.telegram.messenger.fp a;
    public org.telegram.ui.ActionBar.f6 b;
    public int c;
    public int d;
    public float e;

    public final void a(org.telegram.messenger.fp fpVar) {
        this.a = fpVar;
        if (fpVar == null) {
            this.c = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, this.b);
            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.b);
            this.c = i0.a.f(this.e, this.c, 603979776);
            this.d = i0.a.f(this.e, this.d, -1);
            return;
        }
        int c10 = fpVar.c(org.telegram.ui.ActionBar.k6.I.q());
        int d = fpVar.d(org.telegram.ui.ActionBar.k6.I.q());
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        int f10 = i0.a.f(0.75f, d, c10);
        int w02 = org.telegram.messenger.g0.B(f10) > 0.721f ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, f6Var) : org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, f10);
        this.c = w02;
        this.d = org.telegram.messenger.g0.B(w02) > 0.721f ? -16777216 : -1;
        this.c = i0.a.f(this.e, this.c, 603979776);
        this.d = i0.a.f(this.e, this.d, -1);
    }
}
