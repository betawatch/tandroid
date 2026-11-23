package com.google.android.recaptcha.internal;

import b7.h;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.l;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
final class zzcw extends j implements p {
    int zza;
    final /* synthetic */ l zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(int i7, long j3, long j10, double d, l lVar, c cVar) {
        super(2, cVar);
        this.zzb = lVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzcw(20, 100L, 1000L, 2.0d, this.zzb, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i7 = this.zza;
        h.b(obj);
        if (i7 != 0) {
            return obj;
        }
        l lVar = this.zzb;
        zzcx zzcxVar = zzcx.zza;
        this.zza = 1;
        Object zza = zzcxVar.zza(20, 100L, 1000L, 2.0d, lVar, this);
        return zza == aVar ? aVar : zza;
    }
}
