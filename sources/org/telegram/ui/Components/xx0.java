package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xx0 implements wb0, yb0 {
    public final /* synthetic */ zx0 a;

    @Override // org.telegram.ui.Components.wb0
    public String e(int i10) {
        return this.a.n[i10];
    }

    @Override // org.telegram.ui.Components.yb0
    public void t(ac0 ac0Var, int i10) {
        zx0 zx0Var = this.a;
        zx0Var.b();
        org.telegram.messenger.uz.r1 = i10;
        org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.uz.r1).apply();
        zx0Var.invalidate();
        try {
            ac0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
