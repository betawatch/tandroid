package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzga extends ccb implements eq4 {
    final /* synthetic */ zzgb zza;
    final /* synthetic */ long zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzga(zzgb zzgbVar, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zza = zzgbVar;
        this.zzb = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzga zzgaVar = new zzga(this.zza, this.zzb, fw2Var);
        zzgaVar.zzc = obj;
        return zzgaVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzga) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (com.google.android.recaptcha.internal.zzgb.zzo(r1, r9) != false) goto L10;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzds zzdsVar;
        zzdt zzdtVar;
        zzdr zzdrVar;
        zzdt zzdtVar2;
        zzcg zzcgVar;
        qse.b(obj);
        zzhk zzhkVar = (zzhk) this.zzc;
        zzgb zzgbVar = this.zza;
        zzdv zze = zzgbVar.zze();
        zzdsVar = zzdv.zzb;
        boolean a = rp5.a(zze, zzdsVar);
        g5c g5cVar = g5c.a;
        if (!a) {
            zzdv zze2 = zzgbVar.zze();
            zzdtVar = zzdv.zzc;
            if (!rp5.a(zze2, zzdtVar)) {
                zzdv zze3 = zzgbVar.zze();
                zzdrVar = zzdv.zzd;
                if (rp5.a(zze3, zzdrVar)) {
                    zzcgVar = zzgbVar.zzd;
                }
                zzdtVar2 = zzdv.zzc;
                zzgbVar.zzf = zzdtVar2;
                cp2 a2 = hsd.a();
                zzgbVar.zzb = a2;
                ppd.b(zzgb.zzd(zzgbVar).zza(), new zzfz(zzgbVar, a2, zzhkVar, this.zzb, null));
            }
        }
        return g5cVar;
    }
}
