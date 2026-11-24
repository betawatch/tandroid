package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzll extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzxn zzb;
    final /* synthetic */ zzly zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzll(zzxn zzxnVar, zzly zzlyVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzxnVar;
        this.zzc = zzlyVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzll zzllVar = new zzll(this.zzb, this.zzc, fw2Var);
        zzllVar.zzd = obj;
        return zzllVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzll) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r12).zza(r0, r11) != r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r12 != r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r12.zzc(r0, r11) != r3) goto L22;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object sa9Var;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzhkVar = (zzhk) this.zzd;
            zzxn zzxnVar = this.zzb;
            if (zzxnVar.zzV() && zzxnVar.zzT() && zzxnVar.zzS()) {
                zzly zzlyVar = this.zzc;
                zzlyVar.zze = zzxnVar;
                this.zzd = zzhkVar;
                this.zza = 2;
                obj = zzly.zzu(zzlyVar, this);
            } else {
                zzdj zzn = this.zzc.zzn();
                zzmc zzmcVar = zzmc.zzd;
                this.zza = 1;
            }
            return bx2Var;
        }
        if (i == 1) {
            qse.b(obj);
            sa9Var = new sa9(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
            return new ta9(sa9Var);
        }
        if (i != 2) {
            qse.b(obj);
            sa9Var = g5c.a;
            return new ta9(sa9Var);
        }
        zzhkVar = (zzhk) this.zzd;
        qse.b(obj);
        this.zzd = null;
        this.zza = 3;
    }
}
