package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum s implements i1 {
    b(0),
    c(1),
    d(2),
    e(3);

    public final int a;

    s(int i9) {
        this.a = i9;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + s.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
