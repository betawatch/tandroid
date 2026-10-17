package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
