package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
