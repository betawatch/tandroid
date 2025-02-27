package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import com.google.android.gms.cast.internal.Logger;

/* loaded from: classes.dex */
public final class zzl {
    public String zzb;
    public String zzc;
    public long zzd = zza;
    public int zze = 1;
    public String zzf;
    public int zzg;
    public String zzh;
    public boolean zzi;
    public int zzj;
    private final zzaf zzl;
    private static final Logger zzk = new Logger("ApplicationAnalyticsSession");
    public static long zza = System.currentTimeMillis();

    private zzl(zzaf zzafVar) {
        this.zzl = zzafVar;
    }

    public static zzl zza(zzaf zzafVar) {
        zzl zzlVar = new zzl(zzafVar);
        zza++;
        return zzlVar;
    }

    public static zzl zzb(SharedPreferences sharedPreferences, zzaf zzafVar) {
        if (sharedPreferences == null) {
            return null;
        }
        zzl zzlVar = new zzl(zzafVar);
        zzlVar.zzi = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        zzlVar.zzb = sharedPreferences.getString("application_id", "");
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        zzlVar.zzc = sharedPreferences.getString("receiver_metrics_id", "");
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        zzlVar.zzd = sharedPreferences.getLong("analytics_session_id", 0L);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        zzlVar.zze = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            return null;
        }
        zzlVar.zzf = sharedPreferences.getString("receiver_session_id", "");
        zzlVar.zzg = sharedPreferences.getInt("device_capabilities", 0);
        zzlVar.zzh = sharedPreferences.getString("device_model_name", "");
        zzlVar.zzj = sharedPreferences.getInt("analytics_session_start_type", 0);
        return zzlVar;
    }

    public final void zzc(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        zzk.d("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", this.zzb);
        edit.putString("receiver_metrics_id", this.zzc);
        edit.putLong("analytics_session_id", this.zzd);
        edit.putInt("event_sequence_number", this.zze);
        edit.putString("receiver_session_id", this.zzf);
        edit.putInt("device_capabilities", this.zzg);
        edit.putString("device_model_name", this.zzh);
        edit.putInt("analytics_session_start_type", this.zzj);
        edit.putBoolean("is_output_switcher_enabled", this.zzi);
        edit.apply();
    }

    public final boolean zzd() {
        return this.zzl.zze();
    }
}
