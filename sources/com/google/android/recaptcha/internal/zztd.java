package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class zztd {
    protected volatile zzts zza;
    private volatile zzqm zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zztd)) {
            return false;
        }
        zztd zztdVar = (zztd) obj;
        zzts zztsVar = this.zza;
        zzts zztsVar2 = zztdVar.zza;
        if (zztsVar == null) {
            if (zztsVar2 == null) {
                return zzb().equals(zztdVar.zzb());
            }
            zzd(zztsVar2.zzm());
            return this.zza.equals(zztsVar2);
        }
        if (zztsVar2 != null) {
            return zztsVar.equals(zztsVar2);
        }
        zztdVar.zzd(zztsVar.zzm());
        return zztsVar.equals(zztdVar.zza);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzqk) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzo();
        }
        return 0;
    }

    public final zzqm zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = zzqm.zzb;
            } else {
                this.zzb = this.zza.zzb();
            }
            return this.zzb;
        }
    }

    public final zzts zzc(zzts zztsVar) {
        zzts zztsVar2 = this.zza;
        this.zzb = null;
        this.zza = zztsVar;
        return zztsVar2;
    }

    public final void zzd(zzts zztsVar) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza != null) {
                    return;
                }
                try {
                    this.zza = zztsVar;
                    this.zzb = zzqm.zzb;
                } catch (zzsx unused) {
                    this.zzc = true;
                    this.zza = zztsVar;
                    this.zzb = zzqm.zzb;
                }
            }
        }
    }
}
