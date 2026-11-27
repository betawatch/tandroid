package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzip implements zzik {
    private final ux2 zza;
    private final zzjb zzb;
    private final zzkt zzc;
    private final Map zzd;

    public zzip(ux2 ux2Var, zzjb zzjbVar, zzkt zzktVar, Map map) {
        this.zza = ux2Var;
        this.zzb = zzjbVar;
        this.zzc = zzktVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzip zzipVar, zzzu zzzuVar, zziz zzizVar) {
        zzmf zzb = zzmf.zzb();
        int zza = zzizVar.zza();
        zzjt zzjtVar = (zzjt) zzipVar.zzd.get(Integer.valueOf(zzzuVar.zzf()));
        if (zzjtVar == null) {
            p3d.d(5, 2, null);
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
            lq5.j("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zziz zzizVar, zw2 zw2Var) {
        Object b = xde.b(new zzim(zzizVar, list, this, null), zw2Var);
        return b == vx2.a ? b : f9c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zziz zzizVar, zw2 zw2Var) {
        Object b = xde.b(new zzin(exc, zzizVar, this, null), zw2Var);
        return b == vx2.a ? b : f9c.a;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zza(String str) {
        fud.b(this.zza, new zzio(new zziz(this.zzb), this, str, null));
    }
}
