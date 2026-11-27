package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzio extends yfb implements is4 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zziz zzd;
    final /* synthetic */ zzip zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzio(zziz zzizVar, zzip zzipVar, String str, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzd = zzizVar;
        this.zze = zzipVar;
        this.zzf = str;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzio(this.zzd, this.zze, this.zzf, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzio) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r6 != r2) goto L19;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        zzkt zzktVar;
        Object zzg;
        zzzq zzzqVar;
        zzmf zzmfVar;
        int i = this.zzc;
        vx2 vx2Var = vx2.a;
        try {
        } catch (Exception e) {
            zzip zzipVar = this.zze;
            zziz zzizVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzh = zzipVar.zzh(e, zzizVar, this);
        }
        if (i == 0) {
            ixe.b(obj);
            zziz zzizVar2 = this.zzd;
            zzizVar2.zza = new zzcs();
            zzzq zzi = zzzq.zzi(zzpp.zzh().zzj(this.zzf));
            zzi.zzf();
            zzip zzipVar2 = this.zze;
            zzktVar = zzipVar2.zzc;
            zzzo zza = zzktVar.zza(zzi);
            zzmf zzb = zzmf.zzb();
            List zzi2 = zza.zzi();
            this.zza = zzi;
            this.zzb = zzb;
            this.zzc = 1;
            zzg = zzipVar2.zzg(zzi2, zzizVar2, this);
            if (zzg != vx2Var) {
                zzzqVar = zzi;
                zzmfVar = zzb;
            }
            return vx2Var;
        }
        if (i != 1) {
            ixe.b(obj);
            return f9c.a;
        }
        zzmfVar = (zzmf) this.zzb;
        zzzqVar = (zzzq) this.zza;
        ixe.b(obj);
        zzmfVar.zzf();
        new Long(zzmfVar.zza(TimeUnit.MICROSECONDS));
        zzzqVar.zzf();
        return f9c.a;
    }
}
