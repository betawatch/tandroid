package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ex0 implements pb0, rb0 {
    public final /* synthetic */ gx0 a;

    @Override // org.telegram.ui.Components.pb0
    public String i(int i7) {
        return this.a.n[i7];
    }

    @Override // org.telegram.ui.Components.rb0
    public void n(tb0 tb0Var, int i7) {
        gx0 gx0Var = this.a;
        gx0Var.b();
        org.telegram.messenger.cz.r1 = i7;
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.cz.r1).apply();
        gx0Var.invalidate();
        try {
            tb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
