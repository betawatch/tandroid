package com.google.android.recaptcha.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzgh {
    private zzvu zza;
    private final h26 zzb;

    public zzgh() {
        int i = zzby.zza;
        this.zzb = ure.b(zzgg.zza);
    }

    private final Application zzb() {
        return (Application) this.zzb.getValue();
    }

    private static final String zzc() {
        try {
            String iSO3Country = Locale.getDefault().getISO3Country();
            iSO3Country.getClass();
            return iSO3Country;
        } catch (MissingResourceException unused) {
            return "";
        }
    }

    private static final String zzd() {
        try {
            String iSO3Language = Locale.getDefault().getISO3Language();
            iSO3Language.getClass();
            return iSO3Language;
        } catch (MissingResourceException unused) {
            return "";
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0076 -> B:9:0x0077). Please report as a decompilation issue!!! */
    public final zzwz zza(String str) {
        String str2;
        int i = zzby.zza;
        Set zza = zzch.zza(zzb());
        zzvu zzvuVar = this.zza;
        if (zzvuVar == null) {
            zzvr zzf = zzvu.zzf();
            int i2 = Build.VERSION.SDK_INT;
            zzf.zzf(i2);
            String str3 = "unknown";
            if (i2 >= 33) {
                int i3 = zzb().getPackageManager().getApplicationInfo(zzb().getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)).metaData.getInt("com.google.android.gms.version", -1);
                if (i3 != -1) {
                    str2 = String.valueOf(i3);
                }
                str2 = "unknown";
            } else {
                int i4 = zzb().getPackageManager().getApplicationInfo(zzb().getPackageName(), 128).metaData.getInt("com.google.android.gms.version", -1);
                if (i4 != -1) {
                    str2 = String.valueOf(i4);
                }
                str2 = "unknown";
            }
            zzf.zzs(str2);
            zzf.zzu("18.7.1");
            zzf.zzr(Build.MODEL);
            zzf.zzt(Build.MANUFACTURER);
            try {
                int i5 = Build.VERSION.SDK_INT;
                str3 = i5 >= 33 ? String.valueOf(zzb().getPackageManager().getPackageInfo(zzb().getPackageName(), PackageManager.PackageInfoFlags.of(0L)).getLongVersionCode()) : i5 >= 28 ? String.valueOf(zzb().getPackageManager().getPackageInfo(zzb().getPackageName(), 0).getLongVersionCode()) : String.valueOf(zzb().getPackageManager().getPackageInfo(zzb().getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            zzf.zzq(str3);
            zzvuVar = (zzvu) zzf.zzk();
        }
        this.zza = zzvuVar;
        zzvr zzvrVar = (zzvr) zzvuVar.zzr();
        zzvrVar.zze(zza);
        zzvu zzvuVar2 = (zzvu) zzvrVar.zzk();
        zzwx zzf2 = zzwz.zzf();
        zzf2.zzr(str);
        zzf2.zze(zzvuVar2);
        zzf2.zzq(zzd());
        zzf2.zzf(zzc());
        return (zzwz) zzf2.zzk();
    }
}
