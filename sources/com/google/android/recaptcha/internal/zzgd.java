package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzgd extends eeb implements fs4 {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzge zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgd(zzge zzgeVar, long j, px2 px2Var) {
        super(2, px2Var);
        this.zzd = zzgeVar;
        this.zze = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzgd zzgdVar = new zzgd(this.zzd, this.zze, px2Var);
        zzgdVar.zzf = obj;
        return zzgdVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgd) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bb, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r14).zza(r0, r13) != r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        if (r14 == r6) goto L35;
     */
    @Override // og0
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
        zzhk zzhkVar3;
        double d2;
        zzfp zzfpVar2;
        zzds zzdsVar2;
        int i = this.zzc;
        g7c g7cVar = g7c.a;
        ly2 ly2Var = ly2.a;
        try {
            if (i == 0) {
                tue.b(obj);
                zzhkVar = (zzhk) this.zzf;
                zzge zzgeVar = this.zzd;
                zzdvVar = zzgeVar.zzb;
                zzdsVar = zzdv.zzb;
                if (!rr5.a(zzdvVar, zzdsVar)) {
                    zzdvVar2 = zzgeVar.zzb;
                    zzdrVar2 = zzdv.zzd;
                    if (!rr5.a(zzdvVar2, zzdrVar2)) {
                        zzdtVar = zzdv.zzc;
                        zzgeVar.zzb = zzdtVar;
                        double d3 = this.zze;
                        zzfpVar = zzgeVar.zza;
                        double d4 = 0.6d * d3;
                        this.zzf = zzhkVar;
                        this.zza = zzhkVar;
                        d = d3 * 0.4d;
                        this.zzb = d;
                        this.zzc = 1;
                        obj = zzfpVar.zzp((long) d4, this);
                        if (obj != ly2Var) {
                            zzhkVar2 = zzhkVar;
                        }
                        return ly2Var;
                    }
                }
                return g7cVar;
            }
            if (i == 1) {
                d = this.zzb;
                zzhkVar = (zzhk) this.zza;
                zzhkVar2 = (zzhk) this.zzf;
                tue.b(obj);
            } else if (i == 2) {
                d2 = this.zzb;
                zzhkVar3 = (zzhk) this.zzf;
                tue.b(obj);
                zzxn zzxnVar = (zzxn) obj;
                zzge zzgeVar2 = this.zzd;
                zzgeVar2.zzc = zzxnVar;
                zzfpVar2 = zzgeVar2.zza;
                this.zzf = zzhkVar3;
                this.zzc = 3;
                obj = zzfpVar2.zzn(zzxnVar, (long) d2, this);
            } else {
                if (i != 3) {
                    tue.b(obj);
                    zzge zzgeVar3 = this.zzd;
                    zzdsVar2 = zzdv.zzb;
                    zzgeVar3.zzb = zzdsVar2;
                    return g7cVar;
                }
                zzhkVar3 = (zzhk) this.zzf;
                tue.b(obj);
                this.zzf = null;
                this.zzc = 4;
            }
            this.zzf = zzhkVar2;
            this.zza = null;
            this.zzb = d;
            this.zzc = 2;
            obj = ((zzhf) obj).zza(zzhkVar, this);
            if (obj != ly2Var) {
                zzhkVar3 = zzhkVar2;
                d2 = d;
                zzxn zzxnVar2 = (zzxn) obj;
                zzge zzgeVar22 = this.zzd;
                zzgeVar22.zzc = zzxnVar2;
                zzfpVar2 = zzgeVar22.zza;
                this.zzf = zzhkVar3;
                this.zzc = 3;
                obj = zzfpVar2.zzn(zzxnVar2, (long) d2, this);
            }
            return ly2Var;
        } catch (zzcg e) {
            zzge zzgeVar4 = this.zzd;
            zzdrVar = zzdv.zzd;
            zzgeVar4.zzb = zzdrVar;
            throw e;
        }
    }
}
