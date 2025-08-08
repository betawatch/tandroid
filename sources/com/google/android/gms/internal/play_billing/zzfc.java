package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzfc implements Runnable {
    zzff zza;

    zzfc(zzff zzffVar) {
        this.zza = zzffVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r1 = r0.zzc;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzeu zzeuVar;
        ScheduledFuture scheduledFuture;
        zzff zzffVar = this.zza;
        if (zzffVar == null || zzeuVar == null) {
            return;
        }
        this.zza = null;
        if (zzeuVar.isDone()) {
            zzffVar.zzp(zzeuVar);
            return;
        }
        try {
            scheduledFuture = zzffVar.zzd;
            zzffVar.zzd = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzffVar.zzo(new zzfd(str, null));
                    throw th;
                }
            }
            zzffVar.zzo(new zzfd(str + ": " + zzeuVar.toString(), null));
        } finally {
            zzeuVar.cancel(true);
        }
    }
}
