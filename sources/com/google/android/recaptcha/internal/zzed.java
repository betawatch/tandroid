package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzed extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzed zzedVar = new zzed(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, fw2Var);
        zzedVar.zzg = obj;
        return zzedVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzed) create((zzhh) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i != 0) {
            return obj;
        }
        zzhh zzhhVar = (zzhh) this.zzg;
        zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzhhVar, null);
        this.zza = 1;
        Object zza = zzhj.zza(zzhhVar, zzecVar, this);
        bx2 bx2Var = bx2.a;
        return zza == bx2Var ? bx2Var : zza;
    }
}
