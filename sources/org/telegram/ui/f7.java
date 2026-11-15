package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
