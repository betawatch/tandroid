package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class x50 extends co0 {
    @Override // org.telegram.ui.Components.co0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.co0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.co0
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
