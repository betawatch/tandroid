package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzip implements zzik {
    private final ax2 zza;
    private final zzjb zzb;
    private final zzkt zzc;
    private final Map zzd;

    public zzip(ax2 ax2Var, zzjb zzjbVar, zzkt zzktVar, Map map) {
        this.zza = ax2Var;
        this.zzb = zzjbVar;
        this.zzc = zzktVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzip zzipVar, zzzu zzzuVar, zziz zzizVar) {
        zzmf zzb = zzmf.zzb();
        int zza = zzizVar.zza();
        zzjt zzjtVar = (zzjt) zzipVar.zzd.get(Integer.valueOf(zzzuVar.zzf()));
        if (zzjtVar == null) {
            fvc.c(5, 2, null);
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
            w26.j("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zziz zzizVar, fw2 fw2Var) {
        Object b = h9e.b(new zzim(zzizVar, list, this, null), fw2Var);
        return b == bx2.a ? b : g5c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zziz zzizVar, fw2 fw2Var) {
        Object b = h9e.b(new zzin(exc, zzizVar, this, null), fw2Var);
        return b == bx2.a ? b : g5c.a;
    }

    @Override // com.google.android.recaptcha.internal.zzik
    public final void zza(String str) {
        ppd.b(this.zza, new zzio(new zziz(this.zzb), this, str, null));
    }
}
