package com.google.android.recaptcha.internal;

import ad.e;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import bd.s;
import bd.t;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzch {
    public zzch() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
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
            return s.a;
        }
    }

    private static final Map zzb() {
        e[] eVarArr = {new e(0, zzvs.zzb), new e(1, zzvs.zzc), new e(2, zzvs.zzd), new e(3, zzvs.zze), new e(4, zzvs.zzf), new e(5, zzvs.zzg), new e(6, zzvs.zzh), new e(7, zzvs.zzi), new e(8, zzvs.zzj), new e(9, zzvs.zzk), new e(10, zzvs.zzl), new e(11, zzvs.zzm), new e(12, zzvs.zzn), new e(13, zzvs.zzo), new e(14, zzvs.zzp), new e(15, zzvs.zzq)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.a(16));
        t.c(linkedHashMap, eVarArr);
        int i10 = Build.VERSION.SDK_INT;
        linkedHashMap.put(17, zzvs.zzs);
        linkedHashMap.put(16, zzvs.zzr);
        if (i10 >= 28) {
            linkedHashMap.put(18, zzvs.zzt);
            linkedHashMap.put(19, zzvs.zzu);
            linkedHashMap.put(20, zzvs.zzv);
            linkedHashMap.put(21, zzvs.zzw);
        }
        if (i10 >= 29) {
            linkedHashMap.put(23, zzvs.zzy);
        }
        if (i10 >= 30) {
            linkedHashMap.put(25, zzvs.zzA);
        }
        if (i10 >= 31) {
            linkedHashMap.put(32, zzvs.zzH);
            linkedHashMap.put(29, zzvs.zzE);
        }
        if (i10 >= 33) {
            linkedHashMap.put(35, zzvs.zzK);
            linkedHashMap.put(34, zzvs.zzJ);
            linkedHashMap.put(33, zzvs.zzI);
        }
        return linkedHashMap;
    }
}
