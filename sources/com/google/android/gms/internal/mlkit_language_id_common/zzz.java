package com.google.android.gms.internal.mlkit_language_id_common;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zzz extends zzu {
    final /* synthetic */ zzaa zza;

    zzz(zzaa zzaaVar) {
        this.zza = zzaaVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzk.zza(i, i2, "index");
        zzaa zzaaVar = this.zza;
        int i3 = i + i;
        objArr = zzaaVar.zzb;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzaaVar.zzb;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }
}
