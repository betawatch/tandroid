package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        int i9 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.zzd = i9 | (charAt2 << i11);
                return;
            } else {
                i9 |= (charAt2 & 8191) << i11;
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
        int i9 = this.zzd;
        if ((i9 & 1) != 0) {
            return 1;
        }
        return (i9 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
