package com.google.android.recaptcha.internal;

import hd.g;
import java.util.List;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
