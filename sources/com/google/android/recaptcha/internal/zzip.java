package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzip implements zzik {
    private final ky2 zza;
    private final zzjb zzb;
    private final zzkt zzc;
    private final Map zzd;

    public zzip(ky2 ky2Var, zzjb zzjbVar, zzkt zzktVar, Map map) {
        this.zza = ky2Var;
        this.zzb = zzjbVar;
        this.zzc = zzktVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzip zzipVar, zzzu zzzuVar, zziz zzizVar) {
        zzmf zzb = zzmf.zzb();
        int zza = zzizVar.zza();
        zzjt zzjtVar = (zzjt) zzipVar.zzd.get(Integer.valueOf(zzzuVar.zzf()));
        if (zzjtVar == null) {
            i2d.d(5, 2, null);
            return;
        }
        int zzg = zzzuVar.zzg();
        zzzt[] zzztVarArr = (zzzt[]) zzzuVar.zzj().toArray(new zzzt[0]);
        zzjtVar.zza(zzg, zzizVar, (zzzt[]) Arrays.copyOf(zzztVarArr, zzztVarArr.length));
        if (zza == zzizVar.zza()) {
            zzizVar.zzg(zzizVar.zza() + 1);
        }
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i = zzco.zza;
        int zzk = zzzuVar.zzk();
        if (zzk != 1) {
            zzco.zza(zzk - 2, zza2);
        } else {
            u36.j("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zziz zzizVar, px2 px2Var) {
        Object b = ibe.b(new zzim(zzizVar, list, this, null), px2Var);
        return b == ly2.a ? b : g7c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zziz zzizVar, px2 px2Var) {
        Object b = ibe.b(new zzin(exc, zzizVar, this, null), px2Var);
        return b == ly2.a ? b : g7c.a;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zza(String str) {
        srd.b(this.zza, new zzio(new zziz(this.zzb), this, str, null));
    }
}
