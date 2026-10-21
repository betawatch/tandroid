package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public abstract class s60 extends ap0 {
    @Override // org.telegram.ui.Components.ap0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.ap0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.ap0
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
