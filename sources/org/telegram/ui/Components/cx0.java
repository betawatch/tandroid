package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
