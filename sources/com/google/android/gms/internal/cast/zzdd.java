package com.google.android.gms.internal.cast;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.core.content.ContextCompat;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdd implements zzda {
    private static final Logger zzb = new Logger("ConnectivityMonitor");
    private final zzrx zzc;
    private final ConnectivityManager zze;
    private boolean zzh;
    private final Context zzi;
    private final Object zzj = new Object();
    public final Set zza = Collections.synchronizedSet(new HashSet());
    private final Map zzf = DesugarCollections.synchronizedMap(new HashMap());
    private final List zzg = Collections.synchronizedList(new ArrayList());
    private final ConnectivityManager.NetworkCallback zzd = new zzdc(this);

    public zzdd(Context context, zzrx zzrxVar) {
        this.zzc = zzrxVar;
        this.zzi = context;
        this.zze = (ConnectivityManager) context.getSystemService("connectivity");
    }

    static /* bridge */ /* synthetic */ void zzc(zzdd zzddVar) {
        synchronized (Preconditions.checkNotNull(zzddVar.zzj)) {
            if (zzddVar.zzf != null && zzddVar.zzg != null) {
                zzb.d("all networks are unavailable.", new Object[0]);
                zzddVar.zzf.clear();
                zzddVar.zzg.clear();
                zzddVar.zzg();
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzd(zzdd zzddVar, Network network) {
        synchronized (Preconditions.checkNotNull(zzddVar.zzj)) {
            try {
                if (zzddVar.zzf != null && zzddVar.zzg != null) {
                    zzb.d("the network is lost", new Object[0]);
                    if (zzddVar.zzg.remove(network)) {
                        zzddVar.zzf.remove(network);
                    }
                    zzddVar.zzg();
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Network network, LinkProperties linkProperties) {
        synchronized (Preconditions.checkNotNull(this.zzj)) {
            try {
                if (this.zzf != null && this.zzg != null) {
                    zzb.d("a new network is available", new Object[0]);
                    if (this.zzf.containsKey(network)) {
                        this.zzg.remove(network);
                    }
                    this.zzf.put(network, linkProperties);
                    this.zzg.add(network);
                    zzg();
                }
            } finally {
            }
        }
    }

    private final void zzg() {
        if (this.zzc == null) {
            return;
        }
        synchronized (this.zza) {
            try {
                Iterator it = this.zza.iterator();
                while (it.hasNext()) {
                    ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                    if (!this.zzc.isShutdown()) {
                        final zzcz zzczVar = null;
                        this.zzc.execute(new Runnable(zzczVar) { // from class: com.google.android.gms.internal.cast.zzdb
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdd.this.zze();
                                throw null;
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r1 = r4.zze.getLinkProperties(r0);
     */
    @Override // com.google.android.gms.internal.cast.zzda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza() {
        Network activeNetwork;
        NetworkRequest.Builder addTransportType;
        NetworkRequest build;
        LinkProperties linkProperties;
        zzb.d("Start monitoring connectivity changes", new Object[0]);
        if (this.zzh || this.zze == null || ContextCompat.checkSelfPermission(this.zzi, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return;
        }
        activeNetwork = this.zze.getActiveNetwork();
        if (activeNetwork != null && linkProperties != null) {
            zzf(activeNetwork, linkProperties);
        }
        ConnectivityManager connectivityManager = this.zze;
        addTransportType = new NetworkRequest.Builder().addTransportType(1);
        build = addTransportType.build();
        connectivityManager.registerNetworkCallback(build, this.zzd);
        this.zzh = true;
    }

    public final boolean zze() {
        List list = this.zzg;
        return (list == null || list.isEmpty()) ? false : true;
    }
}
