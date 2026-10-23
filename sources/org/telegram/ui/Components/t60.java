package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public abstract class t60 extends ep0 {
    @Override // org.telegram.ui.Components.ep0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.ep0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.ep0
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
