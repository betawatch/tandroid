package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzfu extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzgb zzb;
    final /* synthetic */ long zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfu(zzgb zzgbVar, long j, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzgbVar;
        this.zzc = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzfu zzfuVar = new zzfu(this.zzb, this.zzc, px2Var);
        zzfuVar.zzd = obj;
        return zzfuVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfu) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
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
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzdr zzdrVar;
        zzcg zzcgVar;
        zzdt zzdtVar;
        zzhk zzhkVar;
        int i = this.zza;
        ly2 ly2Var = ly2.a;
        try {
            if (i == 0) {
                tue.b(obj);
                zzhkVar = (zzhk) this.zzd;
                zzgb zzgbVar = this.zzb;
                long j = this.zzc;
                this.zzd = zzhkVar;
                this.zza = 1;
                obj = zzgbVar.zzq(j, this);
            } else if (i == 1) {
                zzhkVar = (zzhk) this.zzd;
                tue.b(obj);
            } else {
                if (i != 2) {
                    tue.b(obj);
                    long longValue = this.zzc - ((Number) obj).longValue();
                    if (longValue >= 500) {
                        return new Long(longValue);
                    }
                    throw new zzcg(zzce.zzc, zzcd.zzas, null, null, 12, null);
                }
                tue.b(obj);
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
            if (!rr5.a(zze, zzdrVar)) {
                zzdv zze2 = zzgbVar3.zze();
                zzdtVar = zzdv.zzc;
                if (!rr5.a(zze2, zzdtVar)) {
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
