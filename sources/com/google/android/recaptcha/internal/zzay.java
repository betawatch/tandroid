package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzay extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzba zzb;
    final /* synthetic */ zzxp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(zzba zzbaVar, zzxp zzxpVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzbaVar;
        this.zzc = zzxpVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzay zzayVar = new zzay(this.zzb, this.zzc, zw2Var);
        zzayVar.zzd = obj;
        return zzayVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzay) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
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
    @Override // qf0
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
        vx2 vx2Var = vx2.a;
        if (i == 0) {
            ixe.b(obj);
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
            ixe.b(obj);
            return f9c.a;
        }
        zzhkVar = (zzhk) this.zzd;
        ixe.b(obj);
        this.zzd = null;
        this.zza = 2;
    }
}
