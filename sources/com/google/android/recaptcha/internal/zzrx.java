package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
final class zzrx {
    private final Object zza;
    private final int zzb;

    public zzrx(Object obj, int i7) {
        this.zza = obj;
        this.zzb = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrx)) {
            return false;
        }
        zzrx zzrxVar = (zzrx) obj;
        return this.zza == zzrxVar.zza && this.zzb == zzrxVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
