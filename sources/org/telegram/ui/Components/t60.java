package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class t60 extends ep0 {
    @Override // org.telegram.ui.Components.ep0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.ep0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.ep0
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
