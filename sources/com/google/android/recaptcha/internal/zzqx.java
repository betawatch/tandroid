package com.google.android.recaptcha.internal;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzqx implements zzsr {
    static final zzsr zza = new zzqx();

    private zzqx() {
    }

    @Override // com.google.android.recaptcha.internal.zzsr
    public final boolean zza(int i9) {
        zzqy zzqyVar;
        zzqy zzqyVar2 = zzqy.zza;
        if (i9 == 0) {
            zzqyVar = zzqy.zza;
        } else if (i9 == 1) {
            zzqyVar = zzqy.zzg;
        } else if (i9 == 2) {
            zzqyVar = zzqy.zzh;
        } else if (i9 == 900) {
            zzqyVar = zzqy.zzb;
        } else if (i9 != Integer.MAX_VALUE) {
            switch (i9) {
                case 998:
                    zzqyVar = zzqy.zzc;
                    break;
                case 999:
                    zzqyVar = zzqy.zzd;
                    break;
                case MediaDataController.MAX_STYLE_RUNS_COUNT /* 1000 */:
                    zzqyVar = zzqy.zze;
                    break;
                case 1001:
                    zzqyVar = zzqy.zzf;
                    break;
                default:
                    switch (i9) {
                        case 99997:
                            zzqyVar = zzqy.zzi;
                            break;
                        case 99998:
                            zzqyVar = zzqy.zzj;
                            break;
                        case 99999:
                            zzqyVar = zzqy.zzk;
                            break;
                        default:
                            zzqyVar = null;
                            break;
                    }
            }
        } else {
            zzqyVar = zzqy.zzl;
        }
        return zzqyVar != null;
    }
}
