package com.google.android.gms.internal.play_billing;

import a8.a9;
import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class z extends r {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public z(int i7, int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
        this.e = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a9.a(i7, this.e);
        Object obj = this.c[i7 + i7 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
