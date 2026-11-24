package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzd extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, long j, zzxn zzxnVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzgVar;
        this.zzc = j;
        this.zzd = zzxnVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzd zzdVar = new zzd(this.zzb, this.zzc, this.zzd, fw2Var);
        zzdVar.zze = obj;
        return zzdVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r11 != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r11 == r4) goto L22;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        g5c g5cVar = g5c.a;
        bx2 bx2Var = bx2.a;
        try {
        } catch (Exception e) {
            zzg zzgVar = this.zzb;
            zzgVar.zza = false;
            this.zza = 2;
            obj = zzgVar.zzf(e, this);
        }
        if (i == 0) {
            qse.b(obj);
            zzgr zzgrVar = (zzgr) this.zze;
            zzg zzgVar2 = this.zzb;
            if (zzgVar2.zzi()) {
                return g5cVar;
            }
            long j = this.zzc;
            zzc zzcVar = new zzc(zzgrVar, zzgVar2, this.zzd, null);
            this.zza = 1;
            obj = mve.a(j, zzcVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    qse.b(obj);
                    throw zzcgVar;
                }
                qse.b(obj);
                zzg zzgVar3 = this.zzb;
                zzcg zzcgVar2 = (zzcg) obj;
                this.zze = zzcgVar2;
                this.zza = 3;
                if (zzgVar3.zzc(zzcgVar2, this) != bx2Var) {
                    throw zzcgVar2;
                }
                return bx2Var;
            }
            qse.b(obj);
        }
        qse.b(((ta9) obj).a);
        this.zzb.zza = true;
        return g5cVar;
    }
}
