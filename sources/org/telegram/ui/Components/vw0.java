package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vw0 implements eb0, gb0 {
    public final /* synthetic */ xw0 a;

    @Override // org.telegram.ui.Components.eb0
    public String e(int i7) {
        return this.a.n[i7];
    }

    @Override // org.telegram.ui.Components.gb0
    public void m(ib0 ib0Var, int i7) {
        xw0 xw0Var = this.a;
        xw0Var.b();
        org.telegram.messenger.gz.r1 = i7;
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.gz.r1).apply();
        xw0Var.invalidate();
        try {
            ib0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
