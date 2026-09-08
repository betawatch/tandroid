package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
