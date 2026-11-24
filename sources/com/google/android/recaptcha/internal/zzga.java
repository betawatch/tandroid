package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzga extends eeb implements fs4 {
    final /* synthetic */ zzgb zza;
    final /* synthetic */ long zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzga(zzgb zzgbVar, long j, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzgbVar;
        this.zzb = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzga zzgaVar = new zzga(this.zza, this.zzb, px2Var);
        zzgaVar.zzc = obj;
        return zzgaVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzga) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (com.google.android.recaptcha.internal.zzgb.zzo(r1, r9) != false) goto L10;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzds zzdsVar;
        zzdt zzdtVar;
        zzdr zzdrVar;
        zzdt zzdtVar2;
        zzcg zzcgVar;
        tue.b(obj);
        zzhk zzhkVar = (zzhk) this.zzc;
        zzgb zzgbVar = this.zza;
        zzdv zze = zzgbVar.zze();
        zzdsVar = zzdv.zzb;
        boolean a = rr5.a(zze, zzdsVar);
        g7c g7cVar = g7c.a;
        if (!a) {
            zzdv zze2 = zzgbVar.zze();
            zzdtVar = zzdv.zzc;
            if (!rr5.a(zze2, zzdtVar)) {
                zzdv zze3 = zzgbVar.zze();
                zzdrVar = zzdv.zzd;
                if (rr5.a(zze3, zzdrVar)) {
                    zzcgVar = zzgbVar.zzd;
                }
                zzdtVar2 = zzdv.zzc;
                zzgbVar.zzf = zzdtVar2;
                nq2 a2 = kud.a();
                zzgbVar.zzb = a2;
                srd.b(zzgb.zzd(zzgbVar).zza(), new zzfz(zzgbVar, a2, zzhkVar, this.zzb, null));
            }
        }
        return g7cVar;
    }
}
