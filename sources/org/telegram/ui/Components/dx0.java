package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dx0 implements mb0, ob0 {
    public final /* synthetic */ fx0 a;

    @Override // org.telegram.ui.Components.mb0
    public String e(int i7) {
        return this.a.n[i7];
    }

    @Override // org.telegram.ui.Components.ob0
    public void o(qb0 qb0Var, int i7) {
        fx0 fx0Var = this.a;
        fx0Var.b();
        org.telegram.messenger.bz.r1 = i7;
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.bz.r1).apply();
        fx0Var.invalidate();
        try {
            qb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
