package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class g60 extends lo0 {
    @Override // org.telegram.ui.Components.lo0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.lo0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.lo0
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
