package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzsl implements zzsc {
    final int zza;
    final zzvg zzb;

    public zzsl(zzsq zzsqVar, int i7, zzvg zzvgVar, boolean z9, boolean z10) {
        this.zza = i7;
        this.zzb = zzvgVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzsl) obj).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzsc
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzsc
    public final zztr zzb(zztr zztrVar, zzts zztsVar) {
        zzsh zzshVar = (zzsh) zztrVar;
        zzshVar.zzh((zzsn) zztsVar);
        return zzshVar;
    }

    @Override // com.google.android.recaptcha.internal.zzsc
    public final zztx zzc(zztx zztxVar, zztx zztxVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.recaptcha.internal.zzsc
    public final zzvg zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzsc
    public final zzvh zze() {
        return this.zzb.zza();
    }

    @Override // com.google.android.recaptcha.internal.zzsc
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzsc
    public final boolean zzg() {
        return false;
    }
}
