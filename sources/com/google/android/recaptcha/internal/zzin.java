package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzin extends eeb implements fs4 {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zziz zzb;
    final /* synthetic */ zzip zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(Exception exc, zziz zzizVar, zzip zzipVar, px2 px2Var) {
        super(2, px2Var);
        this.zza = exc;
        this.zzb = zzizVar;
        this.zzc = zzipVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzin zzinVar = new zzin(this.zza, this.zzb, this.zzc, px2Var);
        zzinVar.zzd = obj;
        return zzinVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        zzys zzysVar;
        tue.b(obj);
        ky2 ky2Var = (ky2) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzdm) {
            zzysVar = ((zzdm) exc).zza();
            zzysVar.zze(this.zzb.zza());
        } else {
            zziz zzizVar = this.zzb;
            zzys zzf = zzyt.zzf();
            zzf.zze(zzizVar.zza());
            zzf.zzr(2);
            zzf.zzq(2);
            zzysVar = zzf;
        }
        zzyt zzytVar = (zzyt) zzysVar.zzk();
        zzytVar.zzl();
        zzytVar.zzk();
        h79.a(exc.getClass()).b();
        exc.getMessage();
        zziz zzizVar2 = this.zzb;
        zzcs zzb = zzizVar2.zzb();
        zzcs zzcsVar = zzizVar2.zza;
        if (zzcsVar == null) {
            zzcsVar = null;
        }
        zzww zza = zzhd.zza(zzb, zzcsVar);
        String zzd = zzizVar2.zzd();
        if (zzd.length() == 0) {
            zzd = "recaptcha.m.Main.rge";
        }
        av5 av5Var = (av5) ky2Var.c().get(nf5.c);
        if (av5Var != null ? av5Var.isActive() : true) {
            zzip zzipVar = this.zzc;
            zzpp zzh = zzpp.zzh();
            byte[] zzd2 = zzytVar.zzd();
            String zzi = zzh.zzi(zzd2, 0, zzd2.length);
            zzpp zzh2 = zzpp.zzh();
            byte[] zzd3 = zza.zzd();
            zzipVar.zzb.zzd().zzb(zzd, (String[]) Arrays.copyOf(new String[]{zzi, zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return g7c.a;
    }
}
