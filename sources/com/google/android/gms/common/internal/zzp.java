package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzp implements ServiceConnection, zzt {
    final /* synthetic */ zzs zza;
    private final Map zzb = new HashMap();
    private int zzc = 2;
    private boolean zzd;
    private IBinder zze;
    private final zzo zzf;
    private ComponentName zzg;

    public zzp(zzs zzsVar, zzo zzoVar) {
        this.zza = zzsVar;
        this.zzf = zzoVar;
    }

    static /* bridge */ /* synthetic */ ConnectionResult zzd(zzp zzpVar, String str, Executor executor) {
        Context context;
        ConnectionTracker connectionTracker;
        Context context2;
        ConnectionResult connectionResult;
        ConnectionTracker connectionTracker2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        try {
            zzo zzoVar = zzpVar.zzf;
            context = zzpVar.zza.zzc;
            Intent zzb = zzoVar.zzb(context);
            zzpVar.zzc = 3;
            StrictMode.VmPolicy zza = com.google.android.gms.common.util.zzc.zza();
            try {
                zzs zzsVar = zzpVar.zza;
                connectionTracker = zzsVar.zzf;
                context2 = zzsVar.zzc;
                boolean zza2 = connectionTracker.zza(context2, str, zzb, zzpVar, 4225, executor);
                zzpVar.zzd = zza2;
                if (zza2) {
                    handler = zzpVar.zza.zzd;
                    Message obtainMessage = handler.obtainMessage(1, zzpVar.zzf);
                    handler2 = zzpVar.zza.zzd;
                    j = zzpVar.zza.zzh;
                    handler2.sendMessageDelayed(obtainMessage, j);
                    connectionResult = ConnectionResult.RESULT_SUCCESS;
                } else {
                    zzpVar.zzc = 2;
                    try {
                        zzs zzsVar2 = zzpVar.zza;
                        connectionTracker2 = zzsVar2.zzf;
                        context3 = zzsVar2.zzc;
                        connectionTracker2.unbindService(context3, zzpVar);
                    } catch (IllegalArgumentException unused) {
                    }
                    connectionResult = new ConnectionResult(16);
                }
                return connectionResult;
            } finally {
                StrictMode.setVmPolicy(zza);
            }
        } catch (zzaj e) {
            return e.zza;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.zza.zzb;
        synchronized (hashMap) {
            try {
                handler = this.zza.zzd;
                handler.removeMessages(1, this.zzf);
                this.zze = iBinder;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.zzc = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.zza.zzb;
        synchronized (hashMap) {
            try {
                handler = this.zza.zzd;
                handler.removeMessages(1, this.zzf);
                this.zze = null;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.zzc = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final ComponentName zzb() {
        return this.zzg;
    }

    public final IBinder zzc() {
        return this.zze;
    }

    public final void zze(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.zzb.put(serviceConnection, serviceConnection2);
    }

    public final void zzf(ServiceConnection serviceConnection, String str) {
        this.zzb.remove(serviceConnection);
    }

    public final void zzg(String str) {
        Handler handler;
        ConnectionTracker connectionTracker;
        Context context;
        zzo zzoVar = this.zzf;
        handler = this.zza.zzd;
        handler.removeMessages(1, zzoVar);
        zzs zzsVar = this.zza;
        connectionTracker = zzsVar.zzf;
        context = zzsVar.zzc;
        connectionTracker.unbindService(context, this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final boolean zzh(ServiceConnection serviceConnection) {
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzi() {
        return this.zzb.isEmpty();
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
