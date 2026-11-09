package com.google.android.recaptcha.internal;

import rf.b;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class zzmx {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzmx(String str, Class cls, boolean z9) {
        this(str, cls, z9, true);
    }

    public static zzmx zza(String str, Class cls) {
        return new zzmx(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        StringBuilder j3 = b.j(name, "/");
        j3.append(this.zza);
        j3.append("[");
        j3.append(name2);
        j3.append("]");
        return j3.toString();
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzmx(String str, Class cls, boolean z9, boolean z10) {
        zzot.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z9;
        System.identityHashCode(this);
        for (int i7 = 0; i7 < 5; i7++) {
        }
    }
}
