package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        org.telegram.messenger.y10 y10Var = tb0Var.v0;
        return y10Var != null ? (CharSequence) y10Var.a(Integer.valueOf(tb0Var.I)) : tb0Var.d(tb0Var.I);
    }
}
