package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class y50 extends ho0 {
    @Override // org.telegram.ui.Components.ho0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.ho0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.ho0
    public final void c(boolean z4) {
        int h = h();
        if (z4) {
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
