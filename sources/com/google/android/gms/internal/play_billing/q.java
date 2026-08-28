package com.google.android.gms.internal.play_billing;

import f7.v5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends r {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ r e;

    public q(r rVar, int i9, int i10) {
        this.e = rVar;
        this.c = i9;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        v5.a(i9, this.d);
        return this.e.get(i9 + this.c);
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
    public final r subList(int i9, int i10) {
        v5.c(i9, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i9 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
