package com.google.android.gms.internal.play_billing;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public class zzcl {
    protected volatile zzdf zza;
    private volatile zzba zzc;

    static {
        zzbn zzbnVar = zzbn.zza;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcl) {
            zzcl zzclVar = (zzcl) obj;
            zzdf zzdfVar = this.zza;
            zzdf zzdfVar2 = zzclVar.zza;
            if (zzdfVar == null && zzdfVar2 == null) {
                return zzb().equals(zzclVar.zzb());
            }
            if (zzdfVar == null || zzdfVar2 == null) {
                if (zzdfVar != null) {
                    zzclVar.zzc(zzdfVar.zzf());
                    return zzdfVar.equals(zzclVar.zza);
                }
                zzc(zzdfVar2.zzf());
                return this.zza.equals(zzdfVar2);
            }
            return zzdfVar.equals(zzdfVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzax) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zze();
        }
        return 0;
    }

    public final zzba zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzba.zzb;
            } else {
                this.zzc = this.zza.zzb();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zzdf zzdfVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzdfVar;
                    this.zzc = zzba.zzb;
                } catch (zzci unused) {
                    this.zza = zzdfVar;
                    this.zzc = zzba.zzb;
                }
            }
        }
    }
}
