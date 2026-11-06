package com.google.android.recaptcha.internal;

import gd.k;
import id.c;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import zd.b0;
import zd.z;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class zzip implements zzik {
    private final z zza;
    private final zzjb zzb;
    private final zzkt zzc;
    private final Map zzd;

    public zzip(z zVar, zzjb zzjbVar, zzkt zzktVar, Map map) {
        this.zza = zVar;
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
        int i7 = zzco.zza;
        int zzk = zzzuVar.zzk();
        if (zzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzco.zza(zzk - 2, zza2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zziz zzizVar, c cVar) {
        Object e10 = b0.e(new zzim(zzizVar, list, this, null), cVar);
        return e10 == jd.a.a ? e10 : k.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zziz zzizVar, c cVar) {
        Object e10 = b0.e(new zzin(exc, zzizVar, this, null), cVar);
        return e10 == jd.a.a ? e10 : k.a;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zza(String str) {
        b0.q(this.zza, new zzio(new zziz(this.zzb), this, str, null));
    }
}
