package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzag extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzaj zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzaj zzajVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzajVar;
        this.zzc = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzag zzagVar = new zzag(this.zzb, this.zzc, fw2Var);
        zzagVar.zzd = obj;
        return zzagVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzag) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i != 0) {
            return obj;
        }
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object b = h9e.b(zzafVar, this);
        bx2 bx2Var = bx2.a;
        return b == bx2Var ? bx2Var : b;
    }
}
