package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzan extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzar zzarVar, String str, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzarVar;
        this.zzc = str;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzan zzanVar = new zzan(this.zzb, this.zzc, px2Var);
        zzanVar.zzd = obj;
        return zzanVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r5 != r2) goto L10;
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
            String str = this.zzc;
            this.zzd = zzgrVar;
            this.zza = 1;
            obj = zzarVar.zze(str, this);
        } else {
            if (i != 1) {
                tue.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zzd;
            tue.b(obj);
        }
        this.zzd = null;
        this.zza = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza != ly2Var ? zza : ly2Var;
    }
}
