package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
