package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
        StringBuilder k = b00.k(name, "/");
        k.append(this.zza);
        k.append("[");
        k.append(name2);
        k.append("]");
        return k.toString();
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public zzmx(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }
}
