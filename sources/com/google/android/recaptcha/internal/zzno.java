package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
