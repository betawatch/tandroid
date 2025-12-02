package com.google.android.gms.internal.fido;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zzch extends zzcc {
    final /* synthetic */ zzci zza;

    zzch(zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzcv zzcvVar;
        zzcc zzccVar;
        zzcvVar = this.zza.zza.zzd;
        Object obj = zzcvVar.zzd.get(i);
        zzccVar = this.zza.zza.zze;
        return new AbstractMap.SimpleImmutableEntry(obj, zzccVar.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.size();
    }
}
