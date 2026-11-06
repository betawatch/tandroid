package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
final class zzgd extends j implements p {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzge zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgd(zzge zzgeVar, long j3, c cVar) {
        super(2, cVar);
        this.zzd = zzgeVar;
        this.zze = j3;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzgd zzgdVar = new zzgd(this.zzd, this.zze, cVar);
        zzgdVar.zzf = obj;
        return zzgdVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgd) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        if (r14 == r0) goto L39;
     */
    @Override // kd.a
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
        double d2;
        zzhk zzhkVar3;
        zzfp zzfpVar2;
        zzds zzdsVar2;
        jd.a aVar = jd.a.a;
        int i7 = this.zzc;
        k kVar = k.a;
        try {
            if (i7 == 0) {
                b.c(obj);
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
                        double d10 = this.zze;
                        zzfpVar = zzgeVar.zza;
                        double d11 = 0.6d * d10;
                        this.zzf = zzhkVar;
                        this.zza = zzhkVar;
                        double d12 = d10 * 0.4d;
                        this.zzb = d12;
                        this.zzc = 1;
                        obj = zzfpVar.zzp((long) d11, this);
                        if (obj != aVar) {
                            d = d12;
                            zzhkVar2 = zzhkVar;
                        }
                        return aVar;
                    }
                }
                return kVar;
            }
            if (i7 == 1) {
                d = this.zzb;
                zzhkVar = (zzhk) this.zza;
                zzhkVar2 = (zzhk) this.zzf;
                b.c(obj);
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        b.c(obj);
                        zzge zzgeVar2 = this.zzd;
                        zzdsVar2 = zzdv.zzb;
                        zzgeVar2.zzb = zzdsVar2;
                        return kVar;
                    }
                    zzhkVar3 = (zzhk) this.zzf;
                    b.c(obj);
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
                d2 = this.zzb;
                zzhkVar3 = (zzhk) this.zzf;
                b.c(obj);
                zzxn zzxnVar = (zzxn) obj;
                zzge zzgeVar3 = this.zzd;
                zzgeVar3.zzc = zzxnVar;
                zzfpVar2 = zzgeVar3.zza;
                this.zzf = zzhkVar3;
                this.zzc = 3;
                obj = zzfpVar2.zzn(zzxnVar, (long) d2, this);
            }
            this.zzf = zzhkVar2;
            this.zza = null;
            this.zzb = d;
            this.zzc = 2;
            obj = ((zzhf) obj).zza(zzhkVar, this);
            if (obj != aVar) {
                d2 = d;
                zzhkVar3 = zzhkVar2;
                zzxn zzxnVar2 = (zzxn) obj;
                zzge zzgeVar32 = this.zzd;
                zzgeVar32.zzc = zzxnVar2;
                zzfpVar2 = zzgeVar32.zza;
                this.zzf = zzhkVar3;
                this.zzc = 3;
                obj = zzfpVar2.zzn(zzxnVar2, (long) d2, this);
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
