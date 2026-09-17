package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, int i11) {
        ((zzuw) obj).zzj((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i10, long j3) {
        ((zzuw) obj).zzj((i10 << 3) | 1, Long.valueOf(j3));
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i10, Object obj2) {
        ((zzuw) obj).zzj((i10 << 3) | 3, (zzuw) obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i10, zzqm zzqmVar) {
        ((zzuw) obj).zzj((i10 << 3) | 2, zzqmVar);
    }

    @Override // com.google.android.recaptcha.internal.zzuv
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i10, long j3) {
        ((zzuw) obj).zzj(i10 << 3, Long.valueOf(j3));
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
