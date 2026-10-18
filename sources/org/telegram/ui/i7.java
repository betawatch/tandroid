package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
