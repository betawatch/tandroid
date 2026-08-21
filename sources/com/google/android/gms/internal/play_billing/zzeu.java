package com.google.android.gms.internal.play_billing;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzeu {
    static final zzeu zza = new zzeu(true);
    private static volatile zzeu zzd;
    private final Map zze = Collections.EMPTY_MAP;

    public static zzeu zza() {
        zzeu zzeuVar = zzd;
        if (zzeuVar != null) {
            return zzeuVar;
        }
        synchronized (zzeu.class) {
            try {
                zzeu zzeuVar2 = zzd;
                if (zzeuVar2 != null) {
                    return zzeuVar2;
                }
                int i = zzgs.$r8$clinit;
                zzeu zzb = zzfc.zzb(zzeu.class);
                zzd = zzb;
                return zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzfh zzb(zzgl zzglVar, int i) {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(this.zze.get(new zzet(zzglVar, i)));
        return null;
    }

    zzeu(boolean z) {
    }
}
