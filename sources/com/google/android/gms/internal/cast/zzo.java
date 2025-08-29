package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public final class zzo {
    private static final Logger zza = new Logger("FeatureUsageAnalytics");
    private static final String zzb = "21.4.0";
    private static zzo zzc;
    private final zzg zzd;
    private final SharedPreferences zze;
    private final String zzf;
    private long zzl;
    private final Clock zzk = DefaultClock.getInstance();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Handler zzh = new zzed(Looper.getMainLooper());
    private final Runnable zzg = new Runnable() { // from class: com.google.android.gms.internal.cast.zzn
        @Override // java.lang.Runnable
        public final void run() {
            zzo.zzc(zzo.this);
        }
    };

    private zzo(SharedPreferences sharedPreferences, zzg zzgVar, String str) {
        this.zze = sharedPreferences;
        this.zzd = zzgVar;
        this.zzf = str;
    }

    public static synchronized zzo zza(SharedPreferences sharedPreferences, zzg zzgVar, String str) {
        zzo zzoVar;
        synchronized (zzo.class) {
            try {
                if (zzc == null) {
                    zzc = new zzo(sharedPreferences, zzgVar, str);
                }
                zzoVar = zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzoVar;
    }

    static String zzb(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    public static /* synthetic */ void zzc(zzo zzoVar) {
        if (zzoVar.zzi.isEmpty()) {
            return;
        }
        long j = true != zzoVar.zzj.equals(zzoVar.zzi) ? 86400000L : 172800000L;
        long zzf = zzoVar.zzf();
        long j2 = zzoVar.zzl;
        if (j2 == 0 || zzf - j2 >= j) {
            zza.d("Upload the feature usage report.", new Object[0]);
            zznd zza2 = zzne.zza();
            zza2.zzb(zzb);
            zza2.zza(zzoVar.zzf);
            zzne zzneVar = (zzne) zza2.zzq();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(zzoVar.zzi);
            zzmx zza3 = zzmy.zza();
            zza3.zza(arrayList);
            zza3.zzb(zzneVar);
            zzmy zzmyVar = (zzmy) zza3.zzq();
            zznn zzc2 = zzno.zzc();
            zzc2.zzc(zzmyVar);
            zzoVar.zzd.zze((zzno) zzc2.zzq(), NotificationCenter.pushMessagesUpdated);
            SharedPreferences sharedPreferences = zzoVar.zze;
            Set set = zzoVar.zzj;
            Set set2 = zzoVar.zzi;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (!set.equals(set2)) {
                zzoVar.zzj.clear();
                zzoVar.zzj.addAll(zzoVar.zzi);
                Iterator it = zzoVar.zzj.iterator();
                while (it.hasNext()) {
                    String num = Integer.toString(((zzml) it.next()).zza());
                    String zzh = zzoVar.zzh(num);
                    String zzb2 = zzb("feature_usage_timestamp_reported_feature_", num);
                    if (!TextUtils.equals(zzh, zzb2)) {
                        long j3 = zzoVar.zze.getLong(zzh, 0L);
                        edit.remove(zzh);
                        if (j3 != 0) {
                            edit.putLong(zzb2, j3);
                        }
                    }
                }
            }
            zzoVar.zzl = zzf;
            edit.putLong("feature_usage_last_report_time", zzf).apply();
        }
    }

    public static void zzd(zzml zzmlVar) {
        zzo zzoVar;
        if (!zzg.zza || (zzoVar = zzc) == null) {
            return;
        }
        zzoVar.zze.edit().putLong(zzoVar.zzh(Integer.toString(zzmlVar.zza())), zzoVar.zzf()).apply();
        zzoVar.zzi.add(zzmlVar);
        zzoVar.zzj();
    }

    private final long zzf() {
        return ((Clock) Preconditions.checkNotNull(this.zzk)).currentTimeMillis();
    }

    private static zzml zzg(String str) {
        zzml zzmlVar;
        try {
            int parseInt = Integer.parseInt(str);
            zzml zzmlVar2 = zzml.zza;
            switch (parseInt) {
                case 0:
                    zzmlVar = zzml.zza;
                    break;
                case 1:
                    zzmlVar = zzml.zzb;
                    break;
                case 2:
                    zzmlVar = zzml.zzc;
                    break;
                case 3:
                    zzmlVar = zzml.zzd;
                    break;
                case 4:
                    zzmlVar = zzml.zze;
                    break;
                case 5:
                    zzmlVar = zzml.zzf;
                    break;
                case 6:
                    zzmlVar = zzml.zzg;
                    break;
                case 7:
                    zzmlVar = zzml.zzh;
                    break;
                case 8:
                    zzmlVar = zzml.zzi;
                    break;
                case 9:
                    zzmlVar = zzml.zzj;
                    break;
                case 10:
                    zzmlVar = zzml.zzk;
                    break;
                case 11:
                    zzmlVar = zzml.zzl;
                    break;
                case 12:
                    zzmlVar = zzml.zzm;
                    break;
                case 13:
                    zzmlVar = zzml.zzn;
                    break;
                case 14:
                    zzmlVar = zzml.zzo;
                    break;
                case 15:
                    zzmlVar = zzml.zzp;
                    break;
                case 16:
                    zzmlVar = zzml.zzq;
                    break;
                case 17:
                    zzmlVar = zzml.zzr;
                    break;
                case 18:
                    zzmlVar = zzml.zzs;
                    break;
                case 19:
                    zzmlVar = zzml.zzt;
                    break;
                case 20:
                    zzmlVar = zzml.zzu;
                    break;
                case 21:
                    zzmlVar = zzml.zzv;
                    break;
                case 22:
                    zzmlVar = zzml.zzw;
                    break;
                case 23:
                    zzmlVar = zzml.zzx;
                    break;
                case 24:
                    zzmlVar = zzml.zzy;
                    break;
                case 25:
                    zzmlVar = zzml.zzz;
                    break;
                case 26:
                    zzmlVar = zzml.zzA;
                    break;
                case 27:
                    zzmlVar = zzml.zzB;
                    break;
                case 28:
                    zzmlVar = zzml.zzC;
                    break;
                case 29:
                    zzmlVar = zzml.zzD;
                    break;
                case 30:
                    zzmlVar = zzml.zzE;
                    break;
                case 31:
                    zzmlVar = zzml.zzF;
                    break;
                case 32:
                    zzmlVar = zzml.zzG;
                    break;
                case 33:
                    zzmlVar = zzml.zzH;
                    break;
                case 34:
                    zzmlVar = zzml.zzI;
                    break;
                case 35:
                    zzmlVar = zzml.zzJ;
                    break;
                case 36:
                    zzmlVar = zzml.zzK;
                    break;
                case 37:
                    zzmlVar = zzml.zzL;
                    break;
                case 38:
                    zzmlVar = zzml.zzM;
                    break;
                case 39:
                    zzmlVar = zzml.zzN;
                    break;
                case 40:
                    zzmlVar = zzml.zzO;
                    break;
                case 41:
                    zzmlVar = zzml.zzP;
                    break;
                case 42:
                    zzmlVar = zzml.zzQ;
                    break;
                case 43:
                    zzmlVar = zzml.zzR;
                    break;
                case 44:
                    zzmlVar = zzml.zzS;
                    break;
                case 45:
                    zzmlVar = zzml.zzT;
                    break;
                case 46:
                    zzmlVar = zzml.zzU;
                    break;
                case 47:
                    zzmlVar = zzml.zzV;
                    break;
                case 48:
                    zzmlVar = zzml.zzW;
                    break;
                case 49:
                    zzmlVar = zzml.zzX;
                    break;
                case 50:
                    zzmlVar = zzml.zzY;
                    break;
                case 51:
                    zzmlVar = zzml.zzZ;
                    break;
                case 52:
                    zzmlVar = zzml.zzaa;
                    break;
                case 53:
                    zzmlVar = zzml.zzab;
                    break;
                case 54:
                    zzmlVar = zzml.zzac;
                    break;
                case 55:
                    zzmlVar = zzml.zzad;
                    break;
                default:
                    zzmlVar = null;
                    break;
            }
            return zzmlVar;
        } catch (NumberFormatException unused) {
            return zzml.zza;
        }
    }

    private final String zzh(String str) {
        SharedPreferences sharedPreferences = this.zze;
        String zzb2 = zzb("feature_usage_timestamp_reported_feature_", str);
        return sharedPreferences.contains(zzb2) ? zzb2 : zzb("feature_usage_timestamp_detected_feature_", str);
    }

    private final void zzi(Set set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.zze.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    private final void zzj() {
        this.zzh.post(this.zzg);
    }

    public final void zze() {
        zzml zzg;
        SharedPreferences sharedPreferences = this.zze;
        Set set = this.zzi;
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        set.clear();
        this.zzj.clear();
        this.zzl = 0L;
        if (!zzb.equals(string) || !this.zzf.equals(string2)) {
            HashSet hashSet = new HashSet();
            for (String str : this.zze.getAll().keySet()) {
                if (str.startsWith("feature_usage_timestamp_")) {
                    hashSet.add(str);
                }
            }
            hashSet.add("feature_usage_last_report_time");
            zzi(hashSet);
            this.zze.edit().putString("feature_usage_sdk_version", zzb).putString("feature_usage_package_name", this.zzf).apply();
            return;
        }
        this.zzl = this.zze.getLong("feature_usage_last_report_time", 0L);
        long zzf = zzf();
        HashSet hashSet2 = new HashSet();
        for (String str2 : this.zze.getAll().keySet()) {
            if (str2.startsWith("feature_usage_timestamp_")) {
                long j = this.zze.getLong(str2, 0L);
                if (j != 0 && zzf - j > 1209600000) {
                    hashSet2.add(str2);
                } else if (str2.startsWith("feature_usage_timestamp_reported_feature_")) {
                    zzml zzg2 = zzg(str2.substring(41));
                    if (zzg2 != null) {
                        this.zzj.add(zzg2);
                        this.zzi.add(zzg2);
                    }
                } else if (str2.startsWith("feature_usage_timestamp_detected_feature_") && (zzg = zzg(str2.substring(41))) != null) {
                    this.zzi.add(zzg);
                }
            }
        }
        zzi(hashSet2);
        Preconditions.checkNotNull(this.zzh);
        Preconditions.checkNotNull(this.zzg);
        zzj();
    }
}
