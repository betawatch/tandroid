package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zze extends eeb implements fs4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(zzgr zzgrVar, zzg zzgVar, String str, px2 px2Var) {
        super(2, px2Var);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = str;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zze(this.zzc, this.zzd, this.zze, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r5 != r2) goto L10;
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
            zzg zzgVar = this.zzd;
            String str = this.zze;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = zzgVar.zzb(str, this);
        } else {
            if (i != 1) {
                tue.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zza;
            tue.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza != ly2Var ? zza : ly2Var;
    }
}
