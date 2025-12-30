package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzox implements zzow {
    zzox() {
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final StackTraceElement zza(Class cls, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i2 = 3;
        boolean z = false;
        while (true) {
            if (i2 >= stackTrace.length) {
                i2 = -1;
                break;
            }
            if (stackTrace[i2].getClassName().equals(name)) {
                z = true;
            } else {
                if (z) {
                    break;
                }
                z = false;
            }
            i2++;
        }
        if (i2 != -1) {
            return stackTrace[i2];
        }
        return null;
    }
}
