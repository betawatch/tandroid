package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzfp {
    private final String zza;
    private final d26 zzb;
    private final d26 zzc;
    private final d26 zzd;
    private final d26 zze;
    private final d26 zzf;
    private final d26 zzg;
    private final d26 zzh;
    private final d26 zzi;

    public zzfp(String str) {
        this.zza = str;
        int i = zzby.zza;
        this.zzb = fpe.b(zzff.zza);
        this.zzc = fpe.b(zzfg.zza);
        this.zzd = fpe.b(zzfh.zza);
        this.zze = fpe.b(zzfi.zza);
        this.zzf = fpe.b(zzfj.zza);
        this.zzg = fpe.b(zzfk.zza);
        this.zzh = fpe.b(zzfl.zza);
        this.zzi = fpe.b(zzfm.zza);
    }

    public static final /* synthetic */ zzq zzb(zzfp zzfpVar) {
        return (zzq) zzfpVar.zzi.getValue();
    }

    public static final /* synthetic */ zzcg zzd(zzfp zzfpVar, Exception exc) {
        return exc instanceof nqb ? zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzb, exc.getMessage(), null, 8, null)) : exc instanceof zzcg ? zzfpVar.zzt(exc, (zzcg) exc) : zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzZ, exc.getMessage(), null, 8, null));
    }

    public static final /* synthetic */ zzci zze(zzfp zzfpVar) {
        return (zzci) zzfpVar.zzd.getValue();
    }

    public static final /* synthetic */ zzcr zzf(zzfp zzfpVar) {
        return (zzcr) zzfpVar.zzh.getValue();
    }

    public static final /* synthetic */ zzcy zzg(zzfp zzfpVar) {
        return (zzcy) zzfpVar.zzc.getValue();
    }

    public static final /* synthetic */ zzda zzh(zzfp zzfpVar) {
        return (zzda) zzfpVar.zzg.getValue();
    }

    public static final /* synthetic */ zzht zzi(zzfp zzfpVar) {
        return (zzht) zzfpVar.zzb.getValue();
    }

    public static final /* synthetic */ zzif zzj(zzfp zzfpVar) {
        return (zzif) zzfpVar.zze.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzs() {
        return (Application) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzcg zzt(Exception exc, zzcg zzcgVar) {
        return !zzu() ? new zzcg(zzce.zzc, zzcd.zzao, exc.getMessage(), null, 8, null) : zzcgVar;
    }

    private final boolean zzu() {
        NetworkCapabilities networkCapabilities;
        int i = zzby.zza;
        try {
            Object systemService = zzs().getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasCapability(16);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzv(String str) {
        try {
            zzxg zzj = zzxg.zzj(zzdb.zza(str));
            int i = zzby.zza;
            ((zziq) fpe.b(zzeu.zza).getValue()).zza(zzj);
        } catch (Exception e) {
            throw new zzcg(zzce.zzl, zzcd.zzan, e.getMessage(), null, 8, null);
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

    public final Object zzl(String str, long j, px2 px2Var) {
        return new zzhf(27, new zzet(this, str, j, null), null);
    }

    public final Object zzm(zzye zzyeVar, long j, px2 px2Var) {
        return new zzhf(28, new zzex(this, j, zzyeVar, null), null);
    }

    public final Object zzn(zzxn zzxnVar, long j, px2 px2Var) {
        return new zzhg(new zzfd(j, this, zzxnVar, null));
    }

    public final Object zzo(zzyg zzygVar, px2 px2Var) {
        return new zzhf(29, new zzfe(zzygVar, this, null), null);
    }

    public final Object zzp(long j, px2 px2Var) {
        return new zzhf(22, new zzfo(j, this, null), null);
    }
}
