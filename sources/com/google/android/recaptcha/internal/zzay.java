package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzay extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzba zzb;
    final /* synthetic */ zzxp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(zzba zzbaVar, zzxp zzxpVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzbaVar;
        this.zzc = zzxpVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzay zzayVar = new zzay(this.zzb, this.zzc, px2Var);
        zzayVar.zzd = obj;
        return zzayVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzay) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r9).zza(r0, r8) != r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r9 != r2) goto L13;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzda zzdaVar;
        String zzp;
        zzbo zzboVar;
        zzbo zzboVar2;
        int i = this.zza;
        ly2 ly2Var = ly2.a;
        if (i == 0) {
            tue.b(obj);
            zzhkVar = (zzhk) this.zzd;
            zzba zzbaVar = this.zzb;
            zzdaVar = zzbaVar.zzb;
            if (zzdaVar.zzb(zzba.zzb(zzbaVar))) {
                zzxp zzxpVar = this.zzc;
                if (zzxpVar.zzf() != 0) {
                    zzp = zzba.zzp(zzxpVar.zzg());
                    zzbaVar.zzd = zzp;
                    zzboVar = zzbaVar.zza;
                    zzboVar.zzj(zzxpVar.zzf());
                    zzboVar2 = zzbaVar.zza;
                    this.zzd = zzhkVar;
                    this.zza = 1;
                    obj = zzboVar2.zze(this);
                }
            }
            zzbaVar.zzo(false);
            throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
        }
        if (i != 1) {
            tue.b(obj);
            return g7c.a;
        }
        zzhkVar = (zzhk) this.zzd;
        tue.b(obj);
        this.zzd = null;
        this.zza = 2;
    }
}
