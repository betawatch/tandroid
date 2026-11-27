package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzap extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ zzxp zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzar zzarVar, zzxp zzxpVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzarVar;
        this.zzc = zzxpVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzap zzapVar = new zzap(this.zzb, this.zzc, zw2Var);
        zzapVar.zzd = obj;
        return zzapVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzap) create((zzgr) obj, (zw2) obj2)).invokeSuspend(f9c.a);
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
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zza;
        vx2 vx2Var = vx2.a;
        if (i == 0) {
            ixe.b(obj);
            zzgrVar = (zzgr) this.zzd;
            zzar zzarVar = this.zzb;
            zzxp zzxpVar = this.zzc;
            this.zzd = zzgrVar;
            this.zza = 1;
            obj = zzarVar.zzf(zzxpVar, this);
        } else {
            if (i != 1) {
                ixe.b(obj);
                return f9c.a;
            }
            zzgrVar = (zzgr) this.zzd;
            ixe.b(obj);
        }
        this.zzd = null;
        this.zza = 2;
    }
}
