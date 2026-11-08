package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public enum x implements i1 {
    b(0),
    c(1),
    d(2),
    e(3);

    public final int a;

    x(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + x.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
