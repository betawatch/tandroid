package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhm extends zzhp {
    private final int zza;
    private final zzcj zzb;

    zzhm(zzcj zzcjVar) {
        zzcjVar.getClass();
        this.zzb = zzcjVar;
        zzdc zzd = zzcjVar.zzc().zzd();
        int i = 0;
        while (zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) zzd.next();
            int zzb = ((zzhp) entry.getKey()).zzb();
            i = i < zzb ? zzb : i;
            int zzb2 = ((zzhp) entry.getValue()).zzb();
            if (i < zzb2) {
                i = zzb2;
            }
        }
        int i2 = i + 1;
        this.zza = i2;
        if (i2 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        int size;
        int size2;
        zzhp zzhpVar = (zzhp) obj;
        if (zzhp.zzd((byte) -96) != zzhpVar.zza()) {
            size2 = zzhpVar.zza();
            size = zzhp.zzd((byte) -96);
        } else {
            zzhm zzhmVar = (zzhm) zzhpVar;
            if (this.zzb.size() == zzhmVar.zzb.size()) {
                zzdc zzd = this.zzb.zzc().zzd();
                zzdc zzd2 = zzhmVar.zzb.zzc().zzd();
                do {
                    if (!zzd.hasNext() && !zzd2.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) zzd.next();
                    Map.Entry entry2 = (Map.Entry) zzd2.next();
                    int compareTo2 = ((zzhp) entry.getKey()).compareTo((zzhp) entry2.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((zzhp) entry.getValue()).compareTo((zzhp) entry2.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
            size = this.zzb.size();
            size2 = zzhmVar.zzb.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhm.class == obj.getClass()) {
            return this.zzb.equals(((zzhm) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd((byte) -96)), this.zzb});
    }

    public final String toString() {
        if (this.zzb.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzdc zzd = this.zzb.zzc().zzd();
        while (zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) zzd.next();
            linkedHashMap.put(((zzhp) entry.getKey()).toString().replace("\n", "\n  "), ((zzhp) entry.getValue()).toString().replace("\n", "\n  "));
        }
        zzbd zza = zzbd.zza(",\n  ");
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            zzbc.zza(sb, linkedHashMap.entrySet().iterator(), zza, " : ");
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzhp.zzd((byte) -96);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zzb() {
        return this.zza;
    }

    public final zzcj zzc() {
        return this.zzb;
    }
}
