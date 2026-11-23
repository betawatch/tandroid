package com.google.android.recaptcha.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
final class zzoa extends zzof {
    private static final zzoa zza = new zzoa(zzof.zze());
    private final AtomicReference zzb;

    public zzoa(zzof zzofVar) {
        this.zzb = new AtomicReference(zzofVar);
    }

    public static final zzoa zzb() {
        return zza;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final zznd zza() {
        return ((zzof) this.zzb.get()).zza();
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final zzor zzc() {
        return ((zzof) this.zzb.get()).zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final boolean zzd(String str, Level level, boolean z10) {
        ((zzof) this.zzb.get()).zzd(str, level, z10);
        return false;
    }
}
