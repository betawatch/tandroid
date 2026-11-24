package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzer extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzye zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzfp zzfpVar, zzye zzyeVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzfpVar;
        this.zzc = zzyeVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzer(this.zzb, this.zzc, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        try {
            if (this.zza != 0) {
                qse.b(obj);
            } else {
                qse.b(obj);
                zzfp zzfpVar = this.zzb;
                zzif zzj = zzfp.zzj(zzfpVar);
                zzcy zzg = zzfp.zzg(zzfpVar);
                zzye zzyeVar = this.zzc;
                this.zza = 1;
                obj = zzj.zzb(zzg, zzyeVar, this);
                bx2 bx2Var = bx2.a;
                if (obj == bx2Var) {
                    return bx2Var;
                }
            }
            return (zzyg) obj;
        } catch (Exception e) {
            throw zzfp.zzd(this.zzb, e);
        }
    }
}
