package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public abstract class f60 extends po0 {
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
