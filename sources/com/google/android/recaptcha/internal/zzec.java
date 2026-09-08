package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzec extends j implements p {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzhh zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j3, zzhh zzhhVar, c cVar) {
        super(2, cVar);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j3;
        this.zzg = zzhhVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, cVar);
        zzecVar.zzh = obj;
        return zzecVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzec) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                t7.b(obj);
            } else {
                t7.b(obj);
                zzhk zzhkVar = (zzhk) this.zzh;
                zzeb zzebVar = new zzeb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, null);
                this.zza = 1;
                obj = zzhj.zze(zzhkVar, 6, zzebVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzeq) obj;
        } catch (zzcg e7) {
            throw e7.zzc();
        } catch (Exception e10) {
            throw new zzcg(zzce.zzb, zzcd.zza, e10.getMessage(), null, 8, null).zzc();
        }
    }
}
