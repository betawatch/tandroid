package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.Map;
import tc.h;
import y5.e;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class zzdp {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void zza(Application application) {
        Map map;
        Map map2;
        int i10 = zzby.zza;
        zzbz[] zzbzVarArr = {new zzbz(915034691, new zzcc(null, 1, null)), new zzbz(915034891, new zziq()), new zzbz(915034696, new zzch()), new zzbz(915035000, new zzmb()), new zzbz(915034713, new zzcy("https://www.recaptcha.net/recaptcha/api3")), new zzbz(915034856, new zzhm(null, 1, null)), new zzbz(915034881, new zzig(true)), new zzbz(735120228, application), new zzbz(915034697, new zzci(application)), new zzbz(915034880, new zzif()), new zzbz(915034677, new zzcq(application)), new zzbz(915034857, new zzhp()), new zzbz(915034863, new zzht()), new zzbz(915034876, new zzib()), new zzbz(915034720, new zzcz(e.b)), new zzbz(915034706, new zzcm()), new zzbz(915034844, new zzhc()), new zzbz(915034831, new zzgz(application)), new zzbz(1931397515, application.getContentResolver()), new zzbz(-800379174, IntegrityManagerFactory.createStandard(application)), new zzbz(-940314074, new zzi(h.c(new zzaj(null, 1, 0 == true ? 1 : 0), new zzu(null, null, 3, null), new zzly()))), new zzbz(915034730, new zzdk()), new zzbz(915034820, new zzgh()), new zzbz(-940314066, new zzq()), new zzbz(915034675, new zzbr(new zza())), new zzbz(915034674, new zzbq())};
        for (int i11 = 0; i11 < 26; i11++) {
            zzbz zzbzVar = zzbzVarArr[i11];
            map = zzby.zzc;
            if (!map.containsKey(Integer.valueOf(zzbzVar.zza()))) {
                map2 = zzby.zzc;
                map2.put(Integer.valueOf(zzbzVar.zza()), zzbzVar);
            }
        }
    }
}
