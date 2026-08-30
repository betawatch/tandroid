package com.google.android.recaptcha.internal;

import dd.l;
import dd.p;
import k7.p7;
import ld.c0;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class zzcw extends i implements p {
    int zza;
    final /* synthetic */ l zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(int i10, long j10, long j11, double d, l lVar, c cVar) {
        super(2, cVar);
        this.zzb = lVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzcw(20, 100L, 1000L, 2.0d, this.zzb, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        p7.b(obj);
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
