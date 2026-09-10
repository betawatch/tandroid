package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
final class zzqf extends zzqg {
    final /* synthetic */ zzqm zza;
    private int zzb = 0;
    private final int zzc;

    public zzqf(zzqm zzqmVar) {
        this.zza = zzqmVar;
        this.zzc = zzqmVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
