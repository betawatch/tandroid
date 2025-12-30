package com.google.android.recaptcha.internal;

import android.app.Application;
import android.content.ContentResolver;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class zzdp {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void zza(Application application) {
        Map map;
        Map map2;
        int i = zzby.zza;
        zzbz[] zzbzVarArr = {new zzbz(zzcc.class.getName().hashCode(), new zzcc(null, 1, null)), new zzbz(zziq.class.getName().hashCode(), new zziq()), new zzbz(zzch.class.getName().hashCode(), new zzch()), new zzbz(zzmb.class.getName().hashCode(), new zzmb()), new zzbz(zzcy.class.getName().hashCode(), new zzcy("https://www.recaptcha.net/recaptcha/api3")), new zzbz(zzhm.class.getName().hashCode(), new zzhm(null, 1, null)), new zzbz(zzig.class.getName().hashCode(), new zzig(true)), new zzbz(Application.class.getName().hashCode(), application), new zzbz(zzci.class.getName().hashCode(), new zzci(application)), new zzbz(zzif.class.getName().hashCode(), new zzif()), new zzbz(zzbt.class.getName().hashCode(), new zzcq(application)), new zzbz(zzhn.class.getName().hashCode(), new zzhp()), new zzbz(zzht.class.getName().hashCode(), new zzht()), new zzbz(zzib.class.getName().hashCode(), new zzib()), new zzbz(zzda.class.getName().hashCode(), new zzcz(GoogleApiAvailabilityLight.getInstance())), new zzbz(zzcr.class.getName().hashCode(), new zzcm()), new zzbz(zzha.class.getName().hashCode(), new zzhc()), new zzbz(zzgs.class.getName().hashCode(), new zzgz(application)), new zzbz(ContentResolver.class.getName().hashCode(), application.getContentResolver()), new zzbz(StandardIntegrityManager.class.getName().hashCode(), IntegrityManagerFactory.createStandard(application)), new zzbz(zzi.class.getName().hashCode(), new zzi(CollectionsKt.listOf((Object[]) new zzg[]{new zzaj(null, 1, 0 == true ? 1 : 0), new zzu(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), new zzly()}))), new zzbz(zzdk.class.getName().hashCode(), new zzdk()), new zzbz(zzgh.class.getName().hashCode(), new zzgh()), new zzbz(zzq.class.getName().hashCode(), new zzq()), new zzbz(zzbr.class.getName().hashCode(), new zzbr(new zza())), new zzbz(zzbq.class.getName().hashCode(), new zzbq())};
        for (int i2 = 0; i2 < 26; i2++) {
            zzbz zzbzVar = zzbzVarArr[i2];
            map = zzby.zzc;
            if (!map.containsKey(Integer.valueOf(zzbzVar.zza()))) {
                map2 = zzby.zzc;
                map2.put(Integer.valueOf(zzbzVar.zza()), zzbzVar);
            }
        }
    }
}
