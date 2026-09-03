package com.google.android.recaptcha.internal;

import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class zzmx {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzmx(String str, Class cls, boolean z4) {
        this(str, cls, z4, true);
    }

    public static zzmx zza(String str, Class cls) {
        return new zzmx(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        StringBuilder f10 = w2.f(name, "/");
        f10.append(this.zza);
        f10.append("[");
        f10.append(name2);
        f10.append("]");
        return f10.toString();
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzmx(String str, Class cls, boolean z4, boolean z10) {
        zzot.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z4;
        System.identityHashCode(this);
        for (int i10 = 0; i10 < 5; i10++) {
        }
    }
}
