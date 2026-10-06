package org.telegram.ui.Components;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public abstract class l60 extends wo0 {
    @Override // org.telegram.ui.Components.wo0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.wo0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.wo0
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
