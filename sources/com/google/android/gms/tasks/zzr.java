package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
