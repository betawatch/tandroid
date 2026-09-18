package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
