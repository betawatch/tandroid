package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class f7 extends rg.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public f7(int i7) {
        this.d = i7;
    }

    public abstract void F();

    @Override // v4.g0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((m7) this.e.get(i7)).a;
    }
}
