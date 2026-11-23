package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
