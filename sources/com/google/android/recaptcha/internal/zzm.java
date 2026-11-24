package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzm extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzxn zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzgr zzgrVar, zzg zzgVar, long j, zzxn zzxnVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = j;
        this.zzf = zzxnVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzm(this.zzc, this.zzd, this.zze, this.zzf, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzm) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhf) r11).zza(r0.zza(), r10) != r3) goto L16;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object sa9Var;
        zzgr zzgrVar;
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        try {
        } catch (zzcg e) {
            sa9Var = new sa9(e);
        }
        if (i == 0) {
            qse.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            long j = this.zze;
            zzxn zzxnVar = this.zzf;
            this.zza = zzgrVar;
            this.zzb = 1;
            zzhf zzhfVar = new zzhf(zzgVar.zzk(), new zzd(zzgVar, j, zzxnVar, null), null);
            if (zzhfVar != bx2Var) {
                obj = zzhfVar;
            }
            return bx2Var;
        }
        if (i != 1) {
            qse.b(obj);
            sa9Var = g5c.a;
            return new ta9(sa9Var);
        }
        zzgrVar = (zzgr) this.zza;
        qse.b(obj);
        this.zza = null;
        this.zzb = 2;
    }
}
