package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class e7 extends rg.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public e7(int i7) {
        this.d = i7;
    }

    public abstract void F();

    @Override // v4.i0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((l7) this.e.get(i7)).a;
    }
}
