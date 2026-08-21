package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zzcb extends zzbt {
    final /* synthetic */ zzcc zza;

    zzcb(zzcc zzccVar) {
        Objects.requireNonNull(zzccVar);
        this.zza = zzccVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        zzcc zzccVar = this.zza;
        i2 = zzccVar.zzc;
        zzbg.zza(i, i2, "index");
        objArr = zzccVar.zzb;
        int i3 = i + i;
        Object obj = objArr[i3];
        Objects.requireNonNull(obj);
        objArr2 = zzccVar.zzb;
        Object obj2 = objArr2[i3 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean zzf() {
        return true;
    }
}
