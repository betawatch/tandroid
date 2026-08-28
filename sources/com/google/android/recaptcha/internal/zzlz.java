package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import oc.d;
import pc.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzlz {
    public static final Map zza() {
        d[] dVarArr = {new d(-4, zzcd.zzo), new d(-12, zzcd.zzp), new d(-6, zzcd.zzk), new d(-11, zzcd.zzm), new d(-13, zzcd.zzq), new d(-14, zzcd.zzr), new d(-2, zzcd.zzl), new d(-7, zzcd.zzs), new d(-5, zzcd.zzt), new d(-9, zzcd.zzu), new d(-8, zzcd.zzE), new d(-15, zzcd.zzn), new d(-1, zzcd.zzv), new d(-3, zzcd.zzx), new d(-10, zzcd.zzy)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.a(15));
        r.c(linkedHashMap, dVarArr);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            linkedHashMap.put(-16, zzcd.zzw);
        }
        if (i9 >= 27) {
            linkedHashMap.put(1, zzcd.zzA);
            linkedHashMap.put(2, zzcd.zzB);
            linkedHashMap.put(0, zzcd.zzC);
            linkedHashMap.put(3, zzcd.zzD);
        }
        if (i9 >= 29) {
            linkedHashMap.put(4, zzcd.zzz);
        }
        return linkedHashMap;
    }
}
