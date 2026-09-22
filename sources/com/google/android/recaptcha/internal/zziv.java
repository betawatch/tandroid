package com.google.android.recaptcha.internal;

import hd.g;
import java.util.List;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
