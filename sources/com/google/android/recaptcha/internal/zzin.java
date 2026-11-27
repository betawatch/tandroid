package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzin extends yfb implements is4 {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zziz zzb;
    final /* synthetic */ zzip zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(Exception exc, zziz zzizVar, zzip zzipVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zza = exc;
        this.zzb = zzizVar;
        this.zzc = zzipVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzin zzinVar = new zzin(this.zza, this.zzb, this.zzc, zw2Var);
        zzinVar.zzd = obj;
        return zzinVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        zzys zzysVar;
        ixe.b(obj);
        ux2 ux2Var = (ux2) this.zzd;
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
        s89.a(exc.getClass()).b();
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
        ev5 ev5Var = (ev5) ux2Var.c().get(qf5.c);
        if (ev5Var != null ? ev5Var.isActive() : true) {
            zzip zzipVar = this.zzc;
            zzpp zzh = zzpp.zzh();
            byte[] zzd2 = zzytVar.zzd();
            String zzi = zzh.zzi(zzd2, 0, zzd2.length);
            zzpp zzh2 = zzpp.zzh();
            byte[] zzd3 = zza.zzd();
            zzipVar.zzb.zzd().zzb(zzd, (String[]) Arrays.copyOf(new String[]{zzi, zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return g9c.a;
    }
}
