package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzue implements zztp {
    private final zzts zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzue(zzts zztsVar, String str, Object[] objArr) {
        this.zza = zztsVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.zzd = i7 | (charAt2 << i11);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zztp
    public final zzts zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zztp
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.recaptcha.internal.zztp
    public final int zzc() {
        int i7 = this.zzd;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
