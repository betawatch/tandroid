package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzft extends ccb implements qp4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzgb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(long j, zzgb zzgbVar, fw2 fw2Var) {
        super(1, fw2Var);
        this.zzb = j;
        this.zzc = zzgbVar;
    }

    @Override // of0
    public final fw2 create(fw2 fw2Var) {
        return new zzft(this.zzb, this.zzc, fw2Var);
    }

    @Override // qp4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzft) create((fw2) obj)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i == 0) {
            long j = this.zzb;
            zzfs zzfsVar = new zzfs(this.zzc, null);
            this.zza = 1;
            Object a = mve.a(j, zzfsVar, this);
            bx2 bx2Var = bx2.a;
            if (a == bx2Var) {
                return bx2Var;
            }
        }
        return g5c.a;
    }
}
