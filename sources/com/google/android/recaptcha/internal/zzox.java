package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
final class zzox implements zzow {
    @Override // com.google.android.recaptcha.internal.zzow
    public final StackTraceElement zza(Class cls, int i7) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i10 = 3;
        boolean z9 = false;
        while (true) {
            if (i10 >= stackTrace.length) {
                i10 = -1;
                break;
            }
            if (stackTrace[i10].getClassName().equals(name)) {
                z9 = true;
            } else {
                if (z9) {
                    break;
                }
                z9 = false;
            }
            i10++;
        }
        if (i10 != -1) {
            return stackTrace[i10];
        }
        return null;
    }
}
