package com.google.android.recaptcha.internal;

import hd.g;
import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
