package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
