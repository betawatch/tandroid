package com.google.android.recaptcha.internal;

import ad.e;
import android.os.Build;
import bd.t;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzlz {
    public static final Map zza() {
        e[] eVarArr = {new e(-4, zzcd.zzo), new e(-12, zzcd.zzp), new e(-6, zzcd.zzk), new e(-11, zzcd.zzm), new e(-13, zzcd.zzq), new e(-14, zzcd.zzr), new e(-2, zzcd.zzl), new e(-7, zzcd.zzs), new e(-5, zzcd.zzt), new e(-9, zzcd.zzu), new e(-8, zzcd.zzE), new e(-15, zzcd.zzn), new e(-1, zzcd.zzv), new e(-3, zzcd.zzx), new e(-10, zzcd.zzy)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.a(15));
        t.c(linkedHashMap, eVarArr);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            linkedHashMap.put(-16, zzcd.zzw);
        }
        if (i10 >= 27) {
            linkedHashMap.put(1, zzcd.zzA);
            linkedHashMap.put(2, zzcd.zzB);
            linkedHashMap.put(0, zzcd.zzC);
            linkedHashMap.put(3, zzcd.zzD);
        }
        if (i10 >= 29) {
            linkedHashMap.put(4, zzcd.zzz);
        }
        return linkedHashMap;
    }
}
