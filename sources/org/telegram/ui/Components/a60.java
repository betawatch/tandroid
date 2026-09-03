package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class a60 extends ho0 {
    @Override // org.telegram.ui.Components.ho0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.ho0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.ho0
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
