package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

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

    static zztw zzc(zzuv zzuvVar, zzrz zzrzVar, zzts zztsVar) {
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
                int i = 0;
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
                            i = zzufVar.zzj();
                            zzsmVar = zzryVar.zza(this.zza, i);
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
                        zzuvVar.zzg(zza, i, zzqmVar);
                    }
                }
            } finally {
                zzuvVar.zzj(obj, zza);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[EDGE_INSN: B:24:0x0084->B:25:0x0084 BREAK  A[LOOP:1: B:10:0x0049->B:18:0x0049], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzqb zzqbVar) {
        zzsn zzsnVar = (zzsn) obj;
        zzuw zzuwVar = zzsnVar.zzc;
        if (zzuwVar == zzuw.zzc()) {
            zzuwVar = zzuw.zzf();
            zzsnVar.zzc = zzuwVar;
        }
        ((zzsk) obj).zzi();
        zzsm zzsmVar = null;
        while (i < i2) {
            int zzi = zzqc.zzi(bArr, i, zzqbVar);
            int i3 = zzqbVar.zza;
            if (i3 == 11) {
                int i4 = 0;
                zzqm zzqmVar = null;
                while (zzi < i2) {
                    zzi = zzqc.zzi(bArr, zzi, zzqbVar);
                    int i5 = zzqbVar.zza;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (zzsmVar != null) {
                                int i8 = zzuc.zza;
                                throw null;
                            }
                            if (i7 == 2) {
                                zzi = zzqc.zza(bArr, zzi, zzqbVar);
                                zzqmVar = (zzqm) zzqbVar.zzc;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            zzi = zzqc.zzo(i5, bArr, zzi, i2, zzqbVar);
                        }
                    } else if (i7 == 0) {
                        zzi = zzqc.zzi(bArr, zzi, zzqbVar);
                        i4 = zzqbVar.zza;
                        zzsmVar = zzqbVar.zzd.zza(this.zza, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (zzqmVar != null) {
                    zzuwVar.zzj((i4 << 3) | 2, zzqmVar);
                }
                i = zzi;
            } else if ((i3 & 7) == 2) {
                zzsmVar = zzqbVar.zzd.zza(this.zza, i3 >>> 3);
                if (zzsmVar != null) {
                    int i9 = zzuc.zza;
                    throw null;
                }
                i = zzqc.zzh(i3, bArr, zzi, i2, zzuwVar, zzqbVar);
            } else {
                i = zzqc.zzo(i3, bArr, zzi, i2, zzqbVar);
            }
        }
        if (i != i2) {
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
