package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
public final class zzic implements zzib {
    public static final zzaq zza;
    public static final zzaq zzb;
    public static final zzaq zzc;
    public static final zzaq zzd;
    public static final zzaq zze;
    public static final zzaq zzf;
    public static final zzaq zzg;
    public static final zzaq zzh;
    public static final zzaq zzi;
    public static final zzaq zzj;
    public static final zzaq zzk;
    public static final zzaq zzl;
    public static final zzaq zzm;
    public static final zzaq zzn;
    public static final zzaq zzo;
    public static final zzaq zzp;
    public static final zzaq zzq;
    public static final zzaq zzr;
    public static final zzaq zzs;

    static {
        zzay zzd2 = new zzay("com.google.android.gms.fido").zze(zzcf.zzl("FIDO")).zzd();
        zza = zzd2.zzc("Passkeys__check_all_keys", false);
        zzb = zzd2.zzc("Passkeys__check_sync_status", true);
        zzc = zzd2.zzc("Passkeys__client_data_hash_override_for_security_keys", false);
        zzd = zzd2.zzc("Passkeys__direct_assetlinks", false);
        zze = zzd2.zza("Passkeys__direct_assetlinks_cache_seconds", 604800L);
        zzf = zzd2.zzb("Passkeys__direct_assetlinks_rpids", "*");
        zzg = zzd2.zzc("Passkeys__dispatch_prf_via_credman", true);
        zzh = zzd2.zzb("Passkeys__help_center_url", "https://support.google.com/accounts/answer/6208650");
        zzi = zzd2.zzc("Passkeys__hide_consent_page_in_registration_enabled", false);
        zzj = zzd2.zzc("Passkeys__ignore_stop_during_hybrid_request", false);
        zzk = zzd2.zzc("Passkeys__json_for_parcelables", false);
        zzl = zzd2.zzc("Passkeys__passkey_entries_use_gpm_icon", false);
        zzm = zzd2.zzc("Passkeys__reencrypt_passkey", false);
        zzn = zzd2.zzc("Passkeys__return_cryptauth_status", false);
        zzo = zzd2.zzc("Passkeys__set_key_version", true);
        zzp = zzd2.zza("Passkeys__should_show_welcome_fragment", -1L);
        zzq = zzd2.zzc("Passkeys__skip_consent_after_retrieval", false);
        zzr = zzd2.zzc("Passkeys__skip_consent_screen", false);
        zzs = zzd2.zzc("Passkeys__use_result_receiver", false);
    }

    @Override // com.google.android.gms.internal.fido.zzib
    public final boolean zza() {
        return ((Boolean) zzk.zza()).booleanValue();
    }
}
