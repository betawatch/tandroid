package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class x50 extends co0 {
    @Override // org.telegram.ui.Components.co0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.co0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.co0
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
