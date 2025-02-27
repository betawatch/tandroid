package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public abstract class zztm extends zzsg {
    protected zztp zza;
    private final zztp zzb;

    protected zztm(zztp zztpVar) {
        this.zzb = zztpVar;
        if (zztpVar.zzK()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zztpVar.zzx();
    }

    private static void zza(Object obj, Object obj2) {
        zzvf.zza().zzb(obj.getClass()).zze(obj, obj2);
    }

    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final zztm clone() {
        zztm zztmVar = (zztm) this.zzb.zzb(5, null, null);
        zztmVar.zza = zzs();
        return zztmVar;
    }

    public final zztm zzp(zztp zztpVar) {
        if (!this.zzb.equals(zztpVar)) {
            if (!this.zza.zzK()) {
                zzv();
            }
            zza(this.zza, zztpVar);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zztp zzq() {
        zztp zzs = zzs();
        byte byteValue = ((Byte) zzs.zzb(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean zzh = zzvf.zza().zzb(zzs.getClass()).zzh(zzs);
                zzs.zzb(2, true != zzh ? null : zzs, null);
            }
            throw new zzvy(zzs);
        }
        return zzs;
    }

    @Override // com.google.android.gms.internal.cast.zzuw
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zztp zzs() {
        if (!this.zza.zzK()) {
            return this.zza;
        }
        this.zza.zzF();
        return this.zza;
    }

    protected final void zzu() {
        if (this.zza.zzK()) {
            return;
        }
        zzv();
    }

    protected void zzv() {
        zztp zzx = this.zzb.zzx();
        zza(zzx, this.zza);
        this.zza = zzx;
    }
}
