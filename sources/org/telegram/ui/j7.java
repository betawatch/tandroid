package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class j7 extends qg.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public j7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override // s4.h0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((q7) this.e.get(i10)).a;
    }
}
