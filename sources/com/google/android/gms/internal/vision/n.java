package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
