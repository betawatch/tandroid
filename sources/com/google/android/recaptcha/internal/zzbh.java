package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzbh extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzbo zzc;
    final /* synthetic */ zzhk zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbo zzboVar, zzhk zzhkVar, px2 px2Var) {
        super(2, px2Var);
        this.zzc = zzboVar;
        this.zzd = zzhkVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzbh(this.zzc, this.zzd, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r4).zza(r0, r3) != r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r4 != r2) goto L9;
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
            zzbo zzboVar = this.zzc;
            zzboVar.zzc = zzbp.zza;
            zzhkVar = this.zzd;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzboVar.zze(this);
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
