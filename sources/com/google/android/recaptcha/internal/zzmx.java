package com.google.android.recaptcha.internal;

import v7.j;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public class zzmx {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzmx(String str, Class cls, boolean z10) {
        this(str, cls, z10, true);
    }

    public static zzmx zza(String str, Class cls) {
        return new zzmx(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        StringBuilder h = j.h(name, "/");
        h.append(this.zza);
        h.append("[");
        h.append(name2);
        h.append("]");
        return h.toString();
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzmx(String str, Class cls, boolean z10, boolean z11) {
        zzot.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z10;
        System.identityHashCode(this);
        for (int i10 = 0; i10 < 5; i10++) {
        }
    }
}
