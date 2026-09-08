package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.l;
import rd.p;
import v7.t7;
import zd.c0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzcw extends j implements p {
    int zza;
    final /* synthetic */ l zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(int i10, long j3, long j10, double d, l lVar, c cVar) {
        super(2, cVar);
        this.zzb = lVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzcw(20, 100L, 1000L, 2.0d, this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        t7.b(obj);
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
