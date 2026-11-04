package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wa0 extends nm0 {
    public final /* synthetic */ cb0 d;

    public wa0(cb0 cb0Var) {
        this.d = cb0Var;
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.nm0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.nm0
    public final CharSequence d() {
        cb0 cb0Var = this.d;
        org.telegram.messenger.v10 v10Var = cb0Var.v0;
        return v10Var != null ? (CharSequence) v10Var.a(Integer.valueOf(cb0Var.I)) : cb0Var.d(cb0Var.I);
    }
}
