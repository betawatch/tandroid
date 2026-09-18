package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public abstract class g60 extends qo0 {
    @Override // org.telegram.ui.Components.qo0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.qo0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.qo0
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
