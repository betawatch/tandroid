package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
