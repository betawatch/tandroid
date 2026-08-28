package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.recaptcha.RecaptchaAction;
import g7.x5;
import hd.e2;
import kotlin.jvm.internal.i;
import oc.c;
import oc.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzfp {
    private final String zza;
    private final c zzb;
    private final c zzc;
    private final c zzd;
    private final c zze;
    private final c zzf;
    private final c zzg;
    private final c zzh;
    private final c zzi;

    public zzfp(String str) {
        this.zza = str;
        int i9 = zzby.zza;
        this.zzb = x5.a(zzff.zza);
        this.zzc = x5.a(zzfg.zza);
        this.zzd = x5.a(zzfh.zza);
        this.zze = x5.a(zzfi.zza);
        this.zzf = x5.a(zzfj.zza);
        this.zzg = x5.a(zzfk.zza);
        this.zzh = x5.a(zzfl.zza);
        this.zzi = x5.a(zzfm.zza);
    }

    public static final /* synthetic */ zzq zzb(zzfp zzfpVar) {
        return (zzq) ((g) zzfpVar.zzi).a();
    }

    public static final /* synthetic */ zzcg zzd(zzfp zzfpVar, Exception exc) {
        return exc instanceof e2 ? zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzb, exc.getMessage(), null, 8, null)) : exc instanceof zzcg ? zzfpVar.zzt(exc, (zzcg) exc) : zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzZ, exc.getMessage(), null, 8, null));
    }

    public static final /* synthetic */ zzci zze(zzfp zzfpVar) {
        return (zzci) ((g) zzfpVar.zzd).a();
    }

    public static final /* synthetic */ zzcr zzf(zzfp zzfpVar) {
        return (zzcr) ((g) zzfpVar.zzh).a();
    }

    public static final /* synthetic */ zzcy zzg(zzfp zzfpVar) {
        return (zzcy) ((g) zzfpVar.zzc).a();
    }

    public static final /* synthetic */ zzda zzh(zzfp zzfpVar) {
        return (zzda) ((g) zzfpVar.zzg).a();
    }

    public static final /* synthetic */ zzht zzi(zzfp zzfpVar) {
        return (zzht) ((g) zzfpVar.zzb).a();
    }

    public static final /* synthetic */ zzif zzj(zzfp zzfpVar) {
        return (zzif) ((g) zzfpVar.zze).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzs() {
        return (Application) ((g) this.zzf).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzcg zzt(Exception exc, zzcg zzcgVar) {
        return !zzu() ? new zzcg(zzce.zzc, zzcd.zzao, exc.getMessage(), null, 8, null) : zzcgVar;
    }

    private final boolean zzu() {
        NetworkCapabilities networkCapabilities;
        int i9 = zzby.zza;
        try {
            Object systemService = zzs().getSystemService("connectivity");
            i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            if (Build.VERSION.SDK_INT >= 23) {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzv(String str) {
        try {
            zzxg zzj = zzxg.zzj(zzdb.zza(str));
            int i9 = zzby.zza;
            ((zziq) x5.a(zzeu.zza).a()).zza(zzj);
        } catch (Exception e10) {
            throw new zzcg(zzce.zzl, zzcd.zzan, e10.getMessage(), null, 8, null);
        }
    }

    public final zzye zzk(RecaptchaAction recaptchaAction, zzxx zzxxVar, zzxn zzxnVar) {
        zzyd zzf = zzye.zzf();
        zzf.zzs(this.zza);
        zzf.zze(recaptchaAction.getAction());
        zzf.zzf(zzxnVar.zzO());
        zzf.zzq(zzxnVar.zzN());
        zzf.zzr(zzxxVar);
        return (zzye) zzf.zzk();
    }

    public final Object zzl(String str, long j10, qc.c cVar) {
        return new zzhf(27, new zzet(this, str, j10, null), null);
    }

    public final Object zzm(zzye zzyeVar, long j10, qc.c cVar) {
        return new zzhf(28, new zzex(this, j10, zzyeVar, null), null);
    }

    public final Object zzn(zzxn zzxnVar, long j10, qc.c cVar) {
        return new zzhg(new zzfd(j10, this, zzxnVar, null));
    }

    public final Object zzo(zzyg zzygVar, qc.c cVar) {
        return new zzhf(29, new zzfe(zzygVar, this, null), null);
    }

    public final Object zzp(long j10, qc.c cVar) {
        return new zzhf(22, new zzfo(j10, this, null), null);
    }
}
