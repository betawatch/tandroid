package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public enum s implements i1 {
    b(0),
    c(1),
    d(2),
    e(3);

    public final int a;

    s(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + s.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
