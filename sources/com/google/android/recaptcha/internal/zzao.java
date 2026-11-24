package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzao extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzar zzarVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzarVar;
        this.zzc = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzao zzaoVar = new zzao(this.zzb, this.zzc, fw2Var);
        zzaoVar.zzd = obj;
        return zzaoVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
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
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        try {
        } catch (Exception e) {
            zzar zzarVar = this.zzb;
            this.zza = 2;
            obj = zzarVar.zzg(e, this);
        }
        if (i == 0) {
            qse.b(obj);
            zzhk zzhkVar = (zzhk) this.zzd;
            zzar zzarVar2 = this.zzb;
            int zza = zzarVar2.zza();
            zzan zzanVar = new zzan(zzarVar2, this.zzc, null);
            this.zza = 1;
            obj = new zzhf(37, zzanVar, new Integer(zza)).zza(zzhkVar, this);
        } else {
            if (i != 1) {
                qse.b(obj);
                return (zzat) obj;
            }
            qse.b(obj);
        }
        return (zzat) obj;
    }
}
