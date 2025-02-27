package com.google.android.gms.internal.cast;

import android.os.Bundle;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzm {
    private static final Logger zza = new Logger("ApplicationAnalyticsUtils");
    private static final String zzb = "21.4.0";
    private final String zzc;
    private final Map zzd;
    private final Map zze;

    public zzm(Bundle bundle, String str) {
        this.zzc = str;
        this.zzd = zzah.zza(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.zze = zzah.zza(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    private final zznn zzh(zzl zzlVar) {
        long j;
        zznn zzc = zzno.zzc();
        zzc.zzm(zzlVar.zzd);
        int i = zzlVar.zze;
        zzlVar.zze = i + 1;
        zzc.zzh(i);
        String str = zzlVar.zzc;
        if (str != null) {
            zzc.zzj(str);
        }
        String str2 = zzlVar.zzh;
        if (str2 != null) {
            zzc.zzg(str2);
        }
        zznd zza2 = zzne.zza();
        zza2.zzb(zzb);
        zza2.zza(this.zzc);
        zzc.zzb((zzne) zza2.zzq());
        zznf zza3 = zzng.zza();
        if (zzlVar.zzb != null) {
            zzoj zza4 = zzok.zza();
            zza4.zza(zzlVar.zzb);
            zza3.zza((zzok) zza4.zzq());
        }
        zza3.zzf(false);
        String str3 = zzlVar.zzf;
        if (str3 != null) {
            try {
                String replace = str3.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                zza.w(e, "receiverSessionId %s is not valid for hash", str3);
                j = 0;
            }
            zza3.zzh(j);
        }
        zza3.zzb(zzlVar.zzg);
        zza3.zzd(zzlVar.zzd());
        zza3.zze(zzlVar.zzi);
        zzc.zzd(zza3);
        return zzc;
    }

    private static void zzi(zznn zznnVar, boolean z) {
        zznf zzc = zzng.zzc(zznnVar.zza());
        zzc.zzf(z);
        zznnVar.zzd(zzc);
    }

    public final zzno zza(zzl zzlVar) {
        return (zzno) zzh(zzlVar).zzq();
    }

    public final zzno zzb(zzl zzlVar, boolean z) {
        zznn zzh = zzh(zzlVar);
        zzi(zzh, z);
        return (zzno) zzh.zzq();
    }

    public final zzno zzc(zzl zzlVar) {
        zznn zzh = zzh(zzlVar);
        zznf zzc = zzng.zzc(zzh.zza());
        zzc.zzg(10);
        zzh.zze((zzng) zzc.zzq());
        zzi(zzh, true);
        return (zzno) zzh.zzq();
    }

    public final zzno zzd(zzl zzlVar) {
        zznn zzh = zzh(zzlVar);
        if (zzlVar.zzj == 1) {
            zznf zzc = zzng.zzc(zzh.zza());
            zzc.zzg(17);
            zzh.zze((zzng) zzc.zzq());
        }
        return (zzno) zzh.zzq();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzno zze(zzl zzlVar, int i) {
        int i2;
        Map map;
        int i3;
        zznn zzh = zzh(zzlVar);
        zznf zzc = zzng.zzc(zzh.zza());
        Map map2 = this.zze;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i);
            if (map2.containsKey(valueOf)) {
                i2 = ((Integer) Preconditions.checkNotNull((Integer) this.zze.get(valueOf))).intValue();
                zzc.zzg(i2);
                map = this.zzd;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i);
                    if (map.containsKey(valueOf2)) {
                        i3 = ((Integer) Preconditions.checkNotNull((Integer) this.zzd.get(valueOf2))).intValue();
                        zzc.zzc(i3);
                        zzh.zze((zzng) zzc.zzq());
                        return (zzno) zzh.zzq();
                    }
                }
                i3 = i + 10000;
                zzc.zzc(i3);
                zzh.zze((zzng) zzc.zzq());
                return (zzno) zzh.zzq();
            }
        }
        i2 = i + 10000;
        zzc.zzg(i2);
        map = this.zzd;
        if (map != null) {
        }
        i3 = i + 10000;
        zzc.zzc(i3);
        zzh.zze((zzng) zzc.zzq());
        return (zzno) zzh.zzq();
    }

    public final zzno zzf(zzl zzlVar, int i, int i2) {
        zznn zzh = zzh(zzlVar);
        zznf zzc = zzng.zzc(zzh.zza());
        zzc.zzj(i);
        zzc.zzi(i2);
        zzh.zze((zzng) zzc.zzq());
        return (zzno) zzh.zzq();
    }

    public final zzno zzg(zzl zzlVar, int i) {
        zznn zzh = zzh(zzlVar);
        zznf zzc = zzng.zzc(zzh.zza());
        zzc.zzj(i);
        zzh.zze((zzng) zzc.zzq());
        return (zzno) zzh.zzq();
    }
}
