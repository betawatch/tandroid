package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzev extends eeb implements rr4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzye zze;
    final /* synthetic */ e79 zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzgr zzgrVar, zzfp zzfpVar, zzye zzyeVar, e79 e79Var, px2 px2Var) {
        super(1, px2Var);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
        this.zze = zzyeVar;
        this.zzf = e79Var;
    }

    @Override // og0
    public final px2 create(px2 px2Var) {
        return new zzev(this.zzc, this.zzd, this.zze, this.zzf, px2Var);
    }

    @Override // rr4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzev) create((px2) obj)).invokeSuspend(g7c.a);
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
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zzb;
        ly2 ly2Var = ly2.a;
        try {
            if (i == 0) {
                tue.b(obj);
                zzgrVar = this.zzc;
                zzfp zzfpVar = this.zzd;
                zzye zzyeVar = this.zze;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = new zzhf(48, new zzes(zzfpVar, zzyeVar, null), null);
            } else {
                if (i != 1) {
                    tue.b(obj);
                    return (zzyg) obj;
                }
                zzgrVar = (zzgr) this.zza;
                tue.b(obj);
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
