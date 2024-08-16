package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
/* loaded from: classes.dex */
public final class zzfi$zzn extends zzjb<zzfi$zzn, zza> implements zzkm {
    private static final zzfi$zzn zzh;
    private static volatile zzkx<zzfi$zzn> zzi;
    private int zzc;
    private zzfi$zzd zzd;
    private int zze;
    private zzfi$zzh zzf;
    private zzfi$zzc zzg;

    private zzfi$zzn() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzn>] */
    @Override // com.google.android.gms.internal.vision.zzjb
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzfk.zza[i - 1]) {
            case 1:
                return new zzfi$zzn();
            case 2:
                return new zza(null);
            case 3:
                return zzjb.zza(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                zzkx<zzfi$zzn> zzkxVar = zzi;
                zzkx<zzfi$zzn> zzkxVar2 = zzkxVar;
                if (zzkxVar == null) {
                    synchronized (zzfi$zzn.class) {
                        try {
                            zzkx<zzfi$zzn> zzkxVar3 = zzi;
                            zzkx<zzfi$zzn> zzkxVar4 = zzkxVar3;
                            if (zzkxVar3 == null) {
                                ?? zzaVar = new zzjb.zza(zzh);
                                zzi = zzaVar;
                                zzkxVar4 = zzaVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzkxVar2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    /* loaded from: classes.dex */
    public static final class zza extends zzjb.zzb<zzfi$zzn, zza> implements zzkm {
        private zza() {
            super(zzfi$zzn.zzh);
        }

        /* synthetic */ zza(zzfk zzfkVar) {
            this();
        }
    }

    static {
        zzfi$zzn zzfi_zzn = new zzfi$zzn();
        zzh = zzfi_zzn;
        zzjb.zza(zzfi$zzn.class, zzfi_zzn);
    }
}
