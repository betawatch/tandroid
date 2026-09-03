package com.google.android.recaptcha.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
    public final boolean zzd(String str, Level level, boolean z4) {
        ((zzof) this.zzb.get()).zzd(str, level, z4);
        return false;
    }
}
