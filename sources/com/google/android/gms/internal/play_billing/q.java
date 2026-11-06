package com.google.android.gms.internal.play_billing;

import a8.a9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class q extends r {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ r e;

    public q(r rVar, int i7, int i10) {
        this.e = rVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a9.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean l() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] m() {
        return this.e.m();
    }

    @Override // com.google.android.gms.internal.play_billing.r, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final r subList(int i7, int i10) {
        a9.c(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
