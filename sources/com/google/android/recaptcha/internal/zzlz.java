package com.google.android.recaptcha.internal;

import android.os.Build;
import dd.e;
import ed.s;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzlz {
    public static final Map zza() {
        e[] eVarArr = {new e(-4, zzcd.zzo), new e(-12, zzcd.zzp), new e(-6, zzcd.zzk), new e(-11, zzcd.zzm), new e(-13, zzcd.zzq), new e(-14, zzcd.zzr), new e(-2, zzcd.zzl), new e(-7, zzcd.zzs), new e(-5, zzcd.zzt), new e(-9, zzcd.zzu), new e(-8, zzcd.zzE), new e(-15, zzcd.zzn), new e(-1, zzcd.zzv), new e(-3, zzcd.zzx), new e(-10, zzcd.zzy)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(s.b(15));
        s.e(linkedHashMap, eVarArr);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            linkedHashMap.put(-16, zzcd.zzw);
        }
        if (i3 >= 27) {
            linkedHashMap.put(1, zzcd.zzA);
            linkedHashMap.put(2, zzcd.zzB);
            linkedHashMap.put(0, zzcd.zzC);
            linkedHashMap.put(3, zzcd.zzD);
        }
        if (i3 >= 29) {
            linkedHashMap.put(4, zzcd.zzz);
        }
        return linkedHashMap;
    }
}
