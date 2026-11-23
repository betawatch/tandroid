package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
final class zzox implements zzow {
    @Override // com.google.android.recaptcha.internal.zzow
    public final StackTraceElement zza(Class cls, int i7) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i10 = 3;
        boolean z10 = false;
        while (true) {
            if (i10 >= stackTrace.length) {
                i10 = -1;
                break;
            }
            if (stackTrace[i10].getClassName().equals(name)) {
                z10 = true;
            } else {
                if (z10) {
                    break;
                }
                z10 = false;
            }
            i10++;
        }
        if (i10 != -1) {
            return stackTrace[i10];
        }
        return null;
    }
}
