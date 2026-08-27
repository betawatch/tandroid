package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.recaptcha.RecaptchaAction;
import h7.j6;
import id.e2;
import kotlin.jvm.internal.j;
import pc.c;
import pc.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        int i10 = zzby.zza;
        this.zzb = j6.a(zzff.zza);
        this.zzc = j6.a(zzfg.zza);
        this.zzd = j6.a(zzfh.zza);
        this.zze = j6.a(zzfi.zza);
        this.zzf = j6.a(zzfj.zza);
        this.zzg = j6.a(zzfk.zza);
        this.zzh = j6.a(zzfl.zza);
        this.zzi = j6.a(zzfm.zza);
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
        int i10 = zzby.zza;
        try {
            Object systemService = zzs().getSystemService("connectivity");
            j.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
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
            int i10 = zzby.zza;
            ((zziq) j6.a(zzeu.zza).a()).zza(zzj);
        } catch (Exception e9) {
            throw new zzcg(zzce.zzl, zzcd.zzan, e9.getMessage(), null, 8, null);
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

    public final Object zzl(String str, long j10, rc.c cVar) {
        return new zzhf(27, new zzet(this, str, j10, null), null);
    }

    public final Object zzm(zzye zzyeVar, long j10, rc.c cVar) {
        return new zzhf(28, new zzex(this, j10, zzyeVar, null), null);
    }

    public final Object zzn(zzxn zzxnVar, long j10, rc.c cVar) {
        return new zzhg(new zzfd(j10, this, zzxnVar, null));
    }

    public final Object zzo(zzyg zzygVar, rc.c cVar) {
        return new zzhf(29, new zzfe(zzygVar, this, null), null);
    }

    public final Object zzp(long j10, rc.c cVar) {
        return new zzhf(22, new zzfo(j10, this, null), null);
    }
}
