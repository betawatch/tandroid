package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.l;
import v7.t7;
import zd.s;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzfy extends j implements l {
    int zza;
    final /* synthetic */ zzhk zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ s zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzhk zzhkVar, zzgb zzgbVar, long j3, s sVar, c cVar) {
        super(1, cVar);
        this.zzb = zzhkVar;
        this.zzc = zzgbVar;
        this.zzd = j3;
        this.zze = sVar;
    }

    @Override // kd.a
    public final c create(c cVar) {
        return new zzfy(this.zzb, this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // rd.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzfy) create((c) obj)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        t7.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzhk zzhkVar = this.zzb;
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, null);
        this.zza = 1;
        Object zze = zzhj.zze(zzhkVar, 41, zzfxVar, this);
        return zze == aVar ? aVar : zze;
    }
}
