package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzn implements ServiceConnection {
    zzp zzc;
    final /* synthetic */ zzu zzf;
    int zza = 0;
    final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzk
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i);
            }
            zzn zznVar = zzn.this;
            synchronized (zznVar) {
                try {
                    zzr zzrVar = (zzr) zznVar.zze.get(i);
                    if (zzrVar == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                        return true;
                    }
                    zznVar.zze.remove(i);
                    zznVar.zzf();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        zzrVar.zzc(new zzs(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    zzrVar.zza(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    final Queue zzd = new ArrayDeque();
    final SparseArray zze = new SparseArray();

    /* synthetic */ zzn(zzu zzuVar, zzm zzmVar) {
        this.zzf = zzuVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                zzn zznVar = zzn.this;
                IBinder iBinder2 = iBinder;
                synchronized (zznVar) {
                    if (iBinder2 == null) {
                        zznVar.zza(0, "Null service connection");
                        return;
                    }
                    try {
                        zznVar.zzc = new zzp(iBinder2);
                        zznVar.zza = 2;
                        zznVar.zzc();
                    } catch (RemoteException e) {
                        zznVar.zza(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                zzn.this.zza(2, "Service disconnected");
            }
        });
    }

    final synchronized void zza(int i, String str) {
        zzb(i, str, null);
    }

    final synchronized void zzb(int i, String str, Throwable th) {
        Context context;
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.zza;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.zza = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.zza = 4;
            zzu zzuVar = this.zzf;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = zzuVar.zzb;
            connectionTracker.unbindService(context, this);
            zzs zzsVar = new zzs(i, str, th);
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((zzr) it.next()).zzc(zzsVar);
            }
            this.zzd.clear();
            for (int i3 = 0; i3 < this.zze.size(); i3++) {
                ((zzr) this.zze.valueAt(i3)).zzc(zzsVar);
            }
            this.zze.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void zzc() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                final zzr zzrVar;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                while (true) {
                    final zzn zznVar = zzn.this;
                    synchronized (zznVar) {
                        try {
                            if (zznVar.zza != 2) {
                                return;
                            }
                            if (zznVar.zzd.isEmpty()) {
                                zznVar.zzf();
                                return;
                            }
                            zzrVar = (zzr) zznVar.zzd.poll();
                            zznVar.zze.put(zzrVar.zza, zzrVar);
                            scheduledExecutorService2 = zznVar.zzf.zzc;
                            scheduledExecutorService2.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzn.this.zze(zzrVar.zza);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } finally {
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(zzrVar)));
                    }
                    zzu zzuVar = zznVar.zzf;
                    Messenger messenger = zznVar.zzb;
                    int i = zzrVar.zzc;
                    context = zzuVar.zzb;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = zzrVar.zza;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zzrVar.zzb());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", zzrVar.zzd);
                    obtain.setData(bundle);
                    try {
                        zznVar.zzc.zza(obtain);
                    } catch (RemoteException e) {
                        zznVar.zza(2, e.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    final synchronized void zze(int i) {
        zzr zzrVar = (zzr) this.zze.get(i);
        if (zzrVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i);
            this.zze.remove(i);
            zzrVar.zzc(new zzs(3, "Timed out waiting for response", null));
            zzf();
        }
    }

    final synchronized void zzf() {
        Context context;
        try {
            if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.zza = 3;
                zzu zzuVar = this.zzf;
                ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                context = zzuVar.zzb;
                connectionTracker.unbindService(context, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean zzg(zzr zzrVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i = this.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzd.add(zzrVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.zzd.add(zzrVar);
            zzc();
            return true;
        }
        this.zzd.add(zzrVar);
        Preconditions.checkState(this.zza == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.zza = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzf.zzb;
            if (connectionTracker.bindService(context, intent, this, 1)) {
                scheduledExecutorService = this.zzf.zzc;
                scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzn.this.zzd();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zza(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            zzb(0, "Unable to bind to service", e);
        }
        return true;
    }
}
