package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zztw implements zzug {
    private final zzts zza;
    private final zzuv zzb;
    private final boolean zzc;
    private final zzrz zzd;

    private zztw(zzuv zzuvVar, zzrz zzrzVar, zzts zztsVar) {
        this.zzb = zzuvVar;
        this.zzc = zztsVar instanceof zzsk;
        this.zzd = zzrzVar;
        this.zza = zztsVar;
    }

    public static zztw zzc(zzuv zzuvVar, zzrz zzrzVar, zzts zztsVar) {
        return new zztw(zzuvVar, zzrzVar, zztsVar);
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zza(Object obj) {
        int zzb = ((zzsn) obj).zzc.zzb();
        return this.zzc ? zzb + ((zzsk) obj).zzb.zzb() : zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zzb(Object obj) {
        int hashCode = ((zzsn) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzsk) obj).zzb.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final Object zze() {
        zzts zztsVar = this.zza;
        return zztsVar instanceof zzsn ? ((zzsn) zztsVar).zzv() : zztsVar.zzaf().zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzg(Object obj, Object obj2) {
        zzui.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzui.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzh(Object obj, zzuf zzufVar, zzry zzryVar) {
        boolean zzO;
        zzuv zzuvVar = this.zzb;
        Object zza = zzuvVar.zza(obj);
        ((zzsk) obj).zzi();
        while (zzufVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzufVar.zzd();
                int i10 = 0;
                if (zzd != 11) {
                    if ((zzd & 7) != 2) {
                        zzO = zzufVar.zzO();
                    } else {
                        if (zzryVar.zza(this.zza, zzd >>> 3) != null) {
                            throw null;
                        }
                        zzO = zzuvVar.zzk(zza, zzufVar, 0);
                    }
                    if (!zzO) {
                        break;
                    }
                } else {
                    zzsm zzsmVar = null;
                    zzqm zzqmVar = null;
                    while (zzufVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzufVar.zzd();
                        if (zzd2 != 16) {
                            if (zzd2 != 26) {
                                if (zzd2 == 12 || !zzufVar.zzO()) {
                                    break;
                                }
                            } else {
                                if (zzsmVar != null) {
                                    throw null;
                                }
                                zzqmVar = zzufVar.zzp();
                            }
                        } else {
                            i10 = zzufVar.zzj();
                            zzsmVar = zzryVar.zza(this.zza, i10);
                        }
                    }
                    if (zzufVar.zzd() != 12) {
                        throw new zzsx("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzqmVar == null) {
                        continue;
                    } else {
                        if (zzsmVar != null) {
                            throw null;
                        }
                        zzuvVar.zzg(zza, i10, zzqmVar);
                    }
                }
            } finally {
                zzuvVar.zzj(obj, zza);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[EDGE_INSN: B:24:0x008b->B:25:0x008b BREAK  A[LOOP:1: B:10:0x004e->B:18:0x004e], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzqb zzqbVar) {
        int i12;
        zzsn zzsnVar = (zzsn) obj;
        zzuw zzuwVar = zzsnVar.zzc;
        if (zzuwVar == zzuw.zzc()) {
            zzuwVar = zzuw.zzf();
            zzsnVar.zzc = zzuwVar;
        }
        zzuw zzuwVar2 = zzuwVar;
        ((zzsk) obj).zzi();
        zzsm zzsmVar = null;
        while (i10 < i11) {
            int zzi = zzqc.zzi(bArr, i10, zzqbVar);
            int i13 = zzqbVar.zza;
            if (i13 == 11) {
                byte[] bArr2 = bArr;
                int i14 = i11;
                zzqb zzqbVar2 = zzqbVar;
                int i15 = 0;
                zzqm zzqmVar = null;
                while (true) {
                    if (zzi >= i14) {
                        i12 = zzi;
                        break;
                    }
                    i12 = zzqc.zzi(bArr2, zzi, zzqbVar2);
                    int i16 = zzqbVar2.zza;
                    int i17 = i16 >>> 3;
                    int i18 = i16 & 7;
                    if (i17 != 2) {
                        if (i17 == 3) {
                            if (zzsmVar != null) {
                                int i19 = zzuc.zza;
                                throw null;
                            }
                            if (i18 == 2) {
                                zzi = zzqc.zza(bArr2, i12, zzqbVar2);
                                zzqmVar = (zzqm) zzqbVar2.zzc;
                            }
                        }
                        if (i16 != 12) {
                            break;
                        } else {
                            zzi = zzqc.zzo(i16, bArr2, i12, i14, zzqbVar2);
                        }
                    } else if (i18 == 0) {
                        zzi = zzqc.zzi(bArr2, i12, zzqbVar2);
                        i15 = zzqbVar2.zza;
                        zzsmVar = zzqbVar2.zzd.zza(this.zza, i15);
                    } else if (i16 != 12) {
                    }
                }
                if (zzqmVar != null) {
                    zzuwVar2.zzj((i15 << 3) | 2, zzqmVar);
                }
                i10 = i12;
                bArr = bArr2;
                i11 = i14;
                zzqbVar = zzqbVar2;
            } else if ((i13 & 7) == 2) {
                zzsmVar = zzqbVar.zzd.zza(this.zza, i13 >>> 3);
                if (zzsmVar != null) {
                    int i20 = zzuc.zza;
                    throw null;
                }
                i10 = zzqc.zzh(i13, bArr, zzi, i11, zzuwVar2, zzqbVar);
            } else {
                i10 = zzqc.zzo(i13, bArr, zzi, i11, zzqbVar);
            }
        }
        if (i10 != i11) {
            throw new zzsx("Failed to parse the message.");
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzj(Object obj, zzvi zzviVar) {
        Iterator zzf = ((zzsk) obj).zzb.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzsc zzscVar = (zzsc) entry.getKey();
            if (zzscVar.zze() != zzvh.zzi) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzscVar.zzg();
            zzscVar.zzf();
            if (entry instanceof zzsz) {
                zzviVar.zzw(zzscVar.zza(), ((zzsz) entry).zza().zzb());
            } else {
                zzviVar.zzw(zzscVar.zza(), entry.getValue());
            }
        }
        ((zzsn) obj).zzc.zzk(zzviVar);
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzsn) obj).zzc.equals(((zzsn) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzsk) obj).zzb.equals(((zzsk) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final boolean zzl(Object obj) {
        return ((zzsk) obj).zzb.zzk();
    }
}
