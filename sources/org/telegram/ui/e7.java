package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class e7 extends og.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public e7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override // s4.i0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.i0
    public final int j(int i10) {
        return ((l7) this.e.get(i10)).a;
    }
}
