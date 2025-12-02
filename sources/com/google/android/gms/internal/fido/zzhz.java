package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
public final class zzhz implements zzhy {
    public static final zzaq zza;
    public static final zzaq zzb;
    public static final zzaq zzc;
    public static final zzaq zzd;
    public static final zzaq zze;
    public static final zzaq zzf;
    public static final zzaq zzg;

    static {
        zzay zzd2 = new zzay("com.google.android.gms.fido").zze(zzcf.zzl("FIDO")).zzd();
        zza = zzd2.zzc("Hybrid__client_enabled", false);
        zzb = zzd2.zzc("Hybrid__disavow_location_permissions", true);
        zzc = zzd2.zza("Hybrid__number_of_seconds_to_wait_for_bt_scanning_radio_to_be_ready", 3L);
        zzd = zzd2.zza("Hybrid__number_of_seconds_to_wait_for_bt_scanning_turning_on", 3L);
        zze = zzd2.zzc("Hybrid__prf_eval_during_create", true);
        zzf = zzd2.zzc("Hybrid__use_hybrid_for_server_link", false);
        zzg = zzd2.zzc("Hybrid__websocket_close_socket", true);
    }

    @Override // com.google.android.gms.internal.fido.zzhy
    public final boolean zza() {
        return ((Boolean) zza.zza()).booleanValue();
    }
}
