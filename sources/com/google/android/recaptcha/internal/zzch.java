package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzch {
    public zzch() {
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzvs.zzM);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzvs.zzN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzvs.zzO);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzvs.zzP);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzvs.zzr);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return a34.a;
        }
    }

    private static final Map zzb() {
        rx7[] rx7VarArr = {new rx7(0, zzvs.zzb), new rx7(1, zzvs.zzc), new rx7(2, zzvs.zzd), new rx7(3, zzvs.zze), new rx7(4, zzvs.zzf), new rx7(5, zzvs.zzg), new rx7(6, zzvs.zzh), new rx7(7, zzvs.zzi), new rx7(8, zzvs.zzj), new rx7(9, zzvs.zzk), new rx7(10, zzvs.zzl), new rx7(11, zzvs.zzm), new rx7(12, zzvs.zzn), new rx7(13, zzvs.zzo), new rx7(14, zzvs.zzp), new rx7(15, zzvs.zzq)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(uk6.b(16));
        uk6.d(linkedHashMap, rx7VarArr);
        linkedHashMap.put(17, zzvs.zzs);
        linkedHashMap.put(16, zzvs.zzr);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            linkedHashMap.put(18, zzvs.zzt);
            linkedHashMap.put(19, zzvs.zzu);
            linkedHashMap.put(20, zzvs.zzv);
            linkedHashMap.put(21, zzvs.zzw);
        }
        if (i >= 29) {
            linkedHashMap.put(23, zzvs.zzy);
        }
        if (i >= 30) {
            linkedHashMap.put(25, zzvs.zzA);
        }
        if (i >= 31) {
            linkedHashMap.put(32, zzvs.zzH);
            linkedHashMap.put(29, zzvs.zzE);
        }
        if (i >= 33) {
            linkedHashMap.put(35, zzvs.zzK);
            linkedHashMap.put(34, zzvs.zzJ);
            linkedHashMap.put(33, zzvs.zzI);
        }
        return linkedHashMap;
    }
}
