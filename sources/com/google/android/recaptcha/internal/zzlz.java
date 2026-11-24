package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzlz {
    public static final Map zza() {
        lw7[] lw7VarArr = {new lw7(-4, zzcd.zzo), new lw7(-12, zzcd.zzp), new lw7(-6, zzcd.zzk), new lw7(-11, zzcd.zzm), new lw7(-13, zzcd.zzq), new lw7(-14, zzcd.zzr), new lw7(-2, zzcd.zzl), new lw7(-7, zzcd.zzs), new lw7(-5, zzcd.zzt), new lw7(-9, zzcd.zzu), new lw7(-8, zzcd.zzE), new lw7(-15, zzcd.zzn), new lw7(-1, zzcd.zzv), new lw7(-3, zzcd.zzx), new lw7(-10, zzcd.zzy)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(sk6.b(15));
        sk6.d(linkedHashMap, lw7VarArr);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            linkedHashMap.put(-16, zzcd.zzw);
        }
        if (i >= 27) {
            linkedHashMap.put(1, zzcd.zzA);
            linkedHashMap.put(2, zzcd.zzB);
            linkedHashMap.put(0, zzcd.zzC);
            linkedHashMap.put(3, zzcd.zzD);
        }
        if (i >= 29) {
            linkedHashMap.put(4, zzcd.zzz);
        }
        return linkedHashMap;
    }
}
