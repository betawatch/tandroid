package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class v60 extends dp0 {
    @Override // org.telegram.ui.Components.dp0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.dp0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.dp0
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
