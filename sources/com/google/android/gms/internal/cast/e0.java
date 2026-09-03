package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e0 extends f0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ f0 e;

    public e0(f0 f0Var, int i10, int i11) {
        this.e = f0Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j7.t5.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final Object[] p() {
        return this.e.p();
    }

    @Override // com.google.android.gms.internal.cast.f0, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final f0 subList(int i10, int i11) {
        j7.t5.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
