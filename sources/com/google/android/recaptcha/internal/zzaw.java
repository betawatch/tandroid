package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzaw extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzba zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(zzhk zzhkVar, zzba zzbaVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzhkVar;
        this.zzd = zzbaVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzaw(this.zzc, this.zzd, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaw) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r6 != r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r6 != r3) goto L13;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzbo zzboVar;
        String str;
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        try {
            if (i == 0) {
                qse.b(obj);
                zzhkVar = this.zzc;
                zzba zzbaVar = this.zzd;
                zzboVar = zzbaVar.zza;
                str = zzbaVar.zzd;
                this.zza = zzhkVar;
                this.zzb = 1;
                obj = new zzhg(new zzbb(zzboVar, str, null));
            } else {
                if (i != 1) {
                    qse.b(obj);
                    zzba zzbaVar2 = this.zzd;
                    zzyu zzf = zzyx.zzf();
                    zzyv zzf2 = zzyw.zzf();
                    zzf2.zzw((String) obj);
                    zzf.zzf((zzyw) zzf2.zzk());
                    return zzas.zzb(zzbaVar2, (zzyx) zzf.zzk());
                }
                zzhkVar = (zzhk) this.zza;
                qse.b(obj);
            }
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhg) obj).zza(zzhkVar, this);
        } catch (Exception e) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e.getMessage(), e);
        }
    }
}
