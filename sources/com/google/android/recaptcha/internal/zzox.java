package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
final class zzox implements zzow {
    @Override // com.google.android.recaptcha.internal.zzow
    public final StackTraceElement zza(Class cls, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i11 = 3;
        boolean z10 = false;
        while (true) {
            if (i11 >= stackTrace.length) {
                i11 = -1;
                break;
            }
            if (stackTrace[i11].getClassName().equals(name)) {
                z10 = true;
            } else {
                if (z10) {
                    break;
                }
                z10 = false;
            }
            i11++;
        }
        if (i11 != -1) {
            return stackTrace[i11];
        }
        return null;
    }
}
