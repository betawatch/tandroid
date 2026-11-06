package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import gd.e;
import hd.p;
import hd.r;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
            j.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
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
            return p.a;
        }
    }

    private static final Map zzb() {
        e[] eVarArr = {new e(0, zzvs.zzb), new e(1, zzvs.zzc), new e(2, zzvs.zzd), new e(3, zzvs.zze), new e(4, zzvs.zzf), new e(5, zzvs.zzg), new e(6, zzvs.zzh), new e(7, zzvs.zzi), new e(8, zzvs.zzj), new e(9, zzvs.zzk), new e(10, zzvs.zzl), new e(11, zzvs.zzm), new e(12, zzvs.zzn), new e(13, zzvs.zzo), new e(14, zzvs.zzp), new e(15, zzvs.zzq)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.b(16));
        r.e(linkedHashMap, eVarArr);
        int i7 = Build.VERSION.SDK_INT;
        linkedHashMap.put(17, zzvs.zzs);
        linkedHashMap.put(16, zzvs.zzr);
        if (i7 >= 28) {
            linkedHashMap.put(18, zzvs.zzt);
            linkedHashMap.put(19, zzvs.zzu);
            linkedHashMap.put(20, zzvs.zzv);
            linkedHashMap.put(21, zzvs.zzw);
        }
        if (i7 >= 29) {
            linkedHashMap.put(23, zzvs.zzy);
        }
        if (i7 >= 30) {
            linkedHashMap.put(25, zzvs.zzA);
        }
        if (i7 >= 31) {
            linkedHashMap.put(32, zzvs.zzH);
            linkedHashMap.put(29, zzvs.zzE);
        }
        if (i7 >= 33) {
            linkedHashMap.put(35, zzvs.zzK);
            linkedHashMap.put(34, zzvs.zzJ);
            linkedHashMap.put(33, zzvs.zzI);
        }
        return linkedHashMap;
    }
}
