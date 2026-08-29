package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import kotlin.jvm.internal.j;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzgd extends i implements p {
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzgd zzgdVar = new zzgd(this.zzd, this.zze, cVar);
        zzgdVar.zzf = obj;
        return zzgdVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgd) create((zzhk) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        if (r14 == r0) goto L39;
     */
    @Override // uc.a
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
        tc.a aVar = tc.a.a;
        int i10 = this.zzc;
        qc.i iVar = qc.i.a;
        try {
            if (i10 == 0) {
                c7.b(obj);
                zzhkVar = (zzhk) this.zzf;
                zzge zzgeVar = this.zzd;
                zzdvVar = zzgeVar.zzb;
                zzdsVar = zzdv.zzb;
                if (!j.a(zzdvVar, zzdsVar)) {
                    zzdvVar2 = zzgeVar.zzb;
                    zzdrVar2 = zzdv.zzd;
                    if (!j.a(zzdvVar2, zzdrVar2)) {
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
                return iVar;
            }
            if (i10 == 1) {
                d = this.zzb;
                zzhkVar = (zzhk) this.zza;
                zzhkVar2 = (zzhk) this.zzf;
                c7.b(obj);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        c7.b(obj);
                        zzge zzgeVar2 = this.zzd;
                        zzdsVar2 = zzdv.zzb;
                        zzgeVar2.zzb = zzdsVar2;
                        return iVar;
                    }
                    zzhkVar3 = (zzhk) this.zzf;
                    c7.b(obj);
                    this.zzf = null;
                    this.zzc = 4;
                    if (((zzhg) obj).zza(zzhkVar3, this) == aVar) {
                        return aVar;
                    }
                    zzge zzgeVar22 = this.zzd;
                    zzdsVar2 = zzdv.zzb;
                    zzgeVar22.zzb = zzdsVar2;
                    return iVar;
                }
                d10 = this.zzb;
                zzhkVar3 = (zzhk) this.zzf;
                c7.b(obj);
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
