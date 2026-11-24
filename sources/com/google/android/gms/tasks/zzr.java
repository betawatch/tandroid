package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzr {
    private final Object zza = new Object();
    private Queue zzb;
    private boolean zzc;

    public final void zza(zzq zzqVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new ArrayDeque();
            }
            this.zzb.add(zzqVar);
        }
    }

    public final void zzb(Task task) {
        zzq zzqVar;
        synchronized (this.zza) {
            if (this.zzb == null || this.zzc) {
                return;
            }
            this.zzc = true;
            while (true) {
                synchronized (this.zza) {
                    zzqVar = (zzq) this.zzb.poll();
                    if (zzqVar == null) {
                        this.zzc = false;
                        return;
                    }
                }
                zzqVar.zza(task);
            }
        }
    }
}
