package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class z60 extends hp0 {
    @Override // org.telegram.ui.Components.hp0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.hp0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.hp0
    public final void c(boolean z10) {
        int h = h();
        if (z10) {
            h *= -1;
        }
        k(Math.min(i(), Math.max(0, j() + h)));
    }

    public int h() {
        return 1;
    }

    public abstract int i();

    public abstract int j();

    public abstract void k(int i10);
}
