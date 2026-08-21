package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
class zzeg extends zzef {
    protected final byte[] zza;

    zzeg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzei) || zzd() != ((zzei) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzeg)) {
            return obj.equals(this);
        }
        zzeg zzegVar = (zzeg) obj;
        int zzi = zzi();
        int zzi2 = zzegVar.zzi();
        if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzegVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzegVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzegVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzegVar.zza;
        zzegVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < zzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    protected final int zze(int i, int i2, int i3) {
        return zzfo.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final zzei zzf(int i, int i2) {
        int zzh = zzei.zzh(0, i2, zzd());
        return zzh == 0 ? zzei.zzb : new zzec(this.zza, 0, zzh);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    final void zzg(zzdz zzdzVar) {
        ((zzem) zzdzVar).zzc(this.zza, 0, zzd());
    }
}
