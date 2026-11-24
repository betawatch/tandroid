package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzbb extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzbo zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(zzbo zzboVar, String str, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzboVar;
        this.zzc = str;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzbb zzbbVar = new zzbb(this.zzb, this.zzc, px2Var);
        zzbbVar.zzd = obj;
        return zzbbVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbb) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        return (java.lang.String) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r7).zza(r0, r6) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        if (r7 != r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r7 == r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r0 != 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        r7 = r6.zzb;
        r0 = r6.zzc;
        r6.zza = 4;
        r7 = r7.zzm(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        if (r7 == r4) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object obj2 = this.zza;
        ly2 ly2Var = ly2.a;
        try {
        } catch (Exception unused) {
            zzbo zzboVar = this.zzb;
            this.zzd = obj2;
            this.zza = 2;
            obj = zzboVar.zze(this);
            zzhkVar = obj2;
        }
        if (obj2 == 0) {
            tue.b(obj);
            zzhk zzhkVar2 = (zzhk) this.zzd;
            zzbo zzboVar2 = this.zzb;
            String str = this.zzc;
            this.zzd = zzhkVar2;
            this.zza = 1;
            obj = zzboVar2.zzm(str, this);
            obj2 = zzhkVar2;
        } else if (obj2 == 1) {
            zzhk zzhkVar3 = (zzhk) this.zzd;
            tue.b(obj);
            obj2 = zzhkVar3;
        } else if (obj2 != 2) {
            tue.b(obj);
        } else {
            zzhk zzhkVar4 = (zzhk) this.zzd;
            tue.b(obj);
            zzhkVar = zzhkVar4;
            this.zzd = null;
            this.zza = 3;
        }
        return (String) obj;
    }
}
