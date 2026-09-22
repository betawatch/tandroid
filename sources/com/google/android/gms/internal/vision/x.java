package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public enum x implements i1 {
    b(0),
    c(1),
    d(2),
    e(3);

    public final int a;

    x(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + x.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
