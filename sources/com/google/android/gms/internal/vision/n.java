package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
