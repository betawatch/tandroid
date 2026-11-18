package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class mb0 extends wm0 {
    public final /* synthetic */ sb0 d;

    public mb0(sb0 sb0Var) {
        this.d = sb0Var;
    }

    @Override // org.telegram.ui.Components.wm0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.wm0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.wm0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.wm0
    public final CharSequence d() {
        sb0 sb0Var = this.d;
        org.telegram.messenger.y10 y10Var = sb0Var.v0;
        return y10Var != null ? (CharSequence) y10Var.a(Integer.valueOf(sb0Var.I)) : sb0Var.d(sb0Var.I);
    }
}
