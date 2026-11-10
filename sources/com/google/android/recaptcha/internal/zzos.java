package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class zzos {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzow zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.recaptcha.internal.zzow] */
    static {
        zzox zzoxVar;
        int i7 = 0;
        while (true) {
            if (i7 >= 2) {
                zzoxVar = new zzox();
                break;
            }
            zzoxVar = null;
            try {
                zzoxVar = (zzow) Class.forName(zza[i7]).asSubclass(zzow.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzoxVar != null) {
                break;
            } else {
                i7++;
            }
        }
        zzb = zzoxVar;
    }

    public static StackTraceElement zza(Class cls, int i7) {
        zzot.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
