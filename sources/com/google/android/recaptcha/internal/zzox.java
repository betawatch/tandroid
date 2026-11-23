package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
