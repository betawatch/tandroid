package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzs extends ccb implements eq4 {
    final /* synthetic */ zzu zza;
    final /* synthetic */ zzxn zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzu zzuVar, zzxn zzxnVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zza = zzuVar;
        this.zzb = zzxnVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzs(this.zza, this.zzb, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        qse.b(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            return new ta9(new sa9(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            return new ta9(new sa9(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        mn5 mn5Var = new mn5();
        Application zzl = zzu.zzl(zzuVar);
        zzl.getClass();
        u84 u84Var = new u84(zzl, u84.s, vn.g, ay4.c);
        agb b = bgb.b();
        b.c = new f84[]{ped.b};
        b.a = new e6e(mn5Var, (byte) 1);
        b.d = (char) 34001;
        Task e = u84Var.e(0, b.a());
        e.getClass();
        zzuVar.zzc = zzdf.zza(e);
        return new ta9(g5c.a);
    }
}
