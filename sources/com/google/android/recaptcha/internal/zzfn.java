package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzfn extends ccb implements eq4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfn(zzgr zzgrVar, zzfp zzfpVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzfn(this.zzc, this.zzd, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfn) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
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
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zzb;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzgrVar = this.zzc;
            zzfp zzfpVar = this.zzd;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = new zzhg(new zzez(zzfpVar, null));
        } else {
            if (i != 1) {
                qse.b(obj);
                return (zzxn) obj;
            }
            zzgrVar = (zzgr) this.zza;
            qse.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
    }
}
