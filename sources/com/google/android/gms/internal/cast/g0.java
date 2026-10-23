package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class g0 extends h0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ h0 e;

    public g0(h0 h0Var, int i10, int i11) {
        this.e = h0Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        v7.l5.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final Object[] o() {
        return this.e.o();
    }

    @Override // com.google.android.gms.internal.cast.h0, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final h0 subList(int i10, int i11) {
        v7.l5.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
