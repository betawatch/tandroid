package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw0 implements ya0, ab0 {
    public final /* synthetic */ uw0 a;

    @Override // org.telegram.ui.Components.ya0
    public String e(int i3) {
        return this.a.n[i3];
    }

    @Override // org.telegram.ui.Components.ab0
    public void l(cb0 cb0Var, int i3) {
        uw0 uw0Var = this.a;
        uw0Var.b();
        org.telegram.messenger.az.r1 = i3;
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.az.r1).apply();
        uw0Var.invalidate();
        try {
            cb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
