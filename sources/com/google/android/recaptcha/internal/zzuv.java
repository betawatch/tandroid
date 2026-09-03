package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
abstract class zzuv {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i10, int i11);

    public abstract void zze(Object obj, int i10, long j10);

    public abstract void zzf(Object obj, int i10, Object obj2);

    public abstract void zzg(Object obj, int i10, zzqm zzqmVar);

    public abstract void zzh(Object obj, int i10, long j10);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzuf zzufVar, int i10) {
        int zzd = zzufVar.zzd();
        int i11 = zzd >>> 3;
        int i12 = zzd & 7;
        if (i12 == 0) {
            zzh(obj, i11, zzufVar.zzl());
            return true;
        }
        if (i12 == 1) {
            zze(obj, i11, zzufVar.zzk());
            return true;
        }
        if (i12 == 2) {
            zzg(obj, i11, zzufVar.zzp());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new zzsx("Protocol message end-group tag did not match expected tag.");
            }
            if (i12 != 5) {
                throw new zzsw("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i11, zzufVar.zzf());
            return true;
        }
        Object zzb = zzb();
        int i13 = i11 << 3;
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw new zzsx("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzufVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzufVar, i14)) {
        }
        if ((i13 | 4) != zzufVar.zzd()) {
            throw new zzsx("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i11, zzc(zzb));
        return true;
    }
}
