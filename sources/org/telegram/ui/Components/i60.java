package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
