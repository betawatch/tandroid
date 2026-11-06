package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
final class zzqx implements zzsr {
    static final zzsr zza = new zzqx();

    private zzqx() {
    }

    @Override // com.google.android.recaptcha.internal.zzsr
    public final boolean zza(int i7) {
        zzqy zzqyVar;
        zzqy zzqyVar2 = zzqy.zza;
        if (i7 == 0) {
            zzqyVar = zzqy.zza;
        } else if (i7 == 1) {
            zzqyVar = zzqy.zzg;
        } else if (i7 == 2) {
            zzqyVar = zzqy.zzh;
        } else if (i7 == 900) {
            zzqyVar = zzqy.zzb;
        } else if (i7 != Integer.MAX_VALUE) {
            switch (i7) {
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
                    switch (i7) {
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
