package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw0 implements db0, fb0 {
    public final /* synthetic */ uw0 a;

    @Override // org.telegram.ui.Components.db0
    public String h(int i7) {
        return this.a.n[i7];
    }

    @Override // org.telegram.ui.Components.fb0
    public void n(hb0 hb0Var, int i7) {
        uw0 uw0Var = this.a;
        uw0Var.b();
        org.telegram.messenger.iz.r1 = i7;
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.iz.r1).apply();
        uw0Var.invalidate();
        try {
            hb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
