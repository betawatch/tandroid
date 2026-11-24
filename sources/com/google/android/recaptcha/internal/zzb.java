package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzb extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zzg zzgVar, String str, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzb zzbVar = new zzb(this.zzb, this.zzc, this.zzd, fw2Var);
        zzbVar.zze = obj;
        return zzbVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r12 != r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r12 != r4) goto L23;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        try {
        } catch (Exception unused) {
            zzg zzgVar = this.zzb;
            String str = this.zzc;
            this.zze = null;
            this.zza = 3;
            obj = zzgVar.zza(str, this);
        }
        if (i == 0) {
            qse.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzg zzgVar2 = this.zzb;
            String str2 = this.zzc;
            long j = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            zzhf zzhfVar = new zzhf(zzgVar2.zzj(), new zzf(j, zzgVar2, str2, null), null);
            if (zzhfVar != bx2Var) {
                obj = zzhfVar;
            }
            return bx2Var;
        }
        if (i != 1) {
            if (i != 2) {
                qse.b(obj);
                return new ta9(obj);
            }
            qse.b(obj);
            obj = (zzxx) obj;
            return new ta9(obj);
        }
        zzhkVar = (zzhk) this.zze;
        qse.b(obj);
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
