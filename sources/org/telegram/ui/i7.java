package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class i7 extends pg.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public i7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override // s4.g0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((p7) this.e.get(i10)).a;
    }
}
