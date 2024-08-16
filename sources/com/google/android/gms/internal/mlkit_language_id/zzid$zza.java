package com.google.android.gms.internal.mlkit_language_id;

import com.google.android.gms.internal.mlkit_language_id.zzeo;
/* compiled from: com.google.mlkit:language-id@@16.1.1 */
/* loaded from: classes.dex */
public final class zzid$zza extends zzeo<zzid$zza, zza> implements zzgb {
    private static final zzid$zza zzf;
    private static volatile zzgj<zzid$zza> zzg;
    private int zzc;
    private int zzd;
    private zzid$zzj zze;

    /* compiled from: com.google.mlkit:language-id@@16.1.1 */
    /* loaded from: classes.dex */
    public enum zzb implements zzet {
        zza(0),
        zzb(1);
        
        private static final zzes<zzb> zzc = new zzie();
        private final int zzd;

        @Override // com.google.android.gms.internal.mlkit_language_id.zzet
        public final int zza() {
            return this.zzd;
        }

        public static zzev zzb() {
            return zzif.zza;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }

        zzb(int i) {
            this.zzd = i;
        }
    }

    private zzid$zza() {
    }

    /* compiled from: com.google.mlkit:language-id@@16.1.1 */
    /* loaded from: classes.dex */
    public static final class zza extends zzeo.zzb<zzid$zza, zza> implements zzgb {
        private zza() {
            super(zzid$zza.zzf);
        }

        /* synthetic */ zza(zzic zzicVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r3v15, types: [com.google.android.gms.internal.mlkit_language_id.zzgj<com.google.android.gms.internal.mlkit_language_id.zzid$zza>, com.google.android.gms.internal.mlkit_language_id.zzeo$zza] */
    @Override // com.google.android.gms.internal.mlkit_language_id.zzeo
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzic.zza[i - 1]) {
            case 1:
                return new zzid$zza();
            case 2:
                return new zza(null);
            case 3:
                return zzeo.zza(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zzb.zzb(), "zze"});
            case 4:
                return zzf;
            case 5:
                zzgj<zzid$zza> zzgjVar = zzg;
                zzgj<zzid$zza> zzgjVar2 = zzgjVar;
                if (zzgjVar == null) {
                    synchronized (zzid$zza.class) {
                        try {
                            zzgj<zzid$zza> zzgjVar3 = zzg;
                            zzgj<zzid$zza> zzgjVar4 = zzgjVar3;
                            if (zzgjVar3 == null) {
                                ?? zzaVar = new zzeo.zza(zzf);
                                zzg = zzaVar;
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

    static {
        zzid$zza zzid_zza = new zzid$zza();
        zzf = zzid_zza;
        zzeo.zza(zzid$zza.class, zzid_zza);
    }
}
