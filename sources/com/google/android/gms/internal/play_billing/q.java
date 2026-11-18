package com.google.android.gms.internal.play_billing;

import a8.c9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        c9.a(i7, this.d);
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
        c9.c(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
