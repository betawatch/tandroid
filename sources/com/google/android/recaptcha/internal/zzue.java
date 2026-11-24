package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i3);
                return;
            } else {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
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
        int i = this.zzd;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
