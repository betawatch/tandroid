package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
