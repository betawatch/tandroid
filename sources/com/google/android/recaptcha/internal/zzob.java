package com.google.android.recaptcha.internal;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class zzob implements zznu {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zznl zzd;
    private final int zze;

    private zzob(String str, boolean z4, int i10, Level level, boolean z10, Set set, zznl zznlVar) {
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zznlVar;
    }

    @Override // com.google.android.recaptcha.internal.zznu
    public final zznb zza(String str) {
        return new zzoe(this.zza, str, true, 2, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzob zzb(boolean z4) {
        Set set = this.zzc;
        zznl zznlVar = this.zzd;
        return new zzob(this.zza, true, 2, Level.OFF, false, set, zznlVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzob() {
        this("", true, 2, r4, false, r6, r7);
        Set set;
        zznl zznlVar;
        Level level = Level.ALL;
        set = zzoe.zzb;
        zznlVar = zzoe.zzc;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ zzob(zzod zzodVar) {
        this("", true, 2, r4, false, r6, r7);
        Set set;
        zznl zznlVar;
        Level level = Level.ALL;
        set = zzoe.zzb;
        zznlVar = zzoe.zzc;
    }
}
