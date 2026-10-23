package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import be.e2;
import com.google.android.recaptcha.RecaptchaAction;
import id.c;
import id.g;
import kotlin.jvm.internal.i;
import v7.h8;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
        this.zzb = h8.a(zzff.zza);
        this.zzc = h8.a(zzfg.zza);
        this.zzd = h8.a(zzfh.zza);
        this.zze = h8.a(zzfi.zza);
        this.zzf = h8.a(zzfj.zza);
        this.zzg = h8.a(zzfk.zza);
        this.zzh = h8.a(zzfl.zza);
        this.zzi = h8.a(zzfm.zza);
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
            i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
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
            int i10 = zzby.zza;
            ((zziq) h8.a(zzeu.zza).a()).zza(zzj);
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

    public final Object zzl(String str, long j10, kd.c cVar) {
        return new zzhf(27, new zzet(this, str, j10, null), null);
    }

    public final Object zzm(zzye zzyeVar, long j10, kd.c cVar) {
        return new zzhf(28, new zzex(this, j10, zzyeVar, null), null);
    }

    public final Object zzn(zzxn zzxnVar, long j10, kd.c cVar) {
        return new zzhg(new zzfd(j10, this, zzxnVar, null));
    }

    public final Object zzo(zzyg zzygVar, kd.c cVar) {
        return new zzhf(29, new zzfe(zzygVar, this, null), null);
    }

    public final Object zzp(long j10, kd.c cVar) {
        return new zzhf(22, new zzfo(j10, this, null), null);
    }
}
