package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
abstract class zzuv {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i, int i2);

    public abstract void zze(Object obj, int i, long j);

    public abstract void zzf(Object obj, int i, Object obj2);

    public abstract void zzg(Object obj, int i, zzqm zzqmVar);

    public abstract void zzh(Object obj, int i, long j);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzuf zzufVar, int i) {
        int zzd = zzufVar.zzd();
        int i2 = zzd >>> 3;
        int i3 = zzd & 7;
        if (i3 == 0) {
            zzh(obj, i2, zzufVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zze(obj, i2, zzufVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zzg(obj, i2, zzufVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                fvc.i("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i3 == 5) {
                zzd(obj, i2, zzufVar.zzf());
                return true;
            }
            haf.a();
            return false;
        }
        Object zzb = zzb();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            fvc.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (zzufVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzufVar, i5)) {
        }
        if ((i4 | 4) == zzufVar.zzd()) {
            zzf(obj, i2, zzc(zzb));
            return true;
        }
        fvc.i("Protocol message end-group tag did not match expected tag.");
        return false;
    }
}
