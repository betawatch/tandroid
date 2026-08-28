package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzr {
    private final Object zza = new Object();
    private Queue zzb;
    private boolean zzc;

    public final void zza(zzq zzqVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new ArrayDeque();
                }
                this.zzb.add(zzqVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(Task task) {
        zzq zzqVar;
        synchronized (this.zza) {
            if (this.zzb != null && !this.zzc) {
                this.zzc = true;
                while (true) {
                    synchronized (this.zza) {
                        try {
                            zzqVar = (zzq) this.zzb.poll();
                            if (zzqVar == null) {
                                this.zzc = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    zzqVar.zzd(task);
                }
            }
        }
    }
}
