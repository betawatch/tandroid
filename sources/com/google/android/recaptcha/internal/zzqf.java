package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        w26.g();
        return (byte) 0;
    }
}
