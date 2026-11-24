package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzf extends eeb implements fs4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzg zzc;
    final /* synthetic */ String zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(long j, zzg zzgVar, String str, px2 px2Var) {
        super(2, px2Var);
        this.zzb = j;
        this.zzc = zzgVar;
        this.zzd = str;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, px2Var);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r0 != r6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        return r6;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        int i = this.zza;
        ly2 ly2Var = ly2.a;
        try {
            if (i == 0) {
                tue.b(obj);
                zzgr zzgrVar = (zzgr) this.zze;
                long j = this.zzb;
                zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
                this.zza = 1;
                a = oxe.a(j, zzeVar, this);
            } else {
                if (i != 1) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    tue.b(obj);
                    throw zzcgVar;
                }
                tue.b(obj);
                a = obj;
            }
            Object obj2 = ((tc9) a).a;
            tue.b(obj2);
            return (zzxx) obj2;
        } catch (Exception e) {
            zzcg zza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzaa, e.getMessage(), null, 8, null));
            zzg zzgVar = this.zzc;
            String str = this.zzd;
            long j2 = this.zzb;
            this.zze = zza;
            this.zza = 2;
            if (zzgVar.zze(str, j2, e, this) != ly2Var) {
                throw zza;
            }
        }
    }
}
