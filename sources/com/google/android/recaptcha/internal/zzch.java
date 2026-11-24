package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
            return f24.a;
        }
    }

    private static final Map zzb() {
        ku7[] ku7VarArr = {new ku7(0, zzvs.zzb), new ku7(1, zzvs.zzc), new ku7(2, zzvs.zzd), new ku7(3, zzvs.zze), new ku7(4, zzvs.zzf), new ku7(5, zzvs.zzg), new ku7(6, zzvs.zzh), new ku7(7, zzvs.zzi), new ku7(8, zzvs.zzj), new ku7(9, zzvs.zzk), new ku7(10, zzvs.zzl), new ku7(11, zzvs.zzm), new ku7(12, zzvs.zzn), new ku7(13, zzvs.zzo), new ku7(14, zzvs.zzp), new ku7(15, zzvs.zzq)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(qi6.b(16));
        qi6.d(linkedHashMap, ku7VarArr);
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
