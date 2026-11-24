package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
            return q34.a;
        }
    }

    private static final Map zzb() {
        lw7[] lw7VarArr = {new lw7(0, zzvs.zzb), new lw7(1, zzvs.zzc), new lw7(2, zzvs.zzd), new lw7(3, zzvs.zze), new lw7(4, zzvs.zzf), new lw7(5, zzvs.zzg), new lw7(6, zzvs.zzh), new lw7(7, zzvs.zzi), new lw7(8, zzvs.zzj), new lw7(9, zzvs.zzk), new lw7(10, zzvs.zzl), new lw7(11, zzvs.zzm), new lw7(12, zzvs.zzn), new lw7(13, zzvs.zzo), new lw7(14, zzvs.zzp), new lw7(15, zzvs.zzq)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(sk6.b(16));
        sk6.d(linkedHashMap, lw7VarArr);
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
