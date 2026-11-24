package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzb extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zzg zzgVar, String str, long j, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzb zzbVar = new zzb(this.zzb, this.zzc, this.zzd, px2Var);
        zzbVar.zze = obj;
        return zzbVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r12 != r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r12 != r4) goto L23;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zza;
        ly2 ly2Var = ly2.a;
        try {
        } catch (Exception unused) {
            zzg zzgVar = this.zzb;
            String str = this.zzc;
            this.zze = null;
            this.zza = 3;
            obj = zzgVar.zza(str, this);
        }
        if (i == 0) {
            tue.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzg zzgVar2 = this.zzb;
            String str2 = this.zzc;
            long j = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            zzhf zzhfVar = new zzhf(zzgVar2.zzj(), new zzf(j, zzgVar2, str2, null), null);
            if (zzhfVar != ly2Var) {
                obj = zzhfVar;
            }
            return ly2Var;
        }
        if (i != 1) {
            if (i != 2) {
                tue.b(obj);
                return new tc9(obj);
            }
            tue.b(obj);
            obj = (zzxx) obj;
            return new tc9(obj);
        }
        zzhkVar = (zzhk) this.zze;
        tue.b(obj);
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
