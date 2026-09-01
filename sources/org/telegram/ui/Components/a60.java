package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class a60 extends io0 {
    @Override // org.telegram.ui.Components.io0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.io0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.io0
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
