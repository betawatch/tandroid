package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzga extends yfb implements is4 {
    final /* synthetic */ zzgb zza;
    final /* synthetic */ long zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzga(zzgb zzgbVar, long j, zw2 zw2Var) {
        super(2, zw2Var);
        this.zza = zzgbVar;
        this.zzb = j;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzga zzgaVar = new zzga(this.zza, this.zzb, zw2Var);
        zzgaVar.zzc = obj;
        return zzgaVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzga) create((zzhk) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (com.google.android.recaptcha.internal.zzgb.zzo(r1, r9) != false) goto L10;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzds zzdsVar;
        zzdt zzdtVar;
        zzdr zzdrVar;
        zzdt zzdtVar2;
        zzcg zzcgVar;
        ixe.b(obj);
        zzhk zzhkVar = (zzhk) this.zzc;
        zzgb zzgbVar = this.zza;
        zzdv zze = zzgbVar.zze();
        zzdsVar = zzdv.zzb;
        boolean a = ur5.a(zze, zzdsVar);
        g9c g9cVar = g9c.a;
        if (!a) {
            zzdv zze2 = zzgbVar.zze();
            zzdtVar = zzdv.zzc;
            if (!ur5.a(zze2, zzdtVar)) {
                zzdv zze3 = zzgbVar.zze();
                zzdrVar = zzdv.zzd;
                if (ur5.a(zze3, zzdrVar)) {
                    zzcgVar = zzgbVar.zzd;
                }
                zzdtVar2 = zzdv.zzc;
                zzgbVar.zzf = zzdtVar2;
                vp2 a2 = xwd.a();
                zzgbVar.zzb = a2;
                fud.b(zzgb.zzd(zzgbVar).zza(), new zzfz(zzgbVar, a2, zzhkVar, this.zzb, null));
            }
        }
        return g9cVar;
    }
}
