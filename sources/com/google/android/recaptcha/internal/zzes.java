package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzes extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzye zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzfp zzfpVar, zzye zzyeVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzfpVar;
        this.zzc = zzyeVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzes(this.zzb, this.zzc, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzes) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i != 0) {
            return obj;
        }
        zzer zzerVar = new zzer(this.zzb, this.zzc, null);
        this.zza = 1;
        Object b = h9e.b(zzerVar, this);
        bx2 bx2Var = bx2.a;
        return b == bx2Var ? bx2Var : b;
    }
}
