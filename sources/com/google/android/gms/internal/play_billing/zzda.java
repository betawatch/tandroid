package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
abstract class zzda {
    static void zza(Throwable th) {
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }
}
