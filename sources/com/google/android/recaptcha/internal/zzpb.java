package com.google.android.recaptcha.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzpb extends zzpc implements Serializable {
    final byte[] zza;

    public zzpb(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzpc
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(zzmg.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // com.google.android.recaptcha.internal.zzpc
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.recaptcha.internal.zzpc
    public final boolean zzc(zzpc zzpcVar) {
        int length = zzpcVar.zze().length;
        byte[] bArr = this.zza;
        if (bArr.length != length) {
            return false;
        }
        boolean z10 = true;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            z10 &= bArr[i3] == zzpcVar.zze()[i3];
        }
        return z10;
    }

    @Override // com.google.android.recaptcha.internal.zzpc
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.recaptcha.internal.zzpc
    public final byte[] zze() {
        return this.zza;
    }
}
