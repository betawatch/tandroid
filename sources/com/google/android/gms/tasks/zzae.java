package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzae<T> implements zzab<T> {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzae(int i7, zzw zzwVar) {
        this.zzb = i7;
        this.zzc = zzwVar;
    }

    private final void zza() {
        int i7 = this.zzd + this.zze + this.zzf;
        int i10 = this.zzb;
        if (i7 == i10) {
            if (this.zzg == null) {
                if (this.zzh) {
                    this.zzc.zze();
                    return;
                } else {
                    this.zzc.zza(null);
                    return;
                }
            }
            zzw zzwVar = this.zzc;
            int i11 = this.zze;
            int length = String.valueOf(i11).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length + 8 + 24);
            sb2.append(i11);
            sb2.append(" out of ");
            sb2.append(i10);
            sb2.append(" underlying tasks failed");
            zzwVar.zzc(new ExecutionException(sb2.toString(), this.zzg));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t6) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
