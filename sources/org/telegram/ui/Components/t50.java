package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class t50 extends xn0 {
    @Override // org.telegram.ui.Components.xn0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.xn0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.xn0
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
