package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzev extends ccb implements qp4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzye zze;
    final /* synthetic */ c59 zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzgr zzgrVar, zzfp zzfpVar, zzye zzyeVar, c59 c59Var, fw2 fw2Var) {
        super(1, fw2Var);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
        this.zze = zzyeVar;
        this.zzf = c59Var;
    }

    @Override // of0
    public final fw2 create(fw2 fw2Var) {
        return new zzev(this.zzc, this.zzd, this.zze, this.zzf, fw2Var);
    }

    @Override // qp4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzev) create((fw2) obj)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r6 != r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r6 != r3) goto L13;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        try {
            if (i == 0) {
                qse.b(obj);
                zzgrVar = this.zzc;
                zzfp zzfpVar = this.zzd;
                zzye zzyeVar = this.zze;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = new zzhf(48, new zzes(zzfpVar, zzyeVar, null), null);
            } else {
                if (i != 1) {
                    qse.b(obj);
                    return (zzyg) obj;
                }
                zzgrVar = (zzgr) this.zza;
                qse.b(obj);
            }
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
        } catch (zzcg e) {
            this.zzf.a = e;
            throw e;
        }
    }
}
