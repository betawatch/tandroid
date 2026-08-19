package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes.dex */
public final class zzfp {
    private final String zza;
    private final Lazy zzb;
    private final Lazy zzc;
    private final Lazy zzd;
    private final Lazy zze;
    private final Lazy zzf;
    private final Lazy zzg;
    private final Lazy zzh;
    private final Lazy zzi;

    public zzfp(String str) {
        this.zza = str;
        int i = zzby.zza;
        this.zzb = LazyKt.lazy(zzff.zza);
        this.zzc = LazyKt.lazy(zzfg.zza);
        this.zzd = LazyKt.lazy(zzfh.zza);
        this.zze = LazyKt.lazy(zzfi.zza);
        this.zzf = LazyKt.lazy(zzfj.zza);
        this.zzg = LazyKt.lazy(zzfk.zza);
        this.zzh = LazyKt.lazy(zzfl.zza);
        this.zzi = LazyKt.lazy(zzfm.zza);
    }

    public static final /* synthetic */ zzq zzb(zzfp zzfpVar) {
        return (zzq) zzfpVar.zzi.getValue();
    }

    public static final /* synthetic */ zzcg zzd(zzfp zzfpVar, Exception exc) {
        return exc instanceof TimeoutCancellationException ? zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzb, exc.getMessage(), null, 8, null)) : exc instanceof zzcg ? zzfpVar.zzt(exc, (zzcg) exc) : zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzZ, exc.getMessage(), null, 8, null));
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
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        int i = zzby.zza;
        try {
            Object systemService = zzs().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            connectivityManager = (ConnectivityManager) systemService;
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            activeNetwork = connectivityManager.getActiveNetwork();
            return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzv(String str) {
        try {
            zzxg zzj = zzxg.zzj(zzdb.zza(str));
            int i = zzby.zza;
            ((zziq) LazyKt.lazy(zzeu.zza).getValue()).zza(zzj);
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

    public final Object zzl(String str, long j, Continuation continuation) {
        return new zzhf(27, new zzet(this, str, j, null), null);
    }

    public final Object zzm(zzye zzyeVar, long j, Continuation continuation) {
        return new zzhf(28, new zzex(this, j, zzyeVar, null), null);
    }

    public final Object zzn(zzxn zzxnVar, long j, Continuation continuation) {
        return new zzhg(new zzfd(j, this, zzxnVar, null));
    }

    public final Object zzo(zzyg zzygVar, Continuation continuation) {
        return new zzhf(29, new zzfe(zzygVar, this, null), null);
    }

    public final Object zzp(long j, Continuation continuation) {
        return new zzhf(22, new zzfo(j, this, null), null);
    }
}
