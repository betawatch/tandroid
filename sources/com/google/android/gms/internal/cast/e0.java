package com.google.android.gms.internal.cast;

import a8.ea;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        ea.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final Object[] o() {
        return this.e.o();
    }

    @Override // com.google.android.gms.internal.cast.f0, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final f0 subList(int i10, int i11) {
        ea.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
