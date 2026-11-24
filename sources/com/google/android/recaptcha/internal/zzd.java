package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzd extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, long j, zzxn zzxnVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzgVar;
        this.zzc = j;
        this.zzd = zzxnVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzd zzdVar = new zzd(this.zzb, this.zzc, this.zzd, px2Var);
        zzdVar.zze = obj;
        return zzdVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r11 != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r11 == r4) goto L22;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        g7c g7cVar = g7c.a;
        ly2 ly2Var = ly2.a;
        try {
        } catch (Exception e) {
            zzg zzgVar = this.zzb;
            zzgVar.zza = false;
            this.zza = 2;
            obj = zzgVar.zzf(e, this);
        }
        if (i == 0) {
            tue.b(obj);
            zzgr zzgrVar = (zzgr) this.zze;
            zzg zzgVar2 = this.zzb;
            if (zzgVar2.zzi()) {
                return g7cVar;
            }
            long j = this.zzc;
            zzc zzcVar = new zzc(zzgrVar, zzgVar2, this.zzd, null);
            this.zza = 1;
            obj = oxe.a(j, zzcVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    tue.b(obj);
                    throw zzcgVar;
                }
                tue.b(obj);
                zzg zzgVar3 = this.zzb;
                zzcg zzcgVar2 = (zzcg) obj;
                this.zze = zzcgVar2;
                this.zza = 3;
                if (zzgVar3.zzc(zzcgVar2, this) != ly2Var) {
                    throw zzcgVar2;
                }
                return ly2Var;
            }
            tue.b(obj);
        }
        tue.b(((tc9) obj).a);
        this.zzb.zza = true;
        return g7cVar;
    }
}
