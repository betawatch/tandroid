package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
