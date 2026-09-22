package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public enum n implements i1 {
    b(0),
    c(1),
    d(2),
    e(3);

    public final int a;

    n(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + n.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
