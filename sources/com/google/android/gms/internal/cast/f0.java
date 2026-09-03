package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        j7.v5.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final Object[] p() {
        return this.e.p();
    }

    @Override // com.google.android.gms.internal.cast.g0, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final g0 subList(int i10, int i11) {
        j7.v5.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
