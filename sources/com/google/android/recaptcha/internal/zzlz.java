package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes.dex */
public final class zzlz {
    public static final Map zza() {
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(-4, zzcd.zzo), TuplesKt.to(-12, zzcd.zzp), TuplesKt.to(-6, zzcd.zzk), TuplesKt.to(-11, zzcd.zzm), TuplesKt.to(-13, zzcd.zzq), TuplesKt.to(-14, zzcd.zzr), TuplesKt.to(-2, zzcd.zzl), TuplesKt.to(-7, zzcd.zzs), TuplesKt.to(-5, zzcd.zzt), TuplesKt.to(-9, zzcd.zzu), TuplesKt.to(-8, zzcd.zzE), TuplesKt.to(-15, zzcd.zzn), TuplesKt.to(-1, zzcd.zzv), TuplesKt.to(-3, zzcd.zzx), TuplesKt.to(-10, zzcd.zzy));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            mutableMapOf.put(-16, zzcd.zzw);
        }
        if (i >= 27) {
            mutableMapOf.put(1, zzcd.zzA);
            mutableMapOf.put(2, zzcd.zzB);
            mutableMapOf.put(0, zzcd.zzC);
            mutableMapOf.put(3, zzcd.zzD);
        }
        if (i >= 29) {
            mutableMapOf.put(4, zzcd.zzz);
        }
        return mutableMapOf;
    }
}
