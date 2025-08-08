package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes.dex */
abstract class zzch extends zzci {
    Object[] zza;
    int zzb;
    boolean zzc;

    zzch(int i) {
        zzbw.zza(i, "initialCapacity");
        this.zza = new Object[i];
        this.zzb = 0;
    }

    private final void zzd(int i) {
        int length = this.zza.length;
        int zzc = zzci.zzc(length, this.zzb + i);
        if (zzc > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zzc);
            this.zzc = false;
        }
    }

    final void zzb(Object[] objArr, int i) {
        zzdd.zzb(objArr, i);
        zzd(i);
        System.arraycopy(objArr, 0, this.zza, this.zzb, i);
        this.zzb += i;
    }

    public final zzch zza(Object obj) {
        obj.getClass();
        zzd(1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }
}
