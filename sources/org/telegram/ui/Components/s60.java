package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public abstract class s60 extends ap0 {
    @Override // org.telegram.ui.Components.ap0
    public final boolean a() {
        return j() > 0;
    }

    @Override // org.telegram.ui.Components.ap0
    public final boolean b() {
        return j() < i();
    }

    @Override // org.telegram.ui.Components.ap0
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
