package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzij;
import com.google.android.gms.internal.play_billing.zzjm;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzbf implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final BillingClientStateListener zzb;
    private final zzbi zzc;
    private final zzbi zzd;
    private final int zze;

    /* synthetic */ zzbf(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, int i, zzbp zzbpVar) {
        zzbl zzblVar;
        zzbl zzblVar2;
        Objects.requireNonNull(billingClientImpl);
        this.zza = billingClientImpl;
        zzblVar = billingClientImpl.zzJ;
        this.zzc = zzbi.zzc(zzblVar);
        zzblVar2 = billingClientImpl.zzJ;
        this.zzd = zzbi.zzc(zzblVar2);
        this.zzb = billingClientStateListener;
        this.zze = i;
    }

    public static /* synthetic */ Object zza(zzbf zzbfVar) {
        Object obj;
        int i;
        int i2;
        Bundle bundle;
        Object obj2;
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        Context context;
        int i3;
        int i4;
        zzch zzchVar;
        int i5;
        String str;
        String str2;
        Long l;
        BillingClientImpl billingClientImpl = zzbfVar.zza;
        obj = billingClientImpl.zza;
        synchronized (obj) {
            try {
                i = billingClientImpl.zzb;
                if (i != 3) {
                    i2 = billingClientImpl.zzb;
                    boolean z = i2 == 1;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        str = billingClientImpl.zzc;
                        str2 = billingClientImpl.zzd;
                        l = billingClientImpl.zzI;
                        zzc.zzc(bundle, str, str2, l.longValue());
                    }
                    zzie zzieVar = zzie.zza;
                    obj2 = billingClientImpl.zza;
                    synchronized (obj2) {
                        zzamVar = billingClientImpl.zzi;
                    }
                    if (zzamVar == null) {
                        BillingClientImpl billingClientImpl2 = zzbfVar.zza;
                        billingClientImpl2.zzaS(0);
                        int i6 = zzbfVar.zze;
                        zzie zzieVar2 = zzie.zzbc;
                        BillingResult billingResult = zzcj.zzj;
                        billingClientImpl2.zzaR(zzieVar2, billingResult, i6);
                        zzbfVar.zzg(billingResult);
                    } else {
                        BillingClientImpl billingClientImpl3 = zzbfVar.zza;
                        context = billingClientImpl3.zzg;
                        String packageName = context.getPackageName();
                        int i7 = 25;
                        int i8 = 25;
                        int i9 = 3;
                        while (true) {
                            if (i8 < 3) {
                                i8 = 0;
                                break;
                            }
                            if (bundle == null) {
                                try {
                                    i9 = zzamVar.zzw(i8, packageName, "subs");
                                } catch (Exception e) {
                                    zzc.zzo("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                    zzie zzieVar3 = e instanceof DeadObjectException ? zzie.zzaM : e instanceof RemoteException ? zzie.zzaL : e instanceof SecurityException ? zzie.zzaN : zzie.zzP;
                                    String zza = zzieVar3.equals(zzie.zzP) ? zzcg.zza(e) : null;
                                    zzbfVar.zza.zzaS(0);
                                    zzbfVar.zzf(BillingClientImpl.zzl(e), zzieVar3, zza, z);
                                    zzbfVar.zzg(BillingClientImpl.zzl(e));
                                }
                            } else {
                                i9 = zzamVar.zzc(i8, packageName, "subs", bundle);
                            }
                            if (i9 == 0) {
                                zzc.zzm("BillingClient", "highestLevelSupportedForSubs: " + i8);
                                break;
                            }
                            i8--;
                        }
                        billingClientImpl3.zzl = i8 >= 5;
                        billingClientImpl3.zzk = i8 >= 3;
                        if (i8 < 3) {
                            zzieVar = zzie.zzi;
                            zzc.zzm("BillingClient", "In-app billing API does not support subscription on this device.");
                        }
                        while (true) {
                            if (i7 < 3) {
                                break;
                            }
                            i9 = bundle == null ? zzamVar.zzw(i7, packageName, "inapp") : zzamVar.zzc(i7, packageName, "inapp", bundle);
                            if (i9 == 0) {
                                billingClientImpl3.zzm = i7;
                                i5 = billingClientImpl3.zzm;
                                zzc.zzm("BillingClient", "mHighestLevelSupportedForInApp: " + i5);
                                break;
                            }
                            i7--;
                        }
                        i3 = billingClientImpl3.zzm;
                        BillingClientImpl.zzac(billingClientImpl3, i3);
                        i4 = billingClientImpl3.zzm;
                        if (i4 < 3) {
                            zzieVar = zzie.zzJ;
                            zzc.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        }
                        BillingClientImpl.zzae(billingClientImpl3, i9);
                        if (i9 != 0) {
                            BillingResult billingResult2 = zzcj.zzb;
                            zzbfVar.zzf(billingResult2, zzieVar, null, z);
                            zzbfVar.zzg(billingResult2);
                        } else {
                            try {
                                Long zze = zzbfVar.zze(z);
                                if (z) {
                                    zzhz zzc = zzib.zzc();
                                    zzc.zzo(6);
                                    zzjt zzc2 = zzjv.zzc();
                                    int i10 = zzbfVar.zze;
                                    zzc2.zza(i10 > 0);
                                    zzc2.zzl(i10);
                                    if (zze != null) {
                                        zzc2.zzm(zze.longValue());
                                    }
                                    BillingClientImpl billingClientImpl4 = zzbfVar.zza;
                                    zzc.zzn(zzc2);
                                    billingClientImpl4.zzaQ((zzib) zzc.zze());
                                } else {
                                    zzjm zzc3 = zzjo.zzc();
                                    zzic zzc4 = zzig.zzc();
                                    zzc4.zzo(0);
                                    zzc3.zza(zzc4);
                                    if (zze != null) {
                                        zzc3.zzl(zze.longValue());
                                    }
                                    zzchVar = zzbfVar.zza.zzh;
                                    zzchVar.zzj((zzjo) zzc3.zze());
                                }
                            } catch (Throwable th) {
                                zzc.zzo("BillingClient", "Unable to log.", th);
                            }
                            zzbfVar.zzg(zzcj.zzi);
                        }
                    }
                }
            } finally {
            }
        }
        return null;
    }

    public static /* synthetic */ void zzb(zzbf zzbfVar) {
        BillingClientImpl billingClientImpl = zzbfVar.zza;
        billingClientImpl.zzaS(0);
        zzie zzieVar = zzie.zzx;
        BillingResult billingResult = zzcj.zzk;
        billingClientImpl.zzaR(zzieVar, billingResult, zzbfVar.zze);
        zzbfVar.zzg(billingResult);
    }

    private final Long zze(boolean z) {
        if (z) {
            zzbi zzbiVar = this.zzc;
            if (!zzbiVar.zzg()) {
                return null;
            }
            zzbiVar.zzf();
            return Long.valueOf(zzbiVar.zza(TimeUnit.MILLISECONDS));
        }
        zzbi zzbiVar2 = this.zzd;
        if (!zzbiVar2.zzg()) {
            return null;
        }
        zzbiVar2.zzf();
        return Long.valueOf(zzbiVar2.zza(TimeUnit.MILLISECONDS));
    }

    private final void zzf(BillingResult billingResult, zzie zzieVar, String str, boolean z) {
        zzch zzchVar;
        try {
            zzic zzc = zzig.zzc();
            zzc.zzo(billingResult.getResponseCode());
            zzc.zzl(billingResult.getDebugMessage());
            zzc.zzn(zzieVar);
            if (str != null) {
                zzc.zza(str);
            }
            Long zze = zze(z);
            if (!z) {
                zzjm zzc2 = zzjo.zzc();
                zzc2.zza(zzc);
                if (zze != null) {
                    zzc2.zzl(zze.longValue());
                }
                zzchVar = this.zza.zzh;
                zzchVar.zzj((zzjo) zzc2.zze());
                return;
            }
            zzjt zzc3 = zzjv.zzc();
            int i = this.zze;
            zzc3.zza(i > 0);
            zzc3.zzl(i);
            if (zze != null) {
                zzc3.zzm(zze.longValue());
            }
            BillingClientImpl billingClientImpl = this.zza;
            zzhv zzc4 = zzhx.zzc();
            zzc4.zzl(zzc);
            zzc4.zzp(6);
            zzc4.zzo(zzc3);
            billingClientImpl.zzaO((zzhx) zzc4.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzg(BillingResult billingResult) {
        Object obj;
        int i;
        BillingClientImpl billingClientImpl = this.zza;
        obj = billingClientImpl.zza;
        synchronized (obj) {
            try {
                i = billingClientImpl.zzb;
                if (i == 3) {
                    return;
                }
                try {
                    this.zzb.onBillingSetupFinished(billingResult);
                } catch (Throwable th) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        Object obj;
        int i;
        int i2;
        zzch zzchVar;
        zzch zzchVar2;
        zzc.zzn("BillingClient", "Billing service died.");
        try {
            BillingClientImpl billingClientImpl = this.zza;
            if (BillingClientImpl.zzai(billingClientImpl)) {
                zzchVar2 = billingClientImpl.zzh;
                zzhv zzc = zzhx.zzc();
                zzc.zzp(6);
                zzic zzc2 = zzig.zzc();
                zzc2.zzn(zzie.zzbf);
                zzc.zzl(zzc2);
                zzjt zzc3 = zzjv.zzc();
                int i3 = this.zze;
                zzc3.zza(i3 > 0);
                zzc3.zzl(i3);
                zzc.zzo(zzc3);
                zzchVar2.zza((zzhx) zzc.zze());
            } else {
                zzchVar = billingClientImpl.zzh;
                zzchVar.zzi(zzij.zzd());
            }
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
        BillingClientImpl billingClientImpl2 = this.zza;
        obj = billingClientImpl2.zza;
        synchronized (obj) {
            i = billingClientImpl2.zzb;
            if (i != 3) {
                i2 = billingClientImpl2.zzb;
                if (i2 != 0) {
                    billingClientImpl2.zzaS(0);
                    billingClientImpl2.zzaV();
                    try {
                        this.zzb.onBillingServiceDisconnected();
                    } catch (Throwable th2) {
                        zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                    }
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        int i;
        Handler zzan;
        BillingResult zzaq;
        zzc.zzm("BillingClient", "Billing service connected.");
        BillingClientImpl billingClientImpl = this.zza;
        obj = billingClientImpl.zza;
        synchronized (obj) {
            try {
                i = billingClientImpl.zzb;
                if (i == 3) {
                    return;
                }
                billingClientImpl.zzi = com.google.android.gms.internal.play_billing.zzal.zzs(iBinder);
                Callable callable = new Callable() { // from class: com.android.billingclient.api.zzbd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzbf.zza(zzbf.this);
                        return null;
                    }
                };
                Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzbe
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbf.zzb(zzbf.this);
                    }
                };
                zzan = billingClientImpl.zzan();
                if (BillingClientImpl.zzG(callable, 30000L, runnable, zzan, billingClientImpl.zzF()) == null) {
                    int i2 = this.zze;
                    zzaq = billingClientImpl.zzaq();
                    billingClientImpl.zzaR(zzie.zzy, zzaq, i2);
                    zzg(zzaq);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        int i;
        zzch zzchVar;
        zzch zzchVar2;
        zzc.zzn("BillingClient", "Billing service disconnected.");
        try {
            BillingClientImpl billingClientImpl = this.zza;
            if (BillingClientImpl.zzai(billingClientImpl)) {
                zzchVar2 = billingClientImpl.zzh;
                zzhv zzc = zzhx.zzc();
                zzc.zzp(6);
                zzic zzc2 = zzig.zzc();
                zzc2.zzn(zzie.zzbe);
                zzc.zzl(zzc2);
                zzjt zzc3 = zzjv.zzc();
                int i2 = this.zze;
                zzc3.zza(i2 > 0);
                zzc3.zzl(i2);
                zzc.zzo(zzc3);
                zzchVar2.zza((zzhx) zzc.zze());
            } else {
                zzchVar = billingClientImpl.zzh;
                zzchVar.zzk(zzjs.zzd());
            }
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
        zzbi zzbiVar = this.zzd;
        zzbiVar.zzd();
        zzbiVar.zze();
        BillingClientImpl billingClientImpl2 = this.zza;
        obj = billingClientImpl2.zza;
        synchronized (obj) {
            try {
                i = billingClientImpl2.zzb;
                if (i == 3) {
                    return;
                }
                billingClientImpl2.zzaS(0);
                try {
                    this.zzb.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } finally {
            }
        }
    }

    public final void zzc() {
        zzbi zzbiVar = this.zzc;
        zzbiVar.zzd();
        zzbiVar.zze();
    }

    final boolean zzd() {
        return this.zze > 0;
    }
}
