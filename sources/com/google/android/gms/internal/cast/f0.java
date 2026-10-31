package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f0 extends g0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ g0 e;

    public f0(g0 g0Var, int i10, int i11) {
        this.e = g0Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        v7.m5.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final Object[] o() {
        return this.e.o();
    }

    @Override // com.google.android.gms.internal.cast.g0, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final g0 subList(int i10, int i11) {
        v7.m5.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
