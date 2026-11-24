package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzj extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zzgr zzgrVar, zzg zzgVar, String str, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = str;
        this.zzf = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzj(this.zzc, this.zzd, this.zze, this.zzf, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r10 != r2) goto L10;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            String str = this.zze;
            long j = this.zzf;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = new zzhg(new zzb(zzgVar, str, j, null));
        } else {
            if (i != 1) {
                qse.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zza;
            qse.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza != bx2Var ? zza : bx2Var;
    }
}
