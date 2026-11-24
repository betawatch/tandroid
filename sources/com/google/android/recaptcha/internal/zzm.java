package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzm extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzxn zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzgr zzgrVar, zzg zzgVar, long j, zzxn zzxnVar, px2 px2Var) {
        super(2, px2Var);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = j;
        this.zzf = zzxnVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzm(this.zzc, this.zzd, this.zze, this.zzf, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzm) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhf) r11).zza(r0.zza(), r10) != r3) goto L16;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object sc9Var;
        zzgr zzgrVar;
        int i = this.zzb;
        ly2 ly2Var = ly2.a;
        try {
        } catch (zzcg e) {
            sc9Var = new sc9(e);
        }
        if (i == 0) {
            tue.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            long j = this.zze;
            zzxn zzxnVar = this.zzf;
            this.zza = zzgrVar;
            this.zzb = 1;
            zzhf zzhfVar = new zzhf(zzgVar.zzk(), new zzd(zzgVar, j, zzxnVar, null), null);
            if (zzhfVar != ly2Var) {
                obj = zzhfVar;
            }
            return ly2Var;
        }
        if (i != 1) {
            tue.b(obj);
            sc9Var = g7c.a;
            return new tc9(sc9Var);
        }
        zzgrVar = (zzgr) this.zza;
        tue.b(obj);
        this.zza = null;
        this.zzb = 2;
    }
}
