package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzaz;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzdj;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import com.google.android.gms.internal.play_billing.zzp;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* loaded from: classes.dex */
class BillingClientImpl extends BillingClient {
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private PendingPurchasesParams zzD;
    private boolean zzE;
    private boolean zzF;
    private volatile BillingClientStateListener zzG;
    private ExecutorService zzH;
    private final Long zzI;
    private zzbl zzJ;
    private final Object zza;
    private volatile int zzb;
    private final String zzc;
    private final String zzd;
    private final Handler zze;
    private volatile zzs zzf;
    private Context zzg;
    private zzch zzh;
    private volatile com.google.android.gms.internal.play_billing.zzam zzi;
    private volatile zzbf zzj;
    private boolean zzk;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, zzb zzbVar, String str, zzch zzchVar, BillingClient.Builder builder) {
        this.zzg = context.getApplicationContext();
        zziq zzc = zzis.zzc();
        zzc.zzs(str);
        String str2 = this.zzd;
        if (str2 != null) {
            zzc.zzt(str2);
        }
        zzc.zzq(this.zzg.getPackageName());
        zzc.zzn(this.zzI.longValue());
        zzc.zzr(builder.zza);
        zzc.zza(Build.VERSION.SDK_INT);
        zzc.zzp(772604006L);
        try {
            zzc.zzl(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        if (zzchVar != null) {
            this.zzh = zzchVar;
        } else {
            this.zzh = new zzcl(this.zzg, (zzis) zzc.zze());
        }
        if (purchasesUpdatedListener == null) {
            zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new zzs(this.zzg, purchasesUpdatedListener, null, zzbVar, null, this.zzh);
        this.zzD = pendingPurchasesParams;
        this.zzF = zzbVar != null;
        this.zzg.getPackageName();
        this.zzE = builder.zza;
    }

    static Future zzG(Callable callable, long j, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzaj
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    zzc.zzn("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            zzc.zzo("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static /* synthetic */ void zzH(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        zzie zzieVar = zzie.zzx;
        BillingResult billingResult = zzcj.zzk;
        billingClientImpl.zzbd(zzieVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public static /* synthetic */ void zzI(BillingClientImpl billingClientImpl, PurchasesResponseListener purchasesResponseListener) {
        zzie zzieVar = zzie.zzx;
        BillingResult billingResult = zzcj.zzk;
        billingClientImpl.zzbd(zzieVar, 9, billingResult);
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzbt.zzk());
    }

    public static /* synthetic */ void zzN(BillingClientImpl billingClientImpl, ProductDetailsResponseListener productDetailsResponseListener) {
        zzie zzieVar = zzie.zzx;
        BillingResult billingResult = zzcj.zzk;
        billingClientImpl.zzbd(zzieVar, 7, billingResult);
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
    }

    public static /* synthetic */ void zzP(BillingClientImpl billingClientImpl, BillingResult billingResult) {
        if (billingClientImpl.zzf.zzd() != null) {
            billingClientImpl.zzf.zzd().onPurchasesUpdated(billingResult, null);
        } else {
            zzc.zzn("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    /* JADX WARN: Finally extract failed */
    private final void zzaD(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        int zza;
        String str;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            zzc.zzm("BillingClient", "Consuming purchase with token: " + purchaseToken);
            synchronized (this.zza) {
                try {
                    try {
                        zzamVar = this.zzi;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (DeadObjectException e) {
                    e = e;
                    zzaG(consumeResponseListener, purchaseToken, zzcj.zzj, zzie.zzC, "Error consuming purchase!", e);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    zzaG(consumeResponseListener, purchaseToken, zzcj.zzh, zzie.zzC, "Error consuming purchase!", e);
                    return;
                }
            }
            if (zzamVar == null) {
                try {
                    zzaG(consumeResponseListener, purchaseToken, zzcj.zzj, zzie.zzbc, "Service has been reset to null.", null);
                    return;
                } catch (DeadObjectException e3) {
                    e = e3;
                    zzaG(consumeResponseListener, purchaseToken, zzcj.zzj, zzie.zzC, "Error consuming purchase!", e);
                    return;
                } catch (Exception e4) {
                    e = e4;
                    zzaG(consumeResponseListener, purchaseToken, zzcj.zzh, zzie.zzC, "Error consuming purchase!", e);
                    return;
                }
            }
            if (this.zzp) {
                String packageName = this.zzg.getPackageName();
                boolean z = this.zzp;
                String str2 = this.zzc;
                String str3 = this.zzd;
                long longValue = this.zzI.longValue();
                Bundle bundle = new Bundle();
                if (z) {
                    zzc.zzc(bundle, str2, str3, longValue);
                }
                Bundle zze = zzamVar.zze(9, packageName, purchaseToken, bundle);
                zza = zze.getInt("RESPONSE_CODE");
                str = zzc.zzj(zze, "BillingClient");
            } else {
                zza = zzamVar.zza(3, this.zzg.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult zza2 = zzcj.zza(zza, str);
            if (zza == 0) {
                zzc.zzm("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
                return;
            }
            zzaG(consumeResponseListener, purchaseToken, zza2, zzie.zzw, "Error consuming purchase with token. Response code: " + zza, null);
        } catch (DeadObjectException e5) {
            e = e5;
        } catch (Exception e6) {
            e = e6;
        }
    }

    private final void zzaG(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, zzie zzieVar, String str2, Exception exc) {
        zzc.zzo("BillingClient", str2, exc);
        zzbf(zzieVar, 4, billingResult, zzcg.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaO(zzhx zzhxVar) {
        try {
            this.zzh.zzb(zzhxVar, this.zzm);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzaP(zzhx zzhxVar, long j, boolean z) {
        try {
            this.zzh.zze(zzhxVar, this.zzm, j, z);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaQ(zzib zzibVar) {
        try {
            this.zzh.zzg(zzibVar, this.zzm);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaR(zzie zzieVar, BillingResult billingResult, int i) {
        try {
            int i2 = zzcg.$r8$clinit;
            zzhv zzhvVar = (zzhv) zzcg.zzb(zzieVar, 6, billingResult, null, zzil.zza).zzm();
            zzjt zzc = zzjv.zzc();
            zzc.zza(i > 0);
            zzc.zzl(i);
            zzhvVar.zzo(zzc);
            zzaO((zzhx) zzhvVar.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaS(int i) {
        synchronized (this.zza) {
            try {
                if (this.zzb == 3) {
                    return;
                }
                zzc.zzm("BillingClient", "Setting clientState from " + zzaZ(this.zzb) + " to " + zzaZ(i));
                this.zzb = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzaU(BillingClientStateListener billingClientStateListener, int i) {
        zzie zzieVar;
        BillingResult billingResult;
        BillingResult billingResult2;
        synchronized (this.zza) {
            try {
                if (zzaY()) {
                    billingResult = zzap(i);
                } else {
                    if (this.zzb == 1) {
                        zzc.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
                        zzie zzieVar2 = zzie.zzK;
                        billingResult2 = zzcj.zzd;
                        zzaR(zzieVar2, billingResult2, i);
                    } else if (this.zzb == 3) {
                        zzc.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        zzie zzieVar3 = zzie.zzL;
                        billingResult2 = zzcj.zzj;
                        zzaR(zzieVar3, billingResult2, i);
                    } else {
                        zzaS(1);
                        if (i == 0) {
                            this.zzG = billingClientStateListener;
                            i = 0;
                        }
                        zzaV();
                        zzc.zzm("BillingClient", "Starting in-app billing setup.");
                        this.zzj = new zzbf(this, billingClientStateListener, i, null);
                        this.zzj.zzc();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> queryIntentServices = this.zzg.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            zzieVar = zzie.zzO;
                        } else {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzieVar = zzie.zzN;
                                    zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.zzc);
                                    synchronized (this.zza) {
                                        try {
                                            if (this.zzb == 2) {
                                                billingResult = zzap(i);
                                            } else if (this.zzb != 1) {
                                                zzc.zzn("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                zzie zzieVar4 = zzie.zzba;
                                                billingResult2 = zzcj.zzj;
                                                zzaR(zzieVar4, billingResult2, i);
                                            } else {
                                                zzbf zzbfVar = this.zzj;
                                                if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.zzg.bindService(intent2, zzbfVar, 1) : this.zzg.bindService(intent2, 1, zzF(), zzbfVar)) {
                                                    zzc.zzm("BillingClient", "Service was bonded successfully.");
                                                    billingResult = null;
                                                } else {
                                                    zzieVar = zzie.zzM;
                                                    zzc.zzn("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                zzieVar = zzie.zzN;
                                zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        zzaS(0);
                        zzc.zzm("BillingClient", "Billing service unavailable on device.");
                        BillingResult billingResult3 = zzcj.zzb;
                        zzaR(zzieVar, billingResult3, i);
                        billingResult = billingResult3;
                    }
                    billingResult = billingResult2;
                }
            } finally {
            }
        }
        if (billingResult != null) {
            billingClientStateListener.onBillingSetupFinished(billingResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzaV() {
        synchronized (this.zza) {
            if (this.zzj != null) {
                try {
                    this.zzg.unbindService(this.zzj);
                } catch (Throwable th) {
                    try {
                        zzc.zzo("BillingClient", "There was an exception while unbinding service!", th);
                        this.zzi = null;
                        this.zzj = null;
                    } finally {
                        this.zzi = null;
                        this.zzj = null;
                    }
                }
            }
        }
    }

    private final boolean zzaW(long j) {
        try {
            BillingResult billingResult = (BillingResult) zzar(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                zzc.zzm("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
            } else {
                zzc.zzn("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zzc.zzo("BillingClient", "Error during reconnection attempt: ", e);
        }
        return zzaY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzaX(long j) {
        long max;
        zzbi zzb = zzbi.zzb(this.zzJ);
        long j2 = 30000;
        for (int i = 1; i <= 3; i++) {
            try {
                max = Math.max(0L, j2);
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zzc.zzo("BillingClient", "Error during reconnection attempt: ", e);
            }
            if (max <= 0) {
                zzc.zzn("BillingClient", "No time remaining for reconnection attempt.");
                return zzaY();
            }
            BillingResult billingResult = (BillingResult) zzar(i).get(max, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                zzc.zzm("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
                return zzaY();
            }
            zzc.zzn("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j2 = 30000 - zzb.zza(timeUnit);
            long pow = ((long) Math.pow(2.0d, i - 1)) * 1000;
            if (j2 < pow) {
                zzc.zzn("BillingClient", "Reconnection failed due to timeout limit reached.");
                return zzaY();
            }
            if (i < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j2 = 30000 - zzb.zza(timeUnit);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    zzc.zzo("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                }
            }
        }
        zzc.zzn("BillingClient", "Max retries reached.");
        return zzaY();
    }

    private final boolean zzaY() {
        boolean z;
        synchronized (this.zza) {
            try {
                z = false;
                if (this.zzb == 2 && this.zzi != null && this.zzj != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    private static final String zzaZ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    static /* bridge */ /* synthetic */ void zzac(BillingClientImpl billingClientImpl, int i) {
        billingClientImpl.zzm = i;
        billingClientImpl.zzC = i >= 26;
        billingClientImpl.zzB = i >= 24;
        billingClientImpl.zzA = i >= 23;
        billingClientImpl.zzz = i >= 22;
        billingClientImpl.zzy = i >= 21;
        billingClientImpl.zzx = i >= 20;
        billingClientImpl.zzw = i >= 19;
        billingClientImpl.zzv = i >= 18;
        billingClientImpl.zzu = i >= 17;
        billingClientImpl.zzt = i >= 16;
        billingClientImpl.zzs = i >= 15;
        billingClientImpl.zzr = i >= 14;
        billingClientImpl.zzq = i >= 12;
        billingClientImpl.zzp = i >= 9;
        billingClientImpl.zzo = i >= 8;
        billingClientImpl.zzn = i >= 6;
    }

    static /* bridge */ /* synthetic */ void zzae(BillingClientImpl billingClientImpl, int i) {
        if (i != 0) {
            billingClientImpl.zzaS(0);
            return;
        }
        synchronized (billingClientImpl.zza) {
            try {
                if (billingClientImpl.zzb == 3) {
                    return;
                }
                billingClientImpl.zzaS(2);
                zzs zzsVar = billingClientImpl.zzf != null ? billingClientImpl.zzf : null;
                if (zzsVar != null) {
                    zzsVar.zzg(billingClientImpl.zzy);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzai(BillingClientImpl billingClientImpl) {
        boolean z;
        synchronized (billingClientImpl.zza) {
            z = true;
            if (billingClientImpl.zzb != 1) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle zzal(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.zza) {
                zzamVar = this.zzi;
            }
            return zzamVar == null ? zzc.zzd(zzcj.zzj, zzie.zzbc) : zzamVar.zzg(i, this.zzg.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e) {
            return zzc.zze(zzcj.zzj, zzie.zze, zzcg.zza(e));
        } catch (Exception e2) {
            return zzc.zze(zzcj.zzh, zzie.zze, zzcg.zza(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle zzam(String str, String str2) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.zza) {
                zzamVar = this.zzi;
            }
            return zzamVar == null ? zzc.zzd(zzcj.zzj, zzie.zzbc) : zzamVar.zzf(3, this.zzg.getPackageName(), str, str2, null);
        } catch (DeadObjectException e) {
            return zzc.zze(zzcj.zzj, zzie.zze, zzcg.zza(e));
        } catch (Exception e2) {
            return zzc.zze(zzcj.zzh, zzie.zze, zzcg.zza(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler zzan() {
        return Looper.myLooper() == null ? this.zze : new Handler(Looper.myLooper());
    }

    private final zzbo zzao(BillingResult billingResult, zzie zzieVar, String str, Exception exc) {
        zzc.zzo("BillingClient", str, exc);
        zzbf(zzieVar, 7, billingResult, zzcg.zza(exc));
        return new zzbo(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList(), new ArrayList());
    }

    private final BillingResult zzap(int i) {
        zzc.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzhz zzc = zzib.zzc();
        zzc.zzo(6);
        zzjt zzc2 = zzjv.zzc();
        zzc2.zzn(true);
        zzc2.zza(i > 0);
        zzc2.zzl(i);
        zzc.zzn(zzc2);
        zzaQ((zzib) zzc.zze());
        return zzcj.zzi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzaq() {
        int[] iArr = {0, 3};
        synchronized (this.zza) {
            for (int i = 0; i < 2; i++) {
                if (this.zzb == iArr[i]) {
                    return zzcj.zzj;
                }
            }
            return zzcj.zzh;
        }
    }

    private final zzcz zzar(final int i) {
        if (this.zzE && !zzaY()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new com.google.android.gms.internal.play_billing.zzr() { // from class: com.android.billingclient.api.zzu
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(zzp zzpVar) {
                    return BillingClientImpl.zzq(BillingClientImpl.this, i, zzpVar);
                }
            });
        }
        zzc.zzm("BillingClient", "Already connected or not opted into auto reconnection.");
        return com.google.android.gms.internal.play_billing.zzcu.zza(zzcj.zzi);
    }

    private final String zzav(QueryProductDetailsParams queryProductDetailsParams) {
        if (TextUtils.isEmpty(null)) {
            return this.zzg.getPackageName();
        }
        return null;
    }

    private static String zzaw() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private final zzcw zzba(int i, BillingResult billingResult, zzie zzieVar, String str, Exception exc) {
        zzbf(zzieVar, 9, billingResult, zzcg.zza(exc));
        zzc.zzo("BillingClient", str, exc);
        return new zzcw(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0170 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzcw zzbb(String str, boolean z, int i) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        BillingResult build;
        zzie zzieVar;
        BillingClientImpl billingClientImpl = this;
        char c = 0;
        zzc.zzm("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z2 = billingClientImpl.zzp;
        boolean z3 = billingClientImpl.zzw;
        boolean isEnabledForOneTimeProducts = billingClientImpl.zzD.isEnabledForOneTimeProducts();
        boolean isEnabledForPrepaidPlans = billingClientImpl.zzD.isEnabledForPrepaidPlans();
        long longValue = billingClientImpl.zzI.longValue();
        Bundle bundle = new Bundle();
        zzc.zzc(bundle, billingClientImpl.zzc, billingClientImpl.zzd, longValue);
        if (z2 && isEnabledForOneTimeProducts) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z3 && isEnabledForPrepaidPlans) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        String str2 = null;
        while (true) {
            try {
                synchronized (billingClientImpl.zza) {
                    zzamVar = billingClientImpl.zzi;
                }
                if (zzamVar == null) {
                    return billingClientImpl.zzba(9, zzcj.zzj, zzie.zzbc, "Service has been reset to null", null);
                }
                Bundle zzi = billingClientImpl.zzp ? zzamVar.zzi(billingClientImpl.zzC ? 26 : billingClientImpl.zzB ? 24 : billingClientImpl.zzw ? 19 : 9, billingClientImpl.zzg.getPackageName(), str, str2, bundle) : zzamVar.zzh(3, billingClientImpl.zzg.getPackageName(), str, str2);
                BillingResult billingResult = zzcj.zzh;
                if (zzi == null) {
                    Object[] objArr = new Object[1];
                    objArr[c] = "getPurchase()";
                    zzc.zzn("BillingClient", String.format("%s got null owned items list", objArr));
                    zzieVar = zzie.zzab;
                } else {
                    int zzb = zzc.zzb(zzi, "BillingClient");
                    String zzj = zzc.zzj(zzi, "BillingClient");
                    BillingResult.Builder newBuilder = BillingResult.newBuilder();
                    newBuilder.setResponseCode(zzb);
                    newBuilder.setDebugMessage(zzj);
                    build = newBuilder.build();
                    if (zzb != 0) {
                        Integer valueOf = Integer.valueOf(zzb);
                        Object[] objArr2 = new Object[2];
                        objArr2[c] = "getPurchase()";
                        objArr2[1] = valueOf;
                        zzc.zzn("BillingClient", String.format("%s failed. Response code: %s", objArr2));
                        zzieVar = zzie.zzw;
                    } else if (zzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && zzi.containsKey("INAPP_PURCHASE_DATA_LIST") && zzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            Object[] objArr3 = new Object[1];
                            objArr3[c] = "getPurchase()";
                            zzc.zzn("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", objArr3));
                            zzieVar = zzie.zzad;
                        } else if (stringArrayList2 == null) {
                            Object[] objArr4 = new Object[1];
                            objArr4[c] = "getPurchase()";
                            zzc.zzn("BillingClient", String.format("Bundle returned from %s contains null purchases list.", objArr4));
                            zzieVar = zzie.zzae;
                        } else if (stringArrayList3 == null) {
                            Object[] objArr5 = new Object[1];
                            objArr5[c] = "getPurchase()";
                            zzc.zzn("BillingClient", String.format("Bundle returned from %s contains null signatures list.", objArr5));
                            zzieVar = zzie.zzaf;
                        } else {
                            build = zzcj.zzi;
                            zzieVar = zzie.zza;
                        }
                    } else {
                        Object[] objArr6 = new Object[1];
                        objArr6[c] = "getPurchase()";
                        zzc.zzn("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", objArr6));
                        zzieVar = zzie.zzac;
                    }
                    if (build == zzcj.zzi) {
                        return billingClientImpl.zzba(9, build, zzieVar, "Purchase bundle invalid", null);
                    }
                    ArrayList<String> stringArrayList4 = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    boolean z4 = false;
                    for (int i2 = 0; i2 < stringArrayList5.size(); i2++) {
                        String str3 = stringArrayList5.get(i2);
                        String str4 = stringArrayList6.get(i2);
                        zzc.zzm("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i2))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                                zzc.zzn("BillingClient", "BUG: empty/null token!");
                                z4 = true;
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e) {
                            return zzba(9, zzcj.zzh, zzie.zzY, "Got an exception trying to decode the purchase!", e);
                        }
                    }
                    billingClientImpl = this;
                    if (z4) {
                        billingClientImpl.zzbd(zzie.zzz, 9, billingResult);
                    }
                    str2 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                    zzc.zzm("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        return new zzcw(zzcj.zzi, arrayList);
                    }
                    c = 0;
                }
                build = billingResult;
                if (build == zzcj.zzi) {
                }
            } catch (DeadObjectException e2) {
                return zzba(9, zzcj.zzj, zzie.zzZ, "Got exception trying to get purchases try to reconnect", e2);
            } catch (Exception e3) {
                return billingClientImpl.zzba(9, zzcj.zzh, zzie.zzZ, "Got exception trying to get purchases try to reconnect", e3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzbd(zzie zzieVar, int i, BillingResult billingResult) {
        try {
            int i2 = zzcg.$r8$clinit;
            zzaO(zzcg.zzb(zzieVar, i, billingResult, null, zzil.zza));
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbe(zzie zzieVar, int i, BillingResult billingResult, long j) {
        try {
            int i2 = zzcg.$r8$clinit;
            try {
                this.zzh.zzc(zzcg.zzb(zzieVar, 2, billingResult, null, zzil.zza), this.zzm, j);
            } catch (Throwable th) {
                zzc.zzo("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    private final void zzbf(zzie zzieVar, int i, BillingResult billingResult, String str) {
        try {
            int i2 = zzcg.$r8$clinit;
            zzaO(zzcg.zzb(zzieVar, i, billingResult, str, zzil.zza));
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbg(zzie zzieVar, int i, BillingResult billingResult, long j, boolean z) {
        try {
            int i2 = zzcg.$r8$clinit;
            zzaP(zzcg.zzb(zzieVar, 2, billingResult, null, zzil.zza), j, z);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbh(zzie zzieVar, int i, BillingResult billingResult, String str, long j, boolean z) {
        try {
            int i2 = zzcg.$r8$clinit;
            zzaP(zzcg.zzb(zzieVar, 2, billingResult, str, zzil.zza), j, z);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    static /* bridge */ /* synthetic */ BillingResult zzl(Exception exc) {
        return exc instanceof DeadObjectException ? zzcj.zzj : zzcj.zzh;
    }

    public static /* synthetic */ Object zzq(BillingClientImpl billingClientImpl, int i, zzp zzpVar) {
        billingClientImpl.zzaU(new zzbc(billingClientImpl, zzpVar), i);
        return "reconnectIfNeeded";
    }

    public static /* synthetic */ Object zzr(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        if (billingClientImpl.zzaX(30000L)) {
            billingClientImpl.zzaD(consumeParams, consumeResponseListener);
            return null;
        }
        zzie zzieVar = zzie.zzb;
        BillingResult billingResult = zzcj.zzj;
        billingClientImpl.zzbd(zzieVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        return null;
    }

    public static /* synthetic */ Object zzs(BillingClientImpl billingClientImpl, ProductDetailsResponseListener productDetailsResponseListener, QueryProductDetailsParams queryProductDetailsParams) {
        if (!billingClientImpl.zzaX(30000L)) {
            zzie zzieVar = zzie.zzb;
            BillingResult billingResult = zzcj.zzj;
            billingClientImpl.zzbd(zzieVar, 7, billingResult);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
            return null;
        }
        if (billingClientImpl.zzu) {
            zzbo zzg = billingClientImpl.zzg(queryProductDetailsParams);
            productDetailsResponseListener.onProductDetailsResponse(zzcj.zza(zzg.zza(), zzg.zzb()), new QueryProductDetailsResult(zzg.zzc(), zzg.zzd()));
            return null;
        }
        zzc.zzn("BillingClient", "Querying product details is not supported.");
        zzie zzieVar2 = zzie.zzt;
        BillingResult billingResult2 = zzcj.zzr;
        billingClientImpl.zzbd(zzieVar2, 7, billingResult2);
        productDetailsResponseListener.onProductDetailsResponse(billingResult2, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (zzG(new Callable() { // from class: com.android.billingclient.api.zzak
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzr(BillingClientImpl.this, consumeResponseListener, consumeParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzH(BillingClientImpl.this, consumeResponseListener, consumeParams);
            }
        }, zzan(), zzF()) == null) {
            BillingResult zzaq = zzaq();
            zzbd(zzie.zzy, 4, zzaq);
            consumeResponseListener.onConsumeResponse(zzaq, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        if (this.zzE) {
            return true;
        }
        return zzaY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.billingclient.api.BillingClient
    public BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams) {
        boolean zzd;
        long j;
        Future zzG;
        long j2;
        long j3;
        long j4;
        zzie zzieVar;
        BillingResult billingResult;
        boolean z;
        long j5;
        zzie zzieVar2;
        String str;
        boolean z2;
        boolean z3;
        long nextLong = new Random().nextLong();
        if (this.zzf == null || this.zzf.zzd() == null) {
            zzie zzieVar3 = zzie.zzl;
            BillingResult billingResult2 = zzcj.zzE;
            zzbe(zzieVar3, 2, billingResult2, nextLong);
            return billingResult2;
        }
        if (!zzaW(3000L)) {
            zzie zzieVar4 = zzie.zzb;
            BillingResult billingResult3 = zzcj.zzj;
            zzbe(zzieVar4, 2, billingResult3, nextLong);
            zzm(billingResult3);
            return billingResult3;
        }
        synchronized (this.zza) {
            try {
                zzd = this.zzj != null ? this.zzj.zzd() : false;
            } finally {
            }
        }
        ArrayList zzj = billingFlowParams.zzj();
        List zzk = billingFlowParams.zzk();
        String str2 = null;
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(com.google.android.gms.internal.play_billing.zzby.zza(zzj, null));
        BillingFlowParams.ProductDetailsParams productDetailsParams = (BillingFlowParams.ProductDetailsParams) com.google.android.gms.internal.play_billing.zzby.zza(zzk, null);
        final String productId = productDetailsParams.zza().getProductId();
        final String productType = productDetailsParams.zza().getProductType();
        if (productType.equals("subs") && !this.zzk) {
            zzc.zzn("BillingClient", "Current client doesn't support subscriptions.");
            zzie zzieVar5 = zzie.zzi;
            BillingResult billingResult4 = zzcj.zzl;
            zzbg(zzieVar5, 2, billingResult4, nextLong, zzd);
            zzm(billingResult4);
            return billingResult4;
        }
        if (billingFlowParams.zzt() && !this.zzn) {
            zzc.zzn("BillingClient", "Current client doesn't support extra params for buy intent.");
            zzie zzieVar6 = zzie.zzr;
            BillingResult billingResult5 = zzcj.zzf;
            zzbg(zzieVar6, 2, billingResult5, nextLong, zzd);
            zzm(billingResult5);
            return billingResult5;
        }
        if (zzj.size() > 1 && !this.zzt) {
            zzc.zzn("BillingClient", "Current client doesn't support multi-item purchases.");
            zzie zzieVar7 = zzie.zzs;
            BillingResult billingResult6 = zzcj.zzp;
            zzbg(zzieVar7, 2, billingResult6, nextLong, zzd);
            zzm(billingResult6);
            return billingResult6;
        }
        if (!zzk.isEmpty() && !this.zzu) {
            zzc.zzn("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            zzie zzieVar8 = zzie.zzt;
            BillingResult billingResult7 = zzcj.zzr;
            zzbg(zzieVar8, 2, billingResult7, nextLong, zzd);
            zzm(billingResult7);
            return billingResult7;
        }
        BillingResult zzd2 = billingFlowParams.zzd();
        if (zzd2 != zzcj.zzi) {
            zzbg(zzie.zzbd, 2, zzd2, nextLong, zzd);
            zzm(zzd2);
            return zzd2;
        }
        if (this.zzn) {
            boolean z4 = this.zzp;
            boolean z5 = this.zzw;
            boolean isEnabledForOneTimeProducts = this.zzD.isEnabledForOneTimeProducts();
            boolean isEnabledForPrepaidPlans = this.zzD.isEnabledForPrepaidPlans();
            boolean z6 = this.zzF;
            String str3 = this.zzc;
            String str4 = this.zzd;
            boolean z7 = zzd;
            long longValue = this.zzI.longValue();
            this.zzg.getPackageName();
            int i = zzc.zza;
            final Bundle bundle = new Bundle();
            zzc.zzc(bundle, str3, str4, longValue);
            bundle.putLong("billingClientTransactionId", nextLong);
            if (billingFlowParams.zzb() != 0) {
                bundle.putInt("prorationMode", billingFlowParams.zzb());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zze())) {
                bundle.putString("accountId", billingFlowParams.zze());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzf())) {
                bundle.putString("obfuscatedProfileId", billingFlowParams.zzf());
            }
            if (billingFlowParams.zzs()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzh())) {
                bundle.putString("oldSkuPurchaseToken", billingFlowParams.zzh());
            }
            billingFlowParams.zzg();
            if (TextUtils.isEmpty(null)) {
                str = null;
            } else {
                billingFlowParams.zzg();
                str = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzi())) {
                bundle.putString("originalExternalTransactionId", billingFlowParams.zzi());
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("paymentsPurchaseParams", str);
            }
            if (z4 && isEnabledForOneTimeProducts) {
                z2 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z2 = true;
            }
            if (z5 && isEnabledForPrepaidPlans) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z2);
            }
            if (z6) {
                bundle.putBoolean("enableAlternativeBilling", z2);
            }
            billingFlowParams.zzc();
            billingFlowParams.zza();
            ArrayList arrayList = new ArrayList();
            for (BillingFlowParams.ProductDetailsParams productDetailsParams2 : billingFlowParams.zzk()) {
            }
            if (!arrayList.isEmpty()) {
                zzdj zza = zzdk.zza();
                zza.zza(arrayList);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((zzdk) zza.zze()).zzM());
            }
            if (zzj.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(zzk.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(zzk.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                int i2 = 0;
                long j6 = nextLong;
                while (i2 < zzk.size()) {
                    BillingFlowParams.ProductDetailsParams productDetailsParams3 = (BillingFlowParams.ProductDetailsParams) zzk.get(i2);
                    ProductDetails zza2 = productDetailsParams3.zza();
                    long j7 = j6;
                    if (!zza2.zzb().isEmpty()) {
                        arrayList4.add(zza2.zzb());
                    }
                    arrayList5.add(productDetailsParams3.zzb());
                    String zzc = zza2.zzc();
                    if (zza2.zzd() != null && !zza2.zzd().isEmpty()) {
                        Iterator it = zza2.zzd().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = (ProductDetails.OneTimePurchaseOfferDetails) it.next();
                            if (!TextUtils.isEmpty(oneTimePurchaseOfferDetails.zzb())) {
                                zzc = oneTimePurchaseOfferDetails.zzb();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(zzc)) {
                        arrayList6.add(zzc);
                    }
                    if (i2 > 0) {
                        arrayList2.add(((BillingFlowParams.ProductDetailsParams) zzk.get(i2)).zza().getProductId());
                        arrayList3.add(((BillingFlowParams.ProductDetailsParams) zzk.get(i2)).zza().getProductType());
                    }
                    i2++;
                    j6 = j7;
                }
                j = j6;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList7.isEmpty()) {
                    bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                }
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            } else {
                ArrayList<String> arrayList8 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = zzj.iterator();
                if (it2.hasNext()) {
                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it2.next());
                    throw null;
                }
                if (!arrayList8.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList8);
                }
                if (zzj.size() > 1) {
                    ArrayList<String> arrayList9 = new ArrayList<>(zzj.size() - 1);
                    ArrayList<String> arrayList10 = new ArrayList<>(zzj.size() - 1);
                    if (1 < zzj.size()) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzj.get(1));
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList9);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList10);
                }
                j = nextLong;
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.zzr) {
                zzie zzieVar9 = zzie.zzu;
                BillingResult billingResult8 = zzcj.zzq;
                zzbg(zzieVar9, 2, billingResult8, j, z7);
                zzm(billingResult8);
                return billingResult8;
            }
            zzd = z7;
            if (productDetailsParams == null || TextUtils.isEmpty(productDetailsParams.zza().zza())) {
                z3 = false;
            } else {
                bundle.putString("skuPackageName", productDetailsParams.zza().zza());
                z3 = true;
            }
            str2 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                zzc.zzn("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    bundle.putString("proxyPackageVersion", this.zzg.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle.putString("proxyPackageVersion", "package not found");
                }
            }
            final int i3 = (!this.zzu || zzk.isEmpty()) ? (this.zzs && z3) ? 15 : this.zzp ? 9 : 6 : 17;
            final BillingFlowParams billingFlowParams2 = billingFlowParams;
            zzG = zzG(new Callable() { // from class: com.android.billingclient.api.zzw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle zzal;
                    zzal = BillingClientImpl.this.zzal(i3, productId, productType, billingFlowParams2, bundle);
                    return zzal;
                }
            }, 5000L, null, this.zze, zzF());
            j2 = billingFlowParams2;
        } else {
            j = nextLong;
            zzG = zzG(new Callable() { // from class: com.android.billingclient.api.zzx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle zzam;
                    zzam = BillingClientImpl.this.zzam(productId, productType);
                    return zzam;
                }
            }, 5000L, null, this.zze, zzF());
            j2 = nextLong;
        }
        try {
            if (zzG == null) {
                try {
                    zzieVar = zzie.zzy;
                    billingResult = zzcj.zzc;
                    z = zzd;
                    j5 = j;
                } catch (CancellationException e) {
                    e = e;
                    j4 = j;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar10 = zzie.zzd;
                    BillingResult billingResult9 = zzcj.zzk;
                    zzbh(zzieVar10, 2, billingResult9, zzcg.zza(e), j4, zzd);
                    zzm(billingResult9);
                    return billingResult9;
                } catch (TimeoutException e2) {
                    e = e2;
                    j4 = j;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar102 = zzie.zzd;
                    BillingResult billingResult92 = zzcj.zzk;
                    zzbh(zzieVar102, 2, billingResult92, zzcg.zza(e), j4, zzd);
                    zzm(billingResult92);
                    return billingResult92;
                } catch (Exception e3) {
                    e = e3;
                    j3 = j;
                }
                try {
                    zzbg(zzieVar, 2, billingResult, j5, z);
                    zzm(billingResult);
                    return billingResult;
                } catch (CancellationException e4) {
                    e = e4;
                    zzd = z;
                    j4 = j5;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar1022 = zzie.zzd;
                    BillingResult billingResult922 = zzcj.zzk;
                    zzbh(zzieVar1022, 2, billingResult922, zzcg.zza(e), j4, zzd);
                    zzm(billingResult922);
                    return billingResult922;
                } catch (TimeoutException e5) {
                    e = e5;
                    zzd = z;
                    j4 = j5;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar10222 = zzie.zzd;
                    BillingResult billingResult9222 = zzcj.zzk;
                    zzbh(zzieVar10222, 2, billingResult9222, zzcg.zza(e), j4, zzd);
                    zzm(billingResult9222);
                    return billingResult9222;
                } catch (Exception e6) {
                    e = e6;
                    zzd = z;
                    j3 = j5;
                    zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    zzie zzieVar11 = zzie.zze;
                    BillingResult billingResult10 = zzcj.zzj;
                    zzbh(zzieVar11, 2, billingResult10, zzcg.zza(e), j3, zzd);
                    zzm(billingResult10);
                    return billingResult10;
                }
            }
            j2 = j;
            Bundle bundle2 = (Bundle) zzG.get(5000L, TimeUnit.MILLISECONDS);
            int zzb = zzc.zzb(bundle2, "BillingClient");
            String zzj2 = zzc.zzj(bundle2, "BillingClient");
            if (zzb == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j2);
                intent2.putExtra("wasServiceAutoReconnected", zzd);
                activity.startActivity(intent2);
                return zzcj.zzi;
            }
            zzc.zzn("BillingClient", "Unable to buy item, Error response code: " + zzb);
            BillingResult zza3 = zzcj.zza(zzb, zzj2);
            try {
                if (bundle2 == null) {
                    zzieVar2 = zzie.zza;
                } else {
                    Object obj = bundle2.get("LOG_REASON");
                    if (obj == null) {
                        zzieVar2 = zzie.zza;
                    } else if (obj instanceof Integer) {
                        zzieVar2 = zzie.zzb(((Integer) obj).intValue());
                    } else {
                        zzc.zzn("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        zzieVar2 = zzie.zza;
                    }
                }
            } catch (Throwable th) {
                zzc.zzn("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                zzieVar2 = zzie.zza;
            }
            if (zzieVar2 == zzie.zza) {
                zzieVar2 = zzie.zzw;
            }
            zzie zzieVar12 = zzieVar2;
            if (bundle2 != null) {
                try {
                    str2 = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th2) {
                    zzc.zzn("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                }
            }
            try {
                zzbh(zzieVar12, 2, zza3, str2, j2, zzd);
                zzm(zza3);
                return zza3;
            } catch (CancellationException e7) {
                e = e7;
                j4 = j2;
                zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzie zzieVar102222 = zzie.zzd;
                BillingResult billingResult92222 = zzcj.zzk;
                zzbh(zzieVar102222, 2, billingResult92222, zzcg.zza(e), j4, zzd);
                zzm(billingResult92222);
                return billingResult92222;
            } catch (TimeoutException e8) {
                e = e8;
                j4 = j2;
                zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzie zzieVar1022222 = zzie.zzd;
                BillingResult billingResult922222 = zzcj.zzk;
                zzbh(zzieVar1022222, 2, billingResult922222, zzcg.zza(e), j4, zzd);
                zzm(billingResult922222);
                return billingResult922222;
            } catch (Exception e9) {
                e = e9;
                j3 = j2;
                zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                zzie zzieVar112 = zzie.zze;
                BillingResult billingResult102 = zzcj.zzj;
                zzbh(zzieVar112, 2, billingResult102, zzcg.zza(e), j3, zzd);
                zzm(billingResult102);
                return billingResult102;
            }
        } catch (CancellationException e10) {
            e = e10;
            zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
            zzie zzieVar10222222 = zzie.zzd;
            BillingResult billingResult9222222 = zzcj.zzk;
            zzbh(zzieVar10222222, 2, billingResult9222222, zzcg.zza(e), j4, zzd);
            zzm(billingResult9222222);
            return billingResult9222222;
        } catch (TimeoutException e11) {
            e = e11;
            j4 = j2;
            zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
            zzie zzieVar102222222 = zzie.zzd;
            BillingResult billingResult92222222 = zzcj.zzk;
            zzbh(zzieVar102222222, 2, billingResult92222222, zzcg.zza(e), j4, zzd);
            zzm(billingResult92222222);
            return billingResult92222222;
        } catch (Exception e12) {
            e = e12;
            zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
            zzie zzieVar1122 = zzie.zze;
            BillingResult billingResult1022 = zzcj.zzj;
            zzbh(zzieVar1122, 2, billingResult1022, zzcg.zza(e), j3, zzd);
            zzm(billingResult1022);
            return billingResult1022;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (zzG(new Callable() { // from class: com.android.billingclient.api.zzal
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzs(BillingClientImpl.this, productDetailsResponseListener, queryProductDetailsParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzap
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzN(BillingClientImpl.this, productDetailsResponseListener);
            }
        }, zzan(), zzF()) == null) {
            BillingResult zzaq = zzaq();
            zzbd(zzie.zzy, 7, zzaq);
            productDetailsResponseListener.onProductDetailsResponse(zzaq, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, final PurchasesResponseListener purchasesResponseListener) {
        if (zzG(new zzaw(this, purchasesResponseListener, queryPurchasesParams.zza(), false), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzat
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzI(BillingClientImpl.this, purchasesResponseListener);
            }
        }, zzan(), zzF()) == null) {
            BillingResult zzaq = zzaq();
            zzbd(zzie.zzy, 9, zzaq);
            purchasesResponseListener.onQueryPurchasesResponse(zzaq, com.google.android.gms.internal.play_billing.zzbt.zzk());
        }
    }

    final synchronized ExecutorService zzF() {
        try {
            if (this.zzH == null) {
                this.zzH = Executors.newFixedThreadPool(zzc.zza, new zzav(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzH;
    }

    public final void zzag(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.zze.post(runnable);
        }
    }

    final zzbo zzg(QueryProductDetailsParams queryProductDetailsParams) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String zzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzbt zza = queryProductDetailsParams.zza();
        int size = zza.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 20;
            ArrayList arrayList3 = new ArrayList(zza.subList(i3, i4 > size ? size : i4));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList4.add(((QueryProductDetailsParams.Product) arrayList3.get(i5)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.zzc;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.zza) {
                    zzamVar = this.zzi;
                }
                if (zzamVar == null) {
                    return zzao(zzcj.zzj, zzie.zzbc, "Service has been reset to null.", null);
                }
                boolean z = this.zzw && this.zzD.isEnabledForPrepaidPlans();
                zzav(queryProductDetailsParams);
                zzav(queryProductDetailsParams);
                zzav(queryProductDetailsParams);
                zzav(queryProductDetailsParams);
                Bundle zzj = zzamVar.zzj(true != this.zzx ? 17 : 20, this.zzg.getPackageName(), zzb, bundle, zzc.zzf(str, this.zzd, arrayList3, null, null, zza.zza(z, true, false, true, false, true), this.zzI.longValue()));
                if (zzj == null) {
                    return zzao(zzcj.zzB, zzie.zzR, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!zzj.containsKey("DETAILS_LIST")) {
                    int zzb2 = zzc.zzb(zzj, "BillingClient");
                    String zzj2 = zzc.zzj(zzj, "BillingClient");
                    if (zzb2 == 0) {
                        return zzao(zzcj.zza(6, zzj2), zzie.zzS, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return zzao(zzcj.zza(zzb2, zzj2), zzie.zzw, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + zzb2, null);
                }
                ArrayList<String> stringArrayList = zzj.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return zzao(zzcj.zzB, zzie.zzT, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    try {
                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i6));
                        zzc.zzm("BillingClient", "Got product details: ".concat(productDetails.toString()));
                        arrayList5.add(productDetails);
                    } catch (JSONException e) {
                        return zzao(zzcj.zza(6, "Error trying to decode SkuDetails."), zzie.zzU, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                    }
                }
                ArrayList<String> stringArrayList2 = zzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 != null) {
                        int size4 = stringArrayList2.size();
                        int i7 = 0;
                        while (i7 < size4) {
                            String str2 = stringArrayList2.get(i7);
                            i7++;
                            UnfetchedProduct unfetchedProduct = new UnfetchedProduct(str2);
                            zzc.zzm("BillingClient", "Got unfetchedProduct: ".concat(unfetchedProduct.toString()));
                            arrayList6.add(unfetchedProduct);
                        }
                    } else {
                        int size5 = arrayList3.size();
                        int i8 = 0;
                        while (i8 < size5) {
                            Object obj = arrayList3.get(i8);
                            int i9 = i8 + 1;
                            QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) obj;
                            int size6 = arrayList5.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size6) {
                                    i = size5;
                                    i2 = i9;
                                    arrayList6.add(new UnfetchedProduct(new JSONObject().put("productId", product.zza()).put(TeXSymbolParser.TYPE_ATTR, product.zzb()).put("statusCode", 0).toString()));
                                    break;
                                }
                                Object obj2 = arrayList5.get(i10);
                                i10++;
                                ProductDetails productDetails2 = (ProductDetails) obj2;
                                i = size5;
                                i2 = i9;
                                if (!product.zza().equals(productDetails2.getProductId()) || !product.zzb().equals(productDetails2.getProductType())) {
                                    size5 = i;
                                    i9 = i2;
                                }
                            }
                            size5 = i;
                            i8 = i2;
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i3 = i4;
                } catch (JSONException e2) {
                    return zzao(zzcj.zza(6, "Error trying to decode SkuDetails."), zzie.zzU, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e2);
                }
            } catch (DeadObjectException e3) {
                return zzao(zzcj.zzj, zzie.zzQ, "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
            } catch (Exception e4) {
                return zzao(zzcj.zzh, zzie.zzQ, "queryProductDetailsAsync got a remote exception (try to reconnect).", e4);
            }
        }
        return new zzbo(0, "", arrayList, arrayList2);
    }

    final zzch zzj() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final BillingResult zzm(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zze.post(new Runnable() { // from class: com.android.billingclient.api.zzac
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzP(BillingClientImpl.this, billingResult);
            }
        });
        return billingResult;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        zzaU(billingClientStateListener, 0);
    }

    BillingClientImpl(String str, Context context, zzch zzchVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.zzI = valueOf;
        this.zzJ = zzaz.zza();
        this.zzc = "8.0.0";
        String zzaw = zzaw();
        this.zzd = zzaw;
        this.zzg = context.getApplicationContext();
        zziq zzc = zzis.zzc();
        zzc.zzs("8.0.0");
        if (zzaw != null) {
            zzc.zzt(zzaw);
        }
        zzc.zzq(this.zzg.getPackageName());
        zzc.zzn(valueOf.longValue());
        zzc.zzr(builder.zza);
        zzc.zza(Build.VERSION.SDK_INT);
        zzc.zzp(772604006L);
        try {
            zzc.zzl(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.zzh = new zzcl(this.zzg, (zzis) zzc.zze());
        this.zzg.getPackageName();
        this.zzE = builder.zza;
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzco zzcoVar, zzch zzchVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.zzI = valueOf;
        this.zzJ = zzaz.zza();
        this.zzc = "8.0.0";
        String zzaw = zzaw();
        this.zzd = zzaw;
        this.zzg = context.getApplicationContext();
        zziq zzc = zzis.zzc();
        zzc.zzs("8.0.0");
        if (zzaw != null) {
            zzc.zzt(zzaw);
        }
        zzc.zzq(this.zzg.getPackageName());
        zzc.zzn(valueOf.longValue());
        zzc.zzr(builder.zza);
        zzc.zza(Build.VERSION.SDK_INT);
        zzc.zzp(772604006L);
        try {
            zzc.zzl(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.zzh = new zzcl(this.zzg, (zzis) zzc.zze());
        zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzf = new zzs(this.zzg, null, null, null, null, this.zzh);
        this.zzD = pendingPurchasesParams;
        this.zzg.getPackageName();
        this.zzE = builder.zza;
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzb zzbVar, zzch zzchVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzI = Long.valueOf(new Random().nextLong());
        this.zzJ = zzaz.zza();
        this.zzc = "8.0.0";
        this.zzd = zzaw();
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, null, "8.0.0", null, builder);
    }
}
