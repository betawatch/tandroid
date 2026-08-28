package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
abstract class zzuv {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i9, int i10);

    public abstract void zze(Object obj, int i9, long j10);

    public abstract void zzf(Object obj, int i9, Object obj2);

    public abstract void zzg(Object obj, int i9, zzqm zzqmVar);

    public abstract void zzh(Object obj, int i9, long j10);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzuf zzufVar, int i9) {
        int zzd = zzufVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            zzh(obj, i10, zzufVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zze(obj, i10, zzufVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zzg(obj, i10, zzufVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                if (i9 != 0) {
                    return false;
                }
                throw new zzsx("Protocol message end-group tag did not match expected tag.");
            }
            if (i11 != 5) {
                throw new zzsw("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i10, zzufVar.zzf());
            return true;
        }
        Object zzb = zzb();
        int i12 = i10 << 3;
        int i13 = i9 + 1;
        if (i13 >= zza) {
            throw new zzsx("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzufVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzufVar, i13)) {
        }
        if ((i12 | 4) != zzufVar.zzd()) {
            throw new zzsx("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i10, zzc(zzb));
        return true;
    }
}
