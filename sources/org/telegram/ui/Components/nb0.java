package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class nb0 extends zm0 {
    public final /* synthetic */ tb0 d;

    public nb0(tb0 tb0Var) {
        this.d = tb0Var;
    }

    @Override // org.telegram.ui.Components.zm0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.zm0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.zm0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.zm0
    public final CharSequence d() {
        tb0 tb0Var = this.d;
        org.telegram.messenger.z10 z10Var = tb0Var.v0;
        return z10Var != null ? (CharSequence) z10Var.a(Integer.valueOf(tb0Var.I)) : tb0Var.d(tb0Var.I);
    }
}
