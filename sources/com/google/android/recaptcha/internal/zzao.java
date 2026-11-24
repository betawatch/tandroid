package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzao extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzar zzarVar, String str, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzarVar;
        this.zzc = str;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzao zzaoVar = new zzao(this.zzb, this.zzc, px2Var);
        zzaoVar.zzd = obj;
        return zzaoVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r8 != r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r8 != r2) goto L17;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ly2 ly2Var = ly2.a;
        try {
        } catch (Exception e) {
            zzar zzarVar = this.zzb;
            this.zza = 2;
            obj = zzarVar.zzg(e, this);
        }
        if (i == 0) {
            tue.b(obj);
            zzhk zzhkVar = (zzhk) this.zzd;
            zzar zzarVar2 = this.zzb;
            int zza = zzarVar2.zza();
            zzan zzanVar = new zzan(zzarVar2, this.zzc, null);
            this.zza = 1;
            obj = new zzhf(37, zzanVar, new Integer(zza)).zza(zzhkVar, this);
        } else {
            if (i != 1) {
                tue.b(obj);
                return (zzat) obj;
            }
            tue.b(obj);
        }
        return (zzat) obj;
    }
}
