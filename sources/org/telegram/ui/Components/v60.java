package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class v60 extends kp0 {
    @Override // org.telegram.ui.Components.kp0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.kp0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.kp0
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
