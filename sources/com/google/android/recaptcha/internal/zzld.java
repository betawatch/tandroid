package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzld {
    final /* synthetic */ zzly zza;
    private Long zzb;
    private final zzmf zzc = zzmf.zzb();

    public zzld(zzly zzlyVar) {
        this.zza = zzlyVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            zzmf zzmfVar = this.zzc;
            zzmfVar.zzf();
            this.zzb = Long.valueOf(zzmfVar.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzly zzlyVar = this.zza;
        Long l = zzlyVar.zzr().zzb;
        zzb();
        zzwn zzM = zzwn.zzM(zzdb.zza(str));
        zzzl zzi = zzzm.zzi();
        zzi.zzf(zzM);
        zzly.zzo(zzlyVar).zza((zzzm) zzi.zzk());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zzzl zzi = zzzm.zzi();
        zzi.zzq(zzxc.zzi(zzdb.zza(str)));
        zzly.zzo(this.zza).zza((zzzm) zzi.zzk());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzzh zzg = zzzh.zzg(zzdb.zza(str));
        zzg.zzi().name();
        if (zzg.zzi() != zzzk.zzb) {
            zzg.zzi().name();
            int i = zzcg.zza;
            zzcg zza = zzcf.zza(zzg.zzi());
            zzly zzlyVar = this.zza;
            zzlyVar.zzz().hashCode();
            ((cp2) zzlyVar.zzz()).P(zza);
            return;
        }
        zzly zzlyVar2 = this.zza;
        zzlyVar2.zzz().hashCode();
        if (((cp2) zzlyVar2.zzz()).B(g5c.a)) {
            return;
        }
        zzlyVar2.zzz().hashCode();
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzik zzikVar = this.zza.zzb;
        if (zzikVar == null) {
            zzikVar = null;
        }
        zzikVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        Map map;
        zzb();
        zzxx zzi = zzxx.zzi(zzdb.zza(str));
        zzi.toString();
        map = this.zza.zzd;
        bp2 bp2Var = (bp2) map.remove(zzi.zzk());
        if (bp2Var != null) {
            ((cp2) bp2Var).B(zzi);
        }
    }
}
