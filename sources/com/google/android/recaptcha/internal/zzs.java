package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzs extends eeb implements fs4 {
    final /* synthetic */ zzu zza;
    final /* synthetic */ zzxn zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzu zzuVar, zzxn zzxnVar, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzuVar;
        this.zzb = zzxnVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzs(this.zza, this.zzb, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        tue.b(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            return new tc9(new sc9(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            return new tc9(new sc9(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        mp5 mp5Var = new mp5();
        Application zzl = zzu.zzl(zzuVar);
        zzl.getClass();
        ua4 ua4Var = new ua4(zzl, ua4.s, wo.g, b05.c);
        bib b = cib.b();
        b.c = new o94[]{qgd.b};
        b.a = new fkd(mp5Var, (byte) 4);
        b.d = (char) 34001;
        Task e = ua4Var.e(0, b.a());
        e.getClass();
        zzuVar.zzc = zzdf.zza(e);
        return new tc9(g7c.a);
    }
}
