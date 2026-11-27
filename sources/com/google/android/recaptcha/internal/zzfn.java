package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzfn extends yfb implements is4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfn(zzgr zzgrVar, zzfp zzfpVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzfn(this.zzc, this.zzd, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfn) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
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
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zzb;
        vx2 vx2Var = vx2.a;
        if (i == 0) {
            ixe.b(obj);
            zzgrVar = this.zzc;
            zzfp zzfpVar = this.zzd;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = new zzhg(new zzez(zzfpVar, null));
        } else {
            if (i != 1) {
                ixe.b(obj);
                return (zzxn) obj;
            }
            zzgrVar = (zzgr) this.zza;
            ixe.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
    }
}
