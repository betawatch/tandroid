package com.google.android.gms.internal.mlkit_language_id;

import com.google.android.gms.internal.mlkit_language_id.zzeo;
/* compiled from: com.google.mlkit:language-id@@16.1.1 */
/* loaded from: classes.dex */
public final class zzy$zzae extends zzeo<zzy$zzae, zza> implements zzgb {
    private static final zzy$zzae zzg;
    private static volatile zzgj<zzy$zzae> zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    /* compiled from: com.google.mlkit:language-id@@16.1.1 */
    /* loaded from: classes.dex */
    public enum zzb implements zzet {
        zza(0),
        zzb(1),
        zzc(2),
        zzd(3),
        zze(7),
        zzf(8),
        zzg(4),
        zzh(5),
        zzi(6);
        
        private static final zzes<zzb> zzj = new zzav();
        private final int zzk;

        @Override // com.google.android.gms.internal.mlkit_language_id.zzet
        public final int zza() {
            return this.zzk;
        }

        public static zzev zzb() {
            return zzaw.zza;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzk + " name=" + name() + '>';
        }

        zzb(int i) {
            this.zzk = i;
        }
    }

    private zzy$zzae() {
    }

    /* compiled from: com.google.mlkit:language-id@@16.1.1 */
    /* loaded from: classes.dex */
    public static final class zza extends zzeo.zzb<zzy$zzae, zza> implements zzgb {
        private zza() {
            super(zzy$zzae.zzg);
        }

        /* synthetic */ zza(zzx zzxVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.google.android.gms.internal.mlkit_language_id.zzgj<com.google.android.gms.internal.mlkit_language_id.zzy$zzae>, com.google.android.gms.internal.mlkit_language_id.zzeo$zza] */
    @Override // com.google.android.gms.internal.mlkit_language_id.zzeo
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzx.zza[i - 1]) {
            case 1:
                return new zzy$zzae();
            case 2:
                return new zza(null);
            case 3:
                return zzeo.zza(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"zzc", "zzd", zzb.zzb(), "zze", "zzf"});
            case 4:
                return zzg;
            case 5:
                zzgj<zzy$zzae> zzgjVar = zzh;
                zzgj<zzy$zzae> zzgjVar2 = zzgjVar;
                if (zzgjVar == null) {
                    synchronized (zzy$zzae.class) {
                        try {
                            zzgj<zzy$zzae> zzgjVar3 = zzh;
                            zzgj<zzy$zzae> zzgjVar4 = zzgjVar3;
                            if (zzgjVar3 == null) {
                                ?? zzaVar = new zzeo.zza(zzg);
                                zzh = zzaVar;
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
        zzy$zzae zzy_zzae = new zzy$zzae();
        zzg = zzy_zzae;
        zzeo.zza(zzy$zzae.class, zzy_zzae);
    }
}
