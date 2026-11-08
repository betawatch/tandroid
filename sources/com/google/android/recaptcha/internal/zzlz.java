package com.google.android.recaptcha.internal;

import android.os.Build;
import gd.e;
import hd.r;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class zzlz {
    public static final Map zza() {
        e[] eVarArr = {new e(-4, zzcd.zzo), new e(-12, zzcd.zzp), new e(-6, zzcd.zzk), new e(-11, zzcd.zzm), new e(-13, zzcd.zzq), new e(-14, zzcd.zzr), new e(-2, zzcd.zzl), new e(-7, zzcd.zzs), new e(-5, zzcd.zzt), new e(-9, zzcd.zzu), new e(-8, zzcd.zzE), new e(-15, zzcd.zzn), new e(-1, zzcd.zzv), new e(-3, zzcd.zzx), new e(-10, zzcd.zzy)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.b(15));
        r.e(linkedHashMap, eVarArr);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            linkedHashMap.put(-16, zzcd.zzw);
        }
        if (i7 >= 27) {
            linkedHashMap.put(1, zzcd.zzA);
            linkedHashMap.put(2, zzcd.zzB);
            linkedHashMap.put(0, zzcd.zzC);
            linkedHashMap.put(3, zzcd.zzD);
        }
        if (i7 >= 29) {
            linkedHashMap.put(4, zzcd.zzz);
        }
        return linkedHashMap;
    }
}
