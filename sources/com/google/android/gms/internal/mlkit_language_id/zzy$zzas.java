package com.google.android.gms.internal.mlkit_language_id;

import com.google.android.gms.internal.mlkit_language_id.zzeo;

/* loaded from: classes.dex */
public final class zzy$zzas extends zzeo implements zzgb {
    private static final zzex zzf = new zzbp();
    private static final zzy$zzas zzj;
    private static volatile zzgj zzk;
    private int zzc;
    private zzy$zzat zzd;
    private long zzg;
    private long zzh;
    private zzeu zze = zzeo.zzk();
    private zzew zzi = zzeo.zzl();

    /* loaded from: classes.dex */
    public static final class zza extends zzeo.zzb implements zzgb {
        private zza() {
            super(zzy$zzas.zzj);
        }

        /* synthetic */ zza(zzx zzxVar) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_language_id.zzex, com.google.android.gms.internal.mlkit_language_id.zzbp] */
    static {
        zzy$zzas zzy_zzas = new zzy$zzas();
        zzj = zzy_zzas;
        zzeo.zza(zzy$zzas.class, zzy_zzas);
    }

    private zzy$zzas() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.google.android.gms.internal.mlkit_language_id.zzgj, com.google.android.gms.internal.mlkit_language_id.zzeo$zza] */
    @Override // com.google.android.gms.internal.mlkit_language_id.zzeo
    public final Object zza(int i, Object obj, Object obj2) {
        zzx zzxVar = null;
        switch (zzx.zza[i - 1]) {
            case 1:
                return new zzy$zzas();
            case 2:
                return new zza(zzxVar);
            case 3:
                return zzeo.zza(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001e\u0003ဃ\u0001\u0004ဃ\u0002\u0005\u001b", new Object[]{"zzc", "zzd", "zze", zzai.zzb(), "zzg", "zzh", "zzi", zzy$zzbf.class});
            case 4:
                return zzj;
            case 5:
                zzgj zzgjVar = zzk;
                zzgj zzgjVar2 = zzgjVar;
                if (zzgjVar == null) {
                    synchronized (zzy$zzas.class) {
                        try {
                            zzgj zzgjVar3 = zzk;
                            zzgj zzgjVar4 = zzgjVar3;
                            if (zzgjVar3 == null) {
                                ?? zzaVar = new zzeo.zza(zzj);
                                zzk = zzaVar;
                                zzgjVar4 = zzaVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzgjVar2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
