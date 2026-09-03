package com.google.android.recaptcha.internal;

import dd.p;
import k7.q7;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzee extends i implements p {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzhh zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzeh zzehVar, long j10, zzdw zzdwVar, String str, zzhh zzhhVar, c cVar) {
        super(2, cVar);
        this.zzb = zzehVar;
        this.zzc = j10;
        this.zzd = zzdwVar;
        this.zze = str;
        this.zzf = zzhhVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzee zzeeVar = new zzee(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, cVar);
        zzeeVar.zzg = obj;
        return zzeeVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzee) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r8 != r0) goto L17;
     */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        a aVar = a.a;
        int i10 = this.zza;
        try {
            if (i10 == 0) {
                q7.b(obj);
                zzhkVar = (zzhk) this.zzg;
                zzeh zzehVar = this.zzb;
                long j10 = this.zzc;
                zzeh.zzf(zzehVar, j10);
                zzdw zzdwVar = this.zzd;
                this.zzg = zzhkVar;
                this.zza = 1;
                obj = zzdwVar.zzb(j10, this);
            } else {
                if (i10 != 1) {
                    q7.b(obj);
                    zzeq zzeqVar = new zzeq(this.zzd, this.zze, this.zzf);
                    this.zzb.zzc = zzeqVar;
                    return zzeqVar;
                }
                zzhkVar = (zzhk) this.zzg;
                q7.b(obj);
            }
            this.zzg = null;
            this.zza = 2;
            if (((zzhg) obj).zza(zzhkVar, this) == aVar) {
                return aVar;
            }
            zzeq zzeqVar2 = new zzeq(this.zzd, this.zze, this.zzf);
            this.zzb.zzc = zzeqVar2;
            return zzeqVar2;
        } catch (zzcg e6) {
            throw e6;
        } catch (Exception e10) {
            throw new zzcg(zzce.zzb, zzcd.zza, e10.getMessage(), null, 8, null);
        }
    }
}
