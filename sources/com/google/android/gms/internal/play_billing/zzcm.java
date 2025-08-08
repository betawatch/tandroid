package com.google.android.gms.internal.play_billing;

import java.util.List;

/* loaded from: classes.dex */
final class zzcm extends zzco {
    private final transient zzco zza;

    zzcm(zzco zzcoVar) {
        this.zza = zzcoVar;
    }

    private final int zzp(int i) {
        return (this.zza.size() - 1) - i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbe.zza(i, this.zza.size(), "index");
        return this.zza.get(zzp(i));
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzp(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzp(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.play_billing.zzco
    public final zzco zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco
    /* renamed from: zzi */
    public final zzco subList(int i, int i2) {
        zzbe.zze(i, i2, this.zza.size());
        zzco zzcoVar = this.zza;
        return zzcoVar.subList(zzcoVar.size() - i2, this.zza.size() - i).zzh();
    }
}
