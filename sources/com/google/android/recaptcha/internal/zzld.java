package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jd.s;
import jd.t;
import qc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        Long l10 = zzlyVar.zzr().zzb;
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
            int i10 = zzcg.zza;
            zzcg zza = zzcf.zza(zzg.zzi());
            zzly zzlyVar = this.zza;
            zzlyVar.zzz().hashCode();
            ((t) zzlyVar.zzz()).L(zza);
            return;
        }
        zzly zzlyVar2 = this.zza;
        zzlyVar2.zzz().hashCode();
        if (((t) zzlyVar2.zzz()).A(i.a)) {
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
        s sVar = (s) map.remove(zzi.zzk());
        if (sVar != null) {
            ((t) sVar).A(zzi);
        }
    }
}
