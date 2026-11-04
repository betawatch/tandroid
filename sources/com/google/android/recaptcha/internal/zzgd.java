package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzgd extends j implements p {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzge zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgd(zzge zzgeVar, long j10, c cVar) {
        super(2, cVar);
        this.zzd = zzgeVar;
        this.zze = j10;
    }

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzgd zzgdVar = new zzgd(this.zzd, this.zze, cVar);
        zzgdVar.zzf = obj;
        return zzgdVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgd) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        if (r14 == r0) goto L39;
     */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzdr zzdrVar;
        zzhk zzhkVar;
        zzdv zzdvVar;
        zzds zzdsVar;
        zzdv zzdvVar2;
        zzdr zzdrVar2;
        zzdt zzdtVar;
        zzfp zzfpVar;
        double d;
        zzhk zzhkVar2;
        double d10;
        zzhk zzhkVar3;
        zzfp zzfpVar2;
        zzds zzdsVar2;
        gd.a aVar = gd.a.a;
        int i3 = this.zzc;
        k kVar = k.a;
        try {
            if (i3 == 0) {
                ib.b(obj);
                zzhkVar = (zzhk) this.zzf;
                zzge zzgeVar = this.zzd;
                zzdvVar = zzgeVar.zzb;
                zzdsVar = zzdv.zzb;
                if (!kotlin.jvm.internal.j.a(zzdvVar, zzdsVar)) {
                    zzdvVar2 = zzgeVar.zzb;
                    zzdrVar2 = zzdv.zzd;
                    if (!kotlin.jvm.internal.j.a(zzdvVar2, zzdrVar2)) {
                        zzdtVar = zzdv.zzc;
                        zzgeVar.zzb = zzdtVar;
                        double d11 = this.zze;
                        zzfpVar = zzgeVar.zza;
                        double d12 = 0.6d * d11;
                        this.zzf = zzhkVar;
                        this.zza = zzhkVar;
                        double d13 = d11 * 0.4d;
                        this.zzb = d13;
                        this.zzc = 1;
                        obj = zzfpVar.zzp((long) d12, this);
                        if (obj != aVar) {
                            d = d13;
                            zzhkVar2 = zzhkVar;
                        }
                        return aVar;
                    }
                }
                return kVar;
            }
            if (i3 == 1) {
                d = this.zzb;
                zzhkVar = (zzhk) this.zza;
                zzhkVar2 = (zzhk) this.zzf;
                ib.b(obj);
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        ib.b(obj);
                        zzge zzgeVar2 = this.zzd;
                        zzdsVar2 = zzdv.zzb;
                        zzgeVar2.zzb = zzdsVar2;
                        return kVar;
                    }
                    zzhkVar3 = (zzhk) this.zzf;
                    ib.b(obj);
                    this.zzf = null;
                    this.zzc = 4;
                    if (((zzhg) obj).zza(zzhkVar3, this) == aVar) {
                        return aVar;
                    }
                    zzge zzgeVar22 = this.zzd;
                    zzdsVar2 = zzdv.zzb;
                    zzgeVar22.zzb = zzdsVar2;
                    return kVar;
                }
                d10 = this.zzb;
                zzhkVar3 = (zzhk) this.zzf;
                ib.b(obj);
                zzxn zzxnVar = (zzxn) obj;
                zzge zzgeVar3 = this.zzd;
                zzgeVar3.zzc = zzxnVar;
                zzfpVar2 = zzgeVar3.zza;
                this.zzf = zzhkVar3;
                this.zzc = 3;
                obj = zzfpVar2.zzn(zzxnVar, (long) d10, this);
            }
            this.zzf = zzhkVar2;
            this.zza = null;
            this.zzb = d;
            this.zzc = 2;
            obj = ((zzhf) obj).zza(zzhkVar, this);
            if (obj != aVar) {
                d10 = d;
                zzhkVar3 = zzhkVar2;
                zzxn zzxnVar2 = (zzxn) obj;
                zzge zzgeVar32 = this.zzd;
                zzgeVar32.zzc = zzxnVar2;
                zzfpVar2 = zzgeVar32.zza;
                this.zzf = zzhkVar3;
                this.zzc = 3;
                obj = zzfpVar2.zzn(zzxnVar2, (long) d10, this);
            }
            return aVar;
        } catch (zzcg e10) {
            zzge zzgeVar4 = this.zzd;
            zzdrVar = zzdv.zzd;
            zzgeVar4.zzb = zzdrVar;
            throw e10;
        }
    }
}
