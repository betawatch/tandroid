package com.google.android.gms.internal.play_billing;

import h7.c6;
import j$.util.Objects;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v extends r {
    public static final v e = new v(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public v(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c6.a(i10, this.d);
        Object obj = this.c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.r, com.google.android.gms.internal.play_billing.o
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int n() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean q() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] r() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
