package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wx0 implements wb0, yb0 {
    public final /* synthetic */ yx0 a;

    @Override // org.telegram.ui.Components.wb0
    public String e(int i10) {
        return this.a.n[i10];
    }

    @Override // org.telegram.ui.Components.yb0
    public void t(ac0 ac0Var, int i10) {
        yx0 yx0Var = this.a;
        yx0Var.b();
        org.telegram.messenger.tz.r1 = i10;
        org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.tz.r1).apply();
        yx0Var.invalidate();
        try {
            ac0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
