package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cb0 extends lm0 {
    public final /* synthetic */ ib0 d;

    public cb0(ib0 ib0Var) {
        this.d = ib0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.lm0
    public final void c(boolean z9) {
        this.d.a(!z9);
    }

    @Override // org.telegram.ui.Components.lm0
    public final CharSequence d() {
        ib0 ib0Var = this.d;
        org.telegram.messenger.d20 d20Var = ib0Var.u0;
        return d20Var != null ? (CharSequence) d20Var.a(Integer.valueOf(ib0Var.H)) : ib0Var.d(ib0Var.H);
    }
}
