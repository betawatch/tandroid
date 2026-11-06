package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
