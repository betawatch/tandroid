package com.google.android.gms.internal.play_billing;

import a8.a9;
import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class v extends r {
    public static final v e = new v(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public v(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // com.google.android.gms.internal.play_billing.r, com.google.android.gms.internal.play_billing.o
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a9.a(i7, this.d);
        Object obj = this.c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int i() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean l() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] m() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
