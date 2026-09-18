package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class zzos {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzow zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.recaptcha.internal.zzow] */
    static {
        zzox zzoxVar;
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                zzoxVar = new zzox();
                break;
            }
            zzoxVar = null;
            try {
                zzoxVar = (zzow) Class.forName(zza[i10]).asSubclass(zzow.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzoxVar != null) {
                break;
            } else {
                i10++;
            }
        }
        zzb = zzoxVar;
    }

    public static StackTraceElement zza(Class cls, int i10) {
        zzot.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
