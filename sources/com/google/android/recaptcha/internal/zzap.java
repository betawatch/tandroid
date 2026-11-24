package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzap extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ zzxp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzar zzarVar, zzxp zzxpVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzarVar;
        this.zzc = zzxpVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzap zzapVar = new zzap(this.zzb, this.zzc, px2Var);
        zzapVar.zzd = obj;
        return zzapVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzap) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r5).zza(r0.zza(), r4) != r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r5 != r2) goto L9;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zza;
        ly2 ly2Var = ly2.a;
        if (i == 0) {
            tue.b(obj);
            zzgrVar = (zzgr) this.zzd;
            zzar zzarVar = this.zzb;
            zzxp zzxpVar = this.zzc;
            this.zzd = zzgrVar;
            this.zza = 1;
            obj = zzarVar.zzf(zzxpVar, this);
        } else {
            if (i != 1) {
                tue.b(obj);
                return g7c.a;
            }
            zzgrVar = (zzgr) this.zzd;
            tue.b(obj);
        }
        this.zzd = null;
        this.zza = 2;
    }
}
