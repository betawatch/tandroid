package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        lq5.n();
        return (byte) 0;
    }
}
