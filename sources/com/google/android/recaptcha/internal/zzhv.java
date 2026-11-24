package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzhv extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzib zzb;
    final /* synthetic */ zzxn zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhv(zzib zzibVar, zzxn zzxnVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzibVar;
        this.zzc = zzxnVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzhv zzhvVar = new zzhv(this.zzb, this.zzc, px2Var);
        zzhvVar.zzd = obj;
        return zzhvVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhv) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r8 != r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r8 != r3) goto L13;
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
            if (i == 0) {
                tue.b(obj);
                zzhkVar = (zzhk) this.zzd;
                zzib zzibVar = this.zzb;
                zzxn zzxnVar = this.zzc;
                String zzM = zzxnVar.zzM();
                String zzN = zzxnVar.zzN();
                this.zzd = zzhkVar;
                this.zza = 1;
                obj = new zzhg(new zzhw(zzibVar, zzN, zzM, null));
            } else {
                if (i != 1) {
                    tue.b(obj);
                    return pbb.c(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj);
                }
                zzhkVar = (zzhk) this.zzd;
                tue.b(obj);
            }
            this.zzd = null;
            this.zza = 2;
            obj = ((zzhg) obj).zza(zzhkVar, this);
        } catch (Exception e) {
            if (e instanceof zzcg) {
                throw e;
            }
            throw new zzcg(zzce.zzb, zzcd.zzL, e.getMessage(), null, 8, null);
        }
    }
}
