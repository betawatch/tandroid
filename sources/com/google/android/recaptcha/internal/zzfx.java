package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzfx extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ bp2 zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfx(zzgb zzgbVar, long j, bp2 bp2Var, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzgbVar;
        this.zzd = j;
        this.zze = bp2Var;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, fw2Var);
        zzfxVar.zzf = obj;
        return zzfxVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfx) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r9).zza(r0.zza(), r8) != r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r9 == r5) goto L32;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        zzfp zzfpVar;
        zzgr zzgrVar2;
        zzgr zzgrVar3;
        zzfp zzfpVar2;
        zzds zzdsVar;
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        try {
            if (i == 0) {
                qse.b(obj);
                zzgrVar = (zzgr) this.zzf;
                zzfpVar = this.zzc.zza;
                long j = this.zzd;
                this.zzf = zzgrVar;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = zzfpVar.zzp(j, this);
                if (obj != bx2Var) {
                    zzgrVar2 = zzgrVar;
                }
                return bx2Var;
            }
            if (i == 1) {
                zzgrVar = (zzgr) this.zza;
                zzgrVar2 = (zzgr) this.zzf;
                qse.b(obj);
            } else if (i == 2) {
                zzgrVar3 = (zzgr) this.zzf;
                qse.b(obj);
                zzxn zzxnVar = (zzxn) obj;
                zzgb zzgbVar = this.zzc;
                zzgbVar.zze = zzxnVar;
                zzfpVar2 = zzgbVar.zza;
                long j2 = this.zzd;
                this.zzf = zzgrVar3;
                this.zzb = 3;
                obj = zzfpVar2.zzn(zzxnVar, j2, this);
            } else {
                if (i != 3) {
                    qse.b(obj);
                    zzgb zzgbVar2 = this.zzc;
                    zzdsVar = zzdv.zzb;
                    zzgbVar2.zzf = zzdsVar;
                    return Boolean.valueOf(((cp2) this.zze).B(g5c.a));
                }
                zzgrVar3 = (zzgr) this.zzf;
                qse.b(obj);
                this.zzf = null;
                this.zzb = 4;
            }
            this.zzf = zzgrVar2;
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj != bx2Var) {
                zzgrVar3 = zzgrVar2;
                zzxn zzxnVar2 = (zzxn) obj;
                zzgb zzgbVar3 = this.zzc;
                zzgbVar3.zze = zzxnVar2;
                zzfpVar2 = zzgbVar3.zza;
                long j22 = this.zzd;
                this.zzf = zzgrVar3;
                this.zzb = 3;
                obj = zzfpVar2.zzn(zzxnVar2, j22, this);
            }
            return bx2Var;
        } catch (zzcg e) {
            this.zzc.zzd = e;
            throw e;
        }
    }
}
