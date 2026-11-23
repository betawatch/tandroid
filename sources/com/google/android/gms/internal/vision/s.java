package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
