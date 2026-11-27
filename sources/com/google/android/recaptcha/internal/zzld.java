package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
            ((vp2) zzlyVar.zzz()).P(zza);
            return;
        }
        zzly zzlyVar2 = this.zza;
        zzlyVar2.zzz().hashCode();
        if (((vp2) zzlyVar2.zzz()).B(g9c.a)) {
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
        up2 up2Var = (up2) map.remove(zzi.zzk());
        if (up2Var != null) {
            ((vp2) up2Var).B(zzi);
        }
    }
}
