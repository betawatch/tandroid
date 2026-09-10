package com.google.android.gms.internal.play_billing;

import v7.t5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class q extends r {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ r e;

    public q(r rVar, int i10, int i11) {
        this.e = rVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t5.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean q() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] r() {
        return this.e.r();
    }

    @Override // com.google.android.gms.internal.play_billing.r, java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final r subList(int i10, int i11) {
        t5.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
