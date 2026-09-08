package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.recaptcha.RecaptchaAction;
import gd.c;
import gd.g;
import kotlin.jvm.internal.i;
import v7.s7;
import zd.d2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        this.zzb = s7.a(zzff.zza);
        this.zzc = s7.a(zzfg.zza);
        this.zzd = s7.a(zzfh.zza);
        this.zze = s7.a(zzfi.zza);
        this.zzf = s7.a(zzfj.zza);
        this.zzg = s7.a(zzfk.zza);
        this.zzh = s7.a(zzfl.zza);
        this.zzi = s7.a(zzfm.zza);
    }

    public static final /* synthetic */ zzq zzb(zzfp zzfpVar) {
        return (zzq) ((g) zzfpVar.zzi).a();
    }

    public static final /* synthetic */ zzcg zzd(zzfp zzfpVar, Exception exc) {
        return exc instanceof d2 ? zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzb, exc.getMessage(), null, 8, null)) : exc instanceof zzcg ? zzfpVar.zzt(exc, (zzcg) exc) : zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzZ, exc.getMessage(), null, 8, null));
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
            int i10 = zzby.zza;
            ((zziq) s7.a(zzeu.zza).a()).zza(zzj);
        } catch (Exception e7) {
            throw new zzcg(zzce.zzl, zzcd.zzan, e7.getMessage(), null, 8, null);
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

    public final Object zzl(String str, long j3, id.c cVar) {
        return new zzhf(27, new zzet(this, str, j3, null), null);
    }

    public final Object zzm(zzye zzyeVar, long j3, id.c cVar) {
        return new zzhf(28, new zzex(this, j3, zzyeVar, null), null);
    }

    public final Object zzn(zzxn zzxnVar, long j3, id.c cVar) {
        return new zzhg(new zzfd(j3, this, zzxnVar, null));
    }

    public final Object zzo(zzyg zzygVar, id.c cVar) {
        return new zzhf(29, new zzfe(zzygVar, this, null), null);
    }

    public final Object zzp(long j3, id.c cVar) {
        return new zzhf(22, new zzfo(j3, this, null), null);
    }
}
