package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class l50 extends nn0 {
    @Override // org.telegram.ui.Components.nn0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.nn0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.nn0
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
