package org.telegram.ui.Components;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
