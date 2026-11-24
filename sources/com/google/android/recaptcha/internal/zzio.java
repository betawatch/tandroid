package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzio extends eeb implements fs4 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zziz zzd;
    final /* synthetic */ zzip zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzio(zziz zzizVar, zzip zzipVar, String str, px2 px2Var) {
        super(2, px2Var);
        this.zzd = zzizVar;
        this.zze = zzipVar;
        this.zzf = str;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzio(this.zzd, this.zze, this.zzf, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzio) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r6 != r2) goto L19;
     */
    @Override // og0
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
        ly2 ly2Var = ly2.a;
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
            tue.b(obj);
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
            if (zzg != ly2Var) {
                zzzqVar = zzi;
                zzmfVar = zzb;
            }
            return ly2Var;
        }
        if (i != 1) {
            tue.b(obj);
            return g7c.a;
        }
        zzmfVar = (zzmf) this.zzb;
        zzzqVar = (zzzq) this.zza;
        tue.b(obj);
        zzmfVar.zzf();
        new Long(zzmfVar.zza(TimeUnit.MICROSECONDS));
        zzzqVar.zzf();
        return g7c.a;
    }
}
