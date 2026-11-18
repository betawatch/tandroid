package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cx0 implements ob0, qb0 {
    public final /* synthetic */ ex0 a;

    @Override // org.telegram.ui.Components.ob0
    public String i(int i7) {
        return this.a.n[i7];
    }

    @Override // org.telegram.ui.Components.qb0
    public void n(sb0 sb0Var, int i7) {
        ex0 ex0Var = this.a;
        ex0Var.b();
        org.telegram.messenger.bz.r1 = i7;
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.bz.r1).apply();
        ex0Var.invalidate();
        try {
            sb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
