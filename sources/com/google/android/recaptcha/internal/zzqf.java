package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        int i7 = this.zzb;
        if (i7 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i7 + 1;
        return this.zza.zzb(i7);
    }
}
