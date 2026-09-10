package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import gd.d;
import hd.q;
import hd.r;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class zzch {
    public zzch() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 23) {
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
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return q.a;
        }
    }

    private static final Map zzb() {
        d[] dVarArr = {new d(0, zzvs.zzb), new d(1, zzvs.zzc), new d(2, zzvs.zzd), new d(3, zzvs.zze), new d(4, zzvs.zzf), new d(5, zzvs.zzg), new d(6, zzvs.zzh), new d(7, zzvs.zzi), new d(8, zzvs.zzj), new d(9, zzvs.zzk), new d(10, zzvs.zzl), new d(11, zzvs.zzm), new d(12, zzvs.zzn), new d(13, zzvs.zzo), new d(14, zzvs.zzp), new d(15, zzvs.zzq)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.a(16));
        r.c(linkedHashMap, dVarArr);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            linkedHashMap.put(17, zzvs.zzs);
            linkedHashMap.put(16, zzvs.zzr);
        }
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
