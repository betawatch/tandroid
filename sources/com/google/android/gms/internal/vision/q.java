package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public enum q implements i1 {
    b(0),
    c(1),
    d(2);

    public final int a;

    q(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + q.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
