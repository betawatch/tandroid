package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzfu extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzgb zzb;
    final /* synthetic */ long zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfu(zzgb zzgbVar, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzgbVar;
        this.zzc = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzfu zzfuVar = new zzfu(this.zzb, this.zzc, fw2Var);
        zzfuVar.zzd = obj;
        return zzfuVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfu) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r14 != r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r14).zza(r0, r13) != r4) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        if (r14 != r4) goto L12;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzdr zzdrVar;
        zzcg zzcgVar;
        zzdt zzdtVar;
        zzhk zzhkVar;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        try {
            if (i == 0) {
                qse.b(obj);
                zzhkVar = (zzhk) this.zzd;
                zzgb zzgbVar = this.zzb;
                long j = this.zzc;
                this.zzd = zzhkVar;
                this.zza = 1;
                obj = zzgbVar.zzq(j, this);
            } else if (i == 1) {
                zzhkVar = (zzhk) this.zzd;
                qse.b(obj);
            } else {
                if (i != 2) {
                    qse.b(obj);
                    long longValue = this.zzc - ((Number) obj).longValue();
                    if (longValue >= 500) {
                        return new Long(longValue);
                    }
                    throw new zzcg(zzce.zzc, zzcd.zzas, null, null, 12, null);
                }
                qse.b(obj);
                zzgb zzgbVar2 = this.zzb;
                zzft zzftVar = new zzft(this.zzc, zzgbVar2, null);
                this.zza = 3;
                obj = zzgbVar2.zzp(zzftVar, this);
            }
            this.zzd = null;
            this.zza = 2;
        } catch (Exception e) {
            zzcg zzcgVar2 = e instanceof zzcg ? (zzcg) e : null;
            if (zzcgVar2 == null) {
                zzcgVar2 = new zzcg(zzce.zzc, zzcd.zzas, e.getMessage(), null, 8, null);
            }
            zzgb zzgbVar3 = this.zzb;
            zzdv zze = zzgbVar3.zze();
            zzdrVar = zzdv.zzd;
            if (!rp5.a(zze, zzdrVar)) {
                zzdv zze2 = zzgbVar3.zze();
                zzdtVar = zzdv.zzc;
                if (!rp5.a(zze2, zzdtVar)) {
                    throw zzcgVar2;
                }
            }
            zzcgVar = zzgbVar3.zzd;
            if (zzcgVar != null) {
                throw zzcgVar;
            }
            throw zzcgVar2;
        }
    }
}
