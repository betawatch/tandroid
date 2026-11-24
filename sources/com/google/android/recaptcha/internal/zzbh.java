package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzbh extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzbo zzc;
    final /* synthetic */ zzhk zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbo zzboVar, zzhk zzhkVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzboVar;
        this.zzd = zzhkVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzbh(this.zzc, this.zzd, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r4).zza(r0, r3) != r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r4 != r2) goto L9;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzbo zzboVar = this.zzc;
            zzboVar.zzc = zzbp.zza;
            zzhkVar = this.zzd;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzboVar.zze(this);
        } else {
            if (i != 1) {
                qse.b(obj);
                return g5c.a;
            }
            zzhkVar = (zzhk) this.zza;
            qse.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
    }
}
