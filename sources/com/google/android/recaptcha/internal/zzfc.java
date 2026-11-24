package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzfc extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzxn zze;
    final /* synthetic */ long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfc(zzhk zzhkVar, zzfp zzfpVar, zzxn zzxnVar, long j, px2 px2Var) {
        super(2, px2Var);
        this.zzc = zzhkVar;
        this.zzd = zzfpVar;
        this.zze = zzxnVar;
        this.zzf = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzfc(this.zzc, this.zzd, this.zze, this.zzf, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfc) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r10).zza(r0, r9) != r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r10 != r2) goto L9;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zzb;
        ly2 ly2Var = ly2.a;
        if (i == 0) {
            tue.b(obj);
            zzhkVar = this.zzc;
            zzfp zzfpVar = this.zzd;
            zzxn zzxnVar = this.zze;
            long j = this.zzf;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = new zzhg(new zzfb(zzfpVar, zzxnVar, j, null));
        } else {
            if (i != 1) {
                tue.b(obj);
                return g7c.a;
            }
            zzhkVar = (zzhk) this.zza;
            tue.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
    }
}
