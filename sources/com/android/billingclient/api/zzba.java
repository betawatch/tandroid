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
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzlo;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.internal.play_billing.zzlu;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class zzba implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final BillingClientStateListener zzb;

    /* synthetic */ zzba(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzbl zzblVar) {
        this.zza = billingClientImpl;
        this.zzb = billingClientStateListener;
    }

    private final void zzc(BillingResult billingResult) {
        Object obj;
        int i;
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                i = this.zza.zzb;
                if (i == 3) {
                    return;
                }
                this.zzb.onBillingSetupFinished(billingResult);
            } catch (Throwable th) {
                throw th;
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
        zze.zzl("BillingClient", "Billing service died.");
        try {
            if (BillingClientImpl.zzaq(this.zza)) {
                zzchVar2 = this.zza.zzg;
                zzjx zzc = zzjz.zzc();
                zzc.zzn(6);
                zzke zzc2 = zzki.zzc();
                zzc2.zzo(122);
                zzc.zza(zzc2);
                zzchVar2.zza((zzjz) zzc.zzf());
            } else {
                zzchVar = this.zza.zzg;
                zzchVar.zze(zzkl.zzB());
            }
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
        obj = this.zza.zza;
        synchronized (obj) {
            i = this.zza.zzb;
            if (i != 3) {
                i2 = this.zza.zzb;
                if (i2 != 0) {
                    this.zza.zzaJ(0);
                    this.zza.zzaL();
                    this.zzb.onBillingServiceDisconnected();
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        int i;
        Handler zzax;
        Future zzE;
        BillingResult zzaA;
        zze.zzk("BillingClient", "Billing service connected.");
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                i = this.zza.zzb;
                if (i == 3) {
                    return;
                }
                this.zza.zzh = com.google.android.gms.internal.play_billing.zzam.zzu(iBinder);
                BillingClientImpl billingClientImpl = this.zza;
                Callable callable = new Callable() { // from class: com.android.billingclient.api.zzay
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzba.this.zza();
                        return null;
                    }
                };
                Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzaz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzba.this.zzb();
                    }
                };
                zzax = billingClientImpl.zzax();
                zzE = BillingClientImpl.zzE(callable, 30000L, runnable, zzax, billingClientImpl.zzaD());
                if (zzE == null) {
                    BillingClientImpl billingClientImpl2 = this.zza;
                    zzaA = billingClientImpl2.zzaA();
                    billingClientImpl2.zzbe(25, 6, zzaA);
                    zzc(zzaA);
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
        zze.zzl("BillingClient", "Billing service disconnected.");
        try {
            if (BillingClientImpl.zzaq(this.zza)) {
                zzchVar2 = this.zza.zzg;
                zzjx zzc = zzjz.zzc();
                zzc.zzn(6);
                zzke zzc2 = zzki.zzc();
                zzc2.zzo(121);
                zzc.zza(zzc2);
                zzchVar2.zza((zzjz) zzc.zzf());
            } else {
                zzchVar = this.zza.zzg;
                zzchVar.zzg(zzlu.zzB());
            }
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                i = this.zza.zzb;
                if (i == 3) {
                    return;
                }
                this.zza.zzaJ(0);
                this.zzb.onBillingServiceDisconnected();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ Object zza() {
        Object obj;
        int i;
        int i2;
        Bundle bundle;
        boolean z;
        int i3;
        String zza;
        int i4;
        zzch zzchVar;
        zzch zzchVar2;
        Object obj2;
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        Context context;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Object obj3;
        int i21;
        zzn zznVar;
        boolean z2;
        int i22;
        String str;
        Long l;
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                i = this.zza.zzb;
                if (i != 3) {
                    i2 = this.zza.zzb;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        BillingClientImpl billingClientImpl = this.zza;
                        str = billingClientImpl.zzc;
                        l = billingClientImpl.zzF;
                        zze.zzc(bundle, str, l.longValue());
                    }
                    try {
                        obj2 = this.zza.zza;
                        synchronized (obj2) {
                            zzanVar = this.zza.zzh;
                        }
                    } catch (Exception e) {
                        z = i2 != 1;
                        zze.zzm("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                        i3 = e instanceof DeadObjectException ? 101 : e instanceof RemoteException ? 100 : e instanceof SecurityException ? 102 : 42;
                        zza = i3 == 42 ? zzcg.zza(e) : null;
                        this.zza.zzaJ(0);
                        i4 = 6;
                    }
                    if (zzanVar == null) {
                        this.zza.zzaJ(0);
                        BillingClientImpl billingClientImpl2 = this.zza;
                        BillingResult billingResult = zzcj.zzm;
                        billingClientImpl2.zzbe(119, 6, billingResult);
                        zzc(billingResult);
                    } else {
                        context = this.zza.zzf;
                        String packageName = context.getPackageName();
                        int i23 = 23;
                        i4 = 3;
                        while (true) {
                            if (i23 < 3) {
                                i23 = 0;
                                break;
                            }
                            i4 = bundle == null ? zzanVar.zzy(i23, packageName, "subs") : zzanVar.zzc(i23, packageName, "subs", bundle);
                            if (i4 == 0) {
                                zze.zzk("BillingClient", "highestLevelSupportedForSubs: " + i23);
                                break;
                            }
                            i23--;
                        }
                        this.zza.zzk = i23 >= 5;
                        this.zza.zzj = i23 >= 3;
                        if (i23 < 3) {
                            zze.zzk("BillingClient", "In-app billing API does not support subscription on this device.");
                            i3 = 9;
                        } else {
                            i3 = 1;
                        }
                        int i24 = 23;
                        while (true) {
                            if (i24 < 3) {
                                break;
                            }
                            i4 = bundle == null ? zzanVar.zzy(i24, packageName, "inapp") : zzanVar.zzc(i24, packageName, "inapp", bundle);
                            if (i4 == 0) {
                                this.zza.zzl = i24;
                                i22 = this.zza.zzl;
                                zze.zzk("BillingClient", "mHighestLevelSupportedForInApp: " + i22);
                                break;
                            }
                            i24--;
                        }
                        BillingClientImpl billingClientImpl3 = this.zza;
                        i5 = billingClientImpl3.zzl;
                        billingClientImpl3.zzA = i5 >= 23;
                        BillingClientImpl billingClientImpl4 = this.zza;
                        i6 = billingClientImpl4.zzl;
                        billingClientImpl4.zzz = i6 >= 22;
                        BillingClientImpl billingClientImpl5 = this.zza;
                        i7 = billingClientImpl5.zzl;
                        billingClientImpl5.zzy = i7 >= 21;
                        BillingClientImpl billingClientImpl6 = this.zza;
                        i8 = billingClientImpl6.zzl;
                        billingClientImpl6.zzx = i8 >= 20;
                        BillingClientImpl billingClientImpl7 = this.zza;
                        i9 = billingClientImpl7.zzl;
                        billingClientImpl7.zzw = i9 >= 19;
                        BillingClientImpl billingClientImpl8 = this.zza;
                        i10 = billingClientImpl8.zzl;
                        billingClientImpl8.zzv = i10 >= 18;
                        BillingClientImpl billingClientImpl9 = this.zza;
                        i11 = billingClientImpl9.zzl;
                        billingClientImpl9.zzu = i11 >= 17;
                        BillingClientImpl billingClientImpl10 = this.zza;
                        i12 = billingClientImpl10.zzl;
                        billingClientImpl10.zzt = i12 >= 16;
                        BillingClientImpl billingClientImpl11 = this.zza;
                        i13 = billingClientImpl11.zzl;
                        billingClientImpl11.zzs = i13 >= 15;
                        BillingClientImpl billingClientImpl12 = this.zza;
                        i14 = billingClientImpl12.zzl;
                        billingClientImpl12.zzr = i14 >= 14;
                        BillingClientImpl billingClientImpl13 = this.zza;
                        i15 = billingClientImpl13.zzl;
                        billingClientImpl13.zzq = i15 >= 12;
                        BillingClientImpl billingClientImpl14 = this.zza;
                        i16 = billingClientImpl14.zzl;
                        billingClientImpl14.zzp = i16 >= 10;
                        BillingClientImpl billingClientImpl15 = this.zza;
                        i17 = billingClientImpl15.zzl;
                        billingClientImpl15.zzo = i17 >= 9;
                        BillingClientImpl billingClientImpl16 = this.zza;
                        i18 = billingClientImpl16.zzl;
                        billingClientImpl16.zzn = i18 >= 8;
                        BillingClientImpl billingClientImpl17 = this.zza;
                        i19 = billingClientImpl17.zzl;
                        billingClientImpl17.zzm = i19 >= 6;
                        i20 = this.zza.zzl;
                        if (i20 < 3) {
                            zze.zzl("BillingClient", "In-app billing API version 3 is not supported on this device.");
                            i3 = 36;
                        }
                        if (i4 == 0) {
                            obj3 = this.zza.zza;
                            synchronized (obj3) {
                                try {
                                    i21 = this.zza.zzb;
                                    if (i21 != 3) {
                                        z = i2 != 1;
                                        this.zza.zzaJ(2);
                                        zznVar = this.zza.zze;
                                        zzn zznVar2 = zznVar != null ? this.zza.zze : null;
                                        if (zznVar2 != null) {
                                            z2 = this.zza.zzy;
                                            zznVar2.zzg(z2);
                                        }
                                    }
                                } finally {
                                }
                            }
                        } else {
                            z = i2 != 1;
                            this.zza.zzaJ(0);
                        }
                        zza = null;
                        if (i4 == 0) {
                            try {
                                if (true != z) {
                                    this.zza.zzbg(6);
                                } else {
                                    zzchVar = this.zza.zzg;
                                    zzlo zzc = zzlq.zzc();
                                    zzke zzc2 = zzki.zzc();
                                    zzc2.zzn(0);
                                    zzc.zza(zzc2);
                                    zzchVar.zzf((zzlq) zzc.zzf());
                                }
                            } catch (Throwable th) {
                                zze.zzm("BillingClient", "Unable to log.", th);
                            }
                            zzc(zzcj.zzl);
                        } else {
                            BillingResult billingResult2 = zzcj.zza;
                            try {
                                if (true != z) {
                                    this.zza.zzbf(i3, 6, billingResult2, zza);
                                } else {
                                    zzke zzc3 = zzki.zzc();
                                    zzc3.zzn(billingResult2.getResponseCode());
                                    zzc3.zzm(billingResult2.getDebugMessage());
                                    zzc3.zzo(i3);
                                    if (zza != null) {
                                        zzc3.zza(zza);
                                    }
                                    zzchVar2 = this.zza.zzg;
                                    zzlo zzc4 = zzlq.zzc();
                                    zzc4.zzm((zzki) zzc3.zzf());
                                    zzchVar2.zzf((zzlq) zzc4.zzf());
                                }
                            } catch (Throwable th2) {
                                zze.zzm("BillingClient", "Unable to log.", th2);
                            }
                            zzc(zzcj.zza);
                        }
                    }
                }
            } finally {
            }
        }
        return null;
    }

    final /* synthetic */ void zzb() {
        this.zza.zzaJ(0);
        BillingResult billingResult = zzcj.zzn;
        this.zza.zzbe(24, 6, billingResult);
        zzc(billingResult);
    }
}
