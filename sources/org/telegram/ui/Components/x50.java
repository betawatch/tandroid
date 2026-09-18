package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class x50 extends do0 {
    @Override // org.telegram.ui.Components.do0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.do0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.do0
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
