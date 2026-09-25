package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public abstract class i60 extends po0 {
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
