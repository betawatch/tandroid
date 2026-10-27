package com.google.android.gms.internal.play_billing;

import a8.oa;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        oa.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean p() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] q() {
        return this.e.q();
    }

    @Override // com.google.android.gms.internal.play_billing.r, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final r subList(int i10, int i11) {
        oa.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
