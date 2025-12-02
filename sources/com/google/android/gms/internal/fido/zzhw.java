package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
public final class zzhw implements zzhv {
    public static final zzaq zza;
    public static final zzaq zzb;
    public static final zzaq zzc;
    public static final zzaq zzd;
    public static final zzaq zze;
    public static final zzaq zzf;
    public static final zzaq zzg;
    public static final zzaq zzh;

    static {
        zzay zzd2 = new zzay("com.google.android.gms.fido").zze(zzcf.zzl("FIDO")).zzd();
        zza = zzd2.zzc("Fido2Ctap2Support__disable_transport_comparator", true);
        zzb = zzd2.zzc("Fido2Ctap2Support__enable_cancelling_requests", true);
        zzc = zzd2.zzc("Fido2Ctap2Support__enable_flow_separation_refactor", false);
        zzd = zzd2.zzc("Fido2Ctap2Support__nfc_activity_destroyed_check", true);
        zze = zzd2.zzc("Fido2Ctap2Support__remove_this_device_for_assertions", false);
        zzf = zzd2.zzc("Fido2Ctap2Support__skip_usb_permission_dialog", false);
        zzg = zzd2.zzc("Fido2Ctap2Support__transport_controller_refactor", false);
        zzh = zzd2.zzc("Fido2Ctap2Support__update_user_cancel_response", false);
    }

    @Override // com.google.android.gms.internal.fido.zzhv
    public final boolean zza() {
        return ((Boolean) zzc.zza()).booleanValue();
    }
}
