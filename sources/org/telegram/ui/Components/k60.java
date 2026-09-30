package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public abstract class k60 extends ro0 {
    @Override // org.telegram.ui.Components.ro0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.ro0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.ro0
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
