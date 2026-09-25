package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
final /* synthetic */ class zzme {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        zza = iArr;
        try {
            iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zza[TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zza[TimeUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zza[TimeUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zza[TimeUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            zza[TimeUnit.DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
