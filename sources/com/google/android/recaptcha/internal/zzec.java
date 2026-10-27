package com.google.android.recaptcha.internal;

import a8.jd;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzec extends i implements p {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzhh zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j10, zzhh zzhhVar, c cVar) {
        super(2, cVar);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j10;
        this.zzg = zzhhVar;
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, cVar);
        zzecVar.zzh = obj;
        return zzecVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzec) create((zzhk) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        try {
            if (this.zza != 0) {
                jd.b(obj);
            } else {
                jd.b(obj);
                zzhk zzhkVar = (zzhk) this.zzh;
                zzeb zzebVar = new zzeb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, null);
                this.zza = 1;
                obj = zzhj.zze(zzhkVar, 6, zzebVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzeq) obj;
        } catch (zzcg e) {
            throw e.zzc();
        } catch (Exception e10) {
            throw new zzcg(zzce.zzb, zzcd.zza, e10.getMessage(), null, 8, null).zzc();
        }
    }
}
