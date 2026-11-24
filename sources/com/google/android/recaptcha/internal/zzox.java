package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzox implements zzow {
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
            if (!stackTrace[i2].getClassName().equals(name)) {
                if (z) {
                    break;
                }
                z = false;
            } else {
                z = true;
            }
            i2++;
        }
        if (i2 != -1) {
            return stackTrace[i2];
        }
        return null;
    }
}
