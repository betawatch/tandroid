package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class zzux extends zzuv {
    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzsn zzsnVar = (zzsn) obj;
        zzuw zzuwVar = zzsnVar.zzc;
        if (zzuwVar != zzuw.zzc()) {
            return zzuwVar;
        }
        zzuw zzf = zzuw.zzf();
        zzsnVar.zzc = zzf;
        return zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* synthetic */ Object zzb() {
        return zzuw.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* synthetic */ Object zzc(Object obj) {
        zzuw zzuwVar = (zzuw) obj;
        zzuwVar.zzh();
        return zzuwVar;
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i7, int i10) {
        ((zzuw) obj).zzj((i7 << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i7, long j3) {
        ((zzuw) obj).zzj((i7 << 3) | 1, Long.valueOf(j3));
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i7, Object obj2) {
        ((zzuw) obj).zzj((i7 << 3) | 3, (zzuw) obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i7, zzqm zzqmVar) {
        ((zzuw) obj).zzj((i7 << 3) | 2, zzqmVar);
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i7, long j3) {
        ((zzuw) obj).zzj(i7 << 3, Long.valueOf(j3));
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final void zzi(Object obj) {
        ((zzsn) obj).zzc.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzsn) obj).zzc = (zzuw) obj2;
    }
}
