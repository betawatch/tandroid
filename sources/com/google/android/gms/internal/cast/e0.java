package com.google.android.gms.internal.cast;

import a8.n8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e0 extends f0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ f0 e;

    public e0(f0 f0Var, int i7, int i10) {
        this.e = f0Var;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        n8.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final Object[] k() {
        return this.e.k();
    }

    @Override // com.google.android.gms.internal.cast.f0, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final f0 subList(int i7, int i10) {
        n8.c(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
