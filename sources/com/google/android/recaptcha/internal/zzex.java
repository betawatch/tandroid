package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzex extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzye zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzex(zzfp zzfpVar, long j, zzye zzyeVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzfpVar;
        this.zzc = j;
        this.zzd = zzyeVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzex zzexVar = new zzex(this.zzb, this.zzc, this.zzd, fw2Var);
        zzexVar.zze = obj;
        return zzexVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i != 0) {
            return obj;
        }
        zzgr zzgrVar = (zzgr) this.zze;
        zzfp zzfpVar = this.zzb;
        sw2 c = zzfp.zzf(zzfpVar).zza().c();
        zzew zzewVar = new zzew(this.zzc, zzfpVar, zzgrVar, this.zzd, null);
        this.zza = 1;
        Object c2 = ppd.c(c, zzewVar, this);
        bx2 bx2Var = bx2.a;
        return c2 == bx2Var ? bx2Var : c2;
    }
}
