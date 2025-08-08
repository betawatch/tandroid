package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class GmsClientSupervisor {
    static HandlerThread zza = null;
    private static final Object zzb = new Object();
    private static zzs zzc = null;
    private static Executor zzd = null;
    private static boolean zze = false;

    public static GmsClientSupervisor getInstance(Context context) {
        synchronized (zzb) {
            try {
                if (zzc == null) {
                    zzc = new zzs(context.getApplicationContext(), zze ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), zzd);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzc;
    }

    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void zza(zzo zzoVar, ServiceConnection serviceConnection, String str);

    public final void zzb(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        zza(new zzo(str, str2, 4225, z), serviceConnection, str3);
    }

    protected abstract boolean zzc(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor);
}
