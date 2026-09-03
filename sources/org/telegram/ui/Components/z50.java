package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class z50 extends go0 {
    @Override // org.telegram.ui.Components.go0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.go0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.go0
    public final void c(boolean z4) {
        int h = h();
        if (z4) {
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
