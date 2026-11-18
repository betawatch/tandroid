package com.google.android.recaptcha.internal;

import b7.h;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
final class zzed extends j implements p {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j3, c cVar) {
        super(2, cVar);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j3;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzed zzedVar = new zzed(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, cVar);
        zzedVar.zzg = obj;
        return zzedVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzed) create((zzhh) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i7 = this.zza;
        h.b(obj);
        if (i7 != 0) {
            return obj;
        }
        zzhh zzhhVar = (zzhh) this.zzg;
        zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzhhVar, null);
        this.zza = 1;
        Object zza = zzhj.zza(zzhhVar, zzecVar, this);
        return zza == aVar ? aVar : zza;
    }
}
