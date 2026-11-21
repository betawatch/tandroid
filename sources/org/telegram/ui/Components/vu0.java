package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class vu0 {
    public org.telegram.messenger.bp a;
    public org.telegram.ui.ActionBar.h6 b;
    public int c;
    public int d;
    public float e;

    public final void a(org.telegram.messenger.bp bpVar) {
        this.a = bpVar;
        if (bpVar == null) {
            this.c = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, this.b);
            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, this.b);
            this.c = i0.a.f(this.e, this.c, 603979776);
            this.d = i0.a.f(this.e, this.d, -1);
            return;
        }
        int c10 = bpVar.c(org.telegram.ui.ActionBar.m6.I.q());
        int d = bpVar.d(org.telegram.ui.ActionBar.m6.I.q());
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        int f10 = i0.a.f(0.75f, d, c10);
        int w02 = org.telegram.messenger.g0.B(f10) > 0.721f ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v6, h6Var) : org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, f10);
        this.c = w02;
        this.d = org.telegram.messenger.g0.B(w02) > 0.721f ? -16777216 : -1;
        this.c = i0.a.f(this.e, this.c, 603979776);
        this.d = i0.a.f(this.e, this.d, -1);
    }
}
