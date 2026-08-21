package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* loaded from: classes.dex */
final class zzca extends zzbt {
    static final zzbt zza = new zzca(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzca(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbg.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, com.google.android.gms.internal.play_billing.zzbq
    final int zza(Object[] objArr, int i) {
        Object[] objArr2 = this.zzb;
        int i2 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final Object[] zzg() {
        return this.zzb;
    }
}
