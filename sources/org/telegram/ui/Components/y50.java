package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class y50 extends co0 {
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
