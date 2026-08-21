package com.google.android.gms.internal.play_billing;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;

/* loaded from: classes.dex */
final class zzgp implements zzgv {
    private final zzgl zza;
    private final zzhh zzb;
    private final boolean zzc = false;
    private final zzev zzd;

    private zzgp(zzhh zzhhVar, zzev zzevVar, zzgl zzglVar) {
        this.zzb = zzhhVar;
        this.zzd = zzevVar;
        this.zza = zzglVar;
    }

    static zzgp zzc(zzhh zzhhVar, zzev zzevVar, zzgl zzglVar) {
        return new zzgp(zzhhVar, zzevVar, zzglVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zza(Object obj) {
        int zzb = ((zzfi) obj).zzc.zzb();
        if (!this.zzc) {
            return zzb;
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zzb(Object obj) {
        int hashCode = ((zzfi) obj).zzc.hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final Object zze() {
        zzgl zzglVar = this.zza;
        return zzglVar instanceof zzfi ? ((zzfi) zzglVar).zzo() : zzglVar.zzK().zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzf(Object obj) {
        this.zzb.zzb(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzg(Object obj, Object obj2) {
        zzgx.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgx.zzo(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzdw zzdwVar) {
        zzfi zzfiVar = (zzfi) obj;
        if (zzfiVar.zzc == zzhi.zzc()) {
            zzfiVar.zzc = zzhi.zzf();
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzi(Object obj, zzhu zzhuVar) {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzfi) obj).zzc.equals(((zzfi) obj2).zzc)) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzk(Object obj) {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }
}
