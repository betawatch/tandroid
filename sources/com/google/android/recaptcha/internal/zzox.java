package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
