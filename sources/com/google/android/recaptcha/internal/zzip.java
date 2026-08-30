package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ld.c0;
import ld.e0;
import sc.i;
import uc.c;
import vc.a;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class zzip implements zzik {
    private final c0 zza;
    private final zzjb zzb;
    private final zzkt zzc;
    private final Map zzd;

    public zzip(c0 c0Var, zzjb zzjbVar, zzkt zzktVar, Map map) {
        this.zza = c0Var;
        this.zzb = zzjbVar;
        this.zzc = zzktVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzip zzipVar, zzzu zzzuVar, zziz zzizVar) {
        zzmf zzb = zzmf.zzb();
        int zza = zzizVar.zza();
        zzjt zzjtVar = (zzjt) zzipVar.zzd.get(Integer.valueOf(zzzuVar.zzf()));
        if (zzjtVar == null) {
            throw new zzdm(5, 2, null);
        }
        int zzg = zzzuVar.zzg();
        zzzt[] zzztVarArr = (zzzt[]) zzzuVar.zzj().toArray(new zzzt[0]);
        zzjtVar.zza(zzg, zzizVar, (zzzt[]) Arrays.copyOf(zzztVarArr, zzztVarArr.length));
        if (zza == zzizVar.zza()) {
            zzizVar.zzg(zzizVar.zza() + 1);
        }
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i10 = zzco.zza;
        int zzk = zzzuVar.zzk();
        if (zzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzco.zza(zzk - 2, zza2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zziz zzizVar, c cVar) {
        Object f10 = e0.f(new zzim(zzizVar, list, this, null), cVar);
        return f10 == a.a ? f10 : i.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zziz zzizVar, c cVar) {
        Object f10 = e0.f(new zzin(exc, zzizVar, this, null), cVar);
        return f10 == a.a ? f10 : i.a;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zza(String str) {
        e0.q(this.zza, new zzio(new zziz(this.zzb), this, str, null));
    }
}
