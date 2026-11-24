package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzfs extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzgb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgb zzgbVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzgbVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzfs(this.zzb, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        bp2 bp2Var;
        int i = this.zza;
        qse.b(obj);
        if (i == 0) {
            bp2Var = this.zzb.zzb;
            this.zza = 1;
            Object h = ((cp2) bp2Var).h(this);
            bx2 bx2Var = bx2.a;
            if (h == bx2Var) {
                return bx2Var;
            }
        }
        return g5c.a;
    }
}
