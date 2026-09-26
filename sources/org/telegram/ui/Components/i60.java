package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class i60 extends po0 {
    @Override // org.telegram.ui.Components.po0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.po0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.po0
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
