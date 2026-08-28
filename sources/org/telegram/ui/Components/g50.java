package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class g50 extends mn0 {
    @Override // org.telegram.ui.Components.mn0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.mn0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.mn0
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

    public abstract void k(int i9);
}
