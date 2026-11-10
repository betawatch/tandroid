package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import java.util.Arrays;
import kd.j;
import kotlin.jvm.internal.s;
import rd.p;
import zd.a1;
import zd.y;
import zd.z;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class zzin extends j implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zziz zzb;
    final /* synthetic */ zzip zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(Exception exc, zziz zzizVar, zzip zzipVar, c cVar) {
        super(2, cVar);
        this.zza = exc;
        this.zzb = zzizVar;
        this.zzc = zzipVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzin zzinVar = new zzin(this.zza, this.zzb, this.zzc, cVar);
        zzinVar.zzd = obj;
        return zzinVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzys zzysVar;
        jd.a aVar = jd.a.a;
        b.c(obj);
        z zVar = (z) this.zzd;
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
        s.a(exc.getClass()).b();
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
        a1 a1Var = (a1) zVar.c().get(y.b);
        if (a1Var != null ? a1Var.isActive() : true) {
            zzip zzipVar = this.zzc;
            zzpp zzh = zzpp.zzh();
            byte[] zzd2 = zzytVar.zzd();
            String zzi = zzh.zzi(zzd2, 0, zzd2.length);
            zzpp zzh2 = zzpp.zzh();
            byte[] zzd3 = zza.zzd();
            zzipVar.zzb.zzd().zzb(zzd, (String[]) Arrays.copyOf(new String[]{zzi, zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return k.a;
    }
}
