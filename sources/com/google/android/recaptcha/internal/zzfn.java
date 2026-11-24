package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzfn extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfn(zzgr zzgrVar, zzfp zzfpVar, px2 px2Var) {
        super(2, px2Var);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzfn(this.zzc, this.zzd, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfn) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r5 != r3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r5 != r3) goto L9;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zzb;
        ly2 ly2Var = ly2.a;
        if (i == 0) {
            tue.b(obj);
            zzgrVar = this.zzc;
            zzfp zzfpVar = this.zzd;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = new zzhg(new zzez(zzfpVar, null));
        } else {
            if (i != 1) {
                tue.b(obj);
                return (zzxn) obj;
            }
            zzgrVar = (zzgr) this.zza;
            tue.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
    }
}
