package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g0 extends h0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ h0 e;

    public g0(h0 h0Var, int i9, int i10) {
        this.e = h0Var;
        this.c = i9;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        f7.l5.a(i9, this.d);
        return this.e.get(i9 + this.c);
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final Object[] p() {
        return this.e.p();
    }

    @Override // com.google.android.gms.internal.cast.h0, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final h0 subList(int i9, int i10) {
        f7.l5.c(i9, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i9 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
