package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzez extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzez(zzfp zzfpVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzfpVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzez zzezVar = new zzez(this.zzb, fw2Var);
        zzezVar.zzc = obj;
        return zzezVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzez) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i != 0) {
            return obj;
        }
        zzhk zzhkVar = (zzhk) this.zzc;
        zzfp zzfpVar = this.zzb;
        sw2 c = zzfp.zzf(zzfpVar).zza().c();
        zzey zzeyVar = new zzey(zzfpVar, zzhkVar, null);
        this.zza = 1;
        Object c2 = ppd.c(c, zzeyVar, this);
        bx2 bx2Var = bx2.a;
        return c2 == bx2Var ? bx2Var : c2;
    }
}
