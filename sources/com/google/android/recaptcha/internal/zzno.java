package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class zzno {
    private static final zznj zza = new zznm();
    private static final zzni zzb = new zznn();

    public static zzng zza(Set set) {
        zzng zzngVar = new zzng(zza, null);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzngVar.zzd((zzmx) it.next());
        }
        return zzngVar;
    }
}
