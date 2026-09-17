package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class i0 extends j0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ j0 e;

    public i0(j0 j0Var, int i10, int i11) {
        this.e = j0Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        v7.j5.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // com.google.android.gms.internal.cast.g0
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.cast.g0
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // com.google.android.gms.internal.cast.g0
    public final Object[] p() {
        return this.e.p();
    }

    @Override // com.google.android.gms.internal.cast.j0, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final j0 subList(int i10, int i11) {
        v7.j5.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
