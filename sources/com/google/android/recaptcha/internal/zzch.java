package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzch {
    public zzch() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        Network activeNetwork;
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 23) {
                Object systemService = context.getSystemService("connectivity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                activeNetwork = connectivityManager.getActiveNetwork();
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
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
            return SetsKt.emptySet();
        }
    }

    private static final Map zzb() {
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(0, zzvs.zzb), TuplesKt.to(1, zzvs.zzc), TuplesKt.to(2, zzvs.zzd), TuplesKt.to(3, zzvs.zze), TuplesKt.to(4, zzvs.zzf), TuplesKt.to(5, zzvs.zzg), TuplesKt.to(6, zzvs.zzh), TuplesKt.to(7, zzvs.zzi), TuplesKt.to(8, zzvs.zzj), TuplesKt.to(9, zzvs.zzk), TuplesKt.to(10, zzvs.zzl), TuplesKt.to(11, zzvs.zzm), TuplesKt.to(12, zzvs.zzn), TuplesKt.to(13, zzvs.zzo), TuplesKt.to(14, zzvs.zzp), TuplesKt.to(15, zzvs.zzq));
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            mutableMapOf.put(17, zzvs.zzs);
            mutableMapOf.put(16, zzvs.zzr);
        }
        if (i >= 28) {
            mutableMapOf.put(18, zzvs.zzt);
            mutableMapOf.put(19, zzvs.zzu);
            mutableMapOf.put(20, zzvs.zzv);
            mutableMapOf.put(21, zzvs.zzw);
        }
        if (i >= 29) {
            mutableMapOf.put(23, zzvs.zzy);
        }
        if (i >= 30) {
            mutableMapOf.put(25, zzvs.zzA);
        }
        if (i >= 31) {
            mutableMapOf.put(32, zzvs.zzH);
            mutableMapOf.put(29, zzvs.zzE);
        }
        if (i >= 33) {
            mutableMapOf.put(35, zzvs.zzK);
            mutableMapOf.put(34, zzvs.zzJ);
            mutableMapOf.put(33, zzvs.zzI);
        }
        return mutableMapOf;
    }
}
