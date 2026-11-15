package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class f7 extends rg.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public f7(int i7) {
        this.d = i7;
    }

    public abstract void F();

    @Override // v4.h0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return ((m7) this.e.get(i7)).a;
    }
}
