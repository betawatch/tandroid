package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
