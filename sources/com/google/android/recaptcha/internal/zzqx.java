package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
final class zzqx implements zzsr {
    static final zzsr zza = new zzqx();

    private zzqx() {
    }

    @Override // com.google.android.recaptcha.internal.zzsr
    public final boolean zza(int i10) {
        zzqy zzqyVar;
        zzqy zzqyVar2 = zzqy.zza;
        if (i10 == 0) {
            zzqyVar = zzqy.zza;
        } else if (i10 == 1) {
            zzqyVar = zzqy.zzg;
        } else if (i10 == 2) {
            zzqyVar = zzqy.zzh;
        } else if (i10 == 900) {
            zzqyVar = zzqy.zzb;
        } else if (i10 != Integer.MAX_VALUE) {
            switch (i10) {
                case 998:
                    zzqyVar = zzqy.zzc;
                    break;
                case 999:
                    zzqyVar = zzqy.zzd;
                    break;
                case 1000:
                    zzqyVar = zzqy.zze;
                    break;
                case 1001:
                    zzqyVar = zzqy.zzf;
                    break;
                default:
                    switch (i10) {
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
