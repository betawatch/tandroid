package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public enum q implements i1 {
    b(0),
    c(1),
    d(2);

    public final int a;

    q(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + q.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
