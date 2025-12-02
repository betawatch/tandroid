package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* loaded from: classes.dex */
final class zzfs extends zzft implements Serializable {
    final byte[] zza;

    zzfs(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    final boolean zzc(zzft zzftVar) {
        if (this.zza.length != zzftVar.zze().length) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (true) {
            byte[] bArr = this.zza;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == zzftVar.zze()[i];
            i++;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.gms.internal.fido.zzft
    final byte[] zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length >= 4) {
            return ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
        }
        throw new IllegalStateException(zzbo.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
    }
}
