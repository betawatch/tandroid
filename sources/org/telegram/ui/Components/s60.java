package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class s60 extends zo0 {
    @Override // org.telegram.ui.Components.zo0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.zo0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.zo0
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
