package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class zzdh extends zzdi implements Serializable {
    private static final zzdh zzd;
    final zzce zza;
    final zzce zzb;

    static {
        zzcd zzcdVar;
        zzcb zzcbVar;
        zzcdVar = zzcd.zzb;
        zzcbVar = zzcb.zzb;
        zzd = new zzdh(zzcdVar, zzcbVar);
    }

    private zzdh(zzce zzceVar, zzce zzceVar2) {
        zzcb zzcbVar;
        zzcd zzcdVar;
        this.zza = zzceVar;
        this.zzb = zzceVar2;
        if (zzceVar.zza(zzceVar2) <= 0) {
            zzcbVar = zzcb.zzb;
            if (zzceVar != zzcbVar) {
                zzcdVar = zzcd.zzb;
                if (zzceVar2 != zzcdVar) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Invalid range: ".concat(zze(zzceVar, zzceVar2)));
    }

    public static zzdh zza() {
        return zzd;
    }

    private static String zze(zzce zzceVar, zzce zzceVar2) {
        StringBuilder sb = new StringBuilder(16);
        zzceVar.zzc(sb);
        sb.append("..");
        zzceVar2.zzd(sb);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdh) {
            zzdh zzdhVar = (zzdh) obj;
            if (this.zza.equals(zzdhVar.zza) && this.zzb.equals(zzdhVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return zze(this.zza, this.zzb);
    }

    public final zzdh zzb(zzdh zzdhVar) {
        int zza = this.zza.zza(zzdhVar.zza);
        int zza2 = this.zzb.zza(zzdhVar.zzb);
        if (zza >= 0 && zza2 <= 0) {
            return this;
        }
        if (zza <= 0 && zza2 >= 0) {
            return zzdhVar;
        }
        zzce zzceVar = zza >= 0 ? this.zza : zzdhVar.zza;
        zzce zzceVar2 = zza2 <= 0 ? this.zzb : zzdhVar.zzb;
        zzbe.zzd(zzceVar.zza(zzceVar2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, zzdhVar);
        return new zzdh(zzceVar, zzceVar2);
    }

    public final zzdh zzc(zzdh zzdhVar) {
        int zza = this.zza.zza(zzdhVar.zza);
        int zza2 = this.zzb.zza(zzdhVar.zzb);
        if (zza <= 0 && zza2 >= 0) {
            return this;
        }
        if (zza >= 0 && zza2 <= 0) {
            return zzdhVar;
        }
        zzce zzceVar = zza <= 0 ? this.zza : zzdhVar.zza;
        if (zza2 >= 0) {
            zzdhVar = this;
        }
        return new zzdh(zzceVar, zzdhVar.zzb);
    }

    public final boolean zzd() {
        return this.zza.equals(this.zzb);
    }
}
