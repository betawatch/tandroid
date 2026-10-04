package org.telegram.ui.Components;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public abstract class l60 extends vo0 {
    @Override // org.telegram.ui.Components.vo0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.vo0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.vo0
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
