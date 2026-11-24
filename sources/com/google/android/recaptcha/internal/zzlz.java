package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zzlz {
    public static final Map zza() {
        ku7[] ku7VarArr = {new ku7(-4, zzcd.zzo), new ku7(-12, zzcd.zzp), new ku7(-6, zzcd.zzk), new ku7(-11, zzcd.zzm), new ku7(-13, zzcd.zzq), new ku7(-14, zzcd.zzr), new ku7(-2, zzcd.zzl), new ku7(-7, zzcd.zzs), new ku7(-5, zzcd.zzt), new ku7(-9, zzcd.zzu), new ku7(-8, zzcd.zzE), new ku7(-15, zzcd.zzn), new ku7(-1, zzcd.zzv), new ku7(-3, zzcd.zzx), new ku7(-10, zzcd.zzy)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(qi6.b(15));
        qi6.d(linkedHashMap, ku7VarArr);
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
