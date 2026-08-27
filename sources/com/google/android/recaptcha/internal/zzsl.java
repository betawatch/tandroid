package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class zzsl implements zzsc {
    final int zza;
    final zzvg zzb;

    public zzsl(zzsq zzsqVar, int i10, zzvg zzvgVar, boolean z10, boolean z11) {
        this.zza = i10;
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
