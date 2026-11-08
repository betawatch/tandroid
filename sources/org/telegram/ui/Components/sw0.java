package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
