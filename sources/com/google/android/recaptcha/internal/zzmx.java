package com.google.android.recaptcha.internal;

import w.c;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        StringBuilder f10 = c.f(name, "/");
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
