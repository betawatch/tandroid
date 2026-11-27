package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzed extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzed zzedVar = new zzed(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zw2Var);
        zzedVar.zzg = obj;
        return zzedVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzed) create((zzhh) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        zzhh zzhhVar = (zzhh) this.zzg;
        zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzhhVar, null);
        this.zza = 1;
        Object zza = zzhj.zza(zzhhVar, zzecVar, this);
        vx2 vx2Var = vx2.a;
        return zza == vx2Var ? vx2Var : zza;
    }
}
