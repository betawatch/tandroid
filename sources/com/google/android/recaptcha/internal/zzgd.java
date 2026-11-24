package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzgd extends ccb implements eq4 {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzge zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgd(zzge zzgeVar, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzd = zzgeVar;
        this.zze = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzgd zzgdVar = new zzgd(this.zzd, this.zze, fw2Var);
        zzgdVar.zzf = obj;
        return zzgdVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgd) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bb, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r14).zza(r0, r13) != r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        if (r14 == r6) goto L35;
     */
    @Override // of0
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
        g5c g5cVar = g5c.a;
        bx2 bx2Var = bx2.a;
        try {
            if (i == 0) {
                qse.b(obj);
                zzhkVar = (zzhk) this.zzf;
                zzge zzgeVar = this.zzd;
                zzdvVar = zzgeVar.zzb;
                zzdsVar = zzdv.zzb;
                if (!rp5.a(zzdvVar, zzdsVar)) {
                    zzdvVar2 = zzgeVar.zzb;
                    zzdrVar2 = zzdv.zzd;
                    if (!rp5.a(zzdvVar2, zzdrVar2)) {
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
                        if (obj != bx2Var) {
                            zzhkVar2 = zzhkVar;
                        }
                        return bx2Var;
                    }
                }
                return g5cVar;
            }
            if (i == 1) {
                d = this.zzb;
                zzhkVar = (zzhk) this.zza;
                zzhkVar2 = (zzhk) this.zzf;
                qse.b(obj);
            } else if (i == 2) {
                d2 = this.zzb;
                zzhkVar3 = (zzhk) this.zzf;
                qse.b(obj);
                zzxn zzxnVar = (zzxn) obj;
                zzge zzgeVar2 = this.zzd;
                zzgeVar2.zzc = zzxnVar;
                zzfpVar2 = zzgeVar2.zza;
                this.zzf = zzhkVar3;
                this.zzc = 3;
                obj = zzfpVar2.zzn(zzxnVar, (long) d2, this);
            } else {
                if (i != 3) {
                    qse.b(obj);
                    zzge zzgeVar3 = this.zzd;
                    zzdsVar2 = zzdv.zzb;
                    zzgeVar3.zzb = zzdsVar2;
                    return g5cVar;
                }
                zzhkVar3 = (zzhk) this.zzf;
                qse.b(obj);
                this.zzf = null;
                this.zzc = 4;
            }
            this.zzf = zzhkVar2;
            this.zza = null;
            this.zzb = d;
            this.zzc = 2;
            obj = ((zzhf) obj).zza(zzhkVar, this);
            if (obj != bx2Var) {
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
            return bx2Var;
        } catch (zzcg e) {
            zzge zzgeVar4 = this.zzd;
            zzdrVar = zzdv.zzd;
            zzgeVar4.zzb = zzdrVar;
            throw e;
        }
    }
}
