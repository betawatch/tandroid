package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class u60 extends jp0 {
    @Override // org.telegram.ui.Components.jp0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.jp0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.jp0
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
