package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class zzmx {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    private zzmx(String str, Class cls, boolean z, boolean z2) {
        zzot.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        System.identityHashCode(this);
        for (int i = 0; i < 5; i++) {
        }
    }

    public static zzmx zza(String str, Class cls) {
        return new zzmx(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        StringBuilder l = c00.l(name, "/");
        l.append(this.zza);
        l.append("[");
        l.append(name2);
        l.append("]");
        return l.toString();
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public zzmx(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }
}
