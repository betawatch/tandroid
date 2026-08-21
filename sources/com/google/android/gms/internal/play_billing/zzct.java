package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class zzct implements Runnable {
    final Future zza;
    final zzcs zzb;

    zzct(Future future, zzcs zzcsVar) {
        this.zza = future;
        this.zzb = zzcsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable zza;
        boolean z = false;
        Future future = this.zza;
        if ((future instanceof zzdf) && (zza = zzdg.zza((zzdf) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            if (!future.isDone()) {
                throw new IllegalStateException(zzbj.zza("Future was expected to be done: %s", future));
            }
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzbc zza = zzbe.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
