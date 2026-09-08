package com.google.android.recaptcha.internal;

import hd.g;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zziv {
    private final zzmj zza;

    public zziv() {
        this(1);
    }

    public final List zwk() {
        return zza();
    }

    public final List zza() {
        return g.m(this.zza);
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }

    public zziv(int i10) {
        this.zza = zzmj.zza(i10);
    }
}
