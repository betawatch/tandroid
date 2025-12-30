package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;

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
        return CollectionsKt.toList(this.zza);
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }

    public zziv(int i) {
        this.zza = zzmj.zza(i);
    }
}
