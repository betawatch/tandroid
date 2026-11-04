package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import b8.hb;
import com.google.android.recaptcha.RecaptchaAction;
import dd.c;
import kotlin.jvm.internal.j;
import wd.x1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        int i3 = zzby.zza;
        this.zzb = hb.b(zzff.zza);
        this.zzc = hb.b(zzfg.zza);
        this.zzd = hb.b(zzfh.zza);
        this.zze = hb.b(zzfi.zza);
        this.zzf = hb.b(zzfj.zza);
        this.zzg = hb.b(zzfk.zza);
        this.zzh = hb.b(zzfl.zza);
        this.zzi = hb.b(zzfm.zza);
    }

    public static final /* synthetic */ zzq zzb(zzfp zzfpVar) {
        return (zzq) zzfpVar.zzi.getValue();
    }

    public static final /* synthetic */ zzcg zzd(zzfp zzfpVar, Exception exc) {
        return exc instanceof x1 ? zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzb, exc.getMessage(), null, 8, null)) : exc instanceof zzcg ? zzfpVar.zzt(exc, (zzcg) exc) : zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzZ, exc.getMessage(), null, 8, null));
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
        int i3 = zzby.zza;
        try {
            Object systemService = zzs().getSystemService("connectivity");
            j.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasCapability(16);
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
            int i3 = zzby.zza;
            ((zziq) hb.b(zzeu.zza).getValue()).zza(zzj);
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

    public final Object zzl(String str, long j10, fd.c cVar) {
        return new zzhf(27, new zzet(this, str, j10, null), null);
    }

    public final Object zzm(zzye zzyeVar, long j10, fd.c cVar) {
        return new zzhf(28, new zzex(this, j10, zzyeVar, null), null);
    }

    public final Object zzn(zzxn zzxnVar, long j10, fd.c cVar) {
        return new zzhg(new zzfd(j10, this, zzxnVar, null));
    }

    public final Object zzo(zzyg zzygVar, fd.c cVar) {
        return new zzhf(29, new zzfe(zzygVar, this, null), null);
    }

    public final Object zzp(long j10, fd.c cVar) {
        return new zzhf(22, new zzfo(j10, this, null), null);
    }
}
