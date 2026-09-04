package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
