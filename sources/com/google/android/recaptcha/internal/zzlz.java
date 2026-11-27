package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzlz {
    public static final Map zza() {
        rx7[] rx7VarArr = {new rx7(-4, zzcd.zzo), new rx7(-12, zzcd.zzp), new rx7(-6, zzcd.zzk), new rx7(-11, zzcd.zzm), new rx7(-13, zzcd.zzq), new rx7(-14, zzcd.zzr), new rx7(-2, zzcd.zzl), new rx7(-7, zzcd.zzs), new rx7(-5, zzcd.zzt), new rx7(-9, zzcd.zzu), new rx7(-8, zzcd.zzE), new rx7(-15, zzcd.zzn), new rx7(-1, zzcd.zzv), new rx7(-3, zzcd.zzx), new rx7(-10, zzcd.zzy)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(uk6.b(15));
        uk6.d(linkedHashMap, rx7VarArr);
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
