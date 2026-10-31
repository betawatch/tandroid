package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.l;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzcw extends j implements p {
    int zza;
    final /* synthetic */ l zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(int i10, long j10, long j11, double d, l lVar, c cVar) {
        super(2, cVar);
        this.zzb = lVar;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzcw(20, 100L, 1000L, 2.0d, this.zzb, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        b.b(obj);
        if (i10 != 0) {
            return obj;
        }
        l lVar = this.zzb;
        zzcx zzcxVar = zzcx.zza;
        this.zza = 1;
        Object zza = zzcxVar.zza(20, 100L, 1000L, 2.0d, lVar, this);
        return zza == aVar ? aVar : zza;
    }
}
