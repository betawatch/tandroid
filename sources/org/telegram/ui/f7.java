package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class f7 extends hg.c {
    public final int d;
    public final ArrayList e = new ArrayList();

    public f7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override // s4.g0
    public final int b() {
        return this.e.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((m7) this.e.get(i10)).a;
    }
}
