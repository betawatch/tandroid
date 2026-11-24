package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzfc extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzxn zze;
    final /* synthetic */ long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfc(zzhk zzhkVar, zzfp zzfpVar, zzxn zzxnVar, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzhkVar;
        this.zzd = zzfpVar;
        this.zze = zzxnVar;
        this.zzf = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzfc(this.zzc, this.zzd, this.zze, this.zzf, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfc) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r10).zza(r0, r9) != r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r10 != r2) goto L9;
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
            zzhkVar = this.zzc;
            zzfp zzfpVar = this.zzd;
            zzxn zzxnVar = this.zze;
            long j = this.zzf;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = new zzhg(new zzfb(zzfpVar, zzxnVar, j, null));
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
