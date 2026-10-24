package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
