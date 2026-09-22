package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class i60 extends ro0 {
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
