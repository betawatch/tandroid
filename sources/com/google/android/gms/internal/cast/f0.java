package com.google.android.gms.internal.cast;

import b8.ba;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f0 extends g0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ g0 e;

    public f0(g0 g0Var, int i3, int i10) {
        this.e = g0Var;
        this.c = i3;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        ba.a(i3, this.d);
        return this.e.get(i3 + this.c);
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final Object[] k() {
        return this.e.k();
    }

    @Override // com.google.android.gms.internal.cast.g0, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final g0 subList(int i3, int i10) {
        ba.c(i3, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i3 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
