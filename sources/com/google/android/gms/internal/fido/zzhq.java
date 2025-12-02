package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class zzhq {
    static final zzhp zza(InputStream inputStream, zzhs zzhsVar) {
        try {
            return zzb(inputStream, zzhsVar);
        } finally {
            try {
                zzhsVar.close();
            } catch (IOException unused) {
            }
        }
    }

    private static final zzhp zzb(InputStream inputStream, zzhs zzhsVar) {
        int i = 0;
        try {
            zzhr zzd = zzhsVar.zzd();
            if (zzd == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte zza = zzd.zza();
                byte zzb = zzd.zzb();
                if (zzb == Byte.MIN_VALUE) {
                    long zza2 = zzhsVar.zza();
                    if (zza2 > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    zzc(zza, zza2, inputStream, zzhsVar);
                    zzhp[] zzhpVarArr = new zzhp[(int) zza2];
                    while (i < zza2) {
                        zzhpVarArr[i] = zzb(inputStream, zzhsVar);
                        i++;
                    }
                    return new zzhg(zzcc.zzi(zzhpVarArr));
                }
                if (zzb != -96) {
                    if (zzb == -64) {
                        throw new zzhj("Tags are currently unsupported");
                    }
                    if (zzb == -32) {
                        return new zzhh(zzhsVar.zzf());
                    }
                    if (zzb == 0 || zzb == 32) {
                        long zzb2 = zzhsVar.zzb();
                        zzc(zza, zzb2 > 0 ? zzb2 : ~zzb2, inputStream, zzhsVar);
                        return new zzhk(zzb2);
                    }
                    if (zzb == 64) {
                        byte[] zzg = zzhsVar.zzg();
                        int length = zzg.length;
                        zzc(zza, length, inputStream, zzhsVar);
                        return new zzhi(zzgx.zzl(zzg, 0, length));
                    }
                    if (zzb == 96) {
                        String zze = zzhsVar.zze();
                        zzc(zza, zze.length(), inputStream, zzhsVar);
                        return new zzhn(zze);
                    }
                    throw new zzhj("Unidentifiable major type: " + zzd.zzc());
                }
                long zzc = zzhsVar.zzc();
                if (zzc > 1000) {
                    throw new zzhj("Parser being asked to read a large CBOR map");
                }
                zzc(zza, zzc, inputStream, zzhsVar);
                int i2 = (int) zzc;
                zzhl[] zzhlVarArr = new zzhl[i2];
                zzhp zzhpVar = null;
                int i3 = 0;
                while (i3 < zzc) {
                    zzhp zzb3 = zzb(inputStream, zzhsVar);
                    if (zzhpVar != null && zzb3.compareTo(zzhpVar) <= 0) {
                        throw new zzhf(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", zzhpVar.toString(), zzb3.toString()));
                    }
                    zzhlVarArr[i3] = new zzhl(zzb3, zzb(inputStream, zzhsVar));
                    i3++;
                    zzhpVar = zzb3;
                }
                TreeMap treeMap = new TreeMap();
                while (i < i2) {
                    zzhl zzhlVar = zzhlVarArr[i];
                    if (treeMap.containsKey(zzhlVar.zza())) {
                        throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(zzhlVar.zza(), zzhlVar.zzb());
                    i++;
                }
                return new zzhm(zzcj.zzf(treeMap));
            } catch (IOException e) {
                e = e;
                throw new zzhj("Error in decoding CborValue from bytes", e);
            } catch (RuntimeException e2) {
                e = e2;
                throw new zzhj("Error in decoding CborValue from bytes", e);
            }
        } catch (IOException e3) {
            throw new zzhj("Error in decoding CborValue from bytes", e3);
        }
    }

    private static final void zzc(byte b, long j, InputStream inputStream, zzhs zzhsVar) {
        switch (b) {
            case 24:
                if (j >= 24) {
                    return;
                }
                throw new zzhf("Integer value " + j + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j >= 256) {
                    return;
                }
                throw new zzhf("Integer value " + j + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j >= 65536) {
                    return;
                }
                throw new zzhf("Integer value " + j + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j >= 4294967296L) {
                    return;
                }
                throw new zzhf("Integer value " + j + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }
}
