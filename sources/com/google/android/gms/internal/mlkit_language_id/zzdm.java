package com.google.android.gms.internal.mlkit_language_id;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdm extends zzdo {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzdn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdm(zzdn zzdnVar) {
        this.zzc = zzdnVar;
        this.zzb = zzdnVar.zza();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id.zzds
    public final byte zza() {
        int i = this.zza;
        if (i >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i + 1;
        return this.zzc.zzb(i);
    }
}
