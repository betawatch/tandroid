package com.google.android.recaptcha.internal;

import ae.s;
import ae.t;
import android.webkit.JavascriptInterface;
import hd.i;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        Long l4 = zzlyVar.zzr().zzb;
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
